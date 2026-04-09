package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4574f5 extends AbstractC4516a2 implements A2 {
    private static final C4574f5 zzb;
    private InterfaceC4549d2 zzd = AbstractC4516a2.h();

    static {
        C4574f5 c4574f5 = new C4574f5();
        zzb = c4574f5;
        AbstractC4516a2.p(C4574f5.class, c4574f5);
    }

    private C4574f5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new C4574f5();
        }
        AbstractC4552d5 abstractC4552d5 = null;
        if (i11 == 4) {
            return new C4563e5(abstractC4552d5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
