package center.fyz.thehub.groups.teacher;

import java.util.List;
import java.util.Set;

public class Teacher {

    private String teacherID;
    private Set<String> subjectIDs;
    private List<String> absenceIDs;

    public Teacher(String teacherID, List<String> absenceIDs, Set<String> subjectIDs) {
        this.teacherID = teacherID;
        this.absenceIDs = absenceIDs;
        this.subjectIDs = subjectIDs;
    }

    //TODO : GET & SAVE TEACHER
    public static Teacher get(String teacherID) {
        return null;
    }

    public void save() {

    }

    public String getTeacherID() {
        return teacherID;
    }

    public Teacher setTeacherID(String teacherID) {
        this.teacherID = teacherID;
        return this;
    }

    public List<String> getAbsenceIDs() {
        return absenceIDs;
    }

    public Set<String> getSubjectIDs() {
        return subjectIDs;
    }

    public void addAbsence(List<String> absenceIDs) {
        this.absenceIDs = absenceIDs;
    }

    public void addSubject(Subject subject) {
        this.subjectIDs = subjectIDs;
    }
}
