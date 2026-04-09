package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dy1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final dy1 zzf;
    private static volatile n64 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        dy1 dy1Var = new dy1();
        zzf = dy1Var;
        p54.u(dy1.class, dy1Var);
    }

    public static cy1 A() {
        return (cy1) zzf.r();
    }

    public static dy1 B() {
        return zzf;
    }

    public final void C(boolean z) {
        this.zzc |= 1;
        this.zzd = z;
    }

    public final void D(int i) {
        this.zzc |= 2;
        this.zze = i;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new dy1();
        }
        if (iS == 4) {
            return new cy1(zzf);
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
        synchronized (dy1.class) {
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
