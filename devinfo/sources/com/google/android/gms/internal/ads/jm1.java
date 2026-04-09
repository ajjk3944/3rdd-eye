package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jm1 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public jm1 f12788a;

    /* renamed from: b, reason: collision with root package name */
    public jm1 f12789b;

    /* renamed from: c, reason: collision with root package name */
    public jm1 f12790c;

    /* renamed from: d, reason: collision with root package name */
    public jm1 f12791d;

    /* renamed from: e, reason: collision with root package name */
    public jm1 f12792e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12793f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public int f12794h;

    public jm1() {
        this.f12793f = null;
        this.f12792e = this;
        this.f12791d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f12793f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.g;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12793f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f12793f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.g;
        this.g = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12793f);
        String strValueOf2 = String.valueOf(this.g);
        return r5.c.m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }

    public jm1(jm1 jm1Var, Object obj, jm1 jm1Var2, jm1 jm1Var3) {
        this.f12788a = jm1Var;
        this.f12793f = obj;
        this.f12794h = 1;
        this.f12791d = jm1Var2;
        this.f12792e = jm1Var3;
        jm1Var3.f12791d = this;
        jm1Var2.f12792e = this;
    }
}
