package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ku1 extends p54 {
    private static final ku1 zzc;
    private static volatile n64 zzd;
    private int zza;
    private cv1 zzb;

    static {
        ku1 ku1Var = new ku1();
        zzc = ku1Var;
        p54.u(ku1.class, ku1Var);
    }

    public static ku1 B(byte[] bArr, h54 h54Var) throws a64 {
        p54 p54VarY = p54.y(zzc, bArr, bArr.length, h54Var);
        p54.z(p54VarY);
        return (ku1) p54VarY;
    }

    public final cv1 A() {
        cv1 cv1Var = this.zzb;
        return cv1Var == null ? cv1.E() : cv1Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new ku1();
        }
        if (iS == 4) {
            return new vq1(zzc);
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
        synchronized (ku1.class) {
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
