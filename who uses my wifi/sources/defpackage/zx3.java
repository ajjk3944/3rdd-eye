package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zx3 extends p54 {
    private static final zx3 zzd;
    private static volatile n64 zze;
    private int zza;
    private by3 zzb;
    private int zzc;

    static {
        zx3 zx3Var = new zx3();
        zzd = zx3Var;
        p54.u(zx3.class, zx3Var);
    }

    public static yx3 C() {
        return (yx3) zzd.r();
    }

    public static zx3 D() {
        return zzd;
    }

    public final by3 A() {
        by3 by3Var = this.zzb;
        return by3Var == null ? by3.C() : by3Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(by3 by3Var) {
        this.zzb = by3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
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
            return new r64(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new zx3();
        }
        if (iS == 4) {
            return new yx3(zzd);
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
        synchronized (zx3.class) {
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
