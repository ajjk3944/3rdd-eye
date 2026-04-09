package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzdey {
    private final zzdgg zza;
    private final zzcfe zzb;

    public zzdey(zzdgg zzdggVar, zzcfe zzcfeVar) {
        this.zza = zzdggVar;
        this.zzb = zzcfeVar;
    }

    public final View zza() {
        zzcfe zzcfeVar = this.zzb;
        if (zzcfeVar == null) {
            return null;
        }
        return zzcfeVar.zzG();
    }

    public final View zzb() {
        zzcfe zzcfeVar = this.zzb;
        if (zzcfeVar != null) {
            return zzcfeVar.zzG();
        }
        return null;
    }

    public final zzcfe zzc() {
        return this.zzb;
    }

    public final zzddo zzd(Executor executor) {
        final zzcfe zzcfeVar = this.zzb;
        return new zzddo(new zzdal() { // from class: com.google.android.gms.internal.ads.zzdex
            @Override // com.google.android.gms.internal.ads.zzdal
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                zzcfe zzcfeVar2 = zzcfeVar;
                if (zzcfeVar2 == null || (zzmVarZzL = zzcfeVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }

    public final zzdgg zze() {
        return this.zza;
    }

    public Set zzf(zzcum zzcumVar) {
        return Collections.singleton(new zzddo(zzcumVar, zzcad.zzg));
    }

    public Set zzg(zzcum zzcumVar) {
        return Collections.singleton(new zzddo(zzcumVar, zzcad.zzg));
    }
}
