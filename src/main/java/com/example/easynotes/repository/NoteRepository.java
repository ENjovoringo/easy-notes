package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.easynotes.mode1.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    
}
