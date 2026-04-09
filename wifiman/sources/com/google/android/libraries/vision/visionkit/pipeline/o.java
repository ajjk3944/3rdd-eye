package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2;

/* loaded from: classes.dex */
public final class o extends AbstractC4516a2 implements A2 {
    private static final o zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private long zzf;

    static {
        o oVar = new o();
        zzb = oVar;
        AbstractC4516a2.p(o.class, oVar);
    }

    private o() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new o();
        }
        m mVar = null;
        if (i11 == 4) {
            return new n(mVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
