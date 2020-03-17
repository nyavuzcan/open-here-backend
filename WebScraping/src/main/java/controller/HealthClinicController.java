package controller;

import Hospital.service.HealthClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scraper/healthClinic")
public class HealthClinicController {

  @Autowired
  HealthClinicService healthClinicService;

  @GetMapping(value = "/healthClincs")
  public void scrapeHealthClincs() {
    healthClinicService.scrapHealthClinics();
  }

  @GetMapping(value = "/healthClinicsLinks")
  public void scrapeHeathClinicsLinks(){
    healthClinicService.scrapHealthClinicsLinks();
  }
}
