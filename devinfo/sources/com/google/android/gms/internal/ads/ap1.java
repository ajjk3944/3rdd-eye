package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ap1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f9383a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zo1 f9385c;

    public ap1(zo1 zo1Var, Comparable comparable, Object obj) {
        this.f9385c = zo1Var;
        this.f9383a = comparable;
        this.f9384b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9383a.compareTo(((ap1) obj).f9383a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9383a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f9384b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f9383a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9384b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9383a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9384b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9385c.f();
        Object obj2 = this.f9384b;
        this.f9384b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9383a);
        String strValueOf2 = String.valueOf(this.f9384b);
        return r5.c.m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
