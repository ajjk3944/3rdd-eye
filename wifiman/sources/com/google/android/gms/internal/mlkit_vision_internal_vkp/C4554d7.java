package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.d7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4554d7 extends AbstractC4516a2 implements A2 {
    private static final C4554d7 zzb;
    private int zzd;
    private C4718s7 zze;
    private double zzf;

    static {
        C4554d7 c4554d7 = new C4554d7();
        zzb = c4554d7;
        AbstractC4516a2.p(C4554d7.class, c4554d7);
    }

    private C4554d7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4554d7();
        }
        AbstractC4532b7 abstractC4532b7 = null;
        if (i11 == 4) {
            return new C4543c7(abstractC4532b7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
