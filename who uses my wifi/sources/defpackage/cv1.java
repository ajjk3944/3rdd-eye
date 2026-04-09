package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cv1 extends p54 {
    private static final cv1 zzd;
    private static volatile n64 zze;
    private int zza;
    private dv1 zzb;
    private a54 zzc = a54.g;

    static {
        cv1 cv1Var = new cv1();
        zzd = cv1Var;
        p54.u(cv1.class, cv1Var);
    }

    public static cv1 E() {
        return zzd;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final dv1 B() {
        dv1 dv1Var = this.zzb;
        return dv1Var == null ? dv1.C() : dv1Var;
    }

    public final boolean C() {
        return (this.zza & 2) != 0;
    }

    public final a54 D() {
        return this.zzc;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new cv1();
        }
        if (iS == 4) {
            return new vq1(zzd);
        }
        if (iS == 5) {
            return zzd;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zze;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (cv1.class) {
            try {
                o54Var = zze;
                if (o54Var == null) {
                    o54Var = new o54(zzd);
                    zze = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
