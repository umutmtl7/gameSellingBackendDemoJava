package abstracts;

import entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(int id,String firstName,String lastName);
	void delete(int id);
	void getAll();
}
