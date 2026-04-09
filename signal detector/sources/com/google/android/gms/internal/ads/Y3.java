package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Y3 {

    /* renamed from: a, reason: collision with root package name */
    public final C2038vt f12578a;

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f12579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12580c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12581d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12582e;

    /* renamed from: f, reason: collision with root package name */
    public long f12583f;

    /* renamed from: g, reason: collision with root package name */
    public long f12584g;

    /* renamed from: h, reason: collision with root package name */
    public long f12585h;

    public Y3(int i) {
        switch (i) {
            case 1:
                this.f12578a = new C2038vt();
                this.f12583f = -9223372036854775807L;
                this.f12584g = -9223372036854775807L;
                this.f12585h = -9223372036854775807L;
                this.f12579b = new C2036vr();
                break;
            default:
                this.f12578a = new C2038vt();
                this.f12583f = -9223372036854775807L;
                this.f12584g = -9223372036854775807L;
                this.f12585h = -9223372036854775807L;
                this.f12579b = new C2036vr();
                break;
        }
    }

    public static long a(C2036vr c2036vr) {
        int i = c2036vr.f17355b;
        if (c2036vr.B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c2036vr.H(0, 9, bArr);
        c2036vr.E(i);
        byte b5 = bArr[0];
        if ((b5 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b6 = bArr[2];
        if ((b6 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b7 = bArr[4];
        if ((b7 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j6 = b5;
        long j7 = b6;
        long j8 = (248 & j7) >> 3;
        long j9 = (bArr[1] & 255) << 20;
        long j10 = (j7 & 3) << 13;
        return j10 | j9 | ((j6 & 3) << 28) | (((j6 & 56) >> 3) << 30) | (j8 << 15) | ((bArr[3] & 255) << 5) | ((b7 & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(InterfaceC2046w0 interfaceC2046w0) {
        byte[] bArr = Vt.f12097b;
        int length = bArr.length;
        this.f12579b.z(0, bArr);
        this.f12580c = true;
        interfaceC2046w0.i();
    }
}
