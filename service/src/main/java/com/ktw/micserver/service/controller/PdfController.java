package com.ktw.micserver.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PdfController {
    @GetMapping("/service/pdf/getPdfTemplate/{pdfname}")
    public Map getPdf(@PathVariable String pdfname) {
        Map response = new HashMap();
        response.put("time", System.currentTimeMillis());
        response.put("pdfname", pdfname);
        return response;
    }
}
