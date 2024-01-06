package org.skripnal;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
    private int id;
    private int total;
    private Set<Cart> carts = new HashSet<>();

    public Item() {
    }

    public Item(int total, Set<Cart> carts) {
        this.total = total;
        this.carts = carts;
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


    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && total == item.total && Objects.equals(carts, item.carts);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", total=" + total +
                ", carts=" + carts +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, carts);
    }
}
