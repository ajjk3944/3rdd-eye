package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class as1 extends AbstractList {

    /* renamed from: c, reason: collision with root package name */
    public static final yr1 f9407c = yr1.s(as1.class);

    /* renamed from: a, reason: collision with root package name */
    public final List f9408a;

    /* renamed from: b, reason: collision with root package name */
    public final xr1 f9409b;

    public as1(ArrayList arrayList, xr1 xr1Var) {
        this.f9408a = arrayList;
        this.f9409b = xr1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        List list = this.f9408a;
        if (list.size() > i4) {
            return list.get(i4);
        }
        xr1 xr1Var = this.f9409b;
        if (!xr1Var.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(xr1Var.next());
        return get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zr1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        yr1 yr1Var = f9407c;
        yr1Var.i("potentially expensive size() call");
        yr1Var.i("blowup running");
        while (true) {
            xr1 xr1Var = this.f9409b;
            boolean zHasNext = xr1Var.hasNext();
            List list = this.f9408a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(xr1Var.next());
        }
    }
}
