package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2;

/* renamed from: com.google.android.libraries.vision.visionkit.pipeline.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5014c extends AbstractC4516a2 implements A2 {
    private static final C5014c zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private String zzf = "";

    static {
        C5014c c5014c = new C5014c();
        zzb = c5014c;
        AbstractC4516a2.p(C5014c.class, c5014c);
    }

    private C5014c() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zze", C5017f.class, "zzf"});
        }
        if (i11 == 3) {
            return new C5014c();
        }
        AbstractC5012a abstractC5012a = null;
        if (i11 == 4) {
            return new C5013b(abstractC5012a);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
