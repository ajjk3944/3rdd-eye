package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tg3 extends p54 {
    private static final tg3 zzd;
    private static volatile n64 zze;
    private int zza;
    private x54 zzb = q64.j;
    private p74 zzc;

    static {
        tg3 tg3Var = new tg3();
        zzd = tg3Var;
        p54.u(tg3.class, tg3Var);
    }

    public static sg3 A() {
        return (sg3) zzd.r();
    }

    public final void B(rg3 rg3Var) {
        x54 x54Var = this.zzb;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzb = x54Var.z(size + size);
        }
        this.zzb.add(rg3Var);
    }

    public final /* synthetic */ void C(p74 p74Var) {
        p74Var.getClass();
        this.zzc = p74Var;
        this.zza |= 1;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", rg3.class, "zzc"});
        }
        if (iS == 3) {
            return new tg3();
        }
        if (iS == 4) {
            return new sg3(zzd);
        }
        if (iS == 5) {
            return zzd;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zze;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (tg3.class) {
            try {
                o54Var = zze;
                if (o54Var == null) {
                    o54Var = new o54(zzd);
                    zze = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
