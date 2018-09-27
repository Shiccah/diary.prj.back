package diary.services;

import diary.domain.Entry;
import diary.repositories.EntryRepository;
import diary.services.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> findAll(){
        return entryRepository.findAll();
    }

    public Entry findOne(UUID id){
        return Optional.ofNullable(entryRepository.findById(id)).get().orElseThrow(() -> new EntityNotFoundException(Entry.class, id));
    }
}
