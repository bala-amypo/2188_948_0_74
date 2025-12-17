package com.example.demo.entity;
 import jakart.persistance,*;


@entity
public class studententity{
    @Id
    @generatedValue(strategy=Generationtype.IDENTITY)
    private long id;

    @NotBlank
    private String name;

    @Email(message"Name is not valid")
    private string email;
    public studentEntity()
    {

    }
    public studentEntity(long id,Stirng name,String emai)
    {
        this.id=id;
    }
}