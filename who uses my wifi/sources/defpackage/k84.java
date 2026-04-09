package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k84 extends p54 {
    private static final k84 zzh;
    private static volatile n64 zzi;
    private int zza;
    private j84 zzb;
    private a54 zzd;
    private a54 zze;
    private int zzf;
    private byte zzg = 2;
    private x54 zzc = q64.j;

    static {
        k84 k84Var = new k84();
        zzh = k84Var;
        p54.u(k84.class, k84Var);
    }

    public k84() {
        y44 y44Var = a54.g;
        this.zzd = y44Var;
        this.zze = y44Var;
    }

    public static i84 A() {
        return (i84) zzh.r();
    }

    public final void B(h84 h84Var) {
        x54 x54Var = this.zzc;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzc = x54Var.z(size + size);
        }
        this.zzc.add(h84Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        switch (ex0.s(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = p54Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new r64(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", h84.class, "zzd", "zze", "zzf"});
            case 3:
                return new k84();
            case 4:
                return new i84(zzh);
            case 5:
                return zzh;
            case 6:
                n64 n64Var = zzi;
                if (n64Var != null) {
                    return n64Var;
                }
                synchronized (k84.class) {
                    try {
                        o54Var = zzi;
                        if (o54Var == null) {
                            o54Var = new o54(zzh);
                            zzi = o54Var;
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
