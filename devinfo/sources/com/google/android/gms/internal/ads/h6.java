package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Utf8;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h6 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11717a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11718b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11719c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11720d;

    public h6(int i4) {
        this.f11717a = i4;
        switch (i4) {
            case 1:
                this.f11719c = new d8(null, 0, "audio/ac3", 0);
                this.f11720d = new sk0(2786);
                break;
            case 2:
                this.f11719c = new d8(null, 0, "audio/ac4", 1);
                this.f11720d = new sk0(Http2.INITIAL_MAX_FRAME_SIZE);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        switch (this.f11717a) {
        }
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        int iV;
        int i4;
        switch (this.f11717a) {
            case 0:
                try {
                    break;
                }
            case 1:
                sk0 sk0Var = new sk0(10);
                int i10 = 0;
                while (true) {
                    t1 t1Var = (t1) y1Var;
                    t1Var.O1(sk0Var.f16446a, 0, 10, false);
                    sk0Var.E(0);
                    if (sk0Var.O() != 4801587) {
                        t1Var.f16638f = 0;
                        t1Var.e(i10, false);
                        int i11 = 0;
                        int i12 = i10;
                        while (true) {
                            t1Var.O1(sk0Var.f16446a, 0, 6, false);
                            sk0Var.E(0);
                            if (sk0Var.L() != 2935) {
                                t1Var.f16638f = 0;
                                i12++;
                                if (i12 - i10 >= 8192) {
                                    break;
                                } else {
                                    t1Var.e(i12, false);
                                    i11 = 0;
                                }
                            } else {
                                i11++;
                                if (i11 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr = sk0Var.f16446a;
                                    if (bArr.length < 6) {
                                        iV = -1;
                                    } else if (((bArr[5] & 248) >> 3) > 10) {
                                        int i13 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                                        iV = i13 + i13;
                                    } else {
                                        byte b10 = bArr[4];
                                        iV = jz.v((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
                                    }
                                    if (iV == -1) {
                                        break;
                                    } else {
                                        t1Var.e(iV - 6, false);
                                    }
                                }
                            }
                        }
                    } else {
                        sk0Var.G(3);
                        int iG = sk0Var.g();
                        i10 += iG + 10;
                        t1Var.e(iG, false);
                    }
                }
            default:
                sk0 sk0Var2 = new sk0(10);
                int i14 = 0;
                while (true) {
                    t1 t1Var2 = (t1) y1Var;
                    t1Var2.O1(sk0Var2.f16446a, 0, 10, false);
                    sk0Var2.E(0);
                    if (sk0Var2.O() != 4801587) {
                        t1Var2.f16638f = 0;
                        t1Var2.e(i14, false);
                        int i15 = 0;
                        int i16 = i14;
                        while (true) {
                            int i17 = 7;
                            t1Var2.O1(sk0Var2.f16446a, 0, 7, false);
                            sk0Var2.E(0);
                            int iL = sk0Var2.L();
                            if (iL != 44096 && iL != 44097) {
                                t1Var2.f16638f = 0;
                                i16++;
                                if (i16 - i14 >= 8192) {
                                    break;
                                } else {
                                    t1Var2.e(i16, false);
                                    i15 = 0;
                                }
                            } else {
                                i15++;
                                if (i15 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr2 = sk0Var2.f16446a;
                                    if (bArr2.length < 7) {
                                        i4 = -1;
                                    } else {
                                        int i18 = ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
                                        if (i18 == 65535) {
                                            i18 = ((bArr2[4] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[6] & 255);
                                        } else {
                                            i17 = 4;
                                        }
                                        if (iL == 44097) {
                                            i17 += 2;
                                        }
                                        i4 = i18 + i17;
                                    }
                                    if (i4 == -1) {
                                        break;
                                    } else {
                                        t1Var2.e(i4 - 7, false);
                                    }
                                }
                            }
                        }
                    } else {
                        sk0Var2.G(3);
                        int iG2 = sk0Var2.g();
                        i14 += iG2 + 10;
                        t1Var2.e(iG2, false);
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
        int i4 = this.f11717a;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        switch (this.f11717a) {
            case 0:
                this.f11719c = z1Var;
                break;
            case 1:
                ((d8) this.f11719c).e(z1Var, new h9(LinearLayoutManager.INVALID_OFFSET, 0, 1));
                z1Var.i();
                z1Var.o(new d2(-9223372036854775807L, 0L));
                break;
            default:
                ((d8) this.f11719c).e(z1Var, new h9(LinearLayoutManager.INVALID_OFFSET, 0, 1));
                z1Var.i();
                z1Var.o(new d2(-9223372036854775807L, 0L));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        switch (this.f11717a) {
            case 0:
                l6 l6Var = (l6) this.f11720d;
                if (l6Var != null) {
                    androidx.recyclerview.widget.o oVar = l6Var.f13383a;
                    i6 i6Var = (i6) oVar.f1470d;
                    i6Var.f12144a = 0;
                    i6Var.f12145b = 0L;
                    i6Var.f12146c = 0;
                    i6Var.f12147d = 0;
                    i6Var.f12148e = 0;
                    ((sk0) oVar.f1471e).y(0);
                    oVar.f1467a = -1;
                    oVar.f1469c = false;
                    if (j != 0) {
                        if (l6Var.f13389h != 0) {
                            long j9 = (l6Var.f13390i * j8) / 1000000;
                            l6Var.f13387e = j9;
                            j6 j6Var = l6Var.f13386d;
                            String str = bq0.f9768a;
                            j6Var.h(j9);
                            l6Var.f13389h = 2;
                            break;
                        }
                    } else {
                        l6Var.a(!l6Var.f13392l);
                        break;
                    }
                }
                break;
            case 1:
                this.f11718b = false;
                ((d8) this.f11719c).b();
                break;
            default:
                this.f11718b = false;
                ((d8) this.f11719c).b();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r27, com.google.android.gms.internal.ads.c2 r28) throws java.io.EOFException, java.io.InterruptedIOException, com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h6.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    public boolean j(y1 y1Var) {
        i6 i6Var = new i6();
        if (i6Var.b(y1Var, true) && (i6Var.f12144a & 2) == 2) {
            int iMin = Math.min(i6Var.f12148e, 8);
            sk0 sk0Var = new sk0(iMin);
            y1Var.M1(0, iMin, sk0Var.f16446a);
            sk0Var.E(0);
            if (sk0Var.B() >= 5 && sk0Var.K() == 127 && sk0Var.P() == 1179402563) {
                this.f11720d = new g6();
                return true;
            }
            sk0Var.E(0);
            try {
                if (nn1.t(1, sk0Var, true)) {
                    this.f11720d = new m6();
                    return true;
                }
            } catch (ua unused) {
            }
            sk0Var.E(0);
            if (k6.e(sk0Var, k6.f13041o)) {
                this.f11720d = new k6();
                return true;
            }
        }
        return false;
    }

    private final void b() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
