package edu.miu.cs489.universityapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "professor")
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "prof_id")
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name =" professor_course",
            joinColumns = @JoinColumn(name="professorId"),
            inverseJoinColumns = @JoinColumn(name = "courseId")
    )
    List<Course> courses;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Department department;
}
