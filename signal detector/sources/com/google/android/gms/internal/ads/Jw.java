package com.google.android.gms.internal.ads;

import java.util.RandomAccess;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Jw extends AbstractC1096eL {
    private static final Jw zzf;
    private static volatile CL zzg;
    private int zza;
    private InterfaceC1314iL zzb = C1151fL.f14062e;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        Jw jw = new Jw();
        zzf = jw;
        AbstractC1096eL.u(Jw.class, jw);
    }

    public static Iw A() {
        return (Iw) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void C(int i) {
        RandomAccess randomAccess = this.zzb;
        if (!((GK) randomAccess).f8358a) {
            C1151fL c1151fL = (C1151fL) randomAccess;
            int i3 = c1151fL.f14064c;
            this.zzb = c1151fL.B(i3 + i3);
        }
        ((C1151fL) this.zzb).d(2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", J5.f9254y, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new Jw();
        }
        if (iC == 4) {
            return new Iw(zzf);
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
        synchronized (Jw.class) {
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
