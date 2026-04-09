package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class Q extends AbstractC4516a2 implements A2 {
    private static final Q zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg = 2;
    private float zzh;
    private boolean zzi;

    static {
        Q q10 = new Q();
        zzb = q10;
        AbstractC4516a2.p(Q.class, q10);
    }

    private Q() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", O.f35620a, "zzf", V.f35646a, "zzg", U.f35642a, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new Q();
        }
        H h10 = null;
        if (i11 == 4) {
            return new P(h10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
