package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jh3 extends p54 {
    private static final jh3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        jh3 jh3Var = new jh3();
        zze = jh3Var;
        p54.u(jh3.class, jh3Var);
    }

    public static zg3 D() {
        return (zg3) zze.r();
    }

    public static jh3 E() {
        return zze;
    }

    public final fv1 A() {
        return this.zzb == 1 ? (fv1) this.zzc : fv1.I();
    }

    public final dv1 B() {
        return this.zzb == 2 ? (dv1) this.zzc : dv1.C();
    }

    public final av1 C() {
        av1 av1VarB = av1.b(this.zzd);
        return av1VarB == null ? av1.UNSUPPORTED : av1VarB;
    }

    public final /* synthetic */ void F(fv1 fv1Var) {
        fv1Var.getClass();
        this.zzc = fv1Var;
        this.zzb = 1;
    }

    public final /* synthetic */ void G(dv1 dv1Var) {
        dv1Var.getClass();
        this.zzc = dv1Var;
        this.zzb = 2;
    }

    public final void H(av1 av1Var) {
        this.zzd = av1Var.f;
        this.zza |= 1;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", fv1.class, dv1.class, "zzd", tq1.n});
        }
        if (iS == 3) {
            return new jh3();
        }
        if (iS == 4) {
            return new zg3(zze);
        }
        if (iS == 5) {
            return zze;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzf;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (jh3.class) {
            try {
                o54Var = zzf;
                if (o54Var == null) {
                    o54Var = new o54(zze);
                    zzf = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
