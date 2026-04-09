package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4751v7 extends AbstractC4516a2 implements A2 {
    private static final C4751v7 zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private C4608i6 zzf;

    static {
        C4751v7 c4751v7 = new C4751v7();
        zzb = c4751v7;
        AbstractC4516a2.p(C4751v7.class, c4751v7);
    }

    private C4751v7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", T8.class, "zzf"});
        }
        if (i11 == 3) {
            return new C4751v7();
        }
        AbstractC4728t6 abstractC4728t6 = null;
        if (i11 == 4) {
            return new U6(abstractC4728t6);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
