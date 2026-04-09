package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39126a;

    public j(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f39126a = bool;
    }

    private static boolean x(j jVar) {
        Object obj = jVar.f39126a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f39126a == null) {
            return jVar.f39126a == null;
        }
        if (x(this) && x(jVar)) {
            return ((this.f39126a instanceof BigInteger) || (jVar.f39126a instanceof BigInteger)) ? o().equals(jVar.o()) : u().longValue() == jVar.u().longValue();
        }
        Object obj2 = this.f39126a;
        if (obj2 instanceof Number) {
            Object obj3 = jVar.f39126a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return m().compareTo(jVar.m()) == 0;
                }
                double dS = s();
                double dS2 = jVar.s();
                if (dS != dS2) {
                    return Double.isNaN(dS) && Double.isNaN(dS2);
                }
                return true;
            }
        }
        return obj2.equals(jVar.f39126a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f39126a == null) {
            return 31;
        }
        if (x(this)) {
            jDoubleToLongBits = u().longValue();
        } else {
            Object obj = this.f39126a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(u().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal m() {
        Object obj = this.f39126a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : t5.i.b(v());
    }

    public BigInteger o() {
        Object obj = this.f39126a;
        return obj instanceof BigInteger ? (BigInteger) obj : x(this) ? BigInteger.valueOf(u().longValue()) : t5.i.c(v());
    }

    public boolean q() {
        return w() ? ((Boolean) this.f39126a).booleanValue() : Boolean.parseBoolean(v());
    }

    public double s() {
        return y() ? u().doubleValue() : Double.parseDouble(v());
    }

    public Number u() {
        Object obj = this.f39126a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new t5.g((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String v() {
        Object obj = this.f39126a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (y()) {
            return u().toString();
        }
        if (w()) {
            return ((Boolean) this.f39126a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f39126a.getClass());
    }

    public boolean w() {
        return this.f39126a instanceof Boolean;
    }

    public boolean y() {
        return this.f39126a instanceof Number;
    }

    public boolean z() {
        return this.f39126a instanceof String;
    }

    public j(Number number) {
        Objects.requireNonNull(number);
        this.f39126a = number;
    }

    public j(String str) {
        Objects.requireNonNull(str);
        this.f39126a = str;
    }
}
