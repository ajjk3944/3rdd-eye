package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qe3 extends p54 {
    private static final qe3 zzn;
    private static volatile n64 zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private v54 zzk;
    private v54 zzl;
    private v54 zzm;

    static {
        qe3 qe3Var = new qe3();
        zzn = qe3Var;
        p54.u(qe3.class, qe3Var);
    }

    public qe3() {
        e64 e64Var = e64.j;
        this.zzk = e64Var;
        this.zzl = e64Var;
        this.zzm = e64Var;
    }

    public static qe3 R() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j) {
        v54 v54Var = this.zzl;
        if (!((t44) v54Var).f) {
            this.zzl = p54.k(v54Var);
        }
        ((e64) this.zzl).c(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(long j) {
        v54 v54Var = this.zzm;
        if (!((t44) v54Var).f) {
            this.zzm = p54.k(v54Var);
        }
        ((e64) this.zzm).c(j);
    }

    public final void C() {
        this.zzm = e64.j;
    }

    public final String D() {
        return this.zzb;
    }

    public final long E() {
        return this.zzc;
    }

    public final int F() {
        return this.zzd;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final long I() {
        return this.zzg;
    }

    public final long J() {
        return this.zzh;
    }

    public final long K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zza & 64) != 0;
    }

    public final v54 M() {
        return this.zzk;
    }

    public final int N() {
        return ((e64) this.zzk).size();
    }

    public final int O() {
        return ((e64) this.zzl).size();
    }

    public final v54 P() {
        return this.zzm;
    }

    public final int Q() {
        return ((e64) this.zzm).size();
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void T(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void U(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void V(boolean z) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void W(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void X(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void a0(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(long j) {
        v54 v54Var = this.zzk;
        if (!((t44) v54Var).f) {
            this.zzk = p54.k(v54Var);
        }
        ((e64) this.zzk).c(j);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iS == 3) {
            return new qe3();
        }
        if (iS == 4) {
            return new pe3(zzn);
        }
        if (iS == 5) {
            return zzn;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzo;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (qe3.class) {
            try {
                o54Var = zzo;
                if (o54Var == null) {
                    o54Var = new o54(zzn);
                    zzo = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
