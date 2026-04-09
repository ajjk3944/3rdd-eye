package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgcn extends zzgdj {
    private final Executor zza;
    final /* synthetic */ zzgco zzb;

    public zzgcn(zzgco zzgcoVar, Executor executor) {
        this.zzb = zzgcoVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzd(Throwable th) {
        zzgco zzgcoVar = this.zzb;
        zzgcoVar.zza = null;
        if (th instanceof ExecutionException) {
            zzgcoVar.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgcoVar.cancel(false);
        } else {
            zzgcoVar.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e4) {
            this.zzb.zzd(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
