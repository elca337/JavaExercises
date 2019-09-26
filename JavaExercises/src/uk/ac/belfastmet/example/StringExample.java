package uk.ac.belfastmet.example;

public class StringExample {

	public static void main(String[] args) {
		
//		StringExample lengthOne = new StringExample();
//		lengthOne.StringLength();
		
		StringExample upperCase = new StringExample();
		upperCase.toUpperCase();
		
//		StringExample lowerCase = new StringExample();
//		lowerCase.toLowerCase(); 
		
//		StringExample indexExample = new StringExample();
//		indexExample.indexLocator();
		
//		StringExample letterExample = new StringExample();
//		letterExample.firstCharacter();
		
//		StringExample subStringWord = new StringExample();
//		subStringWord.subcharacter();
		
//		StringExample containIf = new StringExample();
//		containIf.containsString();
		
//		StringExample sentenceSplit = new StringExample();
//		sentenceSplit.splitString();

	}
	
	//length of the string
	public void StringLength() {
		String name = "LeeCasey";
		System.out.println("The length of the string is " + name.length());
	}
	//converts string to upper case
	public void toUpperCase() {
		String randomString = "asd fghjkl sdfg hjk";
		System.out.println(randomString.toUpperCase());
	}
	//converts string to lower case
	public void toLowerCase() {
		String aString = "QWERTYUIOPQWERTYUIOP";
		System.out.println(aString.toLowerCase());
	}
	//identifies the index of selected string
	public void indexLocator() {
		String anotherString = "my name is lee and i am from lurgan";
		System.out.println(anotherString.indexOf("lee"));
	}
	//identifies char at specific index
	public void firstCharacter() {
		String nameOne = "LeeMCasey";
		char letter = nameOne.charAt(4);
		System.out.println(letter);
	}
	//selects specified substring
	public void subcharacter() {
		String word = "lurgan";
		String subCharacter = word.substring(2,5);
		System.out.println(subCharacter);
	}
	//identifies if string contains selected characters
	public void containsString() {
		String wordTwo = "AnLorgain";
		Boolean contains = wordTwo.contains("An");
		if (contains) {
			System.out.println("It contains selected string");
		}
	}
	//splits sentence into individual words
	public void splitString() {
		String sentence = "I am studying Irish on Duolingo";
		String[] strings = sentence.split(" ");
		System.out.println("Length is " + strings);
		for (int y = 0; y < strings.length; y++) {
			System.out.println(strings[y]);
		}
	}
	
	

}
