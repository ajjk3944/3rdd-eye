package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c41 extends u31 implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d41 f9973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(d41 d41Var) {
        super(d41Var);
        this.f9973e = d41Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        d41 d41Var = this.f9973e;
        boolean zIsEmpty = d41Var.isEmpty();
        a();
        ((ListIterator) this.f17053b).add(obj);
        d41Var.f10324f.f14902e++;
        if (zIsEmpty) {
            d41Var.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f17053b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f17053b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f17053b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f17053b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f17053b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(d41 d41Var, int i4) {
        super(d41Var, ((List) d41Var.f10320b).listIterator(i4));
        this.f9973e = d41Var;
    }
}
