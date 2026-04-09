package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class R5 extends AbstractC4516a2 implements A2 {
    private static final R5 zzb;
    private int zzd;
    private float zze;

    static {
        R5 r52 = new R5();
        zzb = r52;
        AbstractC4516a2.p(R5.class, r52);
    }

    private R5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new R5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new Q5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
