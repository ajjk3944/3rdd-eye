package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxq extends zzayi {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxq(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10) {
        super(zzawvVar, "2yqQbpMMcqKX38M442dN+dCyzykwnAxluzbiBDnzfSZwwykVdh1BxKbQaA6qVZBU", "1XIQFsxUhHfLRHhylour2btyczZCL08SFkmijCbkayQ=", zzasrVar, i, 22);
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
            zzasrVar.zzw(zzh.longValue());
        }
    }
}
