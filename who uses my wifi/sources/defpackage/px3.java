package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class px3 extends p54 {
    private static final px3 zzd;
    private static volatile n64 zze;
    private int zza;
    private int zzb;
    private rx3 zzc;

    static {
        px3 px3Var = new px3();
        zzd = px3Var;
        p54.u(px3.class, px3Var);
    }

    public static px3 C(a54 a54Var, h54 h54Var) {
        return (px3) p54.m(zzd, a54Var, h54Var);
    }

    public static ox3 D() {
        return (ox3) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final rx3 B() {
        rx3 rx3Var = this.zzc;
        return rx3Var == null ? rx3.C() : rx3Var;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void F(rx3 rx3Var) {
        this.zzc = rx3Var;
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
            return new px3();
        }
        if (iS == 4) {
            return new ox3(zzd);
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
        synchronized (px3.class) {
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
