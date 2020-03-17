package baseStructures;

import org.springframework.data.annotation.Id;

public class BaseLinkEntity {
  @Id
  private String id;
  private String linkValue;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLinkValue() {
    return linkValue;
  }

  public void setLinkValue(String linkValue) {
    this.linkValue = linkValue;
  }
}
