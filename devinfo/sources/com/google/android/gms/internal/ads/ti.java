package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ti extends qn1 {
    private static final ti zzG;
    private static volatile po1 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final vn1 zzx = new w5(27);
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private un1 zzw = rn1.f15714e;
    private qi zzy;
    private int zzz;

    static {
        ti tiVar = new ti();
        zzG = tiVar;
        qn1.u(ti.class, tiVar);
    }

    public static ti P(byte[] bArr) throws ao1 {
        ti tiVar = zzG;
        int length = bArr.length;
        jn1 jn1Var = jn1.f12801a;
        int i4 = um1.f17262a;
        qn1 qn1VarY = qn1.y(tiVar, bArr, length, jn1.f12802b);
        qn1.z(qn1VarY);
        return (ti) qn1VarY;
    }

    public static si Q() {
        return (si) zzG.r();
    }

    public final void A(long j) {
        this.zzn |= 1;
        this.zzo = j;
    }

    public final void B(int i4) {
        this.zzp = d7.j(i4);
        this.zzn |= 2;
    }

    public final void C(long j) {
        this.zzn |= 4;
        this.zzu = j;
    }

    public final void D(long j) {
        this.zzn |= 8;
        this.zzv = j;
    }

    public final void E(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzw;
        if (!((rm1) randomAccess).f15707a) {
            rn1 rn1Var = (rn1) randomAccess;
            int i4 = rn1Var.f15716c;
            this.zzw = rn1Var.n(i4 + i4);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((rn1) this.zzw).f(((yj) obj).f18775a);
        }
    }

    public final void F(qi qiVar) {
        this.zzy = qiVar;
        this.zzn |= 16;
    }

    public final void G(int i4) {
        this.zzz = d7.j(i4);
        this.zzn |= 32;
    }

    public final void H(int i4) {
        this.zzA = d7.j(i4);
        this.zzn |= 64;
    }

    public final void I(int i4) {
        this.zzB = d7.j(i4);
        this.zzn |= 128;
    }

    public final void J(int i4) {
        this.zzn |= 256;
        this.zzC = i4;
    }

    public final void K(int i4) {
        this.zzD = d7.j(i4);
        this.zzn |= 512;
    }

    public final void L(vi viVar) {
        this.zzE = viVar.f17629a;
        this.zzn |= Segment.SHARE_MINIMUM;
    }

    public final void M(long j) {
        this.zzn |= 2048;
        this.zzF = j;
    }

    public final long N() {
        return this.zzo;
    }

    public final int O() {
        int i4 = this.zzp;
        int i10 = i4 != 0 ? i4 != 1 ? i4 != 1000 ? 0 : 3 : 2 : 1;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            qc qcVar = qc.f15310x;
            return new to1(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", qcVar, "zzu", "zzv", "zzw", qc.f15308v, "zzy", "zzz", qcVar, "zzA", qcVar, "zzB", qcVar, "zzC", "zzD", qcVar, "zzE", qc.f15305s, "zzF"});
        }
        if (iC == 3) {
            return new ti();
        }
        if (iC == 4) {
            return new si(zzG);
        }
        if (iC == 5) {
            return zzG;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzH;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ti.class) {
            try {
                pn1Var = zzH;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzG);
                    zzH = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
