package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c94 extends p54 {
    private static final c94 zzR;
    private static volatile n64 zzS;
    private a94 zzA;
    private x54 zzB;
    private e84 zzC;
    private String zzD;
    private x74 zzE;
    private x54 zzF;
    private o84 zzG;
    private int zzH;
    private x54 zzI;
    private x54 zzJ;
    private long zzK;
    private b94 zzL;
    private q84 zzM;
    private String zzN;
    private z84 zzO;
    private x54 zzP;
    private int zza;
    private int zzb;
    private int zzc;
    private a84 zzg;
    private x54 zzh;
    private x54 zzi;
    private String zzj;
    private t84 zzk;
    private boolean zzl;
    private x54 zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private a54 zzu;
    private x84 zzv;
    private boolean zzw;
    private String zzx;
    private x54 zzy;
    private x54 zzz;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        c94 c94Var = new c94();
        zzR = c94Var;
        p54.u(c94.class, c94Var);
    }

    public c94() {
        q64 q64Var = q64.j;
        this.zzh = q64Var;
        this.zzi = q64Var;
        this.zzj = "";
        this.zzm = q64Var;
        this.zzn = "";
        this.zzu = a54.g;
        this.zzx = "";
        this.zzy = q64Var;
        this.zzz = q64Var;
        this.zzB = q64Var;
        this.zzD = "";
        this.zzF = q64Var;
        this.zzI = q64Var;
        this.zzJ = q64Var;
        this.zzN = "";
        this.zzP = q64Var;
    }

    public static y74 D() {
        return (y74) zzR.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final x54 B() {
        return this.zzh;
    }

    public final String C() {
        return this.zzj;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void G(a84 a84Var) {
        this.zzg = a84Var;
        this.zza |= 32;
    }

    public final void H(v84 v84Var) {
        x54 x54Var = this.zzh;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzh = x54Var.z(size + size);
        }
        this.zzh.add(v84Var);
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void J() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    public final /* synthetic */ void K(t84 t84Var) {
        this.zzk = t84Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void L(x84 x84Var) {
        this.zzv = x84Var;
        this.zza |= 8192;
    }

    public final void M(ArrayList arrayList) {
        x54 x54Var = this.zzy;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzy = x54Var.z(size + size);
        }
        s44.e(arrayList, this.zzy);
    }

    public final void N(ArrayList arrayList) {
        x54 x54Var = this.zzz;
        if (!((t44) x54Var).f) {
            int size = x54Var.size();
            this.zzz = x54Var.z(size + size);
        }
        s44.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void O(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        switch (ex0.s(i)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = p54Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new r64(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", v84.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", v74.m, "zzc", v74.f, "zzg", "zzj", "zzk", "zzu", "zzi", e94.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", g94.class, "zzC", "zzD", "zzE", "zzF", f84.class, "zzG", "zzH", v74.q, "zzI", p84.class, "zzJ", r84.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", y84.class});
            case 3:
                return new c94();
            case 4:
                return new y74(zzR);
            case 5:
                return zzR;
            case 6:
                n64 n64Var = zzS;
                if (n64Var != null) {
                    return n64Var;
                }
                synchronized (c94.class) {
                    try {
                        o54Var = zzS;
                        if (o54Var == null) {
                            o54Var = new o54(zzR);
                            zzS = o54Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o54Var;
            default:
                throw null;
        }
    }
}
