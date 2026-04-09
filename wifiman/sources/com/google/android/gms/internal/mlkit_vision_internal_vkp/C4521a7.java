package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4521a7 extends AbstractC4516a2 implements A2 {
    private static final C4521a7 zzb;
    private InterfaceC4571f2 zzd = AbstractC4516a2.j();

    static {
        C4521a7 c4521a7 = new C4521a7();
        zzb = c4521a7;
        AbstractC4516a2.p(C4521a7.class, c4521a7);
    }

    private C4521a7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new C4521a7();
        }
        Y6 y62 = null;
        if (i11 == 4) {
            return new Z6(y62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
