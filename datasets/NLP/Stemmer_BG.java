import java.io.*;
// jdk 1.4+!!!
import java.util.regex.*;
import java.util.*;

/**
 * Stemming algorithm by Preslav Nakov.
 * @author Alexander Alexandrov, e-mail: sencko@mail.bg
 * @since 2003-9-30
 */
public class Stemmer {
  
  public Hashtable stemmingRules = new Hashtable();
  
  public int STEM_BOUNDARY = 1;

  public static Pattern vocals = Pattern.compile("[^àúîóåèÿþ]*[àúîóåèÿþ]");
  public static Pattern p = Pattern.compile("([à-ÿ]+)\\s==>\\s([à-ÿ]+)\\s([0-9]+)");
  
  
  public void loadStemmingRules(String fileName) throws Exception {
    stemmingRules.clear();
    FileInputStream fis = new FileInputStream(fileName);
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
    String s = null;
    while ((s = br.readLine()) != null) {
      Matcher m = p.matcher(s);
      if (m.matches()) {
        int j = m.groupCount();
        if (j == 3) {
          if (Integer.parseInt(m.group(3)) > STEM_BOUNDARY) {
            stemmingRules.put(m.group(1), m.group(2));
          }
        }
      }
    }
  }

  public String stem(String word) {
    Matcher m = vocals.matcher(word);
    if (!m.lookingAt()) {
      return word;
    }
    for (int i = m.end() + 1; i < word.length(); i++) {
      String suffix = word.substring(i);
      if ((suffix = (String) stemmingRules.get(suffix)) != null) {
        return word.substring(0, i) + suffix;
      }
    }
    return word;
  }
  
}
