package com.nimbleways.springboilerplate.services.implementations;

import com.nimbleways.springboilerplate.businessservice.IOrderBusinessService;
import com.nimbleways.springboilerplate.businessservice.IProductBusinessService;
import com.nimbleways.springboilerplate.services.IProductService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @InjectMocks
    IProductService productService;

    @Mock
    IProductBusinessService productBusinessService;

    @Mock
    IOrderBusinessService orderBusinessService;

    @Mock
    NotificationService notificationService;


    @BeforeEach
public  void setUp(){

    }
}
