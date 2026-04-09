package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfcg implements zzfax {
    private final zzcdu zza;
    private final ScheduledExecutorService zzb;
    private final zzgzy zzc;

    public zzfcg(String str, zzbfg zzbfgVar, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        this.zza = zzcduVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdP)).booleanValue()) {
                com.google.common.util.concurrent.a aVarZza = zzgat.zza(Tasks.forResult(null), null);
                zzgzy zzgzyVar = this.zzc;
                com.google.common.util.concurrent.a aVarZzj = zzgzo.zzj(aVarZza, zzfcf.zza, zzgzyVar);
                if (((Boolean) zzbir.zza.zze()).booleanValue()) {
                    aVarZzj = zzgzo.zzi(aVarZzj, ((Long) zzbir.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgzo.zzg(aVarZzj, Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfce
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgzyVar);
            }
        }
        return zzgzo.zza(new zzfch(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzfch zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfch(null, -1);
    }
}
