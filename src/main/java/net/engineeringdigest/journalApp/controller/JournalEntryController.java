package net.engineeringdigest.journalApp.controller;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/journal") // Add mapping to the class
public class JournalEntryController {

    public Map<Long, JournalEntry>journalEntries = new HashMap<>();

    @GetMapping("/output") //the mapping would be /journal/output
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public void createEntry(){

    }
}
