package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.qK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743qK extends AbstractC1527mK {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f16339a;

    public C1743qK(EF ef) {
        this.f16339a = ef;
    }

    public static boolean f(C1743qK c1743qK) {
        Serializable serializable = c1743qK.f16339a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1527mK
    public final String a() {
        Serializable serializable = this.f16339a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final Number d() {
        Serializable serializable = this.f16339a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C1796rK((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final BigInteger e() {
        Serializable serializable = this.f16339a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (f(this)) {
            return BigInteger.valueOf(d().longValue());
        }
        String strA = a();
        C1476lN.B(strA);
        return new BigInteger(strA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1743qK.class != obj.getClass()) {
            return false;
        }
        C1743qK c1743qK = (C1743qK) obj;
        Serializable serializable = c1743qK.f16339a;
        Serializable serializable2 = this.f16339a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (f(this) && f(c1743qK)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? e().equals(c1743qK.e()) : d().longValue() == c1743qK.d().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : C1476lN.e(a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : C1476lN.e(c1743qK.a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? d().doubleValue() : Double.parseDouble(a());
        double dDoubleValue2 = serializable instanceof Number ? c1743qK.d().doubleValue() : Double.parseDouble(c1743qK.a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f16339a;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            jDoubleToLongBits = d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C1743qK(Boolean bool) {
        this.f16339a = bool;
    }

    public C1743qK(String str) {
        this.f16339a = str;
    }
}
