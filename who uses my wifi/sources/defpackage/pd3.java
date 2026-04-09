package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pd3 extends p54 {
    private static final pd3 zzf;
    private static volatile n64 zzg;
    private int zza;
    private t54 zzb = q54.j;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        pd3 pd3Var = new pd3();
        zzf = pd3Var;
        p54.u(pd3.class, pd3Var);
    }

    public static od3 A() {
        return (od3) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void C(int i) {
        RandomAccess randomAccess = this.zzb;
        if (!((t44) randomAccess).f) {
            q54 q54Var = (q54) randomAccess;
            int i2 = q54Var.h;
            this.zzb = q54Var.z(i2 + i2);
        }
        ((q54) this.zzb).d(2);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", tq1.x, "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new pd3();
        }
        if (iS == 4) {
            return new od3(zzf);
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
        synchronized (pd3.class) {
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
