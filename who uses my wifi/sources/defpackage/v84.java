package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v84 extends p54 {
    private static final v84 zzl;
    private static volatile n64 zzm;
    private int zza;
    private int zzb;
    private k84 zzd;
    private m84 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private t54 zzg = q54.j;
    private String zzh = "";
    private x54 zzj = q64.j;

    static {
        v84 v84Var = new v84();
        zzl = v84Var;
        p54.u(v84.class, v84Var);
    }

    public static u84 C() {
        return (u84) zzl.r();
    }

    public final String A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzj.size();
    }

    public final /* synthetic */ void D(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void F(k84 k84Var) {
        this.zzd = k84Var;
        this.zza |= 4;
    }

    public final void G(String str) {
        str.getClass();
        x54 x54Var = this.zzj;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzj = x54Var.z(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void H(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        switch (ex0.s(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = p54Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new r64(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", v74.n, "zzj"});
            case 3:
                return new v84();
            case 4:
                return new u84(zzl);
            case 5:
                return zzl;
            case 6:
                n64 n64Var = zzm;
                if (n64Var != null) {
                    return n64Var;
                }
                synchronized (v84.class) {
                    try {
                        o54Var = zzm;
                        if (o54Var == null) {
                            o54Var = new o54(zzl);
                            zzm = o54Var;
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
