package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vh1 extends qn1 {
    private static final vh1 zzc;
    private static volatile po1 zzd;
    private int zza;
    private xn1 zzb = so1.f16499e;

    static {
        vh1 vh1Var = new vh1();
        zzc = vh1Var;
        qn1.u(vh1.class, vh1Var);
    }

    public static vh1 E(byte[] bArr, jn1 jn1Var) {
        qn1 qn1VarY = qn1.y(zzc, bArr, bArr.length, jn1Var);
        qn1.z(qn1VarY);
        return (vh1) qn1VarY;
    }

    public static vh1 F(ByteArrayInputStream byteArrayInputStream, jn1 jn1Var) throws ao1 {
        qn1 qn1VarL = qn1.l(zzc, new dn1(byteArrayInputStream), jn1Var);
        qn1.z(qn1VarL);
        return (vh1) qn1VarL;
    }

    public static sh1 G() {
        return (sh1) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final xn1 B() {
        return this.zzb;
    }

    public final int C() {
        return this.zzb.size();
    }

    public final uh1 D(int i4) {
        return (uh1) this.zzb.get(i4);
    }

    public final /* synthetic */ void H(int i4) {
        this.zza = i4;
    }

    public final void I(uh1 uh1Var) {
        xn1 xn1Var = this.zzb;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzb = xn1Var.n(size + size);
        }
        this.zzb.add(uh1Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", uh1.class});
        }
        if (iC == 3) {
            return new vh1();
        }
        if (iC == 4) {
            return new sh1(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzd;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (vh1.class) {
            try {
                pn1Var = zzd;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzc);
                    zzd = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
