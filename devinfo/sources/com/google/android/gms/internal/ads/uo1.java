package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uo1 extends h61 {

    /* renamed from: b, reason: collision with root package name */
    public final vo1 f17279b;

    /* renamed from: c, reason: collision with root package name */
    public h61 f17280c;

    public uo1(wo1 wo1Var) {
        super(1);
        this.f17279b = new vo1(wo1Var);
        this.f17280c = b();
    }

    @Override // com.google.android.gms.internal.ads.h61
    public final byte a() {
        h61 h61Var = this.f17280c;
        if (h61Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = h61Var.a();
        if (!this.f17280c.hasNext()) {
            this.f17280c = b();
        }
        return bA;
    }

    public final wm1 b() {
        vo1 vo1Var = this.f17279b;
        if (vo1Var.hasNext()) {
            return new wm1(vo1Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17280c != null;
    }
}
