package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgec extends zzgcr implements RunnableFuture {
    private volatile zzgdj zza;

    public zzgec(zzgch zzgchVar) {
        this.zza = new zzgea(this, zzgchVar);
    }

    public static zzgec zze(Runnable runnable, Object obj) {
        return new zzgec(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgdj zzgdjVar = this.zza;
        if (zzgdjVar != null) {
            zzgdjVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        zzgdj zzgdjVar = this.zza;
        return zzgdjVar != null ? C1154e9.i("task=[", zzgdjVar.toString(), "]") : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzgdj zzgdjVar;
        if (zzo() && (zzgdjVar = this.zza) != null) {
            zzgdjVar.zzh();
        }
        this.zza = null;
    }

    public zzgec(Callable callable) {
        this.zza = new zzgeb(this, callable);
    }
}
