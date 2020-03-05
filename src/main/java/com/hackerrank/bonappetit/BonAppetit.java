package com.hackerrank.bonappetit;

import java.util.LinkedList;
import java.util.List;

public class BonAppetit {


    public String calculateBillSplit(List<Integer> list, int excludeIndex, int annaContribution) {

        List<Integer>bills = new LinkedList<>(list);
        bills.remove(excludeIndex);

        int sum = bills.stream()
                        .reduce(0, (subtotal, element) -> subtotal += element);

        int division = sum / 2;

        if(division == annaContribution){
            return "Bon Appetit";
        }

        int refund = annaContribution - division;
        return String.valueOf(refund);
    }
}
