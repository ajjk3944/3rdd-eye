package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.C4544c8;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.C9;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4582g2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.Q8;

/* loaded from: classes.dex */
public final class v extends AbstractC4516a2 implements A2 {
    private static final v zzb;
    private int zzd;
    private Q8 zze;
    private InterfaceC4582g2 zzf = AbstractC4516a2.k();
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();

    static {
        v vVar = new v();
        zzb = vVar;
        AbstractC4516a2.p(v.class, vVar);
    }

    private v() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zzd", "zze", "zzf", C9.class, "zzg", C4544c8.class});
        }
        if (i11 == 3) {
            return new v();
        }
        t tVar = null;
        if (i11 == 4) {
            return new u(tVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
