package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4687p8 extends AbstractC4516a2 implements A2 {
    private static final C4687p8 zzb;
    private int zzd;
    private B1 zze = B1.f35555b;
    private float zzf;

    static {
        C4687p8 c4687p8 = new C4687p8();
        zzb = c4687p8;
        AbstractC4516a2.p(C4687p8.class, c4687p8);
    }

    private C4687p8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4687p8();
        }
        AbstractC4665n8 abstractC4665n8 = null;
        if (i11 == 4) {
            return new C4676o8(abstractC4665n8);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
