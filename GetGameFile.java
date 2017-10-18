
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author chrissowden
 *
 */


	/**
	 * @param args
	 */
public class GetGameFile {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<String> fArray = new ArrayList<String>();
		fArray.add("http://people.uncw.edu/tompkinsj/331/ch07/50.csv");
		fArray.add("http://people.uncw.edu/tompkinsj/331/ch07/100.csv");
		fArray.add("http://people.uncw.edu/tompkinsj/331/ch07/500.csv");
		// JFrame frame = new JFrame();

		// building the viewer size

		// frame.setSize(1200, 400);
		// frame.setTitle("GAME TIME");
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// sets the Component inside the frame

		// GuessingGame component = new GuessingGame();
		// frame.add(component);

		// frame.setVisible(true);

		for (String listitem : fArray) {

			URL url = new URL(listitem);
			String title = listitem.substring(listitem.lastIndexOf("/") + 1).trim();
			Scanner read = new Scanner(url.openStream());
			String value = null;
			PrintWriter pWriter = new PrintWriter(title, "UTF-8");
			
//While loop that reads each line
			while ((read.hasNextLine())) {
				value = read.nextLine();
				for (String word : value.split(",")) {
//Print out while loop
					System.out.format("%10s", word);
				}
				System.out.println();
				byte ptext[] = value.getBytes();
				String val = new String(ptext, "UTF-8");
				pWriter.println(val);
			}

			System.out.println();
			pWriter.close();
			read.close();

		}
		System.out.println(
				"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(
				"|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
//Here is where you read from the UTF-8 
// then back into a CSV file
		ArrayList<String> eArray = new ArrayList<String>();
		eArray.add("50.csv");
		eArray.add("100.csv");
		eArray.add("500.csv");

		for (String listitem : eArray) {
			String title = listitem.substring(listitem.lastIndexOf("/") + 1).trim();
			Scanner read = new Scanner(new File(listitem));
			String value = null;

			while ((read.hasNextLine())) {
				value = read.nextLine();
				for (String word : value.split(",")) {

					System.out.format("%10s", word);
				}
				System.out.println();

			}
			System.out.println();

			read.close();

		}
	}
}
