package com.HW15.HW15;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository repository;

    public List<Note> listAll() {
        return repository.findAll();
    }

    public synchronized Note add(Note note) {
        return repository.save(note);
    }

    public Note getById(long id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public synchronized void deleteById(long id) {
        repository.deleteById(id);
    }

    public synchronized void update(Note note) {
        repository.save(note);
    }
}