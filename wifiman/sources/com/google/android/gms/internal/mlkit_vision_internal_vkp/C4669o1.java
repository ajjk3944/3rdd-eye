package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4669o1 extends AbstractC4516a2 implements A2 {
    private static final C4669o1 zzb;
    private String zzd = "";
    private B1 zze = B1.f35555b;

    static {
        C4669o1 c4669o1 = new C4669o1();
        zzb = c4669o1;
        AbstractC4516a2.p(C4669o1.class, c4669o1);
    }

    private C4669o1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new I2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C4669o1();
        }
        AbstractC4647m1 abstractC4647m1 = null;
        if (i11 == 4) {
            return new C4658n1(abstractC4647m1);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
