package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4795z7 extends AbstractC4516a2 implements A2 {
    private static final C4795z7 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4795z7 c4795z7 = new C4795z7();
        zzb = c4795z7;
        AbstractC4516a2.p(C4795z7.class, c4795z7);
    }

    private C4795z7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4762w7.class});
        }
        if (i11 == 3) {
            return new C4795z7();
        }
        AbstractC4773x7 abstractC4773x7 = null;
        if (i11 == 4) {
            return new C4784y7(abstractC4773x7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
