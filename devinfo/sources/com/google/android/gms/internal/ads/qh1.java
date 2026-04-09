package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qh1 extends qn1 {
    private static final qh1 zzd;
    private static volatile po1 zze;
    private String zza = "";
    private bn1 zzb = bn1.f9729b;
    private int zzc;

    static {
        qh1 qh1Var = new qh1();
        zzd = qh1Var;
        qn1.u(qh1.class, qh1Var);
    }

    public static qh1 D(byte[] bArr, jn1 jn1Var) {
        qn1 qn1VarY = qn1.y(zzd, bArr, bArr.length, jn1Var);
        qn1.z(qn1VarY);
        return (qh1) qn1VarY;
    }

    public static ph1 E() {
        return (ph1) zzd.r();
    }

    public static qh1 F() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final bn1 B() {
        return this.zzb;
    }

    public final ii1 C() {
        ii1 ii1VarA = ii1.a(this.zzc);
        return ii1VarA == null ? ii1.UNRECOGNIZED : ii1VarA;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void H(bn1 bn1Var) {
        bn1Var.getClass();
        this.zzb = bn1Var;
    }

    public final /* synthetic */ void I(ii1 ii1Var) {
        this.zzc = ii1Var.b();
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new qh1();
        }
        if (iC == 4) {
            return new ph1(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zze;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (qh1.class) {
            try {
                pn1Var = zze;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzd);
                    zze = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
