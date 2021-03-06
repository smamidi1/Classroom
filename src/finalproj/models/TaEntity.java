package finalproj.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
@Entity
@Table(name = "ta", schema = "project_515")
public class TaEntity {
    private String taId;
    private String taName;
    private String taEmail;
    private String taPhone;
    private Timestamp taTimings;
    private String classId;
    private String assignmentId;

    @Id
    @javax.persistence.Column(name = "ta_id")
    public String getTaId() {
        return taId;
    }

    public void setTaId(String taId) {
        this.taId = taId;
    }

    @Basic
    @javax.persistence.Column(name = "ta_name")
    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName;
    }

    @Basic
    @javax.persistence.Column(name = "ta_email")
    public String getTaEmail() {
        return taEmail;
    }

    public void setTaEmail(String taEmail) {
        this.taEmail = taEmail;
    }

    @Basic
    @javax.persistence.Column(name = "ta_phone")
    public String getTaPhone() {
        return taPhone;
    }

    public void setTaPhone(String taPhone) {
        this.taPhone = taPhone;
    }

    @Basic
    @javax.persistence.Column(name = "ta_timings")
    public Timestamp getTaTimings() {
        return taTimings;
    }

    public void setTaTimings(Timestamp taTimings) {
        this.taTimings = taTimings;
    }

    @Basic
    @javax.persistence.Column(name = "class_id")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @javax.persistence.Column(name = "assignment_id")
    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaEntity taEntity = (TaEntity) o;

        if (taId != null ? !taId.equals(taEntity.taId) : taEntity.taId != null) return false;
        if (taName != null ? !taName.equals(taEntity.taName) : taEntity.taName != null) return false;
        if (taEmail != null ? !taEmail.equals(taEntity.taEmail) : taEntity.taEmail != null) return false;
        if (taPhone != null ? !taPhone.equals(taEntity.taPhone) : taEntity.taPhone != null) return false;
        if (taTimings != null ? !taTimings.equals(taEntity.taTimings) : taEntity.taTimings != null) return false;
        if (classId != null ? !classId.equals(taEntity.classId) : taEntity.classId != null) return false;
        if (assignmentId != null ? !assignmentId.equals(taEntity.assignmentId) : taEntity.assignmentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taId != null ? taId.hashCode() : 0;
        result = 31 * result + (taName != null ? taName.hashCode() : 0);
        result = 31 * result + (taEmail != null ? taEmail.hashCode() : 0);
        result = 31 * result + (taPhone != null ? taPhone.hashCode() : 0);
        result = 31 * result + (taTimings != null ? taTimings.hashCode() : 0);
        result = 31 * result + (classId != null ? classId.hashCode() : 0);
        result = 31 * result + (assignmentId != null ? assignmentId.hashCode() : 0);
        return result;
    }
}
