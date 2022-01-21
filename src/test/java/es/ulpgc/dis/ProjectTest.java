package es.ulpgc.dis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ProjectTest {

    @Test
    public void test_zero()
    {
        ProjectManager projectManager0 = new ProjectManager("James","Johnson",1800);
        ProjectManager projectManager1 = new ProjectManager("Isabella","Smith",(int) (1800.0 * 0.5));

        Project projectA = new Project("Project A", projectManager0);
        Project projectB = new Project("Project B", projectManager1);

        Developer developer0 = new Developer("Jessica", "Jones", (int) (1800.0 * 0.75 * 0.5));
        projectA.addDeveloper(developer0);
        projectB.addDeveloper(developer0);
        //developer0.projects.add(projectA);
        //developer0.projects.add(projectB);

        Developer developer1 = new Developer("Charlie", "Taylor",1800);
        projectA.addDeveloper(developer1);
        //developer1.projects.add(projectA);

        Developer developer2 = new Developer("William", "Brown",(int) (1800.0 * 0.5));
        projectA.addDeveloper(developer2);
        projectB.addDeveloper(developer2);
        //developer2.projects.add(projectA);
        //developer2.projects.add(projectB);

        Developer developer3 = new Developer("Sophie", "Wilson",(int) (1800.0 * 0.5));
        projectB.addDeveloper(developer3);
        //developer3.projects.add(projectB);

        Developer developer4 = new Developer("Emily", "Yhomas",(int) (1800.0 * 0.5));
        projectB.addDeveloper(developer4);
        //developer4.projects.add(projectB);


        /*projectManager0.addManagedDeveloper(developer0);
        projectManager0.addManagedDeveloper(developer1);
        projectManager0.addManagedDeveloper(developer2);


        projectManager1.addManagedDeveloper(developer0);
        projectManager1.addManagedDeveloper(developer2);
        projectManager1.addManagedDeveloper(developer3);
        projectManager1.addManagedDeveloper(developer4);*/

        List<Project> projects = new ArrayList<Project>();
        projects.add(projectA);
        projects.add(projectB);

        List<ProjectManager> projectManagerList = new ArrayList<ProjectManager>();
        projectManagerList.add(projectManager0);
        projectManagerList.add(projectManager1);

        Project auxProject = new Project("auxProject", null);

        Map<String, Integer> workLoadProjects = auxProject.getWorkLoadProjects(projects, projectManagerList);


        assertEquals(5175, (int) workLoadProjects.get("Project A"));
        assertEquals(4275, (int) workLoadProjects.get("Project B"));
    }

}