package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public abstract class F1 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f35583b = 100;

    /* renamed from: a, reason: collision with root package name */
    final int f35584a = f35583b;

    /* synthetic */ F1(E1 e12) {
    }

    public static int a(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long b(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    static F1 c(byte[] bArr, int i10, int i11, boolean z10) {
        D1 d12 = new D1(bArr, 0, i11, z10, null);
        try {
            d12.e(i11);
            return d12;
        } catch (zzbew e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
