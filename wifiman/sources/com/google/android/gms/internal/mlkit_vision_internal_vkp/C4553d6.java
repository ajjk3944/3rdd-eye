package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4553d6 extends AbstractC4516a2 implements A2 {
    private static final C4553d6 zzb;
    private int zzd = 0;
    private Object zze;
    private float zzf;

    static {
        C4553d6 c4553d6 = new C4553d6();
        zzb = c4553d6;
        AbstractC4516a2.p(C4553d6.class, c4553d6);
    }

    private C4553d6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003\u0001\u0004<\u0000", new Object[]{"zze", "zzd", "zzf", C4575f6.class});
        }
        if (i11 == 3) {
            return new C4553d6();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new C4542c6(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
