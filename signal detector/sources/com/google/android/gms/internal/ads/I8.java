package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.RandomAccess;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class I8 extends AbstractC1096eL {
    private static final I8 zzG;
    private static volatile CL zzH = null;
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
    private static final InterfaceC1366jL zzx = new C1994v2(27);
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
    private InterfaceC1314iL zzw = C1151fL.f14062e;
    private F8 zzy;
    private int zzz;

    static {
        I8 i8 = new I8();
        zzG = i8;
        AbstractC1096eL.u(I8.class, i8);
    }

    public static I8 P(byte[] bArr) throws C1636oL {
        I8 i8 = zzG;
        int length = bArr.length;
        XK xk = XK.f12412a;
        int i = JK.f9277a;
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(i8, bArr, length, XK.f12413b);
        AbstractC1096eL.z(abstractC1096eLY);
        return (I8) abstractC1096eLY;
    }

    public static H8 Q() {
        return (H8) zzG.r();
    }

    public final void A(long j6) {
        this.zzn |= 1;
        this.zzo = j6;
    }

    public final void B(int i) {
        this.zzp = AbstractC1135f5.g(i);
        this.zzn |= 2;
    }

    public final void C(long j6) {
        this.zzn |= 4;
        this.zzu = j6;
    }

    public final void D(long j6) {
        this.zzn |= 8;
        this.zzv = j6;
    }

    public final void E(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzw;
        if (!((GK) randomAccess).f8358a) {
            C1151fL c1151fL = (C1151fL) randomAccess;
            int i = c1151fL.f14064c;
            this.zzw = c1151fL.B(i + i);
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((C1151fL) this.zzw).d(((EnumC1570n9) obj).f15757a);
        }
    }

    public final void F(F8 f8) {
        this.zzy = f8;
        this.zzn |= 16;
    }

    public final void G(int i) {
        this.zzz = AbstractC1135f5.g(i);
        this.zzn |= 32;
    }

    public final void H(int i) {
        this.zzA = AbstractC1135f5.g(i);
        this.zzn |= 64;
    }

    public final void I(int i) {
        this.zzB = AbstractC1135f5.g(i);
        this.zzn |= 128;
    }

    public final void J(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void K(int i) {
        this.zzD = AbstractC1135f5.g(i);
        this.zzn |= 512;
    }

    public final void L(K8 k8) {
        this.zzE = k8.f9464a;
        this.zzn |= 1024;
    }

    public final void M(long j6) {
        this.zzn |= 2048;
        this.zzF = j6;
    }

    public final long N() {
        return this.zzo;
    }

    public final int O() {
        int i = this.zzp;
        int i3 = i != 0 ? i != 1 ? i != 1000 ? 0 : 3 : 2 : 1;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            J5 j52 = J5.f9253x;
            return new GL(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", j52, "zzu", "zzv", "zzw", J5.f9251v, "zzy", "zzz", j52, "zzA", j52, "zzB", j52, "zzC", "zzD", j52, "zzE", J5.f9248s, "zzF"});
        }
        if (iC == 3) {
            return new I8();
        }
        if (iC == 4) {
            return new H8(zzG);
        }
        if (iC == 5) {
            return zzG;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzH;
        if (cl != null) {
            return cl;
        }
        synchronized (I8.class) {
            try {
                c1042dL = zzH;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzG);
                    zzH = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
