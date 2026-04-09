package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f04 extends p54 {
    private static final f04 zzd;
    private static volatile n64 zze;
    private int zza;
    private int zzb;
    private h04 zzc;

    static {
        f04 f04Var = new f04();
        zzd = f04Var;
        p54.u(f04.class, f04Var);
    }

    public static f04 C(a54 a54Var, h54 h54Var) {
        return (f04) p54.m(zzd, a54Var, h54Var);
    }

    public static e04 D() {
        return (e04) zzd.r();
    }

    public static n64 E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final h04 B() {
        h04 h04Var = this.zzc;
        return h04Var == null ? h04.E() : h04Var;
    }

    public final /* synthetic */ void F(h04 h04Var) {
        this.zzc = h04Var;
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
            return new r64(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new f04();
        }
        if (iS == 4) {
            return new e04(zzd);
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
        synchronized (f04.class) {
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
