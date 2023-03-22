package BT1_ArrayList_LinkedList.service;

import java.util.List;

public interface IProductService<E> {
    List<E> findAll();
    E save(E e);
    E findById(int id);
    E delete(int id);
    void findByName(String name);

}
