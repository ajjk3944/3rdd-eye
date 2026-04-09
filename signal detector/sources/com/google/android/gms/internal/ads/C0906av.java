package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.AbstractCollection;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906av extends AbstractC1096eL {
    private static final C0906av zzay;
    private static volatile CL zzaz;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private int zzL;
    private int zzS;
    private int zzT;
    private int zzV;
    private int zza;
    private long zzaf;
    private int zzah;
    private int zzai;
    private int zzaj;
    private C1878sv zzak;
    private int zzal;
    private C1771qv zzam;
    private C1179fv zzan;
    private C1393jv zzao;
    private C1339iv zzap;
    private C1824rv zzaq;
    private C1663ov zzar;
    private C1501lv zzas;
    private C1097eM zzat;
    private C1932tv zzav;
    private C1609nv zzaw;
    private C1287hv zzax;
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
    private String zzd = "";
    private InterfaceC1314iL zzh = C1151fL.f14062e;
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private InterfaceC1420kL zzD = C1851sL.f16708e;
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzR = "";
    private String zzU = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzae = "";
    private String zzag = "";
    private String zzau = "";

    static {
        C0906av c0906av = new C0906av();
        zzay = c0906av;
        AbstractC1096eL.u(C0906av.class, c0906av);
    }

    public static Zu C() {
        return (Zu) zzay.r();
    }

    public final /* synthetic */ void A(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzE = i - 2;
    }

    public final /* synthetic */ void B(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzL = i - 2;
    }

    public final /* synthetic */ void D(boolean z6) {
        this.zzi = z6;
    }

    public final /* synthetic */ void E(long j6) {
        this.zzj = j6;
    }

    public final /* synthetic */ void F(long j6) {
        this.zzk = j6;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzo = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzx = str;
    }

    public final /* synthetic */ void I(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzz = str2;
    }

    public final /* synthetic */ void J(int i) {
        this.zzA = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(AbstractCollection abstractCollection) {
        InterfaceC1420kL interfaceC1420kL = this.zzD;
        if (!((GK) interfaceC1420kL).f8358a) {
            this.zzD = AbstractC1096eL.k(interfaceC1420kL);
        }
        FK.e(abstractCollection, this.zzD);
    }

    public final /* synthetic */ void L(int i) {
        this.zzG = i;
    }

    public final /* synthetic */ void M(long j6) {
        this.zzH = j6;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzM = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzN = str;
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzZ = str;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzaa = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzab = str;
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzac = str;
    }

    public final /* synthetic */ void T(String str) {
        this.zzad = str;
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzae = str;
    }

    public final void V(int i) {
        if (i == 11) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i3 = -1;
        switch (i) {
            case 1:
                i3 = 0;
                break;
            case 2:
            case 11:
                break;
            case 3:
                i3 = 1;
                break;
            case 4:
                i3 = 2;
                break;
            case 5:
                i3 = 3;
                break;
            case 6:
                i3 = 4;
                break;
            case 7:
                i3 = 5;
                break;
            case 8:
                i3 = 6;
                break;
            case 9:
                i3 = 7;
                break;
            case 10:
                i3 = 8;
                break;
            default:
                throw null;
        }
        this.zzal = i3;
    }

    public final /* synthetic */ void W(C1097eM c1097eM) {
        this.zzat = c1097eM;
        this.zza |= 256;
    }

    public final /* synthetic */ void X(String str) {
        this.zzau = str;
    }

    public final /* synthetic */ void Y(int i) {
        this.zzb = i - 2;
    }

    public final /* synthetic */ void Z() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzay, "\u0004G\u0000\u0001\u0001GG\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000b", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzL", "zzM", "zzN", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzp", "zzv", "zzB", "zzC", "zzD", "zzO", "zzP", "zzX", "zzaf", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzai", "zzaj", "zzc", "zzam", "zzan", "zzS", "zzU", "zzR", "zzQ", "zzal", "zzT", "zzV", "zzW", "zzy", "zzao", "zzF", "zzap", "zzag", "zzah", "zzak", "zzaq", "zzar", "zzY", "zzas", "zzat", "zzau", "zzw", "zzav", "zzI", "zzJ", "zzK", "zzaw", "zzu", "zzax"});
        }
        if (iC == 3) {
            return new C0906av();
        }
        if (iC == 4) {
            return new Zu(zzay);
        }
        if (iC == 5) {
            return zzay;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzaz;
        if (cl != null) {
            return cl;
        }
        synchronized (C0906av.class) {
            try {
                c1042dL = zzaz;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzay);
                    zzaz = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
