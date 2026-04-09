package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfgk {
    private static final A4.a zza = zzgdb.zzh(null);
    private final zzgdm zzb;
    private final ScheduledExecutorService zzc;
    private final zzfgl zzd;

    public zzfgk(zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, zzfgl zzfglVar) {
        this.zzb = zzgdmVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfglVar;
    }

    public final zzfga zza(Object obj, A4.a... aVarArr) {
        return new zzfga(this, obj, Arrays.asList(aVarArr), null);
    }

    public final zzfgi zzb(Object obj, A4.a aVar) {
        return new zzfgi(this, obj, aVar, Collections.singletonList(aVar), aVar);
    }

    public abstract String zzf(Object obj);
}
