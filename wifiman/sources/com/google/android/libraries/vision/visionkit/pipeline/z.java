package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.A2;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2;

/* loaded from: classes.dex */
public final class z extends AbstractC4516a2 implements A2 {
    private static final z zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private float zzg;
    private long zzh;
    private boolean zzi;
    private float zzj;
    private float zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    static {
        z zVar = new z();
        zzb = zVar;
        AbstractC4516a2.p(z.class, zVar);
    }

    private z() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ခ\u0006\bဂ\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new z();
        }
        w wVar = null;
        if (i11 == 4) {
            return new y(wVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
