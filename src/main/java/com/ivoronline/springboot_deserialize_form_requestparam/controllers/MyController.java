package com.ivoronline.springboot_deserialize_form_requestparam.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
public class MyController {

  //================================================================================
  // GET FORM DATA
  //================================================================================
  @RequestMapping("GetFormData")
  String getFormData(
    @RequestParam String        name,
    @RequestParam Integer       age,
    @RequestParam MultipartFile file
  ) throws IOException {

    //GET FILE CONTENT
    byte[] fileBytes = file.getBytes();
    String fileContent      = new String(fileBytes);

    //RETURN SOMETHING
    String result = name + " is " + age + " years old \n";
           result += fileContent;
    return result;

  }

}


