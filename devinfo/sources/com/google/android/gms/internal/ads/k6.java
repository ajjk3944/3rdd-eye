package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k6 extends l6 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f13041o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f13042p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f13043n;

    public static boolean e(sk0 sk0Var, byte[] bArr) {
        if (sk0Var.B() < 8) {
            return false;
        }
        int i4 = sk0Var.f16447b;
        byte[] bArr2 = new byte[8];
        sk0Var.H(0, 8, bArr2);
        sk0Var.E(i4);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f13043n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final long b(sk0 sk0Var) {
        byte[] bArr = sk0Var.f16446a;
        return (this.f13390i * a80.J(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final boolean c(sk0 sk0Var, long j, ce1 ce1Var) {
        if (e(sk0Var, f13041o)) {
            byte[] bArrCopyOf = Arrays.copyOf(sk0Var.f16446a, sk0Var.f16448c);
            int i4 = bArrCopyOf[9] & 255;
            ArrayList arrayListD = a80.d(bArrCopyOf);
            if (((mx1) ce1Var.f10094b) == null) {
                lw1 lw1Var = new lw1();
                lw1Var.d("audio/ogg");
                lw1Var.e("audio/opus");
                lw1Var.D = i4;
                lw1Var.E = 48000;
                lw1Var.f13664o = arrayListD;
                ce1Var.f10094b = new mx1(lw1Var);
                return true;
            }
        } else {
            if (!e(sk0Var, f13042p)) {
                ((mx1) ce1Var.f10094b).getClass();
                return false;
            }
            ((mx1) ce1Var.f10094b).getClass();
            if (!this.f13043n) {
                this.f13043n = true;
                sk0Var.G(8);
                v8 v8VarQ = nn1.q(x41.r((String[]) nn1.j(sk0Var, false, false).f14041b));
                if (v8VarQ != null) {
                    mx1 mx1Var = (mx1) ce1Var.f10094b;
                    mx1Var.getClass();
                    lw1 lw1Var2 = new lw1(mx1Var);
                    lw1Var2.j = v8VarQ.b(((mx1) ce1Var.f10094b).f14050k);
                    ce1Var.f10094b = new mx1(lw1Var2);
                    return true;
                }
            }
        }
        return true;
    }
}
