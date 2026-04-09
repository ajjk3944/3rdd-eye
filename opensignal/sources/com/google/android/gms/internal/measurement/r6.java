package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5183a;

    public r6(Unsafe unsafe) {
        this.f5183a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b2);

    public abstract boolean b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z10);

    public abstract float d(Object obj, long j);

    public abstract void e(Object obj, long j, float f10);

    public abstract double f(Object obj, long j);

    public abstract void g(Object obj, long j, double d6);
}
