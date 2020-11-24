package com.ktw.micserver.consume.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "micserver-service")
public interface IPdfService {
    @RequestMapping(value = "/service/pdf/getPdfTemplate/{pdfname}", method = RequestMethod.GET)
    Map getPdf(@PathVariable("pdfname") String pdfname);
}
