package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class X6 extends AbstractC4516a2 implements A2 {
    private static final X6 zzb;

    static {
        X6 x62 = new X6();
        zzb = x62;
        AbstractC4516a2.p(X6.class, x62);
    }

    private X6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        V6 v62 = null;
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new X6();
        }
        if (i11 == 4) {
            return new W6(v62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
