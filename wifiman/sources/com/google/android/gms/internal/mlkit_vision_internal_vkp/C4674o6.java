package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4674o6 extends AbstractC4516a2 implements A2 {
    private static final C4674o6 zzb;
    private int zzd = 0;
    private Object zze;
    private float zzf;

    static {
        C4674o6 c4674o6 = new C4674o6();
        zzb = c4674o6;
        AbstractC4516a2.p(C4674o6.class, c4674o6);
    }

    private C4674o6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00017\u0000\u0002\u0001\u0003<\u0000", new Object[]{"zze", "zzd", "zzf", C4652m6.class});
        }
        if (i11 == 3) {
            return new C4674o6();
        }
        AbstractC4630k6 abstractC4630k6 = null;
        if (i11 == 4) {
            return new C4663n6(abstractC4630k6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
