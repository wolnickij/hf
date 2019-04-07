package pl.sda.dao;

import pl.sda.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    List<Customer> findAll();

    Optional<Customer> findById(int id);

    int create(Customer customer);

    int update(Customer customer);

    void delete(int id);

}
