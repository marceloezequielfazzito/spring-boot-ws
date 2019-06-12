package com.eduit.spring.ws.repository;

import com.eduit.spring.ws.model.Item;

import java.util.List;

public class DummyItemRepository implements ItemRepository {

    @Override
    public List<Item> getByName(String name) {
        return null;
    }

    @Override
    public <S extends Item> S save(S s) {
        return null;
    }

    @Override
    public <S extends Item> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Item findOne(Long id) {
        return new Item(id,"item",1000F,100);
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Item> findAll() {
        return null;
    }

    @Override
    public Iterable<Item> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Item item) {

    }

    @Override
    public void delete(Iterable<? extends Item> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
