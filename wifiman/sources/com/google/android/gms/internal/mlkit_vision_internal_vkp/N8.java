package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class N8 extends AbstractC4516a2 implements A2 {
    private static final N8 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        N8 n82 = new N8();
        zzb = n82;
        AbstractC4516a2.p(N8.class, n82);
    }

    private N8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", J8.class});
        }
        if (i11 == 3) {
            return new N8();
        }
        L8 l82 = null;
        if (i11 == 4) {
            return new M8(l82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
