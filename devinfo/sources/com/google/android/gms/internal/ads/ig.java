package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ig extends qn1 {
    private static final ig zzf;
    private static volatile po1 zzg;
    private int zza;
    private lg zzb;
    private bn1 zzc = bn1.f9729b;
    private long zzd;
    private long zze;

    static {
        ig igVar = new ig();
        zzf = igVar;
        qn1.u(ig.class, igVar);
    }

    public static ig D() {
        return zzf;
    }

    public final lg A() {
        lg lgVar = this.zzb;
        return lgVar == null ? lg.C() : lgVar;
    }

    public final bn1 B() {
        return this.zzc;
    }

    public final long C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new ig();
        }
        if (iC == 4) {
            return new sc(zzf);
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
        synchronized (ig.class) {
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
