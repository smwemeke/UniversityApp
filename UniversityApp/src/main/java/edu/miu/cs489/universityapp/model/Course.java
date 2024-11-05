package edu.miu.cs489.universityapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name ="course")
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "course_id")
    private Long id;
    private String courseName;
    private String courseCode;
    private String courseDescription;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "courses")
    private List<Professor> professor;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
