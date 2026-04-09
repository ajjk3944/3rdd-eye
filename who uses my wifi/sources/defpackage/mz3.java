package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mz3 extends p54 {
    private static final mz3 zzc;
    private static volatile n64 zzd;
    private int zza;
    private int zzb;

    static {
        mz3 mz3Var = new mz3();
        zzc = mz3Var;
        p54.u(mz3.class, mz3Var);
    }

    public static lz3 C() {
        return (lz3) zzc.r();
    }

    public static mz3 D() {
        return zzc;
    }

    public final gz3 A() {
        gz3 gz3VarB = gz3.b(this.zza);
        return gz3VarB == null ? gz3.UNRECOGNIZED : gz3VarB;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(gz3 gz3Var) {
        this.zza = gz3Var.a();
    }

    public final /* synthetic */ void F(int i) {
        this.zzb = i;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new mz3();
        }
        if (iS == 4) {
            return new lz3(zzc);
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
        synchronized (mz3.class) {
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
