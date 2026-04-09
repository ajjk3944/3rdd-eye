package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uy3 extends p54 {
    private static final uy3 zzd;
    private static volatile n64 zze;
    private int zza;
    private wy3 zzb;
    private int zzc;

    static {
        uy3 uy3Var = new uy3();
        zzd = uy3Var;
        p54.u(uy3.class, uy3Var);
    }

    public static uy3 B(a54 a54Var, h54 h54Var) {
        return (uy3) p54.m(zzd, a54Var, h54Var);
    }

    public static ty3 C() {
        return (ty3) zzd.r();
    }

    public final wy3 A() {
        wy3 wy3Var = this.zzb;
        return wy3Var == null ? wy3.C() : wy3Var;
    }

    public final /* synthetic */ void D(wy3 wy3Var) {
        this.zzb = wy3Var;
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
            return new r64(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new uy3();
        }
        if (iS == 4) {
            return new ty3(zzd);
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
        synchronized (uy3.class) {
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
