package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class X5 extends AbstractC4516a2 implements A2 {
    private static final X5 zzb;
    private int zzd = 0;
    private Object zze;
    private float zzf;

    static {
        X5 x52 = new X5();
        zzb = x52;
        AbstractC4516a2.p(X5.class, x52);
    }

    private X5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003\u0001", new Object[]{"zze", "zzd", "zzf"});
        }
        if (i11 == 3) {
            return new X5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new W5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
