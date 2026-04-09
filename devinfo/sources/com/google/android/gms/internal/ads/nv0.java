package com.google.android.gms.internal.ads;

import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nv0 extends qn1 {
    private static final nv0 zzf;
    private static volatile po1 zzg;
    private int zza;
    private un1 zzb = rn1.f15714e;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        nv0 nv0Var = new nv0();
        zzf = nv0Var;
        qn1.u(nv0.class, nv0Var);
    }

    public static lv0 A() {
        return (lv0) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void C(int i4) {
        RandomAccess randomAccess = this.zzb;
        if (!((rm1) randomAccess).f15707a) {
            rn1 rn1Var = (rn1) randomAccess;
            int i10 = rn1Var.f15716c;
            this.zzb = rn1Var.n(i10 + i10);
        }
        ((rn1) this.zzb).f(2);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", qc.f15311y, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new nv0();
        }
        if (iC == 4) {
            return new lv0(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzg;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (nv0.class) {
            try {
                pn1Var = zzg;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzf);
                    zzg = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
