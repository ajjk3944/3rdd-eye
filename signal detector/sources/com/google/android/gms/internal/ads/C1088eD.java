package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.eD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088eD extends AbstractC0582Jp {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f13876b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f13877c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f13878d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f13879e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f13880f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f13881g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e6) {
                throw new RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(C1252hD.f14464a);
        }
        try {
            f13878d = unsafe.objectFieldOffset(AbstractC1198gD.class.getDeclaredField("c"));
            f13877c = unsafe.objectFieldOffset(AbstractC1198gD.class.getDeclaredField("b"));
            f13879e = unsafe.objectFieldOffset(AbstractC1198gD.class.getDeclaredField("a"));
            f13880f = unsafe.objectFieldOffset(C1143fD.class.getDeclaredField("a"));
            f13881g = unsafe.objectFieldOffset(C1143fD.class.getDeclaredField("b"));
            f13876b = unsafe;
        } catch (NoSuchFieldException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean M(AbstractC1198gD abstractC1198gD, C1143fD c1143fD, C1143fD c1143fD2) {
        return AbstractC0979cD.a(f13876b, abstractC1198gD, f13878d, c1143fD, c1143fD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean S(YC yc, VC vc, VC vc2) {
        return AbstractC0925bD.a(f13876b, yc, f13877c, vc, vc2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final C1143fD U(YC yc) {
        C1143fD c1143fD;
        C1143fD c1143fD2 = C1143fD.f14042c;
        do {
            c1143fD = yc.f14236c;
            if (c1143fD2 == c1143fD) {
                break;
            }
        } while (!M(yc, c1143fD, c1143fD2));
        return c1143fD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final VC a0(YC yc) {
        VC vc;
        VC vc2 = VC.f11966d;
        do {
            vc = yc.f14235b;
            if (vc2 == vc) {
                break;
            }
        } while (!S(yc, vc, vc2));
        return vc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean e0(AbstractC1198gD abstractC1198gD, Object obj, Object obj2) {
        return AbstractC1034dD.a(f13876b, abstractC1198gD, f13879e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final void k(C1143fD c1143fD, Thread thread) {
        f13876b.putObject(c1143fD, f13880f, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final void w(C1143fD c1143fD, C1143fD c1143fD2) {
        f13876b.putObject(c1143fD, f13881g, c1143fD2);
    }
}
