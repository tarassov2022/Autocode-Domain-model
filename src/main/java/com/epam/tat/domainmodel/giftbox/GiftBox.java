package com.epam.tat.domainmodel.giftbox;
import com.epam.tat.domainmodel.candies.Candy;
import com.epam.tat.domainmodel.util.Finding;
import com.epam.tat.domainmodel.util.Sorting;

import java.util.*;



/**
 * Class Description:
 * Implement interfaces: Sorting and Finding and
 * their methods for sorting candies by name or weight and
 * finding candies by parameters.
 * <p>
 */
public class GiftBox implements Finding, Sorting{
    /**
     * No actions are required for class variable candiesList.
     */
    private List<Candy> candiesList;

   
    /**
     * No actions are required for constructor GiftBox().
     */
    public GiftBox() {
        candiesList = new ArrayList<Candy>();
    }

    /**
     * No actions are required for method addCandy().
     */
    public void addCandy(Candy candy) {
        this.candiesList.add(candy);
    }

    /**
     * Implement sorting of candiesList by its names in ascending order
     * and return sorted by name ascending list of candies.
     */
    @Override
    public List<Candy> sortCandiesByNameAsc() {

        Collections.sort(candiesList, new Comparator<Candy>(){
          public int compare(Candy a,Candy b){
              return a.getName().compareTo(b.getName());
          }
        });

    return candiesList;   // throw new UnsupportedOperationException("You need to implement this method");
    }

    /**
     * Implement sorting of candiesList by its weight in ascending order
     * and return sorted by weight ascending list of candies.
     */
    @Override
    public List<Candy> sortCandiesByWeightAsc() {
        Collections.sort(candiesList, new Comparator<Candy> () {
            public int compare(Candy a, Candy b) {
                return a.getWeight() - b.getWeight();
            }
        });

        //throw new UnsupportedOperationException("You need to implement this method");
    return candiesList;
    }

    /**
     * Implement selection of candies from candiesList with names started with candyNameFirstLetter
     * and return list of candies which names started with candyNameFirstLetter in name ascending list of candies.
     */
    @Override
    public List<Candy> findCandiesByNameStartedWith(char candyNameFirstLetter) {
        List<Candy> flList=new ArrayList<>();
        for ( Candy p : candiesList ){
            if (p.getName().charAt(0)==candyNameFirstLetter){
              flList.add(p);
            }
        }

        //throw new UnsupportedOperationException("You need to implement this method");
        return flList;
    }

    /**
     * Implement selection ot candies from candiesList so that its [weightFrom <= weight => weightTo]
     * and return list of candies with weight in range [weightFrom, weightTo] in weight ascending list of candies.
     */
    @Override
    public List<Candy> findCandiesByWeightInRange(int weightFrom, int weightTo) {
        List<Candy> wrList=new ArrayList<>();
        for ( Candy p : candiesList ){
            if ((p.getWeight()>=weightFrom)&(p.getWeight()<=weightTo)){
                wrList.add(p);
            }
        }

      //  throw new UnsupportedOperationException("You need to implement this method");
        return wrList;
    }
}
