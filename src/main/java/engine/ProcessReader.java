package engine;

import java.io.InputStream;

import com.thoughtworks.xstream.XStream;

class ProcessReader {

	static ProcessTag read(String path) {
		XStream xStream = new XStream();
		xStream.processAnnotations(ProcessTag.class);
		InputStream in = ProcessReader.class.getClassLoader().getResourceAsStream(path);
		ProcessTag process = (ProcessTag) xStream.fromXML(in);
		return process;
	}
}
