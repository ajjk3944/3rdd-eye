package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nx1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final nx1 zzv;
    private static volatile n64 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private x54 zzj = q64.j;
    private String zzn = "";
    private String zzo = "";

    static {
        nx1 nx1Var = new nx1();
        zzv = nx1Var;
        p54.u(nx1.class, nx1Var);
    }

    public static lx1 A() {
        return (lx1) zzv.r();
    }

    public final void B(ArrayList arrayList) {
        x54 x54Var = this.zzj;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzj = x54Var.z(size + size);
        }
        s44.e(arrayList, this.zzj);
    }

    public final void C(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void D(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void E(long j) {
        this.zzi |= 4;
        this.zzm = j;
    }

    public final void F(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void G() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void H(long j) {
        this.zzi |= 32;
        this.zzp = j;
    }

    public final void I(int i) {
        this.zzi |= 64;
        this.zzu = i;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", kx1.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (iS == 3) {
            return new nx1();
        }
        if (iS == 4) {
            return new lx1(zzv);
        }
        if (iS == 5) {
            return zzv;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzw;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (nx1.class) {
            try {
                o54Var = zzw;
                if (o54Var == null) {
                    o54Var = new o54(zzv);
                    zzw = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
