package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o94 extends p54 {
    private static final o94 zzl;
    private static volatile n64 zzm;
    private int zza;
    private a54 zzb = a54.g;
    private t54 zzc;
    private long zzd;
    private t54 zze;
    private x54 zzf;
    private String zzg;
    private x54 zzh;
    private p94 zzi;
    private q94 zzj;
    private y34 zzk;

    static {
        o94 o94Var = new o94();
        zzl = o94Var;
        p54.u(o94.class, o94Var);
    }

    public o94() {
        q54 q54Var = q54.j;
        this.zzc = q54Var;
        this.zze = q54Var;
        q64 q64Var = q64.j;
        this.zzf = q64Var;
        this.zzg = "";
        this.zzh = q64Var;
    }

    public static o94 A(byte[] bArr, h54 h54Var) throws a64 {
        p54 p54VarY = p54.y(zzl, bArr, bArr.length, h54Var);
        p54.z(p54VarY);
        return (o94) p54VarY;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", k94.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iS == 3) {
            return new o94();
        }
        if (iS == 4) {
            return new c84(zzl);
        }
        if (iS == 5) {
            return zzl;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzm;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (o94.class) {
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
    }
}
