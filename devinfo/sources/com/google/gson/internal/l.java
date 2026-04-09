package com.google.gson.internal;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public l f20848a;

    /* renamed from: b, reason: collision with root package name */
    public l f20849b;

    /* renamed from: c, reason: collision with root package name */
    public l f20850c;

    /* renamed from: d, reason: collision with root package name */
    public l f20851d;

    /* renamed from: e, reason: collision with root package name */
    public l f20852e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20853f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public Object f20854h;

    /* renamed from: i, reason: collision with root package name */
    public int f20855i;

    public l(boolean z3) {
        this.f20853f = null;
        this.g = z3;
        this.f20852e = this;
        this.f20851d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f20853f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f20854h;
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
        return this.f20853f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20854h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f20853f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20854h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f20854h;
        this.f20854h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f20853f + "=" + this.f20854h;
    }

    public l(boolean z3, l lVar, Object obj, l lVar2, l lVar3) {
        this.f20848a = lVar;
        this.f20853f = obj;
        this.g = z3;
        this.f20855i = 1;
        this.f20851d = lVar2;
        this.f20852e = lVar3;
        lVar3.f20851d = this;
        lVar2.f20852e = this;
    }
}
