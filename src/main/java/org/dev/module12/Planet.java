package org.dev.module12;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.processing.Pattern;


@Entity
@Table(name = "planet")

public class Planet {
    @Id
    @Column(length = 10, nullable = false)
    private String id;

    @Column(nullable = false, length = 500)
    private String name;

    public Planet() {
    }


    public Planet(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
