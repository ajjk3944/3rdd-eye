package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4514a0 extends AbstractC4516a2 implements A2 {
    private static final C4514a0 zzb;
    private int zzd;
    private int zze = -1;
    private int zzf = -1;
    private InterfaceC4549d2 zzg = AbstractC4516a2.h();
    private InterfaceC4560e2 zzh = AbstractC4516a2.i();
    private InterfaceC4549d2 zzi = AbstractC4516a2.h();

    static {
        C4514a0 c4514a0 = new C4514a0();
        zzb = c4514a0;
        AbstractC4516a2.p(C4514a0.class, c4514a0);
    }

    private C4514a0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004\u0016\u0006\u0013", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C4514a0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new Z(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
