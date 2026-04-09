package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4544c8 extends AbstractC4516a2 implements A2 {
    private static final C4544c8 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4544c8 c4544c8 = new C4544c8();
        zzb = c4544c8;
        AbstractC4516a2.p(C4544c8.class, c4544c8);
    }

    private C4544c8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4533b8.class});
        }
        if (i11 == 3) {
            return new C4544c8();
        }
        Y7 y72 = null;
        if (i11 == 4) {
            return new Z7(y72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
