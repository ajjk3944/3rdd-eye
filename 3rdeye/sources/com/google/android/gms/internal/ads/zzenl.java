package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenl implements zzetu {
    final zzbzq zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgdm zzd;
    private final Context zze;

    public zzenl(Context context, zzbzq zzbzqVar, ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdj)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzqVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdf)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdk)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdg)).booleanValue()) {
                    return zzgdb.zzm(zzfsa.zza(this.zzb.getAppSetIdInfo(), null), new zzfut() { // from class: com.google.android.gms.internal.ads.zzeni
                        @Override // com.google.android.gms.internal.ads.zzfut
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzenm(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcad.zzg);
                }
                Task<AppSetIdInfo> taskZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdj)).booleanValue() ? zzfds.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgdb.zzh(new zzenm(null, -1));
                }
                A4.a aVarZzn = zzgdb.zzn(zzfsa.zza(taskZza, null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzenj
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final A4.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgdb.zzh(new zzenm(null, -1)) : zzgdb.zzh(new zzenm(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcad.zzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdh)).booleanValue()) {
                    aVarZzn = zzgdb.zzo(aVarZzn, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdi)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgdb.zze(aVarZzn, Exception.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzenk
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzenm(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgdb.zzh(new zzenm(null, -1));
    }
}
