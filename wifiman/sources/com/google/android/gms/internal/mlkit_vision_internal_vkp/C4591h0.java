package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4591h0 extends AbstractC4516a2 implements A2 {
    private static final C4591h0 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4591h0 c4591h0 = new C4591h0();
        zzb = c4591h0;
        AbstractC4516a2.p(C4591h0.class, c4591h0);
    }

    private C4591h0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4580g0.class});
        }
        if (i11 == 3) {
            return new C4591h0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4558e0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
