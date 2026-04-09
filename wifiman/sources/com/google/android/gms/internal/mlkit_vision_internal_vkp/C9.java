package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class C9 extends AbstractC4516a2 implements A2 {
    private static final C9 zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private String zzf = "";

    static {
        C9 c92 = new C9();
        zzb = c92;
        AbstractC4516a2.p(C9.class, c92);
    }

    private C9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zze", C4797z9.class, "zzf"});
        }
        if (i11 == 3) {
            return new C9();
        }
        A9 a92 = null;
        if (i11 == 4) {
            return new B9(a92);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
