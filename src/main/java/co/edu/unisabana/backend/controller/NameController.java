package co.edu.unisabana.backend.controller;

import co.edu.unisabana.backend.entity.Name;
import co.edu.unisabana.backend.service.NameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/names")
@RequiredArgsConstructor
public class NameController {
    private final NameService nameService;

    @GetMapping
    public List<Name> getNames() { return nameService.getNames(); }

    @PostMapping
    public Name addName(@RequestBody Name name) { return nameService.saveName(name.getName()); }
}
