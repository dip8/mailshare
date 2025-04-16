package com.mailshare.controller;

import com.mailshare.model.EmailModel;
import com.mailshare.service.IEmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private IEmailServices emailServices;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailModel emailModel) {
        emailServices.sendEmail(emailModel);
        return ResponseEntity.ok("Email sent Successfully");
    }
}
