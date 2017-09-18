import java.util.Arrays;
import java.util.Scanner;

public class UrlsFromHandles {

	public static void main(String[] args) {

		System.out.println("Please enter a Github handle!");

		Scanner myScanner = new Scanner(System.in);
		String ghhandle1 = myScanner.nextLine();

		System.out.println("Please enter another Github handle!");
		String ghhandle2 = myScanner.nextLine();

		String[] example = {ghhandle1, ghhandle2};

		System.out.println("Here are your greenfox email addresses:");
		System.out.println("https://github.com/greenfox-academy/" + ghhandle1);
		System.out.println("https://github.com/greenfox-academy/" + ghhandle2);
	}
	// Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
	// GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

	// example:
	// input: ["ghhandle1", "ghhandle2"]
	// output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]


//        System.out.println(urlsFromHandles(Arrays.asList("ghhandle1", "ghhandle2")));
}