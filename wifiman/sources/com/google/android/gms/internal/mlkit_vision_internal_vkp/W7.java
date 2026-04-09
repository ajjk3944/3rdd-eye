package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class W7 extends AbstractC4516a2 implements A2 {
    private static final W7 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg = 1;

    static {
        W7 w72 = new W7();
        zzb = w72;
        AbstractC4516a2.p(W7.class, w72);
    }

    private W7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", V7.f35649a});
        }
        if (i11 == 3) {
            return new W7();
        }
        T7 t72 = null;
        if (i11 == 4) {
            return new U7(t72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
