package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zr1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f19167a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ as1 f19168b;

    public zr1(as1 as1Var) {
        this.f19168b = as1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f19167a;
        as1 as1Var = this.f19168b;
        return i4 < as1Var.f9408a.size() || as1Var.f9409b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f19167a;
        as1 as1Var = this.f19168b;
        List list = as1Var.f9408a;
        if (i4 >= list.size()) {
            list.add(as1Var.f9409b.next());
            return next();
        }
        int i10 = this.f19167a;
        this.f19167a = i10 + 1;
        return list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
