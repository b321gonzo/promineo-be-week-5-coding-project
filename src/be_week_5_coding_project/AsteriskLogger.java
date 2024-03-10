package be_week_5_coding_project;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String string) {
		System.out.println("***" + string + "***");
	}

	@Override
	public void error(String string) {
		StringBuilder asterisks = new StringBuilder();
		for (int i = 0; i < string.length() + 13; i++) {
			asterisks.append("*");
		}
		System.out.println(asterisks.toString());
		System.out.println("***Error: " + string + "***");
		System.out.println(asterisks.toString());
	}

}
