package com.bootcamp;

import com.bootcamp.jpa.jsonClasses.ClassesToJson;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class App 
{
    
    public static void main( String[] args ) throws ParseException, SQLException, IOException{
        ClassesToJson c = new  ClassesToJson();
        c.jsonBailleur();/*
        c.jsonBeneficiaire();
        c.jsonFournisseur();
        c.jsonIndicateur();
        c.jsonProgramme();
        c.jsonProjet();*/
   }
}
