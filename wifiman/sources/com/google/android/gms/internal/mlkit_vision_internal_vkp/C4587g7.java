package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4587g7 extends AbstractC4516a2 implements A2 {
    private static final C4587g7 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4587g7 c4587g7 = new C4587g7();
        zzb = c4587g7;
        AbstractC4516a2.p(C4587g7.class, c4587g7);
    }

    private C4587g7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4554d7.class});
        }
        if (i11 == 3) {
            return new C4587g7();
        }
        AbstractC4565e7 abstractC4565e7 = null;
        if (i11 == 4) {
            return new C4576f7(abstractC4565e7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
