package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4771x5 extends AbstractC4516a2 implements A2 {
    private static final C4771x5 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private byte zzi = 2;

    static {
        C4771x5 c4771x5 = new C4771x5();
        zzb = c4771x5;
        AbstractC4516a2.p(C4771x5.class, c4771x5);
    }

    private C4771x5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4771x5();
        }
        AbstractC4749v5 abstractC4749v5 = null;
        if (i11 == 4) {
            return new C4760w5(abstractC4749v5);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
