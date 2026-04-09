package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class K6 extends AbstractC4516a2 implements A2 {
    private static final K6 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();
    private InterfaceC4582g2 zze = AbstractC4516a2.k();

    static {
        K6 k62 = new K6();
        zzb = k62;
        AbstractC4516a2.p(K6.class, k62);
    }

    private K6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", E6.class, "zze", H6.class});
        }
        if (i11 == 3) {
            return new K6();
        }
        I6 i62 = null;
        if (i11 == 4) {
            return new J6(i62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
