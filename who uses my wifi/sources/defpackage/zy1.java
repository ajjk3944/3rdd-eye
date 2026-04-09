package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zy1 extends p54 {
    private static final zy1 zzF;
    private static volatile n64 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private hx1 zzA;
    private fx1 zzB;
    private nx1 zzC;
    private oy1 zzD;
    private gy1 zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private ux1 zzw;
    private wy1 zzy;
    private xy1 zzz;
    private String zzp = "";
    private int zzv = 1000;
    private v54 zzx = e64.j;

    static {
        zy1 zy1Var = new zy1();
        zzF = zy1Var;
        p54.u(zy1.class, zy1Var);
    }

    public static yy1 L() {
        return (yy1) zzF.r();
    }

    public final wy1 A() {
        wy1 wy1Var = this.zzy;
        return wy1Var == null ? wy1.A() : wy1Var;
    }

    public final void B(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final fx1 C() {
        fx1 fx1Var = this.zzB;
        return fx1Var == null ? fx1.A() : fx1Var;
    }

    public final void D(gy1 gy1Var) {
        this.zzE = gy1Var;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        v54 v54Var = this.zzx;
        if (!((t44) v54Var).f) {
            this.zzx = p54.k(v54Var);
        }
        s44.e(arrayList, this.zzx);
    }

    public final void F() {
        this.zzx = e64.j;
    }

    public final void G(wy1 wy1Var) {
        this.zzy = wy1Var;
        this.zzn |= 32;
    }

    public final void H(fx1 fx1Var) {
        this.zzB = fx1Var;
        this.zzn |= 256;
    }

    public final void I(nx1 nx1Var) {
        this.zzC = nx1Var;
        this.zzn |= 512;
    }

    public final void J(oy1 oy1Var) {
        this.zzD = oy1Var;
        this.zzn |= 1024;
    }

    public final String K() {
        return this.zzp;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", tq1.w, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (iS == 3) {
            return new zy1();
        }
        if (iS == 4) {
            return new yy1(zzF);
        }
        if (iS == 5) {
            return zzF;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzG;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (zy1.class) {
            try {
                o54Var = zzG;
                if (o54Var == null) {
                    o54Var = new o54(zzF);
                    zzG = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
