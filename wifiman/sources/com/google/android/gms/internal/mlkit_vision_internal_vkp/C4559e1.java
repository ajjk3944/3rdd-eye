package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4559e1 extends AbstractC4516a2 implements A2 {
    private static final C4559e1 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();
    private InterfaceC4582g2 zze = AbstractC4516a2.k();

    static {
        C4559e1 c4559e1 = new C4559e1();
        zzb = c4559e1;
        AbstractC4516a2.p(C4559e1.class, c4559e1);
    }

    private C4559e1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0000\u0001\u000f\u0002\u0000\u0002\u0000\u0001\u001b\u000f\u001a", new Object[]{"zzd", C4515a1.class, "zze"});
        }
        if (i11 == 3) {
            return new C4559e1();
        }
        W0 w02 = null;
        if (i11 == 4) {
            return new C4548d1(w02);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
