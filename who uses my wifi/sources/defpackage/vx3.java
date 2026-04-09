package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vx3 extends p54 {
    private static final vx3 zzd;
    private static volatile n64 zze;
    private int zza;
    private zx3 zzb;
    private kz3 zzc;

    static {
        vx3 vx3Var = new vx3();
        zzd = vx3Var;
        p54.u(vx3.class, vx3Var);
    }

    public static vx3 C(a54 a54Var, h54 h54Var) {
        return (vx3) p54.m(zzd, a54Var, h54Var);
    }

    public static ux3 D() {
        return (ux3) zzd.r();
    }

    public final zx3 A() {
        zx3 zx3Var = this.zzb;
        return zx3Var == null ? zx3.D() : zx3Var;
    }

    public final kz3 B() {
        kz3 kz3Var = this.zzc;
        return kz3Var == null ? kz3.F() : kz3Var;
    }

    public final /* synthetic */ void E(zx3 zx3Var) {
        this.zzb = zx3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(kz3 kz3Var) {
        this.zzc = kz3Var;
        this.zza |= 2;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new vx3();
        }
        if (iS == 4) {
            return new ux3(zzd);
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
        synchronized (vx3.class) {
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
