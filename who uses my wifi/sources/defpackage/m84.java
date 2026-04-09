package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m84 extends p54 {
    private static final m84 zzi;
    private static volatile n64 zzj;
    private int zza;
    private l84 zzb;
    private a54 zzd;
    private a54 zze;
    private int zzf;
    private a54 zzg;
    private byte zzh = 2;
    private x54 zzc = q64.j;

    static {
        m84 m84Var = new m84();
        zzi = m84Var;
        p54.u(m84.class, m84Var);
    }

    public m84() {
        y44 y44Var = a54.g;
        this.zzd = y44Var;
        this.zze = y44Var;
        this.zzg = y44Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        switch (ex0.s(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = p54Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new r64(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", h84.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new m84();
            case 4:
                return new c84(zzi);
            case 5:
                return zzi;
            case 6:
                n64 n64Var = zzj;
                if (n64Var != null) {
                    return n64Var;
                }
                synchronized (m84.class) {
                    try {
                        o54Var = zzj;
                        if (o54Var == null) {
                            o54Var = new o54(zzi);
                            zzj = o54Var;
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
