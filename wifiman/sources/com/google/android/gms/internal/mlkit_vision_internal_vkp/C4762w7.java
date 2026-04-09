package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4762w7 extends AbstractC4516a2 implements A2 {
    private static final C4762w7 zzb;
    private long zze;
    private long zzf;
    private B1 zzd = B1.f35555b;
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();

    static {
        C4762w7 c4762w7 = new C4762w7();
        zzb = c4762w7;
        AbstractC4516a2.p(C4762w7.class, c4762w7);
    }

    private C4762w7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", N6.class});
        }
        if (i11 == 3) {
            return new C4762w7();
        }
        AbstractC4729t7 abstractC4729t7 = null;
        if (i11 == 4) {
            return new C4740u7(abstractC4729t7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
