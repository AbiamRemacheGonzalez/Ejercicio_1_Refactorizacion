package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private String firstName;
    private String lastName;

    private List<Developer> managedTeam;

    private int workLoad;

    public ProjectManager(String firstName, String lastName, int workload) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.managedTeam = new ArrayList<Developer>();
        this.workLoad = workload;
    }

    public List<Developer> getManagedTeam() {
        return managedTeam;
    }

    public void addManagedDeveloper(Developer developer) {
        this.managedTeam.add(developer);
    }

    public int getWorkLoad() {
        return workLoad;
    }
}
