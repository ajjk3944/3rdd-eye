package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4797z9 extends AbstractC4516a2 implements A2 {
    private static final C4797z9 zzb;
    private int zzd;
    private F9 zze;
    private int zzf;

    static {
        C4797z9 c4797z9 = new C4797z9();
        zzb = c4797z9;
        AbstractC4516a2.p(C4797z9.class, c4797z9);
    }

    private C4797z9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4797z9();
        }
        AbstractC4775x9 abstractC4775x9 = null;
        if (i11 == 4) {
            return new C4786y9(abstractC4775x9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
