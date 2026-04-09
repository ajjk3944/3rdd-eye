package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 extends pk.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Unsafe f20144e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f20145f;
    public static final long g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f20146h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f20147i;
    public static final long j;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new n0());
            }
            try {
                g = unsafe.objectFieldOffset(k0.class.getDeclaredField("c"));
                f20145f = unsafe.objectFieldOffset(k0.class.getDeclaredField("b"));
                f20146h = unsafe.objectFieldOffset(k0.class.getDeclaredField("a"));
                f20147i = unsafe.objectFieldOffset(j0.class.getDeclaredField("a"));
                j = unsafe.objectFieldOffset(j0.class.getDeclaredField("b"));
                f20144e = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
        }
    }

    @Override // pk.a
    public final e0 B(t0 t0Var) {
        e0 e0Var;
        e0 e0Var2 = e0.f20102d;
        do {
            e0Var = t0Var.f20170b;
            if (e0Var2 == e0Var) {
                break;
            }
        } while (!K(t0Var, e0Var, e0Var2));
        return e0Var;
    }

    @Override // pk.a
    public final j0 D(t0 t0Var) {
        j0 j0Var;
        j0 j0Var2 = j0.f20156c;
        do {
            j0Var = t0Var.f20171c;
            if (j0Var2 == j0Var) {
                break;
            }
        } while (!N(t0Var, j0Var, j0Var2));
        return j0Var;
    }

    @Override // pk.a
    public final void G(j0 j0Var, j0 j0Var2) {
        f20144e.putObject(j0Var, j, j0Var2);
    }

    @Override // pk.a
    public final void I(j0 j0Var, Thread thread) {
        f20144e.putObject(j0Var, f20147i, thread);
    }

    @Override // pk.a
    public final boolean K(t0 t0Var, e0 e0Var, e0 e0Var2) {
        return m0.a(f20144e, t0Var, f20145f, e0Var, e0Var2);
    }

    @Override // pk.a
    public final boolean M(k0 k0Var, Object obj, Object obj2) {
        return m0.a(f20144e, k0Var, f20146h, obj, obj2);
    }

    @Override // pk.a
    public final boolean N(k0 k0Var, j0 j0Var, j0 j0Var2) {
        return m0.a(f20144e, k0Var, g, j0Var, j0Var2);
    }
}
