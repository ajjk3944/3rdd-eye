package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.AbstractCollection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class es0 extends qn1 {
    private static final es0 zzay;
    private static volatile po1 zzaz;
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
    private ws0 zzak;
    private int zzal;
    private us0 zzam;
    private js0 zzan;
    private ns0 zzao;
    private ms0 zzap;
    private vs0 zzaq;
    private ss0 zzar;
    private ps0 zzas;
    private qp1 zzat;
    private xs0 zzav;
    private rs0 zzaw;
    private ls0 zzax;
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
    private un1 zzh = rn1.f15714e;
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
    private wn1 zzD = fo1.f11247e;
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
        es0 es0Var = new es0();
        zzay = es0Var;
        qn1.u(es0.class, es0Var);
    }

    public static ds0 C() {
        return (ds0) zzay.r();
    }

    public final /* synthetic */ void A(int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzE = i4 - 2;
    }

    public final /* synthetic */ void B(int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzL = i4 - 2;
    }

    public final /* synthetic */ void D(boolean z3) {
        this.zzi = z3;
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
        this.zzx = str;
    }

    public final /* synthetic */ void I(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzz = str2;
    }

    public final /* synthetic */ void J(int i4) {
        this.zzA = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(AbstractCollection abstractCollection) {
        wn1 wn1Var = this.zzD;
        if (!((rm1) wn1Var).f15707a) {
            this.zzD = qn1.k(wn1Var);
        }
        qm1.e(abstractCollection, this.zzD);
    }

    public final /* synthetic */ void L(int i4) {
        this.zzG = i4;
    }

    public final /* synthetic */ void M(long j) {
        this.zzH = j;
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

    public final void V(int i4) {
        if (i4 == 11) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i10 = -1;
        switch (i4) {
            case 1:
                i10 = 0;
                break;
            case 2:
            case 11:
                break;
            case 3:
                i10 = 1;
                break;
            case 4:
                i10 = 2;
                break;
            case 5:
                i10 = 3;
                break;
            case 6:
                i10 = 4;
                break;
            case 7:
                i10 = 5;
                break;
            case 8:
                i10 = 6;
                break;
            case 9:
                i10 = 7;
                break;
            case 10:
                i10 = 8;
                break;
            default:
                throw null;
        }
        this.zzal = i10;
    }

    public final /* synthetic */ void W(qp1 qp1Var) {
        this.zzat = qp1Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void X(String str) {
        this.zzau = str;
    }

    public final /* synthetic */ void Y(int i4) {
        this.zzb = i4 - 2;
    }

    public final /* synthetic */ void Z() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzay, "\u0004G\u0000\u0001\u0001GG\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000b", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzL", "zzM", "zzN", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzp", "zzv", "zzB", "zzC", "zzD", "zzO", "zzP", "zzX", "zzaf", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzai", "zzaj", "zzc", "zzam", "zzan", "zzS", "zzU", "zzR", "zzQ", "zzal", "zzT", "zzV", "zzW", "zzy", "zzao", "zzF", "zzap", "zzag", "zzah", "zzak", "zzaq", "zzar", "zzY", "zzas", "zzat", "zzau", "zzw", "zzav", "zzI", "zzJ", "zzK", "zzaw", "zzu", "zzax"});
        }
        if (iC == 3) {
            return new es0();
        }
        if (iC == 4) {
            return new ds0(zzay);
        }
        if (iC == 5) {
            return zzay;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzaz;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (es0.class) {
            try {
                pn1Var = zzaz;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzay);
                    zzaz = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
