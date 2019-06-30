package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        //ConvertableCurrency currency = new AustralianDollar();
        switch (currencyType) {

            case YEN:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case EURO:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case FRANC:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case AUSTRALIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case CANADIAN_DOLLAR:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case POUND:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case RINGGIT:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case RUPEE:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case SINGAPORE_DOLLAR:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case US_DOLLAR:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            case UNIVERSAL_CURRENCY:
                return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
            default:
                return 1d;
        }
    }
}
