package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f20244c;

    public w(x xVar) {
        this.f20244c = xVar;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        x xVar = this.f20244c;
        ii.a.H(i4, xVar.f20248e);
        Object[] objArr = xVar.f20247d;
        int i10 = i4 + i4;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20244c.f20248e;
    }
}
