package pl.sda.dao;

import pl.sda.domain.Customer;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class CustomerDaoImplementation implements CustomerDao {

    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("jpa-dao");
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.empty();
    }

    @Override
    public int create(Customer customer) {
        return 0;
    }

    @Override
    public int update(Customer customer) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
