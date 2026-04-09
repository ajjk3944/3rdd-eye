package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sq1 extends p54 {
    private static final sq1 zzn;
    private static volatile n64 zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private x54 zzb = q64.j;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        sq1 sq1Var = new sq1();
        zzn = sq1Var;
        p54.u(sq1.class, sq1Var);
    }

    public static rq1 A() {
        return (rq1) zzn.r();
    }

    public final void B(ar1 ar1Var) {
        x54 x54Var = this.zzb;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzb = x54Var.z(size + size);
        }
        this.zzb.add(ar1Var);
    }

    public final void C() {
        this.zzb = q64.j;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void E(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    public final /* synthetic */ void N(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", ar1.class, "zzc", "zzd", "zze", "zzf", "zzg", tq1.d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iS == 3) {
            return new sq1();
        }
        if (iS == 4) {
            return new rq1(zzn);
        }
        if (iS == 5) {
            return zzn;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzo;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (sq1.class) {
            try {
                o54Var = zzo;
                if (o54Var == null) {
                    o54Var = new o54(zzn);
                    zzo = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
