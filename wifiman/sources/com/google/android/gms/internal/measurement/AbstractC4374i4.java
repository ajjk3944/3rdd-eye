package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4374i4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f35267b = 100;

    /* renamed from: a, reason: collision with root package name */
    private int f35268a;

    public static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static AbstractC4374i4 c(byte[] bArr, int i10, int i11, boolean z10) {
        C4399l4 c4399l4 = new C4399l4(bArr, i11);
        try {
            c4399l4.d(i11);
            return c4399l4;
        } catch (zzkq e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int d(int i10);

    public abstract int e();

    private AbstractC4374i4() {
        this.f35268a = f35267b;
    }
}
