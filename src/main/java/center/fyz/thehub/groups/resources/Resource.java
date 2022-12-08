package center.fyz.thehub.groups.resources;

import center.fyz.thehub.groups.Group;

import java.io.File;
import java.util.List;

public class Resource {

    private String groupID, ownerID, resourceName, resourceSubject, resourceID;
    private List<File> resourceFile;

    public Resource(String resourceID, String groupID, String ownerID, String resourceName, String resourceSubject, List<File> resourceFile) {
        this.resourceID = resourceID;
        this.groupID = groupID;
        this.ownerID = ownerID;
        this.resourceName = resourceName;
        this.resourceSubject = resourceSubject;
        this.resourceFile = resourceFile;
    }

    //TODO : GET RESOURCE
    public static Resource get(String resourceID) {
        return null;
    }

    public String getResourceID() {
        return resourceID;
    }

    public Resource setResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    public Resource setGroupID(Group group) {
        this.groupID = group.getGroupID();
        return this;
    }

    public String getGroupID() {
        return groupID;
    }

    public List<File> getResourceFile() {
        return resourceFile;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getResourceSubject() {
        return resourceSubject;
    }

    public Resource setOwnerID(String ownerID) {
        this.ownerID = ownerID;
        return this;
    }

    public Resource setResourceFile(List<File> resourceFile) {
        this.resourceFile = resourceFile;
        return this;
    }

    public Resource setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    public Resource setResourceSubject(String resourceSubject) {
        this.resourceSubject = resourceSubject;
        return this;
    }
}