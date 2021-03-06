package finalproj.models;

import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
@Entity
@Table(name = "classes", schema = "project_515")
public class ClassesEntity {
    private String classId;
    private String className;

    @Id
    @javax.persistence.Column(name = "class_id")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @javax.persistence.Column(name = "class_name")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassesEntity that = (ClassesEntity) o;

        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classId != null ? classId.hashCode() : 0;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        return result;
    }
}
