package com.example.restapi.model;


import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name = "message")
public class Message {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "header")
    @NotNull
    private String header;

    @Column(name = "text")
    private String text;

    public Message(String header, String text) {
        this.header = header;
        this.text = text;
    }

    public Message() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
