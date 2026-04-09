package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class L extends AbstractC4516a2 implements A2 {
    private static final L zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        L l10 = new L();
        zzb = l10;
        AbstractC4516a2.p(L.class, l10);
    }

    private L() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", K.class});
        }
        if (i11 == 3) {
            return new L();
        }
        H h10 = null;
        if (i11 == 4) {
            return new I(h10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
