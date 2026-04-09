package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4530b5 extends AbstractC4516a2 implements A2 {
    private static final C4530b5 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4530b5 c4530b5 = new C4530b5();
        zzb = c4530b5;
        AbstractC4516a2.p(C4530b5.class, c4530b5);
    }

    private C4530b5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", Y4.class});
        }
        if (i11 == 3) {
            return new C4530b5();
        }
        Z4 z42 = null;
        if (i11 == 4) {
            return new C4519a5(z42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
