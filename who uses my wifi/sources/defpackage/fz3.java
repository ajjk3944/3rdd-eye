package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fz3 extends p54 {
    private static final fz3 zzc;
    private static volatile n64 zzd;
    private int zza;
    private a54 zzb = a54.g;

    static {
        fz3 fz3Var = new fz3();
        zzc = fz3Var;
        p54.u(fz3.class, fz3Var);
    }

    public static fz3 C(a54 a54Var, h54 h54Var) {
        return (fz3) p54.m(zzc, a54Var, h54Var);
    }

    public static ez3 D() {
        return (ez3) zzc.r();
    }

    public static fz3 E() {
        return zzc;
    }

    public static n64 F() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final a54 B() {
        return this.zzb;
    }

    public final /* synthetic */ void G(a54 a54Var) {
        this.zzb = a54Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new fz3();
        }
        if (iS == 4) {
            return new ez3(zzc);
        }
        if (iS == 5) {
            return zzc;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzd;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (fz3.class) {
            try {
                o54Var = zzd;
                if (o54Var == null) {
                    o54Var = new o54(zzc);
                    zzd = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
