package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fk extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final fk zzv;
    private static volatile po1 zzw;
    private int zzi;
    private bj zzk;
    private int zzl;
    private dj zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        fk fkVar = new fk();
        zzv = fkVar;
        qn1.u(fk.class, fkVar);
    }

    public static fk A() {
        return zzv;
    }

    public final void B(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void C(dj djVar) {
        this.zzm = djVar;
        this.zzi |= 8;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            qc qcVar = qc.f15310x;
            return new to1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", qcVar, "zzp", qcVar, "zzu", qcVar});
        }
        if (iC == 3) {
            return new fk();
        }
        if (iC == 4) {
            return new ek(zzv);
        }
        if (iC == 5) {
            return zzv;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzw;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (fk.class) {
            try {
                pn1Var = zzw;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzv);
                    zzw = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
