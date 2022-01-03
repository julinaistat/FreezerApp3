package com.example.freezerapp3;

import java.time.LocalDate;
import java.util.*;
import java.sql.Date;

import com.example.freezerapp3.entity.Food;
import com.example.freezerapp3.entity.Unit;
import com.example.freezerapp3.entity.cookedFood;
import com.example.freezerapp3.entity.rawFood;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.freezerapp3.entity.Unit.*;

@SpringBootApplication
public class FreezerApp3Application implements CommandLineRunner {

    //I'll need a logger to check the jdbcspring stuff
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //this dao variable is used later to throw an exception i think
    @Autowired
    JdbcFood dao;

    public static void main(String[] args) {

        SpringApplication.run(FreezerApp3Application.class, args);

        cookedFood milanesaDePollo = new cookedFood("Milanesas", 0.500, KG, LocalDate.of(2000,10,10));
        cookedFood sopaParaguaya = new cookedFood("Sopa Paraguaya");
        rawFood palmitos = new rawFood("Palmitos");
        //System.out.println(milanesaDePollo);
        //System.out.println(sopaParaguaya);

        // We'll store them in a HashMap

        Map freezerMap = new HashMap();
        freezerMap.put("'Milanesa'", milanesaDePollo);
        freezerMap.put("'Palmitos'", palmitos);
        //System.out.println(freezerMap);

        /*
        ----- How to do it with arraylist -----
        ArrayList freezer = new ArrayList<>();
        freezer.add(milanesaDePollo);
        freezer.add(sopaParaguaya);
        freezer.add(Palmitos);
        System.out.println(freezer.get(2));
        boolean isInFreezer = freezer.contains(milanesaDePollo);
        freezer.remove(sopaParaguaya);
        */


        // ADD INPUT FOR EVERYTHING

    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("All food -> {}", dao.findAll() );
        logger.info("Meal cheese -> {}", dao.findByName("Cheese") );
        logger.info("Delete Hot Dogs -> No of rows deleted - {}", dao.deleteByName("Hot Dogs") );
        // HELP WITH INSERT: It asks for a string but the constructor says it's an enum
        logger.info("Inserting Steak -> {}", dao.insert(new Food("Steak", 677, null,null)));
        logger.info("Insert new -> {}", dao.insert(new cookedFood("Sopa Paraguaya")));
        logger.info("Meal Steak -> {}", dao.findByName("Steak") );
        logger.info("All food -> {}", dao.findAll() );
    }
}
