package com.portea.paa.service;

import org.springframework.stereotype.Service;

@Service
public class PaaRestServiceImpl implements PaaRestService {
    @Override
    public String testMySystem() {

        return "Tested system";
    }
}
