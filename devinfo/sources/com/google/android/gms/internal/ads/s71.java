package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s71 extends mq0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f15888a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f15889b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f15890c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f15891d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f15892e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f15893f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(v71.f17553a);
        }
        try {
            f15890c = unsafe.objectFieldOffset(u71.class.getDeclaredField("c"));
            f15889b = unsafe.objectFieldOffset(u71.class.getDeclaredField("b"));
            f15891d = unsafe.objectFieldOffset(u71.class.getDeclaredField("a"));
            f15892e = unsafe.objectFieldOffset(t71.class.getDeclaredField("a"));
            f15893f = unsafe.objectFieldOffset(t71.class.getDeclaredField("b"));
            f15888a = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean L(u71 u71Var, t71 t71Var, t71 t71Var2) {
        return q71.a(f15888a, u71Var, f15890c, t71Var, t71Var2);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean R(m71 m71Var, j71 j71Var, j71 j71Var2) {
        return p71.a(f15888a, m71Var, f15889b, j71Var, j71Var2);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final t71 T(m71 m71Var) {
        t71 t71Var;
        t71 t71Var2 = t71.f16728c;
        do {
            t71Var = m71Var.f17115c;
            if (t71Var2 == t71Var) {
                break;
            }
        } while (!L(m71Var, t71Var, t71Var2));
        return t71Var;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final j71 Y(m71 m71Var) {
        j71 j71Var;
        j71 j71Var2 = j71.f12670d;
        do {
            j71Var = m71Var.f17114b;
            if (j71Var2 == j71Var) {
                break;
            }
        } while (!R(m71Var, j71Var, j71Var2));
        return j71Var;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean b0(u71 u71Var, Object obj, Object obj2) {
        return r71.a(f15888a, u71Var, f15891d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final void k(t71 t71Var, Thread thread) {
        f15888a.putObject(t71Var, f15892e, thread);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final void w(t71 t71Var, t71 t71Var2) {
        f15888a.putObject(t71Var, f15893f, t71Var2);
    }
}
