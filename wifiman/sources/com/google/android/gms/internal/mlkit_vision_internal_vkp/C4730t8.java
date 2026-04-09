package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4730t8 extends AbstractC4516a2 implements A2 {
    private static final C4730t8 zzb;
    private int zzd;
    private float zze;

    static {
        C4730t8 c4730t8 = new C4730t8();
        zzb = c4730t8;
        AbstractC4516a2.p(C4730t8.class, c4730t8);
    }

    private C4730t8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C4730t8();
        }
        AbstractC4708r8 abstractC4708r8 = null;
        if (i11 == 4) {
            return new C4719s8(abstractC4708r8);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
