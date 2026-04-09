package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4763w8 extends AbstractC4516a2 implements A2 {
    private static final C4763w8 zzb;
    private int zzd;
    private float zze;
    private boolean zzf;
    private B1 zzg = B1.f35555b;

    static {
        C4763w8 c4763w8 = new C4763w8();
        zzb = c4763w8;
        AbstractC4516a2.p(C4763w8.class, c4763w8);
    }

    private C4763w8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C4763w8();
        }
        AbstractC4741u8 abstractC4741u8 = null;
        if (i11 == 4) {
            return new C4752v8(abstractC4741u8);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
