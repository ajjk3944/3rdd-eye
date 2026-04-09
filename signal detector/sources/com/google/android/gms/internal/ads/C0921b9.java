package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921b9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C0921b9 zzf;
    private static volatile CL zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        C0921b9 c0921b9 = new C0921b9();
        zzf = c0921b9;
        AbstractC1096eL.u(C0921b9.class, c0921b9);
    }

    public static C0866a9 A() {
        return (C0866a9) zzf.r();
    }

    public static C0921b9 B() {
        return zzf;
    }

    public final void C(boolean z6) {
        this.zzc |= 1;
        this.zzd = z6;
    }

    public final void D(int i) {
        this.zzc |= 2;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new C0921b9();
        }
        if (iC == 4) {
            return new C0866a9(zzf);
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
        synchronized (C0921b9.class) {
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
