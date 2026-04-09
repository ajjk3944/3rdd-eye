package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class E4 extends AbstractC4516a2 implements A2 {
    private static final E4 zzb;
    private int zzd;
    private int zze;
    private B1 zzf = B1.f35555b;
    private float zzg;

    static {
        E4 e42 = new E4();
        zzb = e42;
        AbstractC4516a2.p(E4.class, e42);
    }

    private E4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new E4();
        }
        AbstractC4770x4 abstractC4770x4 = null;
        if (i11 == 4) {
            return new D4(abstractC4770x4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
