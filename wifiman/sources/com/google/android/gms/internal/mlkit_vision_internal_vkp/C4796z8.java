package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4796z8 extends AbstractC4516a2 implements A2 {
    private static final C4796z8 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4796z8 c4796z8 = new C4796z8();
        zzb = c4796z8;
        AbstractC4516a2.p(C4796z8.class, c4796z8);
    }

    private C4796z8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4796z8();
        }
        AbstractC4774x8 abstractC4774x8 = null;
        if (i11 == 4) {
            return new C4785y8(abstractC4774x8);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
