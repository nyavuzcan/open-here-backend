package controller;

import Hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scraper/hospital")
public class HospitalController {
  @Autowired
  HospitalService hospitalService;

  @GetMapping(value = "/hospitals")
  public void scrapHospitals() {
    hospitalService.scrapHospitals();
  }

  @GetMapping(value = "/hospitalsLinks")
  public void scrapHospitalsLinks() {
    hospitalService.scrapHospitalsLinks();
  }
}
