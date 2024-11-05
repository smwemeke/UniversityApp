package edu.miu.cs489.universityapp.service;

import edu.miu.cs489.universityapp.model.Professor;

import java.util.List;
import java.util.Optional;

public interface ProfessorService {
    public List<Professor> listProfessors(String lastName);
}
