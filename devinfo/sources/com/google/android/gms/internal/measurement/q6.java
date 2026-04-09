package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class q6 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f19885a;

    public q6(Unsafe unsafe) {
        this.f19885a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b10);

    public abstract boolean b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z3);

    public abstract float d(Object obj, long j);

    public abstract void e(Object obj, long j, float f10);

    public abstract double f(Object obj, long j);

    public abstract void g(Object obj, long j, double d10);
}
