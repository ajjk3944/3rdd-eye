package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f17116a;

    /* renamed from: b, reason: collision with root package name */
    public final k2 f17117b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17119d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17120e;

    /* renamed from: f, reason: collision with root package name */
    public u2 f17121f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public int f17122h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f17123i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17124k;

    /* renamed from: l, reason: collision with root package name */
    public long f17125l;

    /* renamed from: m, reason: collision with root package name */
    public int f17126m;

    /* renamed from: n, reason: collision with root package name */
    public long f17127n;

    public u8(String str, int i4, String str2) {
        sk0 sk0Var = new sk0(4);
        this.f17116a = sk0Var;
        sk0Var.f16446a[0] = -1;
        this.f17117b = new k2();
        this.f17127n = -9223372036854775807L;
        this.f17118c = str;
        this.f17119d = i4;
        this.f17120e = str2;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f17122h = 0;
        this.f17123i = 0;
        this.f17124k = false;
        this.f17127n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f17127n = j;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void d(sk0 sk0Var) {
        this.f17121f.getClass();
        while (sk0Var.B() > 0) {
            int i4 = this.f17122h;
            sk0 sk0Var2 = this.f17116a;
            if (i4 == 0) {
                byte[] bArr = sk0Var.f16446a;
                int i10 = sk0Var.f16447b;
                int i11 = sk0Var.f16448c;
                while (true) {
                    if (i10 >= i11) {
                        sk0Var.E(i11);
                        break;
                    }
                    int i12 = i10 + 1;
                    byte b10 = bArr[i10];
                    boolean z3 = (b10 & 255) == 255;
                    boolean z10 = this.f17124k && (b10 & 224) == 224;
                    this.f17124k = z3;
                    if (z10) {
                        sk0Var.E(i12);
                        this.f17124k = false;
                        sk0Var2.f16446a[1] = bArr[i10];
                        this.f17123i = 2;
                        this.f17122h = 1;
                        break;
                    }
                    i10 = i12;
                }
            } else if (i4 != 1) {
                int iMin = Math.min(sk0Var.B(), this.f17126m - this.f17123i);
                this.f17121f.b(iMin, sk0Var);
                int i13 = this.f17123i + iMin;
                this.f17123i = i13;
                if (i13 >= this.f17126m) {
                    mq0.c0(this.f17127n != -9223372036854775807L);
                    this.f17121f.d(this.f17127n, 1, this.f17126m, 0, null);
                    this.f17127n += this.f17125l;
                    this.f17123i = 0;
                    this.f17122h = 0;
                }
            } else {
                int iMin2 = Math.min(sk0Var.B(), 4 - this.f17123i);
                sk0Var.H(this.f17123i, iMin2, sk0Var2.f16446a);
                int i14 = this.f17123i + iMin2;
                this.f17123i = i14;
                if (i14 >= 4) {
                    sk0Var2.E(0);
                    int iB = sk0Var2.b();
                    k2 k2Var = this.f17117b;
                    if (k2Var.a(iB)) {
                        this.f17126m = k2Var.f12984b;
                        if (!this.j) {
                            this.f17125l = (k2Var.f12988f * 1000000) / k2Var.f12985c;
                            lw1 lw1Var = new lw1();
                            lw1Var.f13652a = this.g;
                            lw1Var.d(this.f17120e);
                            lw1Var.e((String) k2Var.g);
                            lw1Var.f13662m = Buffer.SEGMENTING_THRESHOLD;
                            lw1Var.D = k2Var.f12986d;
                            lw1Var.E = k2Var.f12985c;
                            lw1Var.f13655d = this.f17118c;
                            lw1Var.f13657f = this.f17119d;
                            this.f17121f.f(new mx1(lw1Var));
                            this.j = true;
                        }
                        sk0Var2.E(0);
                        this.f17121f.b(4, sk0Var2);
                        this.f17122h = 2;
                    } else {
                        this.f17123i = 0;
                        this.f17122h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.g = h9Var.f11777e;
        h9Var.b();
        this.f17121f = z1Var.m(h9Var.f11776d, 1);
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
    }
}
