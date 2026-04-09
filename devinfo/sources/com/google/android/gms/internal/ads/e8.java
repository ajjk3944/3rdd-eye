package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e8 implements x1 {

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f10723c;

    /* renamed from: d, reason: collision with root package name */
    public final hk0 f10724d;

    /* renamed from: e, reason: collision with root package name */
    public z1 f10725e;

    /* renamed from: f, reason: collision with root package name */
    public long f10726f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10727h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10728i;

    /* renamed from: a, reason: collision with root package name */
    public final f8 f10721a = new f8(null, 0, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f10722b = new sk0(2048);
    public long g = -1;

    public e8() {
        sk0 sk0Var = new sk0(10);
        this.f10723c = sk0Var;
        byte[] bArr = sk0Var.f16446a;
        this.f10724d = new hk0(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        sk0 sk0Var;
        t1 t1Var;
        int i4 = 0;
        while (true) {
            sk0Var = this.f10723c;
            t1Var = (t1) y1Var;
            t1Var.O1(sk0Var.f16446a, 0, 10, false);
            sk0Var.E(0);
            if (sk0Var.O() != 4801587) {
                break;
            }
            sk0Var.G(3);
            int iG = sk0Var.g();
            i4 += iG + 10;
            t1Var.e(iG, false);
        }
        t1Var.f16638f = 0;
        t1Var.e(i4, false);
        if (this.g == -1) {
            this.g = i4;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i4;
        do {
            t1Var.O1(sk0Var.f16446a, 0, 2, false);
            sk0Var.E(0);
            if ((sk0Var.L() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                t1Var.O1(sk0Var.f16446a, 0, 4, false);
                hk0 hk0Var = this.f10724d;
                hk0Var.d(14);
                int iH = hk0Var.h(13);
                if (iH <= 6) {
                    i12++;
                    t1Var.f16638f = 0;
                    t1Var.e(i12, false);
                } else {
                    t1Var.e(iH - 6, false);
                    i11 += iH;
                }
            } else {
                i12++;
                t1Var.f16638f = 0;
                t1Var.e(i12, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i4 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f10725e = z1Var;
        this.f10721a.e(z1Var, new h9(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        z1Var.i();
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        this.f10727h = false;
        this.f10721a.b();
        this.f10726f = j8;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) throws EOFException, InterruptedIOException, ua {
        this.f10725e.getClass();
        sk0 sk0Var = this.f10722b;
        int iD = ((t1) y1Var).d(0, 2048, sk0Var.f16446a);
        if (!this.f10728i) {
            this.f10725e.o(new d2(-9223372036854775807L, 0L));
            this.f10728i = true;
        }
        if (iD == -1) {
            return -1;
        }
        sk0Var.E(0);
        sk0Var.C(iD);
        boolean z3 = this.f10727h;
        f8 f8Var = this.f10721a;
        if (!z3) {
            f8Var.f11053u = this.f10726f;
            this.f10727h = true;
        }
        f8Var.d(sk0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
