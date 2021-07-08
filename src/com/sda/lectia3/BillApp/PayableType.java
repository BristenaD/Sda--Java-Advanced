package com.sda.lectia3.BillApp;

public interface PayableType {

    int getValue();

    CurrencyType getCurrency();

    boolean isFake();
}
