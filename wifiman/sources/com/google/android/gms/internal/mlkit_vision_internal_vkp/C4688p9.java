package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4688p9 extends AbstractC4516a2 implements A2 {
    private static final C4688p9 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4688p9 c4688p9 = new C4688p9();
        zzb = c4688p9;
        AbstractC4516a2.p(C4688p9.class, c4688p9);
    }

    private C4688p9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4655m9.class});
        }
        if (i11 == 3) {
            return new C4688p9();
        }
        AbstractC4666n9 abstractC4666n9 = null;
        if (i11 == 4) {
            return new C4677o9(abstractC4666n9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
