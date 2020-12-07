package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {

        Double rateOfGivenCurrency = currencyType.getRate();
        Double rateOfNewCurrency = currencyType.getTypeOfCurrency(this).getRate();


        return rateOfGivenCurrency/rateOfNewCurrency;
    }


    CurrencyType getCurrencyType();
}
