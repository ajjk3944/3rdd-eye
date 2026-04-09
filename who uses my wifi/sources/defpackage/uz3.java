package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uz3 extends p54 {
    private static final uz3 zzf;
    private static volatile n64 zzg;
    private int zza;
    private oz3 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        uz3 uz3Var = new uz3();
        zzf = uz3Var;
        p54.u(uz3.class, uz3Var);
    }

    public static tz3 E() {
        return (tz3) zzf.r();
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final oz3 B() {
        oz3 oz3Var = this.zzb;
        return oz3Var == null ? oz3.E() : oz3Var;
    }

    public final int C() {
        return this.zzd;
    }

    public final i04 D() {
        i04 i04VarB = i04.b(this.zze);
        return i04VarB == null ? i04.UNRECOGNIZED : i04VarB;
    }

    public final /* synthetic */ void F(oz3 oz3Var) {
        this.zzb = oz3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzd = i;
    }

    public final /* synthetic */ void H(i04 i04Var) {
        this.zze = i04Var.a();
    }

    public final int I() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final void J(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzc = i - 2;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new uz3();
        }
        if (iS == 4) {
            return new tz3(zzf);
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
        synchronized (uz3.class) {
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
