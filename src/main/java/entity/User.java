/**
 * 
 */
package entity;

/**
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * 
 *         Please document me!!
 */
public class User {

	private long id;
	private String name;
	private String role;

	/**
	 * @param name
	 * @param role
	 */
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	protected User() {

	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
