package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class People<E extends Person> implements Iterable<E>{
    List<E> personList;

//    public People() {
//        //personList = new ArrayList<Person>();
//    }
//    public People(List<E> personList) {
//        //this.personList = personList;
//    }

    public void add(E e) {
        personList.add(e);
    }

    public Person findById(long id) {
        for (E  e : personList) {
            if (e.getId() == id) {
                return e;
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

    abstract public E[] toArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }

}
