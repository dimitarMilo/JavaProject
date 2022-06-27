package onlineGym;

public class Viewer implements Instructor{

	private String standup;
    private String laydown;
    
    @Override
    public void update(Object standup) {
        this.setPosition1((String) standup);
    }

    public String getPosition1() {
        return standup;
    }

    public void setPosition1(String standup) {
        this.standup = standup;
    }
    
    @Override
    public void update1(Object laydown) {
        this.setPosition2((String) laydown);
    }

    public String getPosition2() {
        return laydown;
    }

    public void setPosition2(String laydown) {
        this.laydown = laydown;
    }

}
