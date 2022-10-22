package coreLogging;

public class DatabaseLogger implements ILogger{

	@Override
	public void log() {
		
		System.out.println("Database is Logged.");
	}

}
