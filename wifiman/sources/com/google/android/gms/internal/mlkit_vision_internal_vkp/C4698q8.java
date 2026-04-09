package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4698q8 extends AbstractC4516a2 implements A2 {
    private static final C4698q8 zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();
    private int zze;

    static {
        C4698q8 c4698q8 = new C4698q8();
        zzb = c4698q8;
        AbstractC4516a2.p(C4698q8.class, c4698q8);
    }

    private C4698q8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"zzd", K7.class, "zze"});
        }
        if (i11 == 3) {
            return new C4698q8();
        }
        AbstractC4555d8 abstractC4555d8 = null;
        if (i11 == 4) {
            return new C4588g8(abstractC4555d8);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
