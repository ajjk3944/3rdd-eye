package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219zB implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17834a;

    /* renamed from: b, reason: collision with root package name */
    public int f17835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AB f17836c;

    public C2219zB(AB ab, int i) {
        Objects.requireNonNull(ab);
        this.f17836c = ab;
        this.f17834a = ab.b()[i];
        this.f17835b = i;
    }

    public final void a() {
        int i = this.f17835b;
        Object obj = this.f17834a;
        AB ab = this.f17836c;
        if (i != -1 && i < ab.size()) {
            if (Objects.equals(obj, ab.b()[this.f17835b])) {
                return;
            }
        }
        this.f17835b = ab.i(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17834a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        AB ab = this.f17836c;
        Map mapE = ab.e();
        if (mapE != null) {
            return mapE.get(this.f17834a);
        }
        a();
        int i = this.f17835b;
        if (i == -1) {
            return null;
        }
        return ab.c()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        AB ab = this.f17836c;
        Map mapE = ab.e();
        Object obj2 = this.f17834a;
        if (mapE != null) {
            return mapE.put(obj2, obj);
        }
        a();
        int i = this.f17835b;
        if (i == -1) {
            ab.put(obj2, obj);
            return null;
        }
        Object obj3 = ab.c()[i];
        ab.c()[this.f17835b] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return AbstractC1135f5.n(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
