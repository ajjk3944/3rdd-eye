package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.dN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044dN extends AbstractC1096eL {
    private static final C1044dN zzl;
    private static volatile CL zzm;
    private int zza;
    private QK zzb = QK.f10609b;
    private InterfaceC1314iL zzc;
    private long zzd;
    private InterfaceC1314iL zze;
    private InterfaceC1474lL zzf;
    private String zzg;
    private InterfaceC1474lL zzh;
    private C1098eN zzi;
    private C1153fN zzj;
    private C1365jK zzk;

    static {
        C1044dN c1044dN = new C1044dN();
        zzl = c1044dN;
        AbstractC1096eL.u(C1044dN.class, c1044dN);
    }

    public C1044dN() {
        C1151fL c1151fL = C1151fL.f14062e;
        this.zzc = c1151fL;
        this.zze = c1151fL;
        FL fl = FL.f8088e;
        this.zzf = fl;
        this.zzg = "";
        this.zzh = fl;
    }

    public static C1044dN A(byte[] bArr, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(zzl, bArr, bArr.length, xk);
        AbstractC1096eL.z(abstractC1096eLY);
        return (C1044dN) abstractC1096eLY;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", ZM.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iC == 3) {
            return new C1044dN();
        }
        if (iC == 4) {
            return new C1691pM(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzm;
        if (cl != null) {
            return cl;
        }
        synchronized (C1044dN.class) {
            try {
                c1042dL = zzm;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzl);
                    zzm = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
