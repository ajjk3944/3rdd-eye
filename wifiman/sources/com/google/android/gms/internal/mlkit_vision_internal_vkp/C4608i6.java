package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4608i6 extends AbstractC4516a2 implements A2 {
    private static final C4608i6 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C4608i6 c4608i6 = new C4608i6();
        zzb = c4608i6;
        AbstractC4516a2.p(C4608i6.class, c4608i6);
    }

    private C4608i6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4608i6();
        }
        AbstractC4585g5 abstractC4585g5 = null;
        if (i11 == 4) {
            return new H5(abstractC4585g5);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
