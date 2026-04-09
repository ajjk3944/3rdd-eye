package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4644l9 extends AbstractC4516a2 implements A2 {
    private static final C4644l9 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4644l9 c4644l9 = new C4644l9();
        zzb = c4644l9;
        AbstractC4516a2.p(C4644l9.class, c4644l9);
    }

    private C4644l9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4611i9.class});
        }
        if (i11 == 3) {
            return new C4644l9();
        }
        AbstractC4556d9 abstractC4556d9 = null;
        if (i11 == 4) {
            return new C4622j9(abstractC4556d9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
