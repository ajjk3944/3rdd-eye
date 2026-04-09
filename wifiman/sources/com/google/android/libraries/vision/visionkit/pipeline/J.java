package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;

/* loaded from: classes.dex */
public final class J extends AbstractC4516a2 implements A2 {
    private static final J zzb;
    private int zzd;
    private D zze;

    static {
        J j10 = new J();
        zzb = j10;
        AbstractC4516a2.p(J.class, j10);
    }

    private J() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new J();
        }
        H h10 = null;
        if (i11 == 4) {
            return new I(h10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
