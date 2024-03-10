package be_week_5_coding_project;

public class App {

	public static void main(String[] args) {

		String string = "Goodbye";
		
		Logger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.log(string);
		System.out.println();
		
		asteriskLogger.error(string);
		System.out.println();
		
		
		
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.log(string);
		System.out.println();
		
		spacedLogger.error(string);
		
	}

}
