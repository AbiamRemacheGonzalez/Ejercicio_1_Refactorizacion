package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private final String firstName;
    private final String lastName;
    public List<Project> projects;
    private int workLoad;

    public Developer(String firstName, String lastName, int workLoad) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workLoad = workLoad;
        this.projects = new ArrayList<Project>();
    }

    public int getWorkLoad() {
        return workLoad;
    }
}
