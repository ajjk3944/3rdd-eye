package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ld1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f13463b = new ld1();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f13464a = new AtomicReference(new yd1(new l90(23)));

    public final synchronized void a(vd1 vd1Var) {
        AtomicReference atomicReference = this.f13464a;
        l90 l90Var = new l90((yd1) atomicReference.get());
        l90Var.j(vd1Var);
        atomicReference.set(new yd1(l90Var));
    }

    public final synchronized void b(ae1 ae1Var) {
        AtomicReference atomicReference = this.f13464a;
        l90 l90Var = new l90((yd1) atomicReference.get());
        l90Var.r(ae1Var);
        atomicReference.set(new yd1(l90Var));
    }
}
