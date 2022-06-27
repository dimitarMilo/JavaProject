package onlineGym;

import java.util.ArrayList;
import java.util.List;


public class Coach {

    private String standup;
    private String laydown;
    private List<Instructor> exercises = new ArrayList<>();

    public void addObserver(Instructor instructor) {
        this.exercises.add(instructor);
    }

    public void removeObserver(Instructor instructor) {
        this.exercises.remove(instructor);
    }

    public void setPosition1(String standup) {
        this.standup = standup;
        for (Instructor instructor : this.exercises) {
            instructor.update(this.standup);
        }
    }
    public void setPosition2(String laydown) {
        this.laydown = laydown;
        for (Instructor instructor : this.exercises) {
            instructor.update(this.laydown);
        }
    }
}
