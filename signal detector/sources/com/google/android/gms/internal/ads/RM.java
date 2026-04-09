package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class RM extends AbstractC1096eL {
    private static final RM zzR;
    private static volatile CL zzS;
    private PM zzA;
    private InterfaceC1474lL zzB;
    private C1852sM zzC;
    private String zzD;
    private C1475lM zzE;
    private InterfaceC1474lL zzF;
    private CM zzG;
    private int zzH;
    private InterfaceC1474lL zzI;
    private InterfaceC1474lL zzJ;
    private long zzK;
    private QM zzL;
    private EM zzM;
    private String zzN;
    private OM zzO;
    private InterfaceC1474lL zzP;
    private int zza;
    private int zzb;
    private int zzc;
    private C1637oM zzg;
    private InterfaceC1474lL zzh;
    private InterfaceC1474lL zzi;
    private String zzj;
    private IM zzk;
    private boolean zzl;
    private InterfaceC1474lL zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private QK zzu;
    private MM zzv;
    private boolean zzw;
    private String zzx;
    private InterfaceC1474lL zzy;
    private InterfaceC1474lL zzz;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        RM rm = new RM();
        zzR = rm;
        AbstractC1096eL.u(RM.class, rm);
    }

    public RM() {
        FL fl = FL.f8088e;
        this.zzh = fl;
        this.zzi = fl;
        this.zzj = "";
        this.zzm = fl;
        this.zzn = "";
        this.zzu = QK.f10609b;
        this.zzx = "";
        this.zzy = fl;
        this.zzz = fl;
        this.zzB = fl;
        this.zzD = "";
        this.zzF = fl;
        this.zzI = fl;
        this.zzJ = fl;
        this.zzN = "";
        this.zzP = fl;
    }

    public static C1529mM D() {
        return (C1529mM) zzR.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final InterfaceC1474lL B() {
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

    public final /* synthetic */ void G(C1637oM c1637oM) {
        this.zzg = c1637oM;
        this.zza |= 32;
    }

    public final void H(KM km) {
        InterfaceC1474lL interfaceC1474lL = this.zzh;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzh = interfaceC1474lL.B(size + size);
        }
        this.zzh.add(km);
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void J() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    public final /* synthetic */ void K(IM im) {
        this.zzk = im;
        this.zza |= 128;
    }

    public final /* synthetic */ void L(MM mm) {
        this.zzv = mm;
        this.zza |= 8192;
    }

    public final void M(ArrayList arrayList) {
        InterfaceC1474lL interfaceC1474lL = this.zzy;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzy = interfaceC1474lL.B(size + size);
        }
        FK.e(arrayList, this.zzy);
    }

    public final void N(ArrayList arrayList) {
        InterfaceC1474lL interfaceC1474lL = this.zzz;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzz = interfaceC1474lL.B(size + size);
        }
        FK.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void O(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        switch (AbstractC2984e.c(i)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = abstractC1096eL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new GL(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", KM.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", C1421kM.f15120k, "zzc", C1421kM.f15114d, "zzg", "zzj", "zzk", "zzu", "zzi", TM.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", VM.class, "zzC", "zzD", "zzE", "zzF", C1906tM.class, "zzG", "zzH", C1421kM.f15124o, "zzI", DM.class, "zzJ", GM.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", NM.class});
            case 3:
                return new RM();
            case 4:
                return new C1529mM(zzR);
            case 5:
                return zzR;
            case 6:
                CL cl = zzS;
                if (cl != null) {
                    return cl;
                }
                synchronized (RM.class) {
                    try {
                        c1042dL = zzS;
                        if (c1042dL == null) {
                            c1042dL = new C1042dL(zzR);
                            zzS = c1042dL;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1042dL;
            default:
                throw null;
        }
    }
}
