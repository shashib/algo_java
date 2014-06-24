import java.util.HashMap;
import java.util.*;

public class WordCount{
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
		//Arrays.sort(words);
		int count1=0;
		int count2=0;
		int count3=0;
		/*for(String w: words){
			//System.out.println(w);
		}*/
		
		System.out.println("Total Number of words :" +words.length);

		HashMap<String,Integer> wordlist = new HashMap<String,Integer>();

		for(String w : words){
			++count3;
			if(wordlist.containsKey(w)){
				wordlist.put(w, (wordlist.get(w)+1));
				++count1;
			}else{
				wordlist.put(w,1);
				++count2;
			}
		} 
		System.out.println("Total Count : "+ count3 +"Size :" + words.length );
		System.out.println("Count1 : "+ count1 + "Count2 :" +count2);
		System.out.println("Total Number of unique words :" +wordlist.size());

		Set set = wordlist.entrySet();
		Iterator i= set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ":" +me.getValue());
		}
	}

}