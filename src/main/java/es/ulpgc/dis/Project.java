package es.ulpgc.dis;

import java.util.*;

public class Project {
    private final String name;
    private final ProjectManager projectManager;
    public List<Developer> developers;

    public Project(String name, ProjectManager projectManager) {
        this.name = name;
        this.projectManager = projectManager;
        this.developers = new ArrayList<>();
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public Integer getWorkLoadProject() {
        Integer projectWorkLoad = projectManager.getWorkLoad();
        for (Developer developer : developers) {
            projectWorkLoad += developer.getWorkLoad();
        }
        return projectWorkLoad;
    }
}
