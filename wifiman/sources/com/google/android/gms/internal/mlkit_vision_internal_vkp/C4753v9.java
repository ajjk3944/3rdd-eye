package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.v9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4753v9 extends AbstractC4516a2 implements A2 {
    private static final C4753v9 zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private int zzf;

    static {
        C4753v9 c4753v9 = new C4753v9();
        zzb = c4753v9;
        AbstractC4516a2.p(C4753v9.class, c4753v9);
    }

    private C4753v9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzd", "zze", C4545c9.class, "zzf"});
        }
        if (i11 == 3) {
            return new C4753v9();
        }
        AbstractC4731t9 abstractC4731t9 = null;
        if (i11 == 4) {
            return new C4742u9(abstractC4731t9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
