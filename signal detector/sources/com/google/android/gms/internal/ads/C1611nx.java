package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.nx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611nx extends AbstractC1096eL {
    private static final C1611nx zzb;
    private static volatile CL zzc;
    private C1959uL zza = C1959uL.f17113b;

    static {
        C1611nx c1611nx = new C1611nx();
        zzb = c1611nx;
        AbstractC1096eL.u(C1611nx.class, c1611nx);
    }

    public static C1611nx C(FileInputStream fileInputStream) throws C1636oL {
        C1611nx c1611nx = zzb;
        SK sk = new SK(fileInputStream);
        XK xk = XK.f12412a;
        int i = JK.f9277a;
        AbstractC1096eL abstractC1096eLL = AbstractC1096eL.l(c1611nx, sk, XK.f12413b);
        AbstractC1096eL.z(abstractC1096eLL);
        return (C1611nx) abstractC1096eLL;
    }

    public static C1611nx D() {
        return zzb;
    }

    public final int A() {
        return this.zza.size();
    }

    public final Map B() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final C1959uL E() {
        C1959uL c1959uL = this.zza;
        if (!c1959uL.f17114a) {
            this.zza = c1959uL.a();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", AbstractC1557mx.f15689a});
        }
        if (iC == 3) {
            return new C1611nx();
        }
        if (iC == 4) {
            return new C1503lx(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzc;
        if (cl != null) {
            return cl;
        }
        synchronized (C1611nx.class) {
            try {
                c1042dL = zzc;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzb);
                    zzc = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
