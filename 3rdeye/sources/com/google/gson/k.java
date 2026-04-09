package com.google.gson;

import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes2.dex */
public final class k extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f23514c = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b, reason: collision with root package name */
    public Serializable f23515b;

    public k(Number number) {
        f(number);
    }

    public static boolean e(k kVar) {
        Serializable serializable = kVar.f23515b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean b() {
        Serializable serializable = this.f23515b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d());
    }

    public final Number c() {
        Serializable serializable = this.f23515b;
        return serializable instanceof String ? new com.google.gson.internal.e((String) serializable) : (Number) serializable;
    }

    public final String d() {
        Serializable serializable = this.f23515b;
        return serializable instanceof Number ? c().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f23515b == null) {
            return kVar.f23515b == null;
        }
        if (e(this) && e(kVar)) {
            return c().longValue() == kVar.c().longValue();
        }
        Serializable serializable = this.f23515b;
        if (!(serializable instanceof Number) || !(kVar.f23515b instanceof Number)) {
            return serializable.equals(kVar.f23515b);
        }
        double dDoubleValue = c().doubleValue();
        double dDoubleValue2 = kVar.c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final void f(Serializable serializable) {
        boolean z10;
        if (serializable instanceof Character) {
            this.f23515b = String.valueOf(((Character) serializable).charValue());
            return;
        }
        if ((serializable instanceof Number) || (serializable instanceof String)) {
            z10 = true;
            break;
        }
        Class<?> cls = serializable.getClass();
        Class<?>[] clsArr = f23514c;
        z10 = false;
        for (int i = 0; i < 16; i++) {
            if (clsArr[i].isAssignableFrom(cls)) {
                z10 = true;
                break;
            }
        }
        B7.d.e(z10);
        this.f23515b = serializable;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f23515b == null) {
            return 31;
        }
        if (e(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            Serializable serializable = this.f23515b;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public k(String str) {
        f(str);
    }
}
