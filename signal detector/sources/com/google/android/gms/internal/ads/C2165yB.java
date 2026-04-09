package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2165yB extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AB f17690b;

    public /* synthetic */ C2165yB(AB ab, int i) {
        this.f17689a = i;
        this.f17690b = ab;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f17689a) {
            case 0:
                this.f17690b.clear();
                break;
            default:
                this.f17690b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f17689a) {
            case 0:
                AB ab = this.f17690b;
                Map mapE = ab.e();
                if (mapE != null) {
                    return mapE.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i = ab.i(entry.getKey());
                    if (i != -1 && Objects.equals(ab.c()[i], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f17690b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f17689a) {
            case 0:
                AB ab = this.f17690b;
                Map mapE = ab.e();
                return mapE != null ? mapE.entrySet().iterator() : new C2111xB(ab, 1);
            default:
                AB ab2 = this.f17690b;
                Map mapE2 = ab2.e();
                return mapE2 != null ? mapE2.keySet().iterator() : new C2111xB(ab2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f17689a) {
            case 0:
                AB ab = this.f17690b;
                Map mapE = ab.e();
                if (mapE != null) {
                    return mapE.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!ab.d()) {
                        int iG = ab.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = ab.f6947a;
                        Objects.requireNonNull(obj2);
                        int iT = AbstractC0582Jp.T(key, value, iG, obj2, ab.a(), ab.b(), ab.c());
                        if (iT != -1) {
                            ab.f(iT, iG);
                            ab.f6952f--;
                            ab.f6951e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                AB ab2 = this.f17690b;
                Map mapE2 = ab2.e();
                return mapE2 != null ? mapE2.keySet().remove(obj) : ab2.j(obj) != AB.f6946j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f17689a) {
        }
        return this.f17690b.size();
    }
}
