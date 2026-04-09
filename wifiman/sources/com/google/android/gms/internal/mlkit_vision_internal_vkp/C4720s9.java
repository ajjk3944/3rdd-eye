package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4720s9 extends AbstractC4516a2 implements A2 {
    private static final C4720s9 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4720s9 c4720s9 = new C4720s9();
        zzb = c4720s9;
        AbstractC4516a2.p(C4720s9.class, c4720s9);
    }

    private C4720s9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4753v9.class});
        }
        if (i11 == 3) {
            return new C4720s9();
        }
        AbstractC4699q9 abstractC4699q9 = null;
        if (i11 == 4) {
            return new C4709r9(abstractC4699q9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
