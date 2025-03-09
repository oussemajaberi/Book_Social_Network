package com.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Token {

    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDate createdAt;
    private LocalDate expiresAt;
    private LocalDate validatedAt;

    @ManyToOne
    @Column(name="UserId",nullable = false)
    private User user;

}
