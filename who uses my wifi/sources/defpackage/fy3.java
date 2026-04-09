package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fy3 extends p54 {
    private static final fy3 zzd;
    private static volatile n64 zze;
    private int zza;
    private hy3 zzb;
    private int zzc;

    static {
        fy3 fy3Var = new fy3();
        zzd = fy3Var;
        p54.u(fy3.class, fy3Var);
    }

    public static fy3 C(a54 a54Var, h54 h54Var) {
        return (fy3) p54.m(zzd, a54Var, h54Var);
    }

    public static ey3 D() {
        return (ey3) zzd.r();
    }

    public final hy3 A() {
        hy3 hy3Var = this.zzb;
        return hy3Var == null ? hy3.C() : hy3Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(hy3 hy3Var) {
        this.zzb = hy3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new fy3();
        }
        if (iS == 4) {
            return new ey3(zzd);
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
        synchronized (fy3.class) {
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
