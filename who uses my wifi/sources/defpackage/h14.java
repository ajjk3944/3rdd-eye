package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h14 extends p54 {
    private static final h14 zzc;
    private static volatile n64 zzd;
    private int zza;
    private a54 zzb = a54.g;

    static {
        h14 h14Var = new h14();
        zzc = h14Var;
        p54.u(h14.class, h14Var);
    }

    public static h14 C(a54 a54Var, h54 h54Var) {
        return (h14) p54.m(zzc, a54Var, h54Var);
    }

    public static g14 D() {
        return (g14) zzc.r();
    }

    public static n64 E() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final a54 B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(a54 a54Var) {
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
            return new r64(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new h14();
        }
        if (iS == 4) {
            return new g14(zzc);
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
        synchronized (h14.class) {
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
