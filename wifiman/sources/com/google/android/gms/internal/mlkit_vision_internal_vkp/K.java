package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class K extends AbstractC4516a2 implements A2 {
    private static final K zzb;
    private int zzd;
    private double zze;
    private double zzf;

    static {
        K k10 = new K();
        zzb = k10;
        AbstractC4516a2.p(K.class, k10);
    }

    private K() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new K();
        }
        H h10 = null;
        if (i11 == 4) {
            return new J(h10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
