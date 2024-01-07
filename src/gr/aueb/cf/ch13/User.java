package gr.aueb.cf.ch13;

/**
 * Defines a user {@link User}.
 * The user has ID{@link #id}, Firstname{@link #firstname}
 * and Lastname{@link #lastname} with <i>mutator</i> methods:
 * {@link #setId(Long)}
 * {@link #setFirstname(String)}
 * {@link #setLastname(String)}
 *
 * @author aposvaki
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    public User() {
    }

    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets user's id.
     *
     * @return
     *          user's id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set user's id.
     *
     * @param id
     *          user's id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets user's firstname.
     *
     * @return
     *          user's firstname.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set user's firstname.
     * @param firstname
     *                  user's firstname.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets user's lastname.
     *
     * @return
     *          user's lastname.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set user's lastname
     *
     * @param lastname
     *                  user's lastname.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
