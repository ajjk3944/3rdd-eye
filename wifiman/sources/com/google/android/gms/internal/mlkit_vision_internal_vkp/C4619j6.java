package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4619j6 extends AbstractC4516a2 implements A2 {
    private static final C4619j6 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private InterfaceC4582g2 zzf = AbstractC4516a2.k();
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();

    static {
        C4619j6 c4619j6 = new C4619j6();
        zzb = c4619j6;
        AbstractC4516a2.p(C4619j6.class, c4619j6);
    }

    private C4619j6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzd", U5.class, "zze", J5.class, "zzf", C4674o6.class, "zzg", C4586g6.class});
        }
        if (i11 == 3) {
            return new C4619j6();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new C4597h6(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
