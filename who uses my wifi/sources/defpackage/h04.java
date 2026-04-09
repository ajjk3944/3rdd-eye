package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h04 extends p54 {
    private static final h04 zzd;
    private static volatile n64 zze;
    private int zza;
    private String zzb = "";
    private qz3 zzc;

    static {
        h04 h04Var = new h04();
        zzd = h04Var;
        p54.u(h04.class, h04Var);
    }

    public static h04 C(a54 a54Var, h54 h54Var) {
        return (h04) p54.m(zzd, a54Var, h54Var);
    }

    public static g04 D() {
        return (g04) zzd.r();
    }

    public static h04 E() {
        return zzd;
    }

    public final String A() {
        return this.zzb;
    }

    public final qz3 B() {
        qz3 qz3Var = this.zzc;
        return qz3Var == null ? qz3.F() : qz3Var;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void G(qz3 qz3Var) {
        qz3Var.getClass();
        this.zzc = qz3Var;
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
            return new r64(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new h04();
        }
        if (iS == 4) {
            return new g04(zzd);
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
        synchronized (h04.class) {
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
