package com.example.homework15.servise;

import com.example.homework15.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    public Note getById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public Note add(Note note) {
        return noteRepository.save(note);
    }

    public void update(Note updatedNote) {
        noteRepository.save(updatedNote);
    }
}