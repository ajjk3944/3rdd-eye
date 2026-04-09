package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class ML implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f9869a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LL f9871c;

    public ML(LL ll, Comparable comparable, Object obj) {
        this.f9871c = ll;
        this.f9869a = comparable;
        this.f9870b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9869a.compareTo(((ML) obj).f9869a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9869a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f9870b;
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
        return this.f9869a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9870b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9869a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9870b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9871c.f();
        Object obj2 = this.f9870b;
        this.f9870b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9869a);
        String strValueOf2 = String.valueOf(this.f9870b);
        return AbstractC1135f5.n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
