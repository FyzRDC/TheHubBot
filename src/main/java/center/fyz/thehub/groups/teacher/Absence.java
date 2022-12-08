package center.fyz.thehub.groups.teacher;


import java.util.Date;

public class Absence {

    private String absenceID;
    private Date absenceDate;
    public Absence(String absenceID, Date absenceDate) {
        this.absenceDate = absenceDate;
        this.absenceID = absenceID;
    }


    //TODO : SAVE & GET ABSENCES
    public static Absence get(String absenceID) {
        return null;
    }

    public void save() {

    }

    public String getAbsenceID() {
        return absenceID;
    }

    public Absence setAbsenceID(String absenceID) {
        this.absenceID = absenceID;
        return this;
    }

    public Date getAbsenceDate() {
        return absenceDate;
    }

    public Absence setAbsenceDate(Date absenceDate) {
        this.absenceDate = absenceDate;
        return this;
    }
}
