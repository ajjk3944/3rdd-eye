package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class F7 extends AbstractC4516a2 implements A2 {
    private static final F7 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        F7 f72 = new F7();
        zzb = f72;
        AbstractC4516a2.p(F7.class, f72);
    }

    private F7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C7.class});
        }
        if (i11 == 3) {
            return new F7();
        }
        D7 d72 = null;
        if (i11 == 4) {
            return new E7(d72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
