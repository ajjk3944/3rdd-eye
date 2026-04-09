package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vr1 extends p54 {
    private static final vr1 zzf;
    private static volatile n64 zzg;
    private int zza;
    private a54 zzb;
    private a54 zzc;
    private a54 zzd;
    private a54 zze;

    static {
        vr1 vr1Var = new vr1();
        zzf = vr1Var;
        p54.u(vr1.class, vr1Var);
    }

    public vr1() {
        y44 y44Var = a54.g;
        this.zzb = y44Var;
        this.zzc = y44Var;
        this.zzd = y44Var;
        this.zze = y44Var;
    }

    public static vr1 E(byte[] bArr, h54 h54Var) throws a64 {
        p54 p54VarY = p54.y(zzf, bArr, bArr.length, h54Var);
        p54.z(p54VarY);
        return (vr1) p54VarY;
    }

    public static ur1 F() {
        return (ur1) zzf.r();
    }

    public final a54 A() {
        return this.zzb;
    }

    public final a54 B() {
        return this.zzc;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final a54 D() {
        return this.zze;
    }

    public final /* synthetic */ void G(a54 a54Var) {
        this.zza |= 1;
        this.zzb = a54Var;
    }

    public final /* synthetic */ void H(y44 y44Var) {
        this.zza |= 2;
        this.zzc = y44Var;
    }

    public final /* synthetic */ void I(a54 a54Var) {
        this.zza |= 4;
        this.zzd = a54Var;
    }

    public final /* synthetic */ void J(y44 y44Var) {
        this.zza |= 8;
        this.zze = y44Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new vr1();
        }
        if (iS == 4) {
            return new ur1(zzf);
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
        synchronized (vr1.class) {
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
