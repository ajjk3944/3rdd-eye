package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.ev, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124ev extends AbstractC1096eL {
    private static final C1124ev zzd;
    private static volatile CL zze;
    private int zza;
    private InterfaceC1474lL zzb = FL.f8088e;
    private C1043dM zzc;

    static {
        C1124ev c1124ev = new C1124ev();
        zzd = c1124ev;
        AbstractC1096eL.u(C1124ev.class, c1124ev);
    }

    public static C0961bv B() {
        return (C0961bv) zzd.r();
    }

    public final int A() {
        return this.zzb.size();
    }

    public final void C(C1069dv c1069dv) {
        InterfaceC1474lL interfaceC1474lL = this.zzb;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzb = interfaceC1474lL.B(size + size);
        }
        this.zzb.add(c1069dv);
    }

    public final void D() {
        this.zzb = FL.f8088e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", C1069dv.class, "zzc"});
        }
        if (iC == 3) {
            return new C1124ev();
        }
        if (iC == 4) {
            return new C0961bv(zzd);
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
        synchronized (C1124ev.class) {
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
