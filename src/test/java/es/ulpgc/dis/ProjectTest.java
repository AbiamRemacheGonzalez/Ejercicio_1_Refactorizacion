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

        Developer developer1 = new Developer("Charlie", "Taylor",1800);
        projectA.addDeveloper(developer1);

        Developer developer2 = new Developer("William", "Brown",(int) (1800.0 * 0.5));
        projectA.addDeveloper(developer2);
        projectB.addDeveloper(developer2);

        Developer developer3 = new Developer("Sophie", "Wilson",(int) (1800.0 * 0.5));
        projectB.addDeveloper(developer3);

        Developer developer4 = new Developer("Emily", "Yhomas",(int) (1800.0 * 0.5));
        projectB.addDeveloper(developer4);

        assertEquals(5175, (int) projectA.getWorkLoadProject());
        assertEquals(4275, (int) projectB.getWorkLoadProject());
    }

}