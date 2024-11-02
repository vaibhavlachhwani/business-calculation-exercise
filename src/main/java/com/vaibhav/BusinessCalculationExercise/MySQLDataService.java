package com.vaibhav.BusinessCalculationExercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("MySQLDataServiceQualifier")
public class MySQLDataService implements IDataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1, 5, 4, 9, 5, 6, 7, 3};
    }
}
