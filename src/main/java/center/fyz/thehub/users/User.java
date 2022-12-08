package center.fyz.thehub.users;

import center.fyz.thehub.groups.Group;
import center.fyz.thehub.groups.resources.Resource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {

    private String discordID, efreiID;
    private Set<String> groupIDs;
    private UserType userType;
    public User(String discordID, String efreiID, UserType userType, Set<String> groupIDs) {
        this.discordID = discordID;
        this.efreiID = efreiID;
        this.userType = userType;
        this.groupIDs = groupIDs;
    }

    public String getEfreiID() {
        return efreiID;
    }

    public User setEfreiID(String efreiID) {
        this.efreiID = efreiID;
        return this;
    }

    public String getDiscordID() {
        return discordID;
    }

    public UserType getUserType() {
        return userType;
    }

    public List<Group> getGroups() {
        ArrayList<Group> groups = new ArrayList<>();
        for(String groupID : getGroupIDs()) {
            groups.add(Group.get(groupID));
        }
        return groups;
    }
    public Set<String> getGroupIDs() {
        return groupIDs;
    }
    public User setDiscordID(String discordID) {
        this.discordID = discordID;
        return this;
    }

    public User addGroupID(Group group) {
        groupIDs.add(group.getGroupID());
        return this;
    }

    public User removeGroupID(Group group) {
        this.groupIDs.remove(group.getGroupID());
        return this;
    }

    //TODO : GET USER
    public static User get(String discordID) {
        return null;
    }

    public List<Resource> getResources() {
        ArrayList<Resource> resourcesFromUser = new ArrayList<>();
        for(Group g : getGroups()) {
            for(Resource resource : g.getResourcesFromUser(this.discordID)) {
                resourcesFromUser.add(resource);
            }
        }
        return resourcesFromUser;
    }


    //TODO : SAVE USER
    public void save() {

    }

}
