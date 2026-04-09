package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4651m5 extends AbstractC4516a2 implements A2 {
    private static final C4651m5 zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";
    private String zzh = "";
    private B1 zzi = B1.f35555b;

    static {
        C4651m5 c4651m5 = new C4651m5();
        zzb = c4651m5;
        AbstractC4516a2.p(C4651m5.class, c4651m5);
    }

    private C4651m5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003<\u0000\u0004<\u0000\u0005ည\u0002", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", C4574f5.class, A5.class, "zzi"});
        }
        if (i11 == 3) {
            return new C4651m5();
        }
        AbstractC4629k5 abstractC4629k5 = null;
        if (i11 == 4) {
            return new C4640l5(abstractC4629k5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
