package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4783y6 extends AbstractC4516a2 implements A2 {
    private static final C4783y6 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4783y6 c4783y6 = new C4783y6();
        zzb = c4783y6;
        AbstractC4516a2.p(C4783y6.class, c4783y6);
    }

    private C4783y6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4750v6.class});
        }
        if (i11 == 3) {
            return new C4783y6();
        }
        AbstractC4761w6 abstractC4761w6 = null;
        if (i11 == 4) {
            return new C4772x6(abstractC4761w6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
