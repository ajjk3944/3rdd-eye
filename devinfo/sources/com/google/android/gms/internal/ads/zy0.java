package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zy0 extends qn1 {
    private static final zy0 zze;
    private static volatile po1 zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        zy0 zy0Var = new zy0();
        zze = zy0Var;
        qn1.u(zy0.class, zy0Var);
    }

    public static zy0 D(zm1 zm1Var) {
        zy0 zy0Var = zze;
        jn1 jn1Var = jn1.f12801a;
        int i4 = um1.f17262a;
        qn1 qn1VarM = qn1.m(zy0Var, zm1Var, jn1.f12802b);
        qn1.z(qn1VarM);
        return (zy0) qn1VarM;
    }

    public static yy0 E() {
        return (yy0) zze.r();
    }

    public static zy0 F() {
        return zze;
    }

    public final kg A() {
        return this.zzb == 1 ? (kg) this.zzc : kg.I();
    }

    public final ig B() {
        return this.zzb == 2 ? (ig) this.zzc : ig.D();
    }

    public final fg C() {
        fg fgVarA = fg.a(this.zzd);
        return fgVarA == null ? fg.UNSUPPORTED : fgVarA;
    }

    public final /* synthetic */ void G(kg kgVar) {
        kgVar.getClass();
        this.zzc = kgVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void H(ig igVar) {
        igVar.getClass();
        this.zzc = igVar;
        this.zzb = 2;
    }

    public final void I(fg fgVar) {
        this.zzd = fgVar.f11160a;
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
            return new to1(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", kg.class, ig.class, "zzd", qc.f15301o});
        }
        if (iC == 3) {
            return new zy0();
        }
        if (iC == 4) {
            return new yy0(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzf;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (zy0.class) {
            try {
                pn1Var = zzf;
                if (pn1Var == null) {
                    pn1Var = new pn1(zze);
                    zzf = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
