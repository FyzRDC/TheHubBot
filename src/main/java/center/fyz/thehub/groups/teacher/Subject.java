package center.fyz.thehub.groups.teacher;

public class Subject {

    private String subjectID, subjectName;
    public Subject(String subjectID, String subjectName) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
    }

    //TODO : GET & SAVE SUBJECT
    public static Subject get(String subjectID) {
        return null;
    }
    public void save() {

    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
