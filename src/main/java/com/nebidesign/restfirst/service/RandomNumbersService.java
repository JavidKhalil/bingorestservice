package com.nebidesign.restfirst.service;

import com.nebidesign.restfirst.domain.RandomNumbersDomain;
import com.nebidesign.restfirst.repository.RandomnumberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RandomNumbersService {

    @Autowired
    private RandomnumberRepo randomnumberRepo;

    private Map<Date, RandomNumbersDomain> winnedRandomNumberDomain = new HashMap<>();
    private Integer upperBound = 100;
    private Integer howManyNumbersWeNeed = 5;

    private Date currentTime = new Date();

    public RandomNumbersDomain fillMap(){
        generateRandomNums(winnedRandomNumberDomain);
        return winnedRandomNumberDomain.get(currentTime);
    }

    private void generateRandomNums(Map<Date, RandomNumbersDomain> winnedNumbers) {
        Random random = new Random();
        List<Integer> winnedValues = new ArrayList<>();
        for (int i = 0; i < howManyNumbersWeNeed; i++ ){
            winnedValues.add(random.nextInt(upperBound));
        }
        RandomNumbersDomain domain = new RandomNumbersDomain();
        domain.setWinnerNumbers(winnedValues);
        domain.setCreatedDate(currentTime);
        domain.setGeneratedDate(currentTime);
        randomnumberRepo.save(domain);
        winnedNumbers.put(currentTime, domain);
    }

}
