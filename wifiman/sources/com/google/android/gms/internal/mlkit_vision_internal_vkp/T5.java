package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class T5 extends AbstractC4516a2 implements A2 {
    private static final T5 zzb;
    private String zzd = "";
    private String zze = "";
    private float zzf;

    static {
        T5 t52 = new T5();
        zzb = t52;
        AbstractC4516a2.p(T5.class, t52);
    }

    private T5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new T5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new S5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
