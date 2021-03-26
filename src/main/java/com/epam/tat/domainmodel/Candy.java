package com.epam.tat.domainmodel;

/**
 * Class Description:
 * Extend class 'com.epam.tat.domainmodel.candies.Candy' from abstract class 'com.epam.tat.domainmodel.candies.CandyBase',
 * implement constructor om.epam.tat.domainmodel.candies.Candy() with two arguments:
 * 'name' as String, 'weight' as int,
 * override and implement get() and set() methods by default and
 * put this class into package 'com.epam.tat.domainmodel.candies'.
 * <p>
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
