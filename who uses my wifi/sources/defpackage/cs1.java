package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cs1 extends p54 {
    private static final cs1 zzf;
    private static volatile n64 zzg;
    private int zza;
    private x54 zzb = q64.j;
    private a54 zzc = a54.g;
    private int zzd = 1;
    private int zze = 1;

    static {
        cs1 cs1Var = new cs1();
        zzf = cs1Var;
        p54.u(cs1.class, cs1Var);
    }

    public static bs1 A() {
        return (bs1) zzf.r();
    }

    public final void B(y44 y44Var) {
        x54 x54Var = this.zzb;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzb = x54Var.z(size + size);
        }
        this.zzb.add(y44Var);
    }

    public final /* synthetic */ void C(y44 y44Var) {
        this.zza |= 1;
        this.zzc = y44Var;
    }

    public final /* synthetic */ void D(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", tq1.m, "zze", tq1.k});
        }
        if (iS == 3) {
            return new cs1();
        }
        if (iS == 4) {
            return new bs1(zzf);
        }
        if (iS == 5) {
            return zzf;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzg;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (cs1.class) {
            try {
                o54Var = zzg;
                if (o54Var == null) {
                    o54Var = new o54(zzf);
                    zzg = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
