package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.lI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471lI extends AbstractC1096eL {
    private static final C1471lI zzc;
    private static volatile CL zzd;
    private int zza;
    private InterfaceC1474lL zzb = FL.f8088e;

    static {
        C1471lI c1471lI = new C1471lI();
        zzc = c1471lI;
        AbstractC1096eL.u(C1471lI.class, c1471lI);
    }

    public static C1311iI A() {
        return (C1311iI) zzc.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final void C(C1417kI c1417kI) {
        InterfaceC1474lL interfaceC1474lL = this.zzb;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzb = interfaceC1474lL.B(size + size);
        }
        this.zzb.add(c1417kI);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C1417kI.class});
        }
        if (iC == 3) {
            return new C1471lI();
        }
        if (iC == 4) {
            return new C1311iI(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzd;
        if (cl != null) {
            return cl;
        }
        synchronized (C1471lI.class) {
            try {
                c1042dL = zzd;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzc);
                    zzd = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
