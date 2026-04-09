package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1675p6 extends AbstractC1096eL {
    private static final C1675p6 zzf;
    private static volatile CL zzg;
    private int zza;
    private InterfaceC1474lL zzb = FL.f8088e;
    private QK zzc = QK.f10609b;
    private int zzd = 1;
    private int zze = 1;

    static {
        C1675p6 c1675p6 = new C1675p6();
        zzf = c1675p6;
        AbstractC1096eL.u(C1675p6.class, c1675p6);
    }

    public static C1621o6 A() {
        return (C1621o6) zzf.r();
    }

    public final void B(OK ok) {
        InterfaceC1474lL interfaceC1474lL = this.zzb;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzb = interfaceC1474lL.B(size + size);
        }
        this.zzb.add(ok);
    }

    public final /* synthetic */ void C(OK ok) {
        this.zza |= 1;
        this.zzc = ok;
    }

    public final /* synthetic */ void D(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", J5.f9243n, "zze", J5.f9241l});
        }
        if (iC == 3) {
            return new C1675p6();
        }
        if (iC == 4) {
            return new C1621o6(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (C1675p6.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
