package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v51 extends x41 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w51 f17531c;

    public v51(w51 w51Var) {
        this.f17531c = w51Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i4) {
        w51 w51Var = this.f17531c;
        mq0.f0(i4, w51Var.f17916f);
        Object[] objArr = w51Var.f17915e;
        int i10 = i4 + i4;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17531c.f17916f;
    }
}
