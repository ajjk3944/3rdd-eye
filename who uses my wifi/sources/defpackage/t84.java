package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t84 extends p54 {
    private static final t84 zzf;
    private static volatile n64 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private a54 zzd;
    private a54 zze;

    static {
        t84 t84Var = new t84();
        zzf = t84Var;
        p54.u(t84.class, t84Var);
    }

    public t84() {
        y44 y44Var = a54.g;
        this.zzd = y44Var;
        this.zze = y44Var;
    }

    public static s84 A() {
        return (s84) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void C(a54 a54Var) {
        a54Var.getClass();
        this.zza |= 4;
        this.zzd = a54Var;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", v74.l, "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new t84();
        }
        if (iS == 4) {
            return new s84(zzf);
        }
        if (iS == 5) {
            return zzf;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzg;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (t84.class) {
            try {
                o54Var = zzg;
                if (o54Var == null) {
                    o54Var = new o54(zzf);
                    zzg = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
