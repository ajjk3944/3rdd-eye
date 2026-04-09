package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.nv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609nv extends AbstractC1096eL {
    private static final C1609nv zzc;
    private static volatile CL zzd;
    private InterfaceC1474lL zza = FL.f8088e;
    private long zzb;

    static {
        C1609nv c1609nv = new C1609nv();
        zzc = c1609nv;
        AbstractC1096eL.u(C1609nv.class, c1609nv);
    }

    public static C1555mv A() {
        return (C1555mv) zzc.r();
    }

    public final void B(Ru ru) {
        InterfaceC1474lL interfaceC1474lL = this.zza;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zza = interfaceC1474lL.B(size + size);
        }
        this.zza.add(ru);
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", Ru.class, "zzb"});
        }
        if (iC == 3) {
            return new C1609nv();
        }
        if (iC == 4) {
            return new C1555mv(zzc);
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
        synchronized (C1609nv.class) {
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
