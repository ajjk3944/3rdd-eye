package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rs0 extends qn1 {
    private static final rs0 zzc;
    private static volatile po1 zzd;
    private xn1 zza = so1.f16499e;
    private long zzb;

    static {
        rs0 rs0Var = new rs0();
        zzc = rs0Var;
        qn1.u(rs0.class, rs0Var);
    }

    public static qs0 A() {
        return (qs0) zzc.r();
    }

    public final void B(xr0 xr0Var) {
        xn1 xn1Var = this.zza;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zza = xn1Var.n(size + size);
        }
        this.zza.add(xr0Var);
    }

    public final /* synthetic */ void C(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", xr0.class, "zzb"});
        }
        if (iC == 3) {
            return new rs0();
        }
        if (iC == 4) {
            return new qs0(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzd;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (rs0.class) {
            try {
                pn1Var = zzd;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzc);
                    zzd = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
