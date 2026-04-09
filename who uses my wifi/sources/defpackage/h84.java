package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h84 extends p54 {
    private static final h84 zze;
    private static volatile n64 zzf;
    private int zza;
    private a54 zzb;
    private a54 zzc;
    private byte zzd = 2;

    static {
        h84 h84Var = new h84();
        zze = h84Var;
        p54.u(h84.class, h84Var);
    }

    public h84() {
        y44 y44Var = a54.g;
        this.zzb = y44Var;
        this.zzc = y44Var;
    }

    public static g84 A() {
        return (g84) zze.r();
    }

    public final /* synthetic */ void B(y44 y44Var) {
        this.zza |= 1;
        this.zzb = y44Var;
    }

    public final /* synthetic */ void C(a54 a54Var) {
        this.zza |= 2;
        this.zzc = a54Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        switch (ex0.s(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = p54Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new r64(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new h84();
            case 4:
                return new g84(zze);
            case 5:
                return zze;
            case 6:
                n64 n64Var = zzf;
                if (n64Var != null) {
                    return n64Var;
                }
                synchronized (h84.class) {
                    try {
                        o54Var = zzf;
                        if (o54Var == null) {
                            o54Var = new o54(zze);
                            zzf = o54Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o54Var;
            default:
                throw null;
        }
    }
}
