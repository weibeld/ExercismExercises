public class Acronym {

  String mAcronym;

  public Acronym(String phrase) {
    mAcronym = createAcronym(phrase);
  }

  private String createAcronym(String phrase) {
    // Regex for splitting camelcase from http://stackoverflow.com/a/7599674/4747193
    String[] words = phrase.split("\\W+|(?<=\\p{Lower})(?=\\p{Upper})|(?<=\\p{Upper})(?=\\p{Upper}\\p{Lower})");
    StringBuffer acronym = new StringBuffer();
    for (int i = 0; i < words.length; i++) {
      acronym.append(words[i].substring(0,1).toUpperCase());
    }
    return acronym.toString();
  }

  public String get() {
    return mAcronym;
  }

}
