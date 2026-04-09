package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4580g0 extends AbstractC4516a2 implements A2 {
    private static final C4580g0 zzb;
    private int zzd;
    private double zze;
    private double zzf;

    static {
        C4580g0 c4580g0 = new C4580g0();
        zzb = c4580g0;
        AbstractC4516a2.p(C4580g0.class, c4580g0);
    }

    private C4580g0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4580g0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4569f0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
