package engine;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("process")
class ProcessTag {
	
	@XStreamAsAttribute
	private String name;

	@XStreamImplicit
	private List<TaskGroupTag> groups;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TaskGroupTag> getGroups() {
		return groups;
	}

	public void setGroups(List<TaskGroupTag> groups) {
		this.groups = groups;
	}
}
