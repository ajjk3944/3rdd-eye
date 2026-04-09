package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4792z4 extends AbstractC4516a2 implements A2 {
    private static final C4792z4 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        C4792z4 c4792z4 = new C4792z4();
        zzb = c4792z4;
        AbstractC4516a2.p(C4792z4.class, c4792z4);
    }

    private C4792z4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0000", new Object[]{"zzd", "zzf", "zzg", "zzh", "zze", L4.f35611a});
        }
        if (i11 == 3) {
            return new C4792z4();
        }
        AbstractC4770x4 abstractC4770x4 = null;
        if (i11 == 4) {
            return new C4781y4(abstractC4770x4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
