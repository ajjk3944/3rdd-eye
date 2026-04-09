package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class A5 extends AbstractC4516a2 implements A2 {
    private static final A5 zzb;
    private int zzd;
    private float zze;
    private B1 zzf = B1.f35555b;

    static {
        A5 a52 = new A5();
        zzb = a52;
        AbstractC4516a2.p(A5.class, a52);
    }

    private A5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new A5();
        }
        AbstractC4782y5 abstractC4782y5 = null;
        if (i11 == 4) {
            return new C4793z5(abstractC4782y5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
