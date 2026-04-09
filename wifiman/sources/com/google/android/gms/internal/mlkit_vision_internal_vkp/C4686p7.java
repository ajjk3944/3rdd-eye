package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4686p7 extends AbstractC4516a2 implements A2 {
    private static final C4686p7 zzb;
    private int zzd;
    private C4541c5 zze;
    private InterfaceC4582g2 zzf = AbstractC4516a2.k();

    static {
        C4686p7 c4686p7 = new C4686p7();
        zzb = c4686p7;
        AbstractC4516a2.p(C4686p7.class, c4686p7);
    }

    private C4686p7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", B6.class});
        }
        if (i11 == 3) {
            return new C4686p7();
        }
        AbstractC4664n7 abstractC4664n7 = null;
        if (i11 == 4) {
            return new C4675o7(abstractC4664n7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
