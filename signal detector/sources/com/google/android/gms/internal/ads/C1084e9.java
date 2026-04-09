package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084e9 extends AbstractC1096eL {
    public static final int zza = 1;
    private static final C1084e9 zzc;
    private static volatile CL zzd;
    private InterfaceC1474lL zzb = FL.f8088e;

    static {
        C1084e9 c1084e9 = new C1084e9();
        zzc = c1084e9;
        AbstractC1096eL.u(C1084e9.class, c1084e9);
    }

    public static Z8 A() {
        return (Z8) zzc.r();
    }

    public final void B(Y8 y8) {
        InterfaceC1474lL interfaceC1474lL = this.zzb;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzb = interfaceC1474lL.B(size + size);
        }
        this.zzb.add(y8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", Y8.class});
        }
        if (iC == 3) {
            return new C1084e9();
        }
        if (iC == 4) {
            return new Z8(zzc);
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
        synchronized (C1084e9.class) {
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
