package com.tw.oocamp_1;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/7/12
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Length {

    private double len;
    private String unit;

    public Length(double i, String m) {
        len = i;
        unit = m;
    }

    public boolean equals(Length l) {
        Length convertedLength = convertToM(l);
        Length convertedSelfLength = convertToM(this);

        return (convertedLength.getUnit().equals(convertedSelfLength.getUnit())
                && (convertedLength.getLen() == convertedSelfLength.getLen()));
    }

    private Length convertToM(Length l) {
        if(l.getUnit().equals("cm")) {
            return new Length(l.getLen()/100,"m");
        }
        else if(l.getUnit().equals("mm")) {
            return new Length(l.getLen()/1000,"m");
        }
        return l;
    }

    public double getLen() {
        return len;
    }

    public String getUnit() {
        return unit;
    }
}
