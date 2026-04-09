package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v04 extends p54 {
    private static final v04 zzd;
    private static volatile n64 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        v04 v04Var = new v04();
        zzd = v04Var;
        p54.u(v04.class, v04Var);
    }

    public static u04 D() {
        return (u04) zzd.r();
    }

    public static v04 E() {
        return zzd;
    }

    public final gz3 A() {
        gz3 gz3VarB = gz3.b(this.zza);
        return gz3VarB == null ? gz3.UNRECOGNIZED : gz3VarB;
    }

    public final gz3 B() {
        gz3 gz3VarB = gz3.b(this.zzb);
        return gz3VarB == null ? gz3.UNRECOGNIZED : gz3VarB;
    }

    public final int C() {
        return this.zzc;
    }

    public final /* synthetic */ void F(gz3 gz3Var) {
        this.zza = gz3Var.a();
    }

    public final /* synthetic */ void G(gz3 gz3Var) {
        this.zzb = gz3Var.a();
    }

    public final /* synthetic */ void H(int i) {
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
            return new r64(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new v04();
        }
        if (iS == 4) {
            return new u04(zzd);
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
        synchronized (v04.class) {
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
