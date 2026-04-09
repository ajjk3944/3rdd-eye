package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dr1 extends qn1 {
    private static final dr1 zzR;
    private static volatile po1 zzS;
    private br1 zzA;
    private xn1 zzB;
    private eq1 zzC;
    private String zzD;
    private xp1 zzE;
    private xn1 zzF;
    private oq1 zzG;
    private int zzH;
    private xn1 zzI;
    private xn1 zzJ;
    private long zzK;
    private cr1 zzL;
    private qq1 zzM;
    private String zzN;
    private ar1 zzO;
    private xn1 zzP;
    private int zza;
    private int zzb;
    private int zzc;
    private aq1 zzg;
    private xn1 zzh;
    private xn1 zzi;
    private String zzj;
    private uq1 zzk;
    private boolean zzl;
    private xn1 zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private bn1 zzu;
    private yq1 zzv;
    private boolean zzw;
    private String zzx;
    private xn1 zzy;
    private xn1 zzz;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        dr1 dr1Var = new dr1();
        zzR = dr1Var;
        qn1.u(dr1.class, dr1Var);
    }

    public dr1() {
        so1 so1Var = so1.f16499e;
        this.zzh = so1Var;
        this.zzi = so1Var;
        this.zzj = "";
        this.zzm = so1Var;
        this.zzn = "";
        this.zzu = bn1.f9729b;
        this.zzx = "";
        this.zzy = so1Var;
        this.zzz = so1Var;
        this.zzB = so1Var;
        this.zzD = "";
        this.zzF = so1Var;
        this.zzI = so1Var;
        this.zzJ = so1Var;
        this.zzN = "";
        this.zzP = so1Var;
    }

    public static yp1 D() {
        return (yp1) zzR.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final xn1 B() {
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

    public final /* synthetic */ void G(aq1 aq1Var) {
        this.zzg = aq1Var;
        this.zza |= 32;
    }

    public final void H(wq1 wq1Var) {
        xn1 xn1Var = this.zzh;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzh = xn1Var.n(size + size);
        }
        this.zzh.add(wq1Var);
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void J() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    public final /* synthetic */ void K(uq1 uq1Var) {
        this.zzk = uq1Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void L(yq1 yq1Var) {
        this.zzv = yq1Var;
        this.zza |= Segment.SIZE;
    }

    public final void M(ArrayList arrayList) {
        xn1 xn1Var = this.zzy;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzy = xn1Var.n(size + size);
        }
        qm1.e(arrayList, this.zzy);
    }

    public final void N(ArrayList arrayList) {
        xn1 xn1Var = this.zzz;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzz = xn1Var.n(size + size);
        }
        qm1.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void O(int i4) {
        this.zzb = i4 - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        switch (i3.e.c(i4)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = qn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new to1(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", wq1.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", wp1.f18129k, "zzc", wp1.f18124d, "zzg", "zzj", "zzk", "zzu", "zzi", fr1.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", hr1.class, "zzC", "zzD", "zzE", "zzF", fq1.class, "zzG", "zzH", wp1.f18133o, "zzI", pq1.class, "zzJ", sq1.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", zq1.class});
            case 3:
                return new dr1();
            case 4:
                return new yp1(zzR);
            case 5:
                return zzR;
            case 6:
                po1 po1Var = zzS;
                if (po1Var != null) {
                    return po1Var;
                }
                synchronized (dr1.class) {
                    try {
                        pn1Var = zzS;
                        if (pn1Var == null) {
                            pn1Var = new pn1(zzR);
                            zzS = pn1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return pn1Var;
            default:
                throw null;
        }
    }
}
