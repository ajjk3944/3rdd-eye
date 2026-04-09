package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4706r6 extends AbstractC4516a2 implements A2 {
    private static final C4706r6 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        C4706r6 c4706r6 = new C4706r6();
        zzb = c4706r6;
        AbstractC4516a2.p(C4706r6.class, c4706r6);
    }

    private C4706r6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zze", "zzd", C4653m7.class, X6.class, I7.class});
        }
        if (i11 == 3) {
            return new C4706r6();
        }
        AbstractC4685p6 abstractC4685p6 = null;
        if (i11 == 4) {
            return new C4696q6(abstractC4685p6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
