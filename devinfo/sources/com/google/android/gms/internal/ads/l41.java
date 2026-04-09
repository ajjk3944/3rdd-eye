package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l41 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13369a;

    /* renamed from: b, reason: collision with root package name */
    public int f13370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m41 f13371c;

    public l41(m41 m41Var, int i4) {
        Objects.requireNonNull(m41Var);
        this.f13371c = m41Var;
        this.f13369a = m41Var.b()[i4];
        this.f13370b = i4;
    }

    public final void a() {
        int i4 = this.f13370b;
        Object obj = this.f13369a;
        m41 m41Var = this.f13371c;
        if (i4 != -1 && i4 < m41Var.size()) {
            if (Objects.equals(obj, m41Var.b()[this.f13370b])) {
                return;
            }
        }
        this.f13370b = m41Var.i(obj);
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
        return this.f13369a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m41 m41Var = this.f13371c;
        Map mapE = m41Var.e();
        if (mapE != null) {
            return mapE.get(this.f13369a);
        }
        a();
        int i4 = this.f13370b;
        if (i4 == -1) {
            return null;
        }
        return m41Var.c()[i4];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m41 m41Var = this.f13371c;
        Map mapE = m41Var.e();
        Object obj2 = this.f13369a;
        if (mapE != null) {
            return mapE.put(obj2, obj);
        }
        a();
        int i4 = this.f13370b;
        if (i4 == -1) {
            m41Var.put(obj2, obj);
            return null;
        }
        Object obj3 = m41Var.c()[i4];
        m41Var.c()[this.f13370b] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return r5.c.m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
