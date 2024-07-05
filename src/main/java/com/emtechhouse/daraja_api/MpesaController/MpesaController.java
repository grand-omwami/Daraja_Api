package com.emtechhouse.daraja_api.MpesaController;

import com.emtechhouse.daraja_api.Dto.AccessTokenResponse;
import com.emtechhouse.daraja_api.MpesaService.DarajaApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Kpesa")
public class MpesaController {

    private final DarajaApi darajaApi;

    public MpesaController(DarajaApi darajaApi) {
        this.darajaApi = darajaApi;
    }

    @GetMapping(path = "/token", produces = "application/json")
    public ResponseEntity<AccessTokenResponse> getAccessToken() {
        return ResponseEntity.ok(darajaApi.getAccessToken());
    }
}
