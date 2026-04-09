package com.google.gson;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f20894a;

    public p(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f20894a = bool;
    }

    public static boolean f(p pVar) {
        Serializable serializable = pVar.f20894a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger a() {
        Serializable serializable = this.f20894a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (f(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String strD = d();
        com.google.gson.internal.g.c(strD);
        return new BigInteger(strD);
    }

    public final Number c() {
        Serializable serializable = this.f20894a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.i((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String d() {
        Serializable serializable = this.f20894a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        Serializable serializable = pVar.f20894a;
        Serializable serializable2 = this.f20894a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (f(this) && f(pVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? a().equals(pVar.a()) : c().longValue() == pVar.c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : com.google.gson.internal.g.i(d())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : com.google.gson.internal.g.i(pVar.d())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? c().doubleValue() : Double.parseDouble(d());
        double dDoubleValue2 = serializable instanceof Number ? pVar.c().doubleValue() : Double.parseDouble(pVar.d());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f20894a;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public p(Number number) {
        Objects.requireNonNull(number);
        this.f20894a = number;
    }

    public p(String str) {
        Objects.requireNonNull(str);
        this.f20894a = str;
    }
}
