/*
 * Copyright © 2020 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */

/**
 * Class Description:
 * Extend class 'candies.Candy' from abstract class 'candies.CandyBase',
 * implement constructor candies.Candy() with two arguments:
 * 'name' as String, 'weight' as int,
 * override and implement get() and set() methods by default and
 * put this class into package 'candies'.
 * <p>
 * Created by sergei_tsarik on 12/21/20.
 */
public class Candy
{

    /**
     * Implement constructor with two arguments:
     * @param name
     * @param weight
     */
    public Candy(String name, int weight)
    {
        /**
         * Assign parameter 'name' to class variable 'name' and
         * parameter 'weight' to class variable 'weight'.
         */
    }

    /**
     * No actions are required within the method getName
     */
    @Override
    public String getName()
    {
        return name;
    }

    /**
     * No actions are required within the method setName
     */
    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Implement method getWeight which
     * returns class variable 'weight'
     */
    @Override
    public int getWeight()
    {
        /**
         * return class variable 'weight'.
         */
        throw new UnsupportedOperationException("You need to implement this method");
    }

    /**
     * Implement method setWeight with
     * @param weight
     * which is assigned to class variable 'weight'.
     */
    @Override
    public void setWeight(int weight)
    {
        /**
         * Assign parameter weight to class variable 'weight'.
         */
        throw new UnsupportedOperationException("You need to implement this method");
    }
}
