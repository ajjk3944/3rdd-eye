package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4611i9 extends AbstractC4516a2 implements A2 {
    private static final C4611i9 zzb;
    private InterfaceC4549d2 zzd = AbstractC4516a2.h();

    static {
        C4611i9 c4611i9 = new C4611i9();
        zzb = c4611i9;
        AbstractC4516a2.p(C4611i9.class, c4611i9);
    }

    private C4611i9() {
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
            return new C4611i9();
        }
        AbstractC4556d9 abstractC4556d9 = null;
        if (i11 == 4) {
            return new C4600h9(abstractC4556d9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
