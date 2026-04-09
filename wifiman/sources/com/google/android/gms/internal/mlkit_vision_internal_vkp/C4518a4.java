package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4518a4 extends AbstractC4516a2 implements A2 {
    private static final C4518a4 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg = 1;
    private int zzh = 1;

    static {
        C4518a4 c4518a4 = new C4518a4();
        zzb = c4518a4;
        AbstractC4516a2.p(C4518a4.class, c4518a4);
    }

    private C4518a4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4518a4();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new Z3(abstractC4758w3);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
