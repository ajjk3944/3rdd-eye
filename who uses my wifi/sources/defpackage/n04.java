package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n04 extends p54 {
    private static final n04 zzb;
    private static volatile n64 zzc;
    private int zza;

    static {
        n04 n04Var = new n04();
        zzb = n04Var;
        p54.u(n04.class, n04Var);
    }

    public static m04 B() {
        return (m04) zzb.r();
    }

    public static n04 C() {
        return zzb;
    }

    public final gz3 A() {
        gz3 gz3VarB = gz3.b(this.zza);
        return gz3VarB == null ? gz3.UNRECOGNIZED : gz3VarB;
    }

    public final /* synthetic */ void D(gz3 gz3Var) {
        this.zza = gz3Var.a();
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iS == 3) {
            return new n04();
        }
        if (iS == 4) {
            return new m04(zzb);
        }
        if (iS == 5) {
            return zzb;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzc;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (n04.class) {
            try {
                o54Var = zzc;
                if (o54Var == null) {
                    o54Var = new o54(zzb);
                    zzc = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
