import java.util.TreeSet;

public class Wordlist{
	public static void main(String[] args){
		String text;
		text="Either the well was very deep, or she fell very slowly, for she had plenty"
		+ "of time as she went down to look about her and to wonder what was going to happen" 
		+ "next. First she tried to look down and make out what she was coming to, but it was" 
		+ "too dark to see anything; then she looked at the sides of the well and noticed that" 
		+ "they were filled with cupboards and book-shelves; here and there she saw maps and " 
		+ "pictures hung upon pegs. She took down a jar from one of the shelves as she passed;" 
		+ " it was labelled ORANGE MARMALADE, but to her great disappointment it was empty: "
		+ "she did not like to drop the jar for fear of killing somebody, so managed to put it "
		+ "into one of the cupboards as she fell past it.";

		String[] words = text.split(" ");
		for(String w: words){
			System.out.println(w);
		}
		System.out.println("Total Number of words :" +text.length());

		TreeSet<String> wordlist = new TreeSet<String>();

		for(String w : words){
			wordlist.add(w);
		} 
		System.out.println("Total Number of unique words :" +wordlist.size());
	}

}