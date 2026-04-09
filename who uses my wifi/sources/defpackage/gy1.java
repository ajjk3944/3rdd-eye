package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gy1 extends p54 {
    public static final int zza = 1;
    private static final gy1 zzc;
    private static volatile n64 zzd;
    private x54 zzb = q64.j;

    static {
        gy1 gy1Var = new gy1();
        zzc = gy1Var;
        p54.u(gy1.class, gy1Var);
    }

    public static by1 A() {
        return (by1) zzc.r();
    }

    public final void B(ay1 ay1Var) {
        x54 x54Var = this.zzb;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzb = x54Var.z(size + size);
        }
        this.zzb.add(ay1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", ay1.class});
        }
        if (iS == 3) {
            return new gy1();
        }
        if (iS == 4) {
            return new by1(zzc);
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
        synchronized (gy1.class) {
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
