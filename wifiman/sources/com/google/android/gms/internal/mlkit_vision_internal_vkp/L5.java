package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class L5 extends AbstractC4516a2 implements A2 {
    private static final L5 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        L5 l52 = new L5();
        zzb = l52;
        AbstractC4516a2.p(L5.class, l52);
    }

    private L5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4652m6.class});
        }
        if (i11 == 3) {
            return new L5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new K5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
