package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class Q6 extends AbstractC4516a2 implements A2 {
    private static final Q6 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        Q6 q62 = new Q6();
        zzb = q62;
        AbstractC4516a2.p(Q6.class, q62);
    }

    private Q6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", T6.class, C4521a7.class});
        }
        if (i11 == 3) {
            return new Q6();
        }
        O6 o62 = null;
        if (i11 == 4) {
            return new P6(o62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
