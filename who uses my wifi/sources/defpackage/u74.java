package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u74 extends p54 {
    private static final u74 zzb;
    private static volatile n64 zzc;
    private x54 zza = q64.j;

    static {
        u74 u74Var = new u74();
        zzb = u74Var;
        p54.u(u74.class, u74Var);
    }

    public static t74 A() {
        return (t74) zzb.r();
    }

    public final void B(s74 s74Var) {
        x54 x54Var = this.zza;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zza = x54Var.z(size + size);
        }
        this.zza.add(s74Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", s74.class});
        }
        if (iS == 3) {
            return new u74();
        }
        if (iS == 4) {
            return new t74(zzb);
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
        synchronized (u74.class) {
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
