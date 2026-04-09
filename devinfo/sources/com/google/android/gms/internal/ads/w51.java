package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w51 extends e51 {

    /* renamed from: d, reason: collision with root package name */
    public final transient z41 f17914d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f17915e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f17916f;

    public w51(z41 z41Var, Object[] objArr, int i4) {
        this.f17914d = z41Var;
        this.f17915e = objArr;
        this.f17916f = i4;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final h61 a() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f17914d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int j(Object[] objArr, int i4) {
        return g().j(objArr, i4);
    }

    @Override // com.google.android.gms.internal.ads.e51
    public final x41 p() {
        return new v51(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17916f;
    }
}
