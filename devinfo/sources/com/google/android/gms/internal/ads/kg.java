package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kg extends qn1 {
    private static final kg zzg;
    private static volatile po1 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        kg kgVar = new kg();
        zzg = kgVar;
        qn1.u(kg.class, kgVar);
    }

    public static kg F(zm1 zm1Var) {
        kg kgVar = zzg;
        jn1 jn1Var = jn1.f12801a;
        int i4 = um1.f17262a;
        qn1 qn1VarM = qn1.m(kgVar, zm1Var, jn1.f12802b);
        qn1.z(qn1VarM);
        return (kg) qn1VarM;
    }

    public static kg G(zm1 zm1Var, jn1 jn1Var) {
        return (kg) qn1.m(zzg, zm1Var, jn1Var);
    }

    public static jg H() {
        return (jg) zzg.r();
    }

    public static kg I() {
        return zzg;
    }

    public final String A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final long E() {
        return this.zzf;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new kg();
        }
        if (iC == 4) {
            return new jg(zzg);
        }
        if (iC == 5) {
            return zzg;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzh;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (kg.class) {
            try {
                pn1Var = zzh;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzg);
                    zzh = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
