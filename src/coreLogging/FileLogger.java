package coreLogging;

public class FileLogger implements ILogger{

	@Override
	public void log() {
		
		System.out.println("File is logged.");
	}

}
