package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4536c0 extends AbstractC4516a2 implements A2 {
    private static final C4536c0 zzb;
    private int zzd;
    private float zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C4536c0 c4536c0 = new C4536c0();
        zzb = c4536c0;
        AbstractC4516a2.p(C4536c0.class, c4536c0);
    }

    private C4536c0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔁ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4536c0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4525b0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
