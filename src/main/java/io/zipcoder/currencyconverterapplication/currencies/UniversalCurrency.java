package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case CHINESE_YR:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
            default:
                return 1d;
        }
    }
}
