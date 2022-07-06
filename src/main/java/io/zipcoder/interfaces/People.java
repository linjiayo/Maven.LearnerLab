package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    List<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }
    public People(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    public boolean contains(Person person) {
        return personList.contains(person);
    }
    public boolean remove(Person person) {
        return personList.remove(person);
    }

    public boolean remove(long id) {
        return personList.remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}
