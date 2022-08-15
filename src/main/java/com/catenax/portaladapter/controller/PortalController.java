package com.catenax.portaladapter.controller;

import com.catenax.portaladapter.dto.CompiledData;
import com.catenax.portaladapter.dto.ConfigData;
import com.catenax.portaladapter.service.CompileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("portaladapter")
@RequiredArgsConstructor
@Slf4j
public class PortalController {


    private final CompileService compileService;

    @PostMapping(consumes = {"application/json"}, produces = {"application/vc+ld+json"})
    @ResponseStatus(HttpStatus.CREATED)
    public CompiledData createCompileData(@RequestBody ConfigData configData) throws Exception {

        return compileService.compileConfigData(configData);
    }
}
