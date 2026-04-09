package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4595h4 extends AbstractC4516a2 implements A2 {
    private static final C4595h4 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        C4595h4 c4595h4 = new C4595h4();
        zzb = c4595h4;
        AbstractC4516a2.p(C4595h4.class, c4595h4);
    }

    private C4595h4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", C4584g4.f35687a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4595h4();
        }
        AbstractC4562e4 abstractC4562e4 = null;
        if (i11 == 4) {
            return new C4573f4(abstractC4562e4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
