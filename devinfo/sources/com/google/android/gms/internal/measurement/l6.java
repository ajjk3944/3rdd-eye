package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f19814a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k6 f19816c;

    public l6(k6 k6Var, Comparable comparable, Object obj) {
        this.f19816c = k6Var;
        this.f19814a = comparable;
        this.f19815b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19814a.compareTo(((l6) obj).f19814a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f19814a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f19815b;
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
        return this.f19814a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19815b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19814a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19815b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19816c.f();
        Object obj2 = this.f19815b;
        this.f19815b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19814a);
        String strValueOf2 = String.valueOf(this.f19815b);
        return r5.c.m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
