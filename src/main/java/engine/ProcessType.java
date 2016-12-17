package engine;

public enum ProcessType {

	REMEDIO_BRASIL("importar_remedio_brasil");

	private final String path;

	private ProcessType(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
}
