package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ji1 extends qn1 {
    public static final /* synthetic */ int zza = 0;
    private static final ji1 zzd;
    private static volatile po1 zze;
    private String zzb = "";
    private xn1 zzc = so1.f16499e;

    static {
        ji1 ji1Var = new ji1();
        zzd = ji1Var;
        qn1.u(ji1.class, ji1Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", rh1.class});
        }
        if (iC == 3) {
            return new ji1();
        }
        if (iC == 4) {
            return new rj(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zze;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ji1.class) {
            try {
                pn1Var = zze;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzd);
                    zze = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
