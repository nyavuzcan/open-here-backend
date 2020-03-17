package Hospital.entity;

import baseStructures.BaseEntity;
import baseStructures.BaseEntity;
import dto.CoordinateRequest;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hospitals")
public class HospitalEntity extends BaseEntity {
  private String hostpitalName;
  private String adress;
  private String tel;
  private CoordinateRequest coordinateRequest;

  public String getHostpitalName() {
    return hostpitalName;
  }

  public void setHostpitalName(String hostpitalName) {
    this.hostpitalName = hostpitalName;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public CoordinateRequest getCoordinateRequest() {
    return coordinateRequest;
  }

  public void setCoordinateRequest(CoordinateRequest coordinateRequest) {
    this.coordinateRequest = coordinateRequest;
  }
}