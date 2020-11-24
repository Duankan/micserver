package com.ktw.micserver.consume.controller;

import com.ktw.micserver.consume.service.IPdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BussiessController {
    @Autowired
    IPdfService iPdfService;

    @GetMapping("/consume/pdf/getPdfTemplate/{pdfname}")
    public Map getPdf(@PathVariable String pdfname) {
        return iPdfService.getPdf(pdfname);
    }
}
