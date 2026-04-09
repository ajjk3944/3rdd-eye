package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class I8 extends AbstractC4516a2 implements A2 {
    private static final I8 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        I8 i82 = new I8();
        zzb = i82;
        AbstractC4516a2.p(I8.class, i82);
    }

    private I8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new I8();
        }
        D8 d82 = null;
        if (i11 == 4) {
            return new H8(d82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
