package ru.hh.school.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

//TODO: оформите entity
@Entity
public class Area {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;

  @Column
  @NotNull // https://www.baeldung.com/hibernate-notnull-vs-nullable
  private String name;

  public Area(){};

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }
}
