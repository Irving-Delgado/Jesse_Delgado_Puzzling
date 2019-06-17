import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling{
	public ArrayList sumArray(){
		int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
		int sum = 0;
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>10){
			newArray.add(arr[i]);
			}
			sum += arr[i];
		}
		System.out.println(sum);
		return newArray;
	}
	public ArrayList nameArray(){
		String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		Random name = new Random();
		ArrayList<String> newArr = new ArrayList<String>();
		ArrayList<String> moreThan5 = new ArrayList<String>();

		for(var i = 0; i<arr.length; i++){
			if(arr[i].length()>5){
				moreThan5.add(arr[i]);
			}
			newArr.add(arr[i]);
		}
		Collections.shuffle(newArr);
		System.out.println(newArr);
		return moreThan5;
	}
	public static void letterArray(){
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		ArrayList<Character> alphabet = new ArrayList<Character>();
		for(var i = 0; i<letters.length; i++){
			alphabet.add(letters[i]);
		}
		Collections.shuffle(alphabet);
		System.out.println("The Last letter is: " + alphabet.get(25));
		
		if(alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u') {
            System.out.println("First letter is the vowel: "+ alphabet.get(0));
        }
        else{
        	System.out.println("The first letter is: "+alphabet.get(0));
        }
	}
	public ArrayList<Integer> randomArray(){
		Random name = new Random();
		int count = 0;
		ArrayList<Integer> arr= new ArrayList<Integer>();
		while(count<10){
			arr.add(name.nextInt(45)+55);
			count++;
		}
		return arr;
	}
	public ArrayList<Integer> sortArray(){
		Random name = new Random();
		int count = 0;
		ArrayList<Integer> arr= new ArrayList<Integer>();
		while(count<10){
			arr.add(name.nextInt(45)+55);
			count++;
		}
		Collections.sort(arr);
		System.out.println("The lowest number is: "+arr.get(0));
		System.out.println("The largest number is: "+arr.get(9));
		return arr;
	}
	public static void randomLettersArray(){
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random name = new Random();
		String fiveLetters = "";
		for(int i = 0; i<5; i++){
			fiveLetters += letters[name.nextInt(25)];
		}
		System.out.println("The word of the day is: "+fiveLetters);
	}
	public static void randomTenArray(){
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random name = new Random();
		String fiveLetters = "";
		String temp = "";
		ArrayList<Object> tenByFive = new ArrayList<Object>();
		for(int i = 0; i<10; i++){
			for(int j = 0; j<5; j++){
				fiveLetters += letters[name.nextInt(25)];
			}
			temp = fiveLetters;
			fiveLetters="";
			tenByFive.add(temp);
		}
	
		System.out.println(tenByFive);
	}

}