package be_week_5_coding_project;

public class SpacedLogger implements Logger{

	@Override
	public void log(String string) {
		StringBuilder spacedString = new StringBuilder();
		spacedString.append(string.charAt(0));
		for (int i = 1; i < string.length(); i++) {
			spacedString.append(" " + string.charAt(i));
		}
		System.out.println(spacedString.toString());
	}

	@Override
	public void error(String string) {
		StringBuilder spacedString = new StringBuilder("ERROR: ");
		spacedString.append(string.charAt(0));
		for (int i = 1; i < string.length(); i++) {
			spacedString.append(" " + string.charAt(i));
		}
		System.out.println(spacedString.toString());
	}

}
