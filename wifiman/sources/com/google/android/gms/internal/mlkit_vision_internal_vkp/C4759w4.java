package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4759w4 extends AbstractC4516a2 implements A2 {
    private static final C4759w4 zzb;
    private byte zze = 2;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4759w4 c4759w4 = new C4759w4();
        zzb = c4759w4;
        AbstractC4516a2.p(C4759w4.class, c4759w4);
    }

    private C4759w4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", C4726t4.class});
        }
        if (i11 == 3) {
            return new C4759w4();
        }
        AbstractC4737u4 abstractC4737u4 = null;
        if (i11 == 4) {
            return new C4748v4(abstractC4737u4);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
