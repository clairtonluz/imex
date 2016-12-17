package engine;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("taskGroup")
class TaskGroupTag {

	@XStreamAsAttribute
	private String name;
	
	@XStreamImplicit
	private List<TaskTag> tasks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TaskTag> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskTag> tasks) {
		this.tasks = tasks;
	}
	
	
}
