package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4657n0 extends AbstractC4516a2 implements A2 {
    private static final C4657n0 zzb;
    private int zzd;
    private C4679p0 zze;
    private float zzf;
    private byte zzh = 2;
    private InterfaceC4549d2 zzg = AbstractC4516a2.h();

    static {
        C4657n0 c4657n0 = new C4657n0();
        zzb = c4657n0;
        AbstractC4516a2.p(C4657n0.class, c4657n0);
    }

    private C4657n0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C4657n0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4646m0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
