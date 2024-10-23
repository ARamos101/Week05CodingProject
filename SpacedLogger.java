package week05;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println(spacedWord(log));
		}
		

	@Override
	public void error(String error) {
		System.out.println("ERROR: " + spacedWord(error));
	}
	private String spacedWord(String word) {
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			newWord.append(word.charAt(i)).append(" ");
			}
		
		newWord.append("\n");
		
		return newWord.toString();
		}

}
