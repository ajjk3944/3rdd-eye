package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class S7 extends AbstractC4516a2 implements A2 {
    private static final S7 zzb;
    private int zzd;
    private C4751v7 zze;
    private InterfaceC4549d2 zzf = AbstractC4516a2.h();

    static {
        S7 s72 = new S7();
        zzb = s72;
        AbstractC4516a2.p(S7.class, s72);
    }

    private S7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0013", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new S7();
        }
        Q7 q72 = null;
        if (i11 == 4) {
            return new R7(q72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
