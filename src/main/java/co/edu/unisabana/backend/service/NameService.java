package co.edu.unisabana.backend.service;

import co.edu.unisabana.backend.entity.Name;
import co.edu.unisabana.backend.repository.NameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NameService {
    private final NameRepository nameRepository;

    public List<Name> getNames() { return nameRepository.findAll(); }

    public Name saveName(String name) {
        return nameRepository.save(name);
    }
}
