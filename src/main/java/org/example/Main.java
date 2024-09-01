package org.example;

import org.example.CustomerManagement;

import java.util.LinkedList;


class Stack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    // Adds an item to the top of the stack
    public void push(T item) {
        stack.addFirst(item);
    }

    // Removes and returns the top item of the stack
    public T pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack.removeFirst();
    }


    public T peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stack.getFirst();
    }
    // Checks if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Returns the number of elements in the stack
    public int size() {
        return stack.size();
    }
}

// Customer class  store customer details
class Customer {
    private String name;
    private String email;
    private int age;

    public Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Email: " + email + ", Age: " + age;
    }
}


public class Main {
    private Stack<Customer> customerStack = new Stack<>();


    public void addCustomer(String name, String email, int age) {
        Customer customer = new Customer(name, email, age);
        customerStack.push(customer);
    }
    public void displayCustomersFromNewestToOldest() {
        while (!customerStack.isEmpty()) {
            Customer customer = customerStack.pop();
            System.out.println(customer);
        }
    }
    public static void main(String[] args) {
        CustomerManagement management = new CustomerManagement();

        // Add customers to stack
        management.addCustomer("tharidi", "tharidi@example.com", 30);
        management.addCustomer("thisarani", "tharidi@example.com", 25);
        management.addCustomer("Alice", "alice@example.com", 40);

        management.displayCustomersFromNewestToOldest();
    }
}
