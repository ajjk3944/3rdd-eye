package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b04 extends p54 {
    private static final b04 zzd;
    private static volatile n64 zze;
    private int zza;
    private int zzb;
    private d04 zzc;

    static {
        b04 b04Var = new b04();
        zzd = b04Var;
        p54.u(b04.class, b04Var);
    }

    public static b04 C(a54 a54Var, h54 h54Var) {
        return (b04) p54.m(zzd, a54Var, h54Var);
    }

    public static a04 D() {
        return (a04) zzd.r();
    }

    public static n64 E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final d04 B() {
        d04 d04Var = this.zzc;
        return d04Var == null ? d04.D() : d04Var;
    }

    public final /* synthetic */ void F(d04 d04Var) {
        this.zzc = d04Var;
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
            return new b04();
        }
        if (iS == 4) {
            return new a04(zzd);
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
        synchronized (b04.class) {
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
