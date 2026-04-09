package defpackage;

import android.os.Build;
import java.util.AbstractCollection;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ga3 extends p54 {
    private static final ga3 zzaw;
    private static volatile n64 zzax;
    private int zzD;
    private int zzE;
    private int zzF;
    private long zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private int zzK;
    private int zzR;
    private int zzS;
    private int zzU;
    private int zza;
    private long zzae;
    private int zzag;
    private int zzah;
    private int zzai;
    private xa3 zzaj;
    private int zzak;
    private va3 zzal;
    private la3 zzam;
    private oa3 zzan;
    private na3 zzao;
    private wa3 zzap;
    private ta3 zzaq;
    private qa3 zzar;
    private q74 zzas;
    private ya3 zzau;
    private sa3 zzav;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzz;
    private String zzd = "";
    private t54 zzh = q54.j;
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzA = "";
    private String zzB = "";
    private v54 zzC = e64.j;
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzT = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzaf = "";
    private String zzat = "";

    static {
        ga3 ga3Var = new ga3();
        zzaw = ga3Var;
        p54.u(ga3.class, ga3Var);
    }

    public static fa3 C() {
        return (fa3) zzaw.r();
    }

    public final /* synthetic */ void A(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzD = i - 2;
    }

    public final /* synthetic */ void B(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzK = i - 2;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzi = z;
    }

    public final /* synthetic */ void E(long j) {
        this.zzj = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zzk = j;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzo = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzw = str;
    }

    public final /* synthetic */ void I(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzy = str2;
    }

    public final /* synthetic */ void J(int i) {
        this.zzz = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(AbstractCollection abstractCollection) {
        v54 v54Var = this.zzC;
        if (!((t44) v54Var).f) {
            this.zzC = p54.k(v54Var);
        }
        s44.e(abstractCollection, this.zzC);
    }

    public final /* synthetic */ void L(int i) {
        this.zzF = i;
    }

    public final /* synthetic */ void M(long j) {
        this.zzG = j;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzL = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzM = str;
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzY = str;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzZ = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzaa = str;
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzab = str;
    }

    public final /* synthetic */ void T(String str) {
        this.zzac = str;
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzad = str;
    }

    public final void V(int i) {
        if (i == 11) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i2 = -1;
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
            case 11:
                break;
            case 3:
                i2 = 1;
                break;
            case 4:
                i2 = 2;
                break;
            case 5:
                i2 = 3;
                break;
            case 6:
                i2 = 4;
                break;
            case 7:
                i2 = 5;
                break;
            case 8:
                i2 = 6;
                break;
            case 9:
                i2 = 7;
                break;
            case 10:
                i2 = 8;
                break;
            default:
                throw null;
        }
        this.zzak = i2;
    }

    public final /* synthetic */ void W(q74 q74Var) {
        this.zzas = q74Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void X(String str) {
        this.zzat = str;
    }

    public final /* synthetic */ void Y(int i) {
        this.zzb = i - 2;
    }

    public final /* synthetic */ void Z() {
        this.zzn = 1;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzaw, "\u0004E\u0000\u0001\u0001EE\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\n", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzw", "zzy", "zzz", "zzD", "zzF", "zzG", "zzK", "zzL", "zzM", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzp", "zzu", "zzA", "zzB", "zzC", "zzN", "zzO", "zzW", "zzae", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzah", "zzai", "zzc", "zzal", "zzam", "zzR", "zzT", "zzQ", "zzP", "zzak", "zzS", "zzU", "zzV", "zzx", "zzan", "zzE", "zzao", "zzaf", "zzag", "zzaj", "zzap", "zzaq", "zzX", "zzar", "zzas", "zzat", "zzv", "zzau", "zzH", "zzI", "zzJ", "zzav"});
        }
        if (iS == 3) {
            return new ga3();
        }
        if (iS == 4) {
            return new fa3(zzaw);
        }
        if (iS == 5) {
            return zzaw;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzax;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (ga3.class) {
            try {
                o54Var = zzax;
                if (o54Var == null) {
                    o54Var = new o54(zzaw);
                    zzax = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
