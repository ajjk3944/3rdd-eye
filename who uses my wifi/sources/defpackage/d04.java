package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d04 extends p54 {
    private static final d04 zzb;
    private static volatile n64 zzc;
    private String zza = "";

    static {
        d04 d04Var = new d04();
        zzb = d04Var;
        p54.u(d04.class, d04Var);
    }

    public static d04 B(a54 a54Var, h54 h54Var) {
        return (d04) p54.m(zzb, a54Var, h54Var);
    }

    public static c04 C() {
        return (c04) zzb.r();
    }

    public static d04 D() {
        return zzb;
    }

    public final String A() {
        return this.zza;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iS == 3) {
            return new d04();
        }
        if (iS == 4) {
            return new c04(zzb);
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
        synchronized (d04.class) {
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
