package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rq0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f15730a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Callable f15731b;

    /* renamed from: c, reason: collision with root package name */
    public final w81 f15732c;

    public rq0(gc0 gc0Var, w81 w81Var) {
        this.f15731b = gc0Var;
        this.f15732c = w81Var;
    }

    public final synchronized void a(int i4) {
        LinkedBlockingDeque linkedBlockingDeque = this.f15730a;
        int size = i4 - linkedBlockingDeque.size();
        for (int i10 = 0; i10 < size; i10++) {
            linkedBlockingDeque.add(((ex) this.f15732c).e(this.f15731b));
        }
    }

    public final synchronized vd.b b() {
        a(1);
        return (vd.b) this.f15730a.poll();
    }
}
