package diary.controller;

import diary.domain.Entry;
import diary.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("entry")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @GetMapping("")
    public List<Entry> findAll(){
        return entryService.findAll();
    }

    @GetMapping("{id}")
    public Entry findOneById(@PathVariable("id") UUID id){
        return entryService.findOne(id);
    }

}
