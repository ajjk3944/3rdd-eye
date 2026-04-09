package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wm1 extends h61 {

    /* renamed from: b, reason: collision with root package name */
    public int f18058b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18059c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn1 f18060d;

    public wm1(bn1 bn1Var) {
        super(1);
        this.f18060d = bn1Var;
        this.f18058b = 0;
        this.f18059c = bn1Var.i();
    }

    @Override // com.google.android.gms.internal.ads.h61
    public final byte a() {
        int i4 = this.f18058b;
        if (i4 >= this.f18059c) {
            throw new NoSuchElementException();
        }
        this.f18058b = i4 + 1;
        return this.f18060d.g(i4);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18058b < this.f18059c;
    }
}
