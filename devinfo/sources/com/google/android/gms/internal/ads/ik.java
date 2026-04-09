package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ik extends qn1 {
    private static final ik zzF;
    private static volatile po1 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private qi zzA;
    private oi zzB;
    private wi zzC;
    private xj zzD;
    private pj zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private dj zzw;
    private fk zzy;
    private gk zzz;
    private String zzp = "";
    private int zzv = 1000;
    private wn1 zzx = fo1.f11247e;

    static {
        ik ikVar = new ik();
        zzF = ikVar;
        qn1.u(ik.class, ikVar);
    }

    public static hk L() {
        return (hk) zzF.r();
    }

    public final fk A() {
        fk fkVar = this.zzy;
        return fkVar == null ? fk.A() : fkVar;
    }

    public final void B(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final oi C() {
        oi oiVar = this.zzB;
        return oiVar == null ? oi.A() : oiVar;
    }

    public final void D(pj pjVar) {
        this.zzE = pjVar;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        wn1 wn1Var = this.zzx;
        if (!((rm1) wn1Var).f15707a) {
            this.zzx = qn1.k(wn1Var);
        }
        qm1.e(arrayList, this.zzx);
    }

    public final void F() {
        this.zzx = fo1.f11247e;
    }

    public final void G(fk fkVar) {
        this.zzy = fkVar;
        this.zzn |= 32;
    }

    public final void H(oi oiVar) {
        this.zzB = oiVar;
        this.zzn |= 256;
    }

    public final void I(wi wiVar) {
        this.zzC = wiVar;
        this.zzn |= 512;
    }

    public final void J(xj xjVar) {
        this.zzD = xjVar;
        this.zzn |= Segment.SHARE_MINIMUM;
    }

    public final String K() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", qc.f15310x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (iC == 3) {
            return new ik();
        }
        if (iC == 4) {
            return new hk(zzF);
        }
        if (iC == 5) {
            return zzF;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzG;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ik.class) {
            try {
                pn1Var = zzG;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzF);
                    zzG = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
