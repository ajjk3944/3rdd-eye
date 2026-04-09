package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vx1 extends p54 {
    private static final vx1 zzL;
    private static volatile n64 zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private iy1 zzA;
    private yx1 zzB;
    private int zzC;
    private int zzD;
    private sx1 zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private hy1 zzv;
    private ky1 zzw;
    private ly1 zzx;
    private my1 zzy;
    private wx1 zzz;

    static {
        vx1 vx1Var = new vx1();
        zzL = vx1Var;
        p54.u(vx1.class, vx1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        if (iS == 3) {
            return new vx1();
        }
        if (iS == 4) {
            return new vq1(zzL);
        }
        if (iS == 5) {
            return zzL;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzM;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (vx1.class) {
            try {
                o54Var = zzM;
                if (o54Var == null) {
                    o54Var = new o54(zzL);
                    zzM = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
