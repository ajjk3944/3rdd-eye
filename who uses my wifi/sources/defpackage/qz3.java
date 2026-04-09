package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qz3 extends p54 {
    private static final qz3 zzd;
    private static volatile n64 zze;
    private String zza = "";
    private a54 zzb = a54.g;
    private int zzc;

    static {
        qz3 qz3Var = new qz3();
        zzd = qz3Var;
        p54.u(qz3.class, qz3Var);
    }

    public static qz3 D(byte[] bArr, h54 h54Var) {
        p54 p54VarY = p54.y(zzd, bArr, bArr.length, h54Var);
        p54.z(p54VarY);
        return (qz3) p54VarY;
    }

    public static pz3 E() {
        return (pz3) zzd.r();
    }

    public static qz3 F() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final a54 B() {
        return this.zzb;
    }

    public final i04 C() {
        i04 i04VarB = i04.b(this.zzc);
        return i04VarB == null ? i04.UNRECOGNIZED : i04VarB;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void H(a54 a54Var) {
        a54Var.getClass();
        this.zzb = a54Var;
    }

    public final /* synthetic */ void I(i04 i04Var) {
        this.zzc = i04Var.a();
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new qz3();
        }
        if (iS == 4) {
            return new pz3(zzd);
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
        synchronized (qz3.class) {
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
