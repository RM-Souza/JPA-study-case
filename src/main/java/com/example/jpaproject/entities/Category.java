package com.example.jpaproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;
    private String name;

    public Category(Long idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products =  new HashSet<>();

}
