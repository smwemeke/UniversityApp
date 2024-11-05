package edu.miu.cs489.universityapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Setter
@Getter
@Table(name ="department")
@NoArgsConstructor
public class Department {

    private Long id;
    private String name;
    @OneToMany(mappedBy = "department")
    private List<Course> courses;
}
