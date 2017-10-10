/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.jpa.jsonClasses.ClassesToJson;
import java.io.IOException;
import java.sql.SQLException;
import org.testng.annotations.Test;

/**
 *
 * @author edwigegédéon
 */
public class JsonTest {
    @Test
    public void jsonTest() throws SQLException, IOException{
        ClassesToJson c = new  ClassesToJson();
        c.jsonBailleur();
        c.jsonBeneficiaire();
        c.jsonFournisseur();
        c.jsonIndicateur();
        c.jsonProgramme();
        c.jsonProjet();
    }
}
