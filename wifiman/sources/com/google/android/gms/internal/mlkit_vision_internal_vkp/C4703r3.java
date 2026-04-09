package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4703r3 extends AbstractC4516a2 implements A2 {
    private static final C4703r3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC4549d2 zzg = AbstractC4516a2.h();
    private int zzh;

    static {
        C4703r3 c4703r3 = new C4703r3();
        zzb = c4703r3;
        AbstractC4516a2.p(C4703r3.class, c4703r3);
    }

    private C4703r3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003$\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C4693q3.f35717a});
        }
        if (i11 == 3) {
            return new C4703r3();
        }
        AbstractC4671o3 abstractC4671o3 = null;
        if (i11 == 4) {
            return new C4682p3(abstractC4671o3);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
