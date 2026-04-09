package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fx1 extends p54 {
    private static final fx1 zzB;
    private static volatile n64 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private x54 zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private ry1 zzo;
    private ty1 zzp;
    private x54 zzu;
    private uy1 zzv;
    private ox1 zzw;
    private ix1 zzx;
    private bz1 zzy;
    private cz1 zzz;

    static {
        fx1 fx1Var = new fx1();
        zzB = fx1Var;
        p54.u(fx1.class, fx1Var);
    }

    public fx1() {
        q64 q64Var = q64.j;
        this.zzu = q64Var;
        this.zzA = q64Var;
    }

    public static fx1 A() {
        return zzB;
    }

    public final void B(dx1 dx1Var) {
        this.zzm = dx1Var.f;
        this.zzl |= 1;
    }

    public final void C(ty1 ty1Var) {
        this.zzp = ty1Var;
        this.zzl |= 8;
    }

    public final ty1 D() {
        ty1 ty1Var = this.zzp;
        return ty1Var == null ? ty1.A() : ty1Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", tq1.o, "zzn", tq1.w, "zzo", "zzp", "zzu", qy1.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", vx1.class});
        }
        if (iS == 3) {
            return new fx1();
        }
        if (iS == 4) {
            return new ex1(zzB);
        }
        if (iS == 5) {
            return zzB;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzC;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (fx1.class) {
            try {
                o54Var = zzC;
                if (o54Var == null) {
                    o54Var = new o54(zzB);
                    zzC = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
