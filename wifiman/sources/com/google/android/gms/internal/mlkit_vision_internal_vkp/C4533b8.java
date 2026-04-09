package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4533b8 extends AbstractC4516a2 implements A2 {
    private static final C4533b8 zzb;
    private int zzd;
    private B1 zze = B1.f35555b;
    private float zzf;
    private Y8 zzg;
    private long zzh;

    static {
        C4533b8 c4533b8 = new C4533b8();
        zzb = c4533b8;
        AbstractC4516a2.p(C4533b8.class, c4533b8);
    }

    private C4533b8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4533b8();
        }
        Y7 y72 = null;
        if (i11 == 4) {
            return new C4522a8(y72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
