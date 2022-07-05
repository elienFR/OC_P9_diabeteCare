package com.mediscreen.clientui.model.beans;

public enum Gender {
  F("female"),
  M("male"),
  NB("non-binary"),
  NA("not communicated");

  final String name;

  Gender(String name){
    this.name =name;
  }

  @Override
  public String toString() {
    return "Gender{" +
      "gender='" + this.name + '\'' +
      '}';
  }
}