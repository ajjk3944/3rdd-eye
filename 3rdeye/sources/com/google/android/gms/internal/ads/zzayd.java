package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayd extends zzayi {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzayd(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10) {
        super(zzawvVar, "AkswGwusnlvibekdTn6rp1TLruqBIpT26qUqw6ERX2GI+0q3NNodYWGNobvk/KA0", "+ySS/EYovSzthax5b5cNVBSw7OeHS3QqC5FfLg20T6g=", zzasrVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzT(zzh.longValue());
        }
    }
}
