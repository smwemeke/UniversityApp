package edu.miu.cs489.universityapp.service.impl;

import edu.miu.cs489.universityapp.model.Professor;
import edu.miu.cs489.universityapp.repository.ProfessorRepo;
import edu.miu.cs489.universityapp.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepo professorRepo;

    @Override
    public List<Professor> listProfessors(String lastName) {
        return  professorRepo.findProfessorByLastName(lastName);
    }
}
