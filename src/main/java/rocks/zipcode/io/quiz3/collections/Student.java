package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
  private String labName;
  private LabStatus labStatus;
  private Map<Lab,LabStatus> labMap;

    public Student() {
        this(null);
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labMap = map;
    }

    public Lab getLab(String labName) {

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
                this.labName = labName;
                this.labStatus = labStatus;

    }


    public void forkLab(Lab lab) {

    }

    public LabStatus getLabStatus(String labName) {
                    return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "labName='" + labName + '\'' +
                ", labStatus=" + labStatus +
                ", labMap=" + labMap +
                '}';
    }
}
