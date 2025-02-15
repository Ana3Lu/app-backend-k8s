package co.edu.unisabana.backend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/names")
@CrossOrigin(origins = "*")
public class PublicApiController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String internalApiUrl = "http://internal-api:8081/internal/names";

    @GetMapping
    public List<Map<String, Object>> getNames() {
        return restTemplate.getForObject(internalApiUrl, List.class);
    }

    @PostMapping
    public Map<String, Object> saveName(@RequestBody Map<String, Object> name) {
        return restTemplate.postForObject(internalApiUrl, name, Map.class);
    }
}
