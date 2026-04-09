package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l3 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f13337a = new sk0(4);

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f13338b = new sk0(9);

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f13339c = new sk0(11);

    /* renamed from: d, reason: collision with root package name */
    public final sk0 f13340d = new sk0();

    /* renamed from: e, reason: collision with root package name */
    public final m3 f13341e;

    /* renamed from: f, reason: collision with root package name */
    public z1 f13342f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13343h;

    /* renamed from: i, reason: collision with root package name */
    public long f13344i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f13345k;

    /* renamed from: l, reason: collision with root package name */
    public int f13346l;

    /* renamed from: m, reason: collision with root package name */
    public long f13347m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13348n;

    /* renamed from: o, reason: collision with root package name */
    public k3 f13349o;

    /* renamed from: p, reason: collision with root package name */
    public o3 f13350p;

    public l3() {
        m3 m3Var = new m3(new w1());
        m3Var.f13738c = -9223372036854775807L;
        m3Var.f13739d = new long[0];
        m3Var.f13740e = new long[0];
        this.f13341e = m3Var;
        this.g = 1;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    public final sk0 b(y1 y1Var) {
        int i4 = this.f13346l;
        sk0 sk0Var = this.f13340d;
        byte[] bArr = sk0Var.f16446a;
        if (i4 > bArr.length) {
            int length = bArr.length;
            sk0Var.z(0, new byte[Math.max(length + length, i4)]);
        } else {
            sk0Var.E(0);
        }
        sk0Var.C(this.f13346l);
        y1Var.L1(0, this.f13346l, sk0Var.f16446a);
        return sk0Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        sk0 sk0Var = this.f13337a;
        t1 t1Var = (t1) y1Var;
        t1Var.O1(sk0Var.f16446a, 0, 3, false);
        sk0Var.E(0);
        if (sk0Var.O() == 4607062) {
            t1Var.O1(sk0Var.f16446a, 0, 2, false);
            sk0Var.E(0);
            if ((sk0Var.L() & 250) == 0) {
                t1Var.O1(sk0Var.f16446a, 0, 4, false);
                sk0Var.E(0);
                int iB = sk0Var.b();
                t1Var.f16638f = 0;
                t1Var.e(iB, false);
                t1Var.O1(sk0Var.f16446a, 0, 4, false);
                sk0Var.E(0);
                if (sk0Var.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f13342f = z1Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        if (j == 0) {
            this.g = 1;
            this.f13343h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0290  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r32, com.google.android.gms.internal.ads.c2 r33) throws java.io.EOFException, java.io.InterruptedIOException, com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l3.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
