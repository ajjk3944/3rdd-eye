package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class C8 extends AbstractC4516a2 implements A2 {
    private static final C8 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C8 c82 = new C8();
        zzb = c82;
        AbstractC4516a2.p(C8.class, c82);
    }

    private C8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4796z8.class});
        }
        if (i11 == 3) {
            return new C8();
        }
        A8 a82 = null;
        if (i11 == 4) {
            return new B8(a82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
