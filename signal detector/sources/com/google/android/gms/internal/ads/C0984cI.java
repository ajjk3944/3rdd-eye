package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.cI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984cI extends AbstractC1096eL {
    private static final C0984cI zzd;
    private static volatile CL zze;
    private String zza = "";
    private QK zzb = QK.f10609b;
    private int zzc;

    static {
        C0984cI c0984cI = new C0984cI();
        zzd = c0984cI;
        AbstractC1096eL.u(C0984cI.class, c0984cI);
    }

    public static C0984cI D(byte[] bArr, XK xk) {
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(zzd, bArr, bArr.length, xk);
        AbstractC1096eL.z(abstractC1096eLY);
        return (C0984cI) abstractC1096eLY;
    }

    public static C0930bI E() {
        return (C0930bI) zzd.r();
    }

    public static C0984cI F() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final QK B() {
        return this.zzb;
    }

    public final EnumC1956uI C() {
        EnumC1956uI enumC1956uIB = EnumC1956uI.b(this.zzc);
        return enumC1956uIB == null ? EnumC1956uI.UNRECOGNIZED : enumC1956uIB;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void H(QK qk) {
        qk.getClass();
        this.zzb = qk;
    }

    public final /* synthetic */ void I(EnumC1956uI enumC1956uI) {
        this.zzc = enumC1956uI.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C0984cI();
        }
        if (iC == 4) {
            return new C0930bI(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zze;
        if (cl != null) {
            return cl;
        }
        synchronized (C0984cI.class) {
            try {
                c1042dL = zze;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzd);
                    zze = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
