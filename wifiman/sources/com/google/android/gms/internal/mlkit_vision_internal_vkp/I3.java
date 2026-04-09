package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class I3 extends AbstractC4516a2 implements A2 {
    private static final I3 zzb;
    private int zzd;
    private float zze;
    private float zzf;

    static {
        I3 i32 = new I3();
        zzb = i32;
        AbstractC4516a2.p(I3.class, i32);
    }

    private I3() {
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
            return new I3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new H3(abstractC4758w3);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
