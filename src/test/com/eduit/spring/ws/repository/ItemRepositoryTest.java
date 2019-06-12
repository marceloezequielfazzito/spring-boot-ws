package com.eduit.spring.ws.repository;


import com.eduit.spring.ws.model.Item;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;
    private Item item;
    private Item item2;
    private List<Item> items;

    @Before
    public void setup(){
        item = new Item("item",101.00f,4);
        item2 = new Item("item",100.00f,2);
        itemRepository.save(item);
        itemRepository.save(item2);
    }

    @After
    public void tearDown(){

        itemRepository.delete(item);
        itemRepository.delete(item2);
    }

    @Test
    public void shouldBeTwoAndNameMustBeCorrect(){
       givenAnItemRepository();
       whenGetItemsByName();
       thenMustBeTwoAndNameMustBeCorrect();
    }

    private void thenMustBeTwoAndNameMustBeCorrect() {
        assertEquals(2, items.size());
        items.forEach(i-> assertEquals("item",i.getName()));
    }

    private void whenGetItemsByName() {
        items = itemRepository.getByName("item");
    }


    public void givenAnItemRepository(){
        this.itemRepository = itemRepository;
    }



}
