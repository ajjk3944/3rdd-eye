package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dm1 extends zl1 {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f10523a;

    public dm1(rc1 rc1Var) {
        this.f10523a = rc1Var;
    }

    public static boolean i(dm1 dm1Var) {
        Serializable serializable = dm1Var.f10523a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final String a() {
        Serializable serializable = this.f10523a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return f().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dm1.class != obj.getClass()) {
            return false;
        }
        dm1 dm1Var = (dm1) obj;
        Serializable serializable = dm1Var.f10523a;
        Serializable serializable2 = this.f10523a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (i(this) && i(dm1Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? g().equals(dm1Var.g()) : f().longValue() == dm1Var.f().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : yr1.e(a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : yr1.e(dm1Var.a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? f().doubleValue() : Double.parseDouble(a());
        double dDoubleValue2 = serializable instanceof Number ? dm1Var.f().doubleValue() : Double.parseDouble(dm1Var.a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final Number f() {
        Serializable serializable = this.f10523a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new em1((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final BigInteger g() {
        Serializable serializable = this.f10523a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (i(this)) {
            return BigInteger.valueOf(f().longValue());
        }
        String strA = a();
        yr1.A(strA);
        return new BigInteger(strA);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f10523a;
        if (serializable == null) {
            return 31;
        }
        if (i(this)) {
            jDoubleToLongBits = f().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public dm1(Boolean bool) {
        this.f10523a = bool;
    }

    public dm1(String str) {
        this.f10523a = str;
    }
}
