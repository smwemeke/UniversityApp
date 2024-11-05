package edu.miu.cs489.universityapp.repository;

import edu.miu.cs489.universityapp.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepo extends JpaRepository<Professor, Integer> {
}
