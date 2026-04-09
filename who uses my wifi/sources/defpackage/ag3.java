package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ag3 extends p54 {
    private static final ag3 zzf;
    private static volatile n64 zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        ag3 ag3Var = new ag3();
        zzf = ag3Var;
        p54.u(ag3.class, ag3Var);
    }

    public static zf3 E() {
        return (zf3) zzf.r();
    }

    public static ag3 F() {
        return zzf;
    }

    public final String A() {
        return this.zzb;
    }

    public final float B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final /* synthetic */ void G(float f) {
        this.zza |= 2;
        this.zzc = f;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new ag3();
        }
        if (iS == 4) {
            return new zf3(zzf);
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
        synchronized (ag3.class) {
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
