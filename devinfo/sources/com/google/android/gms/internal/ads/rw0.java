package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rw0 extends qn1 {
    private static final rw0 zzb;
    private static volatile po1 zzc;
    private ho1 zza = ho1.f11932b;

    static {
        rw0 rw0Var = new rw0();
        zzb = rw0Var;
        qn1.u(rw0.class, rw0Var);
    }

    public static rw0 C(FileInputStream fileInputStream) throws ao1 {
        rw0 rw0Var = zzb;
        dn1 dn1Var = new dn1(fileInputStream);
        jn1 jn1Var = jn1.f12801a;
        int i4 = um1.f17262a;
        qn1 qn1VarL = qn1.l(rw0Var, dn1Var, jn1.f12802b);
        qn1.z(qn1VarL);
        return (rw0) qn1VarL;
    }

    public static rw0 D() {
        return zzb;
    }

    public final int A() {
        return this.zza.size();
    }

    public final Map B() {
        return DesugarCollections.unmodifiableMap(this.zza);
    }

    public final ho1 E() {
        ho1 ho1Var = this.zza;
        if (!ho1Var.f11933a) {
            this.zza = ho1Var.a();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", qw0.f15459a});
        }
        if (iC == 3) {
            return new rw0();
        }
        if (iC == 4) {
            return new pw0(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzc;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (rw0.class) {
            try {
                pn1Var = zzc;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzb);
                    zzc = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
