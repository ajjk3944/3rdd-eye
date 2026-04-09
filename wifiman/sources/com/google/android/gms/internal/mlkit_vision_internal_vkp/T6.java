package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class T6 extends AbstractC4516a2 implements A2 {
    private static final T6 zzb;
    private InterfaceC4549d2 zzd = AbstractC4516a2.h();

    static {
        T6 t62 = new T6();
        zzb = t62;
        AbstractC4516a2.p(T6.class, t62);
    }

    private T6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new T6();
        }
        R6 r62 = null;
        if (i11 == 4) {
            return new S6(r62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
