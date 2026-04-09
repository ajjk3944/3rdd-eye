package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class B6 extends AbstractC4516a2 implements A2 {
    private static final B6 zzb;
    private String zzd = "";
    private String zze = "";
    private double zzf;

    static {
        B6 b62 = new B6();
        zzb = b62;
        AbstractC4516a2.p(B6.class, b62);
    }

    private B6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003Ȉ", new Object[]{"zzd", "zzf", "zze"});
        }
        if (i11 == 3) {
            return new B6();
        }
        AbstractC4794z6 abstractC4794z6 = null;
        if (i11 == 4) {
            return new A6(abstractC4794z6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
