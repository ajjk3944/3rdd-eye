package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.C4776y;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.qa;

/* loaded from: classes.dex */
public final class l extends AbstractC4516a2 implements A2 {
    private static final l zzb;
    private int zzd;
    private qa zze;
    private C4776y zzf;
    private boolean zzg;
    private byte zzi = 2;
    private String zzh = "";

    static {
        l lVar = new l();
        zzb = lVar;
        AbstractC4516a2.p(l.class, lVar);
    }

    private l() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new l();
        }
        AbstractC5021j abstractC5021j = null;
        if (i11 == 4) {
            return new k(abstractC5021j);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
