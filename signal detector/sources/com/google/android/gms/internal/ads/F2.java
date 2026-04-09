package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F2 extends L2 {

    /* renamed from: n, reason: collision with root package name */
    public C0 f8062n;

    /* renamed from: o, reason: collision with root package name */
    public C1187g2 f8063o;

    @Override // com.google.android.gms.internal.ads.L2
    public final void a(boolean z6) {
        super.a(z6);
        if (z6) {
            this.f8062n = null;
            this.f8063o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final long b(C2036vr c2036vr) {
        byte[] bArr = c2036vr.f17354a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6) {
            c2036vr.G(4);
            c2036vr.o();
        } else if (i == 7) {
            i = 7;
            c2036vr.G(4);
            c2036vr.o();
        }
        int iL = AbstractC0709Rg.l(i, c2036vr);
        c2036vr.E(0);
        return iL;
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final boolean c(C2036vr c2036vr, long j6, C0697Ql c0697Ql) {
        byte[] bArr = c2036vr.f17354a;
        C0 c02 = this.f8062n;
        if (c02 == null) {
            C0 c03 = new C0(bArr, 17);
            this.f8062n = c03;
            C1855sP c1855sP = new C1855sP(c03.b(Arrays.copyOfRange(bArr, 9, c2036vr.f17356c), null));
            c1855sP.d("audio/ogg");
            c0697Ql.f10691b = new TP(c1855sP);
            return true;
        }
        byte b5 = bArr[0];
        if ((b5 & 127) != 3) {
            if (b5 != -1) {
                return true;
            }
            C1187g2 c1187g2 = this.f8063o;
            if (c1187g2 != null) {
                c1187g2.f14186a = j6;
                c0697Ql.f10692c = c1187g2;
            }
            ((TP) c0697Ql.f10691b).getClass();
            return false;
        }
        C0697Ql c0697QlQ = AbstractC1114el.q(c2036vr);
        C0 c04 = new C0(c02.f7479a, c02.f7480b, c02.f7481c, c02.f7482d, c02.f7483e, c02.f7485g, c02.f7486h, c02.f7487j, c0697QlQ, c02.f7489l);
        this.f8062n = c04;
        C1187g2 c1187g22 = new C1187g2();
        c1187g22.f14188c = c04;
        c1187g22.f14189d = c0697QlQ;
        c1187g22.f14186a = -1L;
        c1187g22.f14187b = -1L;
        this.f8063o = c1187g22;
        return true;
    }
}
