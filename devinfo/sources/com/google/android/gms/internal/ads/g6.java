package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g6 extends l6 {

    /* renamed from: n, reason: collision with root package name */
    public e2 f11384n;

    /* renamed from: o, reason: collision with root package name */
    public g5 f11385o;

    @Override // com.google.android.gms.internal.ads.l6
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f11384n = null;
            this.f11385o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final long b(sk0 sk0Var) {
        byte[] bArr = sk0Var.f16446a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 == 6) {
            sk0Var.G(4);
            sk0Var.o();
        } else if (i4 == 7) {
            i4 = 7;
            sk0Var.G(4);
            sk0Var.o();
        }
        int iQ = ls.q(i4, sk0Var);
        sk0Var.E(0);
        return iQ;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final boolean c(sk0 sk0Var, long j, ce1 ce1Var) {
        byte[] bArr = sk0Var.f16446a;
        e2 e2Var = this.f11384n;
        if (e2Var == null) {
            e2 e2Var2 = new e2(bArr, 17);
            this.f11384n = e2Var2;
            lw1 lw1Var = new lw1(e2Var2.b(Arrays.copyOfRange(bArr, 9, sk0Var.f16448c), null));
            lw1Var.d("audio/ogg");
            ce1Var.f10094b = new mx1(lw1Var);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            g5 g5Var = this.f11385o;
            if (g5Var != null) {
                g5Var.f11373a = j;
                ce1Var.f10095c = g5Var;
            }
            ((mx1) ce1Var.f10094b).getClass();
            return false;
        }
        rt rtVarN = jz.n(sk0Var);
        e2 e2Var3 = new e2(e2Var.f10668a, e2Var.f10669b, e2Var.f10670c, e2Var.f10671d, e2Var.f10672e, e2Var.g, e2Var.f10674h, e2Var.j, rtVarN, e2Var.f10677l);
        this.f11384n = e2Var3;
        g5 g5Var2 = new g5();
        g5Var2.f11375c = e2Var3;
        g5Var2.f11376d = rtVarN;
        g5Var2.f11373a = -1L;
        g5Var2.f11374b = -1L;
        this.f11385o = g5Var2;
        return true;
    }
}
