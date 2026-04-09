package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    public final zo0 f19037a;

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f19038b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19039c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19040d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19041e;

    /* renamed from: f, reason: collision with root package name */
    public long f19042f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f19043h;

    public z8(int i4) {
        switch (i4) {
            case 1:
                this.f19037a = new zo0();
                this.f19042f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.f19043h = -9223372036854775807L;
                this.f19038b = new sk0();
                break;
            default:
                this.f19037a = new zo0();
                this.f19042f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.f19043h = -9223372036854775807L;
                this.f19038b = new sk0();
                break;
        }
    }

    public static long a(sk0 sk0Var) {
        int i4 = sk0Var.f16447b;
        if (sk0Var.B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        sk0Var.H(0, 9, bArr);
        sk0Var.E(i4);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b10;
        long j8 = b11;
        long j9 = (248 & j8) >> 3;
        long j10 = (bArr[1] & 255) << 20;
        long j11 = (j8 & 3) << 13;
        return j11 | j10 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j9 << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
    }

    public static final int c(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public void b(y1 y1Var) {
        byte[] bArr = bq0.f9769b;
        int length = bArr.length;
        this.f19038b.z(0, bArr);
        this.f19039c = true;
        y1Var.B1();
    }
}
