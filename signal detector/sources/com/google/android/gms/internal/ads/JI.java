package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class JI extends AbstractC1096eL {
    private static final JI zzj;
    private static volatile CL zzk;
    private int zza;
    private int zzb;
    private LI zzc;
    private QK zzd;
    private QK zze;
    private QK zzf;
    private QK zzg;
    private QK zzh;
    private QK zzi;

    static {
        JI ji = new JI();
        zzj = ji;
        AbstractC1096eL.u(JI.class, ji);
    }

    public JI() {
        OK ok = QK.f10609b;
        this.zzd = ok;
        this.zze = ok;
        this.zzf = ok;
        this.zzg = ok;
        this.zzh = ok;
        this.zzi = ok;
    }

    public static JI I(QK qk, XK xk) {
        return (JI) AbstractC1096eL.m(zzj, qk, xk);
    }

    public static II J() {
        return (II) zzj.r();
    }

    public static CL K() {
        return zzj.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final LI B() {
        LI li = this.zzc;
        return li == null ? LI.G() : li;
    }

    public final QK C() {
        return this.zzd;
    }

    public final QK D() {
        return this.zze;
    }

    public final QK E() {
        return this.zzf;
    }

    public final QK F() {
        return this.zzg;
    }

    public final QK G() {
        return this.zzh;
    }

    public final QK H() {
        return this.zzi;
    }

    public final /* synthetic */ void L() {
        this.zzb = 0;
    }

    public final /* synthetic */ void M(LI li) {
        this.zzc = li;
        this.zza |= 1;
    }

    public final /* synthetic */ void N(OK ok) {
        this.zzd = ok;
    }

    public final /* synthetic */ void O(OK ok) {
        this.zze = ok;
    }

    public final /* synthetic */ void P(OK ok) {
        this.zzf = ok;
    }

    public final /* synthetic */ void Q(OK ok) {
        this.zzg = ok;
    }

    public final /* synthetic */ void R(OK ok) {
        this.zzh = ok;
    }

    public final /* synthetic */ void S(OK ok) {
        this.zzi = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new JI();
        }
        if (iC == 4) {
            return new II(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzk;
        if (cl != null) {
            return cl;
        }
        synchronized (JI.class) {
            try {
                c1042dL = zzk;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzj);
                    zzk = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
