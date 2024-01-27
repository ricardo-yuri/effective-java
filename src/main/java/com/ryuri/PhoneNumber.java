package com.ryuri;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

import java.util.Comparator;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

public class PhoneNumber implements Formattable, Comparable<PhoneNumber> {

    private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt((PhoneNumber p) -> p.areaCode)
                                                               .thenComparingInt(p -> p.number);
    private final int areaCode;
    private final int number;

    private PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public static PhoneNumber of(int areaCode, int number) {
        Preconditions.checkArgument(areaCode > 0, "areaCode must be greater than 0");
        Preconditions.checkArgument(number > 0, "number must be greater than 0");
        return new PhoneNumber(areaCode, number);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if (obj instanceof PhoneNumber other) {
            return this.areaCode == other.areaCode
                    && Objects.equals(this.number, other.number);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.areaCode, this.number);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("areaNumber", areaCode)
                .add("number", number).toString();
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        formatter.format("(%d) %d", areaCode, number);
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return COMPARATOR.compare(this, o);
    }
}
