package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4653m7 extends AbstractC4516a2 implements A2 {
    private static final C4653m7 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4653m7 c4653m7 = new C4653m7();
        zzb = c4653m7;
        AbstractC4516a2.p(C4653m7.class, c4653m7);
    }

    private C4653m7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4620j7.class});
        }
        if (i11 == 3) {
            return new C4653m7();
        }
        AbstractC4631k7 abstractC4631k7 = null;
        if (i11 == 4) {
            return new C4642l7(abstractC4631k7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
