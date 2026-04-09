package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tg1 extends qn1 {
    private static final tg1 zzd;
    private static volatile po1 zze;
    private int zza;
    private vg1 zzb;
    private int zzc;

    static {
        tg1 tg1Var = new tg1();
        zzd = tg1Var;
        qn1.u(tg1.class, tg1Var);
    }

    public static tg1 B(bn1 bn1Var, jn1 jn1Var) {
        return (tg1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static sg1 C() {
        return (sg1) zzd.r();
    }

    public final vg1 A() {
        vg1 vg1Var = this.zzb;
        return vg1Var == null ? vg1.C() : vg1Var;
    }

    public final /* synthetic */ void D(vg1 vg1Var) {
        this.zzb = vg1Var;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new tg1();
        }
        if (iC == 4) {
            return new sg1(zzd);
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
        synchronized (tg1.class) {
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
