package org.skripnal;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cart {
    private int id;
    private int total;
    private String name;
    private Set<Item> items = new HashSet<>();

    public Cart() {
    }

    public Cart(int total, String name, Set<Item> items) {
        this.total = total;
        this.name = name;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id && total == cart.total && Objects.equals(name, cart.name) && Objects.equals(items, cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, name, items);
    }

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", total=" + total + ", name='" + name + '\'' + ", items=" + items + '}';
    }
}
