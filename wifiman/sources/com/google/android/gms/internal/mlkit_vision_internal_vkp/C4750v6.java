package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4750v6 extends AbstractC4516a2 implements A2 {
    private static final C4750v6 zzb;
    private String zzd = "";
    private InterfaceC4582g2 zze = AbstractC4516a2.k();

    static {
        C4750v6 c4750v6 = new C4750v6();
        zzb = c4750v6;
        AbstractC4516a2.p(C4750v6.class, c4750v6);
    }

    private C4750v6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", B6.class});
        }
        if (i11 == 3) {
            return new C4750v6();
        }
        AbstractC4717s6 abstractC4717s6 = null;
        if (i11 == 4) {
            return new C4739u6(abstractC4717s6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
