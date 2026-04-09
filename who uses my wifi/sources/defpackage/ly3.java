package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ly3 extends p54 {
    private static final ly3 zzc;
    private static volatile n64 zzd;
    private int zza;
    private int zzb;

    static {
        ly3 ly3Var = new ly3();
        zzc = ly3Var;
        p54.u(ly3.class, ly3Var);
    }

    public static ly3 C(a54 a54Var, h54 h54Var) {
        return (ly3) p54.m(zzc, a54Var, h54Var);
    }

    public static ky3 D() {
        return (ky3) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(int i) {
        this.zza = i;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new ly3();
        }
        if (iS == 4) {
            return new ky3(zzc);
        }
        if (iS == 5) {
            return zzc;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzd;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (ly3.class) {
            try {
                o54Var = zzd;
                if (o54Var == null) {
                    o54Var = new o54(zzc);
                    zzd = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
