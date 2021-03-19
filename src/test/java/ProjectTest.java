/*
 * Copyright © 2020 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */

import candies.Candy;
import giftbox.GiftBox;
import org.junit.jupiter.api.Test;
import util.Finding;
import util.Sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProjectTest {

    @Test
    public void shouldClassesAreInProperPackages() {
        assertEquals("package candies", CandyBase.class.getPackage().toString(), "Class CandyBase is not in package 'candies'");
        assertEquals("package candies", Candy.class.getPackage().toString(), "Class Candy is not in package 'candies'");
        assertEquals("package giftbox", GiftBox.class.getPackage().toString(), "Class GiftBox is not in package 'giftbox'");
        assertEquals("package util", Finding.class.getPackage().toString(), "Interface Finding is not in package 'util'");
        assertEquals("package util", Sorting.class.getPackage().toString(), "Interface Sorting is not in package 'util'");
    }

    @Test
    public void shouldCandyGetWeightReturnWeight() {
        Candy testCandy = new Candy("Bounty", 18);
        assertEquals(18000, testCandy.getWeight(), "Method of 'getWeight' of Candy return wrong value");
    }

    @Test
    public void shouldCandySetWeightChangeWeightValue() {
        Candy testCandy = new Candy("Bounty", 18);
        testCandy.setWeight(5);
        assertEquals(5, testCandy.getWeight(), "Candy has wrong weight after set using 'setWeight' call");
    }
}
