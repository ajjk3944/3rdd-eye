package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class Z5 extends AbstractC4516a2 implements A2 {
    private static final Z5 zzb;
    private int zzd = 0;
    private Object zze;
    private float zzf;

    static {
        Z5 z52 = new Z5();
        zzb = z52;
        AbstractC4516a2.p(Z5.class, z52);
    }

    private Z5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00017\u0000\u00024\u0000\u0003Ȼ\u0000\u0004\u0001", new Object[]{"zze", "zzd", "zzf"});
        }
        if (i11 == 3) {
            return new Z5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new Y5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
