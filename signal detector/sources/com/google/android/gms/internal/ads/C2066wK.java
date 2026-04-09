package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2066wK implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public C2066wK f17423a;

    /* renamed from: b, reason: collision with root package name */
    public C2066wK f17424b;

    /* renamed from: c, reason: collision with root package name */
    public C2066wK f17425c;

    /* renamed from: d, reason: collision with root package name */
    public C2066wK f17426d;

    /* renamed from: e, reason: collision with root package name */
    public C2066wK f17427e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f17428f;

    /* renamed from: g, reason: collision with root package name */
    public Object f17429g;

    /* renamed from: h, reason: collision with root package name */
    public int f17430h;

    public C2066wK() {
        this.f17428f = null;
        this.f17427e = this;
        this.f17426d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f17428f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f17429g;
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
        return this.f17428f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17429g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f17428f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f17429g;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f17429g;
        this.f17429g = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17428f);
        String strValueOf2 = String.valueOf(this.f17429g);
        return AbstractC1135f5.n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }

    public C2066wK(C2066wK c2066wK, Object obj, C2066wK c2066wK2, C2066wK c2066wK3) {
        this.f17423a = c2066wK;
        this.f17428f = obj;
        this.f17430h = 1;
        this.f17426d = c2066wK2;
        this.f17427e = c2066wK3;
        c2066wK3.f17426d = this;
        c2066wK2.f17427e = this;
    }
}
