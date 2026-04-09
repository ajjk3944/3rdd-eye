package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tr1 extends p54 {
    private static final tr1 zzl;
    private static volatile n64 zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private t54 zze = q54.j;
    private x54 zzh = q64.j;

    static {
        tr1 tr1Var = new tr1();
        zzl = tr1Var;
        p54.u(tr1.class, tr1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\b᠌\u0005\t᠌\u0006\n᠌\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", wr1.class, "zzi", tq1.B, "zzj", tq1.D, "zzk", tq1.C});
        }
        if (iS == 3) {
            return new tr1();
        }
        if (iS == 4) {
            return new vq1(zzl);
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
        synchronized (tr1.class) {
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
