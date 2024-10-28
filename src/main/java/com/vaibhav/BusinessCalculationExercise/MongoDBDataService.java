package com.vaibhav.BusinessCalculationExercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements IDataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11, 22, 55, 66, 99, 88, 77, 33, 44};
    }
}
