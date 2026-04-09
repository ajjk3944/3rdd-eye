package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class I7 extends AbstractC4516a2 implements A2 {
    private static final I7 zzb;

    static {
        I7 i72 = new I7();
        zzb = i72;
        AbstractC4516a2.p(I7.class, i72);
    }

    private I7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        G7 g72 = null;
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new I7();
        }
        if (i11 == 4) {
            return new H7(g72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
