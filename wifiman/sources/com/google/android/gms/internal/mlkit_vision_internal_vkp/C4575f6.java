package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4575f6 extends AbstractC4516a2 implements A2 {
    private static final C4575f6 zzb;
    private InterfaceC4549d2 zzd = AbstractC4516a2.h();

    static {
        C4575f6 c4575f6 = new C4575f6();
        zzb = c4575f6;
        AbstractC4516a2.p(C4575f6.class, c4575f6);
    }

    private C4575f6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new C4575f6();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new C4564e6(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
