package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class X8 extends AbstractC4516a2 implements A2 {
    private static final X8 zzb;
    private int zzd;
    private float zze;
    private float zzf;

    static {
        X8 x82 = new X8();
        zzb = x82;
        AbstractC4516a2.p(X8.class, x82);
    }

    private X8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new X8();
        }
        U8 u82 = null;
        if (i11 == 4) {
            return new W8(u82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
