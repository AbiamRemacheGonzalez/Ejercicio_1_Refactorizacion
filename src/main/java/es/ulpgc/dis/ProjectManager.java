package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private String firstName;
    private String lastName;

    private int workLoad;

    public ProjectManager(String firstName, String lastName, int workload) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workLoad = workload;
    }
    public int getWorkLoad() {
        return workLoad;
    }
}
