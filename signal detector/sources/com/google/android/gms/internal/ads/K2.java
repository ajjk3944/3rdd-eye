package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class K2 extends L2 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f9420o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f9421p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f9422n;

    public static boolean e(C2036vr c2036vr, byte[] bArr) {
        if (c2036vr.B() < 8) {
            return false;
        }
        int i = c2036vr.f17355b;
        byte[] bArr2 = new byte[8];
        c2036vr.H(0, 8, bArr2);
        c2036vr.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final void a(boolean z6) {
        super.a(z6);
        if (z6) {
            this.f9422n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final long b(C2036vr c2036vr) {
        byte[] bArr = c2036vr.f17354a;
        return (this.i * AbstractC0933bL.F(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.L2
    public final boolean c(C2036vr c2036vr, long j6, C0697Ql c0697Ql) {
        if (e(c2036vr, f9420o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c2036vr.f17354a, c2036vr.f17356c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListD = AbstractC0933bL.d(bArrCopyOf);
            if (((TP) c0697Ql.f10691b) == null) {
                C1855sP c1855sP = new C1855sP();
                c1855sP.d("audio/ogg");
                c1855sP.e("audio/opus");
                c1855sP.f16714D = i;
                c1855sP.f16715E = 48000;
                c1855sP.f16735o = arrayListD;
                c0697Ql.f10691b = new TP(c1855sP);
                return true;
            }
        } else {
            if (!e(c2036vr, f9421p)) {
                ((TP) c0697Ql.f10691b).getClass();
                return false;
            }
            ((TP) c0697Ql.f10691b).getClass();
            if (!this.f9422n) {
                this.f9422n = true;
                c2036vr.G(8);
                U3 u3U = AbstractC2022vd.u(LB.n((String[]) AbstractC2022vd.n(c2036vr, false, false).f11090b));
                if (u3U != null) {
                    TP tp = (TP) c0697Ql.f10691b;
                    tp.getClass();
                    C1855sP c1855sP2 = new C1855sP(tp);
                    c1855sP2.f16730j = u3U.b(((TP) c0697Ql.f10691b).f11395k);
                    c0697Ql.f10691b = new TP(c1855sP2);
                    return true;
                }
            }
        }
        return true;
    }
}
