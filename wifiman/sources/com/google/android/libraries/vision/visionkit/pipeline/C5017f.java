package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;

/* renamed from: com.google.android.libraries.vision.visionkit.pipeline.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5017f extends AbstractC4516a2 implements A2 {
    private static final C5017f zzb;
    private int zzd;
    private String zze = "";
    private int zzf;

    static {
        C5017f c5017f = new C5017f();
        zzb = c5017f;
        AbstractC4516a2.p(C5017f.class, c5017f);
    }

    private C5017f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C5017f();
        }
        AbstractC5015d abstractC5015d = null;
        if (i11 == 4) {
            return new C5016e(abstractC5015d);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
