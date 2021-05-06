package concrete;

import java.util.List;

import abstracts.CustomerService;
import entities.Customer;
import abstracts.CustomerCheckService;

public class CustomerManager implements CustomerService{

	boolean customerOnThere = false;
	List<Customer> customers;
	private CustomerCheckService customerCheckService;

	public CustomerManager(List<Customer> customers,CustomerCheckService customerCheckService) {
		this.customers = customers;
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer))
		{
			for (Customer customerInList : customers) {
				if(customerInList.getId() == customer.getId() )
				{
					customerOnThere = true;
					System.out.println("Customer could not be added for this reason :"
							+ " There is a customer has the same id on the list.");
				}
			}
			if(!customerOnThere)
			{
			customers.add(customer);
			System.out.println("Customer added successfully");
			}
		}
		else
		{
			System.out.println("Customer could not be added for this reason :"
					+ " The information entered for verification is not real.");
		}
	}

	@Override
	public void update(int id, String firstName,String lastName) {
		for (Customer customer : customers) {
			if(customer.getId() == id)
			{
				customerOnThere = true;
				customer.setFirstName(firstName);
				customer.setLastName(lastName);
				System.out.println("Customer updated. New customer name and surname : " 
				+ customer.getFirstName() + " " + customer.getLastName());
			}
		}
		//means false
		if(!customerOnThere)
		{
			System.out.println("There is no such customer on the list.");
		}
	}

	@Override
	public void delete(int id) {
		for (Customer customer : customers) {
			if(customer.getId() == id)
			{
				customerOnThere = true;
				customers.remove(customer);
				System.out.println("Customer deleted : " + customer.getFirstName() + " " + customer.getLastName()); 
			}
		}
		if(!customerOnThere)
		{
			System.out.println("There is no such customer on the list.");
		}
	}

	@Override
	public void getAll() {
		for (Customer customer : customers) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
		
	}



}
