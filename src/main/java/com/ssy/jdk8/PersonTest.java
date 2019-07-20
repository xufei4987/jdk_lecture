package com.ssy.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/17 19:17
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> personList = Arrays.asList(person1, person2, person3);

        PersonTest personTest = new PersonTest();
        List<Person> persons = personTest.getPersonByUserName("zhangsan", personList);
        persons.forEach(person-> System.out.println(person.getUserName()));

        List<Person> personByAge = personTest.getPersonByAge(30, personList);
        personByAge.forEach(person -> System.out.println(person.getUserName()));

        List<Person> personByAge2 = personTest.getPersonByAge2(40, personList, (a, ps) -> ps.stream().filter((p) -> p.getAge() < a).collect(Collectors.toList()));
        personByAge2.forEach(person -> System.out.println(person.getUserName()));

    }

    public List<Person> getPersonByUserName(String userName, List<Person> personList){
        List<Person> list = personList.stream()
                .filter(person -> person.getUserName().equals(userName))
                .collect(Collectors.toList());
        return list;
    }

    public List<Person> getPersonByAge(int age, List<Person> personList){
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, persons)->{
          return persons.stream().filter(person -> person.getAge() == ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age,personList);
    }

    public List<Person> getPersonByAge2(int age, List<Person> persons, BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,persons);
    }
}
