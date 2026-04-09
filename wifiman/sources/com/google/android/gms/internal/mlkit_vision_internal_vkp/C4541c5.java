package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4541c5 extends AbstractC4516a2 implements A2 {
    private static final C4541c5 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        C4541c5 c4541c5 = new C4541c5();
        zzb = c4541c5;
        AbstractC4516a2.p(C4541c5.class, c4541c5);
    }

    private C4541c5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4541c5();
        }
        I4 i42 = null;
        if (i11 == 4) {
            return new P4(i42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
