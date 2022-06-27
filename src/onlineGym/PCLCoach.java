package onlineGym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLCoach {
	 
	 private String standup;
	 private String laydown;

	 private PropertyChangeSupport support;

	 public PCLCoach() {
	     support = new PropertyChangeSupport(this);
	 }

	 public void addPropertyChangeListener(PropertyChangeListener pcl) {
	     support.addPropertyChangeListener(pcl);
	 }

	 public void removePropertyChangeListener(PropertyChangeListener pcl) {
	     support.removePropertyChangeListener(pcl);
	 }

	 public void setPosition1(String value) {
	     support.firePropertyChange("standup", this.standup, value);
	     this.standup = value;
	     
	 public void setPosition2(String value) {
		 support.firePropertyChange("laydown", this.laydown, value);
		 this.laydown = value;

	 }
}
