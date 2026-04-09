package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xf1 extends qn1 {
    private static final xf1 zzd;
    private static volatile po1 zze;
    private int zza;
    private zf1 zzb;
    private int zzc;

    static {
        xf1 xf1Var = new xf1();
        zzd = xf1Var;
        qn1.u(xf1.class, xf1Var);
    }

    public static wf1 C() {
        return (wf1) zzd.r();
    }

    public static xf1 D() {
        return zzd;
    }

    public final zf1 A() {
        zf1 zf1Var = this.zzb;
        return zf1Var == null ? zf1.C() : zf1Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(zf1 zf1Var) {
        this.zzb = zf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i4) {
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new xf1();
        }
        if (iC == 4) {
            return new wf1(zzd);
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
        synchronized (xf1.class) {
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
