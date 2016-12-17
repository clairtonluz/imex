package engine;

public class BusinessProcess {

	private final ProcessTag processTag;

	public BusinessProcess(ProcessType processType) {
		processTag = ProcessReader.read("processes/" + processType.getPath() + ".xml");
	}

	public void execute(String taskGroupName, Context context) {
		for (TaskGroupTag taskGroup : processTag.getGroups()) {
			if (taskGroupName.equals(taskGroup.getName())) {
				executeTasks(taskGroup, context);
				return;
			}
		}
		throw new IllegalStateException("TaskGroup não encontrado.");
	}

	private void executeTasks(TaskGroupTag taskGroup, Context context) {
		for(TaskTag taskTag: taskGroup.getTasks()) {
			try {
				Task  task = (Task) Class.forName(taskTag.getClazz()).newInstance();
				task.execute(context);
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}
	}
}
