package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4652m6 extends AbstractC4516a2 implements A2 {
    private static final C4652m6 zzb;
    private float zzd;
    private float zze;

    static {
        C4652m6 c4652m6 = new C4652m6();
        zzb = c4652m6;
        AbstractC4516a2.p(C4652m6.class, c4652m6);
    }

    private C4652m6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C4652m6();
        }
        AbstractC4630k6 abstractC4630k6 = null;
        if (i11 == 4) {
            return new C4641l6(abstractC4630k6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
