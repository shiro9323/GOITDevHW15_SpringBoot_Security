package com.goit.GOITDevHW15_SpringBoot_Security.repository;

import com.goit.GOITDevHW15_SpringBoot_Security.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}