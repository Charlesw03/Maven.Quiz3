package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab> {
    private String name;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.name = labName;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Lab o) {
        return name.compareTo(o.name);
    }
}


//
//  private String name;
//
//    public Lab() {
//        this(null);
//    }
//
//    public Lab(String labName) {
//        this.name = labName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int compareTo(Lab o) {
//        return name.compareTo(o.name);
//    }
//    private String labName;
//    private LabStatus labStatus;
//    private Map<Lab,LabStatus> labMap;
//   private String name;
//    public Lab() {
//
//    }
//
//    public Lab(String labName) {
//    this.labName = labName;
//    }
//
//    public String getName() {
//        return labName;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        return name.compareTo(labName);
//    }

