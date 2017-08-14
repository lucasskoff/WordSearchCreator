import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileParserTest
{
	@Test
	public void ReadInFile() throws FileNotFoundException{
		String[] correctWords = {"CORN", "PIG"};
		List<String> correctWordsFromFile = Arrays.asList(correctWords);
		FileParser fileParser = new FileParser();
		fileParser.collectWordsFromFileNameAsList("testfiles/twoWordsForWordSearch");
		assertEquals(correctWordsFromFile, fileParser.getWordsFromFile());
	}
}
