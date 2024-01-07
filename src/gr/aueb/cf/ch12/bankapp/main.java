package gr.aueb.cf.ch12.bankapp;

import gr.aueb.cf.ch12.bankapp.model.*;

public class main {

    public static void main(String[] args) throws Exception {

        User aliceUser = new User("Alice", "Ecila", "12345");
        Account alice = new OverDraftAccount("GR12345", aliceUser, 123);
        alice.setId(1L);

        User bobUser = new User("Bob", "bob", "54321");
        User bob2User = new User("Bob2", "bob2", "54321_2");
        Account bob = new Account("GR54321", bobUser, 987654321);
        JointAccount bob2Joint = new JointAccount(bob, bob2User);

        System.out.println("Old Bob's: " + bob.getBalance());
        System.out.println("Old Bob2's: " + bob2Joint.getBalance() + "\n");

        bob2Joint.withdraw(900000000,"54321_2");
        System.out.println("New Bob's: " + bob.getBalance());
        System.out.println("New Bob2's: " + bob2Joint.getBalance() + "\n");

        System.out.println("Old Alice's balance: " + alice.getAccountBalance());

        alice.withdraw(300, "12345");

        System.out.println("New Alice's balance: " + alice.getAccountBalance());
    }
}
