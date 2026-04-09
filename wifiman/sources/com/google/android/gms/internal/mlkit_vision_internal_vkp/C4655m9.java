package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4655m9 extends AbstractC4516a2 implements A2 {
    private static final C4655m9 zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private int zzh;
    private int zze = 0;
    private InterfaceC4582g2 zzi = AbstractC4516a2.k();

    static {
        C4655m9 c4655m9 = new C4655m9();
        zzb = c4655m9;
        AbstractC4516a2.p(C4655m9.class, c4655m9);
    }

    private C4655m9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001=\u0000\u0002င\u0000\u0003င\u0001\u0004<\u0000\u0005\u001b", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", C4644l9.class, "zzi", C4589g9.class});
        }
        if (i11 == 3) {
            return new C4655m9();
        }
        AbstractC4556d9 abstractC4556d9 = null;
        if (i11 == 4) {
            return new C4567e9(abstractC4556d9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
