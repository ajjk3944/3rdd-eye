package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes.dex */
public final class G2 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8265a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8266b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8267c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8268d;

    public G2(int i) {
        this.f8265a = i;
        switch (i) {
            case 1:
                this.f8267c = new C3(null, 0, "audio/ac3", 0);
                this.f8268d = new C2036vr(2786);
                break;
            case 2:
                this.f8267c = new C3(null, 0, "audio/ac4", 1);
                this.f8268d = new C2036vr(16384);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        int iU;
        int i;
        int i3;
        int i6;
        switch (this.f8265a) {
            case 0:
                try {
                    break;
                }
            case 1:
                C2036vr c2036vr = new C2036vr(10);
                int i7 = 0;
                while (true) {
                    C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
                    c1776r0.y(c2036vr.f17354a, 0, 10, false);
                    c2036vr.E(0);
                    if (c2036vr.O() != 4801587) {
                        C1776r0 c1776r02 = (C1776r0) interfaceC2046w0;
                        c1776r02.f16447f = 0;
                        c1776r0.e(i7, false);
                        int i8 = 0;
                        int i9 = i7;
                        while (true) {
                            c1776r0.y(c2036vr.f17354a, 0, 6, false);
                            c2036vr.E(0);
                            if (c2036vr.L() != 2935) {
                                c1776r02.f16447f = 0;
                                i9++;
                                if (i9 - i7 >= 8192) {
                                    break;
                                } else {
                                    c1776r0.e(i9, false);
                                    i8 = 0;
                                }
                            } else {
                                i8++;
                                if (i8 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr = c2036vr.f17354a;
                                    if (bArr.length < 6) {
                                        iU = -1;
                                    } else if (((bArr[5] & 248) >> 3) > 10) {
                                        int i10 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                                        iU = i10 + i10;
                                    } else {
                                        byte b5 = bArr[4];
                                        iU = AbstractC0709Rg.u((b5 & 192) >> 6, b5 & 63);
                                    }
                                    if (iU == -1) {
                                        break;
                                    } else {
                                        c1776r0.e(iU - 6, false);
                                    }
                                }
                            }
                        }
                    } else {
                        c2036vr.G(3);
                        int iG = c2036vr.g();
                        i7 += iG + 10;
                        c1776r0.e(iG, false);
                    }
                }
            default:
                C2036vr c2036vr2 = new C2036vr(10);
                int i11 = 0;
                while (true) {
                    C1776r0 c1776r03 = (C1776r0) interfaceC2046w0;
                    c1776r03.y(c2036vr2.f17354a, 0, 10, false);
                    c2036vr2.E(0);
                    if (c2036vr2.O() != 4801587) {
                        C1776r0 c1776r04 = (C1776r0) interfaceC2046w0;
                        c1776r04.f16447f = 0;
                        c1776r03.e(i11, false);
                        int i12 = 0;
                        int i13 = i11;
                        while (true) {
                            c1776r03.y(c2036vr2.f17354a, 0, 7, false);
                            c2036vr2.E(0);
                            int iL = c2036vr2.L();
                            if (iL != 44096 && iL != 44097) {
                                c1776r04.f16447f = 0;
                                i13++;
                                if (i13 - i11 >= 8192) {
                                    break;
                                } else {
                                    c1776r03.e(i13, false);
                                    i12 = 0;
                                }
                            } else {
                                i12++;
                                if (i12 >= 4) {
                                    break;
                                } else {
                                    byte[] bArr2 = c2036vr2.f17354a;
                                    if (bArr2.length < 7) {
                                        i6 = -1;
                                    } else {
                                        int i14 = (bArr2[3] & 255) | ((bArr2[2] & 255) << 8);
                                        if (i14 == 65535) {
                                            i = ((bArr2[4] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[6] & 255);
                                            i3 = 7;
                                        } else {
                                            i = i14;
                                            i3 = 4;
                                        }
                                        if (iL == 44097) {
                                            i3 += 2;
                                        }
                                        i6 = i + i3;
                                    }
                                    if (i6 == -1) {
                                        break;
                                    } else {
                                        c1776r03.e(i6 - 7, false);
                                    }
                                }
                            }
                        }
                    } else {
                        c2036vr2.G(3);
                        int iG2 = c2036vr2.g();
                        i11 += iG2 + 10;
                        c1776r03.e(iG2, false);
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        switch (this.f8265a) {
        }
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
        int i = this.f8265a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        switch (this.f8265a) {
            case 0:
                this.f8267c = interfaceC2100x0;
                break;
            case 1:
                ((C3) this.f8267c).e(interfaceC2100x0, new C1189g4(LinearLayoutManager.INVALID_OFFSET, 0, 1));
                interfaceC2100x0.u();
                interfaceC2100x0.A(new B0(-9223372036854775807L, 0L));
                break;
            default:
                ((C3) this.f8267c).e(interfaceC2100x0, new C1189g4(LinearLayoutManager.INVALID_OFFSET, 0, 1));
                interfaceC2100x0.u();
                interfaceC2100x0.A(new B0(-9223372036854775807L, 0L));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        switch (this.f8265a) {
            case 0:
                L2 l2 = (L2) this.f8268d;
                if (l2 != null) {
                    H2 h22 = l2.f9598a;
                    I2 i22 = h22.f8538a;
                    i22.f9061a = 0;
                    i22.f9062b = 0L;
                    i22.f9063c = 0;
                    i22.f9064d = 0;
                    i22.f9065e = 0;
                    h22.f8539b.y(0);
                    h22.f8540c = -1;
                    h22.f8542e = false;
                    if (j6 != 0) {
                        if (l2.f9605h != 0) {
                            long j8 = (l2.i * j7) / 1000000;
                            l2.f9602e = j8;
                            J2 j22 = l2.f9601d;
                            String str = Vt.f12096a;
                            j22.e(j8);
                            l2.f9605h = 2;
                            break;
                        }
                    } else {
                        l2.a(!l2.f9608l);
                        break;
                    }
                }
                break;
            case 1:
                this.f8266b = false;
                ((C3) this.f8267c).a();
                break;
            default:
                this.f8266b = false;
                ((C3) this.f8267c).a();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01e0  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r27, com.google.android.gms.internal.ads.A0 r28) throws com.google.android.gms.internal.ads.P4, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.G2.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }

    public boolean j(InterfaceC2046w0 interfaceC2046w0) {
        I2 i22 = new I2();
        if (i22.b(interfaceC2046w0, true) && (i22.f9061a & 2) == 2) {
            int iMin = Math.min(i22.f9065e, 8);
            C2036vr c2036vr = new C2036vr(iMin);
            interfaceC2046w0.v(0, iMin, c2036vr.f17354a);
            c2036vr.E(0);
            if (c2036vr.B() >= 5 && c2036vr.K() == 127 && c2036vr.P() == 1179402563) {
                this.f8268d = new F2();
                return true;
            }
            c2036vr.E(0);
            try {
                if (AbstractC2022vd.B(1, c2036vr, true)) {
                    this.f8268d = new M2();
                    return true;
                }
            } catch (P4 unused) {
            }
            c2036vr.E(0);
            if (K2.e(c2036vr, K2.f9420o)) {
                this.f8268d = new K2();
                return true;
            }
        }
        return false;
    }

    private final void a() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
