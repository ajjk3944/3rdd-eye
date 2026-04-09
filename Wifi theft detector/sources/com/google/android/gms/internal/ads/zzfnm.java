package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzfnm {
    private static final com.google.common.util.concurrent.a zza = zzgzo.zza(null);
    private final zzgzy zzb;
    private final ScheduledExecutorService zzc;
    private final zzfnn zzd;

    public zzfnm(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzfnn zzfnnVar) {
        this.zzb = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnnVar;
    }

    public final zzfnl zza(Object obj, com.google.common.util.concurrent.a aVar) {
        return new zzfnl(this, obj, null, aVar, Collections.singletonList(aVar), aVar, null);
    }

    public final zzfnd zzb(Object obj, com.google.common.util.concurrent.a... aVarArr) {
        return new zzfnd(this, obj, Arrays.asList(aVarArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgzy zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfnn zzg() {
        return this.zzd;
    }
}
