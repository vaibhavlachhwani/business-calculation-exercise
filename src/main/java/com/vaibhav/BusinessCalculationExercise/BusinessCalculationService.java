package com.vaibhav.BusinessCalculationExercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private IDataService dataService;

    public BusinessCalculationService(IDataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData())
                .max()
                .orElse(0);
    }
}
