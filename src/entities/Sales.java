package entities;

public class Sales {
	private int id;
	private Customer customer;
	private Game game;
	public Sales(int id, Customer customer, Game game) {
		this.id = id;
		this.customer = customer;
		this.game = game;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}

	public int getId() {
		return id;
	}
}
