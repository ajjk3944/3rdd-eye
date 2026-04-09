package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2;

/* loaded from: classes.dex */
public final class A extends AbstractC4516a2 implements A2 {
    private static final A zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        A a10 = new A();
        zzb = a10;
        AbstractC4516a2.p(A.class, a10);
    }

    private A() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", z.class});
        }
        if (i11 == 3) {
            return new A();
        }
        w wVar = null;
        if (i11 == 4) {
            return new x(wVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
