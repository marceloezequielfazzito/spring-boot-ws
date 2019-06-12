package com.eduit.spring.ws.service;

import com.eduit.spring.ws.repository.DummyItemRepository;
import com.eduit.spring.ws.resource.response.ItemResponse;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemServiceTest {


    public static final long ID = 1L;
    private ItemService itemService;
    private ItemResponse response;

    @Test
    public void shouldReturnAndItemResponse(){
        givenAnItemService();
        whenGetItemById();
        thenMustCreateItemResponse();
    }

    private void thenMustCreateItemResponse() {
        assertNotNull(response);
        assertEquals(new Long(ID), response.getId());
        assertEquals("item", response.getName());
        assertEquals(new Float(1000f), response.getPrice());
        assertEquals(new Integer(100), response.getQuantity());
    }

    private void whenGetItemById() {
        response = itemService.getById(ID);
    }

    private void givenAnItemService() {
        itemService = new ItemService(new DummyItemRepository());
    }


}
