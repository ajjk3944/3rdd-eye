package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xq1 extends p54 {
    private static final xq1 zzo;
    private static volatile n64 zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private x54 zzm = q64.j;

    static {
        xq1 xq1Var = new xq1();
        zzo = xq1Var;
        p54.u(xq1.class, xq1Var);
    }

    public static uq1 A() {
        return (uq1) zzo.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", wq1.class, "zzn", tq1.c});
        }
        if (iS == 3) {
            return new xq1();
        }
        if (iS == 4) {
            return new uq1(zzo);
        }
        if (iS == 5) {
            return zzo;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzp;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (xq1.class) {
            try {
                o54Var = zzp;
                if (o54Var == null) {
                    o54Var = new o54(zzo);
                    zzp = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
