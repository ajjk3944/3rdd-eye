package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sa3 extends p54 {
    private static final sa3 zzc;
    private static volatile n64 zzd;
    private x54 zza = q64.j;
    private long zzb;

    static {
        sa3 sa3Var = new sa3();
        zzc = sa3Var;
        p54.u(sa3.class, sa3Var);
    }

    public static ra3 A() {
        return (ra3) zzc.r();
    }

    public final void B(z93 z93Var) {
        x54 x54Var = this.zza;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zza = x54Var.z(size + size);
        }
        this.zza.add(z93Var);
    }

    public final /* synthetic */ void C(long j) {
        this.zzb = j;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", z93.class, "zzb"});
        }
        if (iS == 3) {
            return new sa3();
        }
        if (iS == 4) {
            return new ra3(zzc);
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
        synchronized (sa3.class) {
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
