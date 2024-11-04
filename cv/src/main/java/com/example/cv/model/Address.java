package com.example.cv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Address {
    @Column(nullable = false)
    protected Integer homeNum ;
    @Column(nullable = false)
    protected String homeStreet;
    @Column(nullable = false)
    protected String city ;
    @Column(nullable = false)
    protected String country ;
}
