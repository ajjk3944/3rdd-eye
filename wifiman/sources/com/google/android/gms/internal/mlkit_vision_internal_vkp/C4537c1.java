package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4537c1 extends AbstractC4516a2 implements A2 {
    private static final C4537c1 zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private InterfaceC4582g2 zzf = AbstractC4516a2.k();
    private int zzg;

    static {
        C4537c1 c4537c1 = new C4537c1();
        zzb = c4537c1;
        AbstractC4516a2.p(C4537c1.class, c4537c1);
    }

    private C4537c1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"zzd", "zze", C4559e1.class, "zzf", Y0.class, "zzg"});
        }
        if (i11 == 3) {
            return new C4537c1();
        }
        W0 w02 = null;
        if (i11 == 4) {
            return new C4526b1(w02);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
