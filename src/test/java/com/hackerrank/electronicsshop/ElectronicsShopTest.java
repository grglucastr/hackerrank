package com.hackerrank.electronicsshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElectronicsShopTest {

    private ElectronicsShop electronicsShop;

    @BeforeEach
    public void setUp(){
        electronicsShop = new ElectronicsShop();
    }

    @Test
    public void testBuyOneKeyBoardAndOneDriver(){
        int money = 10;
        int keyboards[] = new int[]{3, 1};
        int drivers[] = new int[]{5, 2, 8};

        int maximum = electronicsShop.calculateMaximumToAfford(keyboards, drivers, money);
        assertEquals(9, maximum);
    }

    @Test
    public void testWhenNotEnoughMoneyToAfford(){
        int money = 5;
        int keyboards[] = new int[]{4};
        int drivers[] = new int[]{5};

        int maximum = electronicsShop.calculateMaximumToAfford(keyboards, drivers, money);
        assertEquals(-1, maximum);
    }

}