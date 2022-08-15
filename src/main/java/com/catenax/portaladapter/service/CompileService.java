package com.catenax.portaladapter.service;


import com.catenax.portaladapter.dto.CompiledData;
import com.catenax.portaladapter.dto.ConfigData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompileService {

    private final DihAuthService dihAuthService;
    public CompiledData compileConfigData(ConfigData configData) {
        return new CompiledData();
    }
}
