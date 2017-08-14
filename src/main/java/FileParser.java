import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FileParser
{
	private List<String> wordsFromFile;

	FileParser(){
		wordsFromFile = new ArrayList<>();
	}

	void collectWordsFromFileNameAsList(String filename) throws FileNotFoundException
	{
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			wordsFromFile.add(scanner.next().toUpperCase());
		}
	}

	List<String> getWordsFromFile() {
		return wordsFromFile;
	}

	void setWordsFromFile(List<String> wordsFromFile) {
		this.wordsFromFile = wordsFromFile;
	}
}
