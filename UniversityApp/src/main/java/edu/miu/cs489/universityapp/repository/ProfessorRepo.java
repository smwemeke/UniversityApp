package edu.miu.cs489.universityapp.repository;

import edu.miu.cs489.universityapp.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepo extends JpaRepository<Professor, Long> {
    List<Professor> findProfessorByLastName(String lastName);
}
