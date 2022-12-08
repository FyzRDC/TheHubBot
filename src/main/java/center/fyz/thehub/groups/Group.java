package center.fyz.thehub.groups;

import center.fyz.thehub.groups.resources.Resource;
import center.fyz.thehub.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Group {

    private String groupID, groupName;
    private Set<String> groupMemberIDs, groupAdminIDs;

    private List<String> resourceIDs;

    public Group(String groupID, String groupName, Set<String> groupMemberIDs, Set<String> groupAdminIDs, List<String> resourceIDs) {
        this.groupID = groupID;
        this.groupAdminIDs = groupAdminIDs;
        this.groupName = groupName;
        this.groupMemberIDs = groupMemberIDs;
        this.resourceIDs = resourceIDs;
    }

    //TODO : GET GROUP
    public static Group get(String groupID) {
        return null;
    }

    public List<Resource> getResourcesFromUser(String discordID) {
        return Arrays.stream(getResources().toArray(new Resource[0]))
                .filter(resource -> resource.getOwnerID().equals(discordID))
                .collect(Collectors.toList());
    }

    public ArrayList<Resource> getResources() {
        ArrayList<Resource> resources = new ArrayList<>();
        for(String resourceID : resourceIDs) {
            resources.add(Resource.get(resourceID));
        }
        return resources;
    }

    public Group addResource(Resource resource) {
        this.resourceIDs.add(resource.getResourceID());
        return this;
    }

    public Group deleteResource(Resource resource){
        if(this.resourceIDs.contains(resource.getResourceID())) this.resourceIDs.add(resource.getResourceID());
        return this;
    }

    public List<String> getResourceIDs() {
        return resourceIDs;
    }

    public Set<String> getGroupAdminIDs() {
        return groupAdminIDs;
    }



    public String getGroupID() {
        return groupID;
    }

    public Set<String> getGroupMemberIDs() {
        return groupMemberIDs;
    }

    public Group setGroupID(String groupID) {
        this.groupID = groupID;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public Group addGroupMember(User user) {
        groupMemberIDs.add(user.getDiscordID());
        user.addGroupID(this);
        return this;
    }

    public Group removeGroupMember(User user) {
        groupMemberIDs.remove(user.getDiscordID());
        user.removeGroupID(this);
        return this;
    }

    public Group setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
}
