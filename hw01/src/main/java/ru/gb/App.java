package ru.gb;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class
App
{
    public static void main( String[] args )
    {

        Person person = new Person("Arty", "PV", 47);
        System.out.println(person);

        Gson personGson = new Gson();
        String json = personGson.toJson(person);
        System.out.println("JSON: " + json);

        Person deserilizedPerson = personGson.fromJson(json, Person.class);
        System.out.println("Deserilized Person: " + deserilizedPerson);
    }
}
