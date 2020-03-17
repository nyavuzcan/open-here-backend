package base;

public class GeneralEnumerationDefinition {
  public enum BaseLinks{
    HASTANE_TR("www.link.com");
    private String shortCode;

    BaseLinks(String shortCode) {
      this.shortCode = shortCode;
    }
  }
}
