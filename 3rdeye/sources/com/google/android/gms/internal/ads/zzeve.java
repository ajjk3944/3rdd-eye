package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeve implements zzetu {
    private final zzbzq zza;
    private final ScheduledExecutorService zzb;
    private final zzgdm zzc;

    public zzeve(String str, zzbbd zzbbdVar, zzbzq zzbzqVar, ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar) {
        this.zza = zzbzqVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgdmVar;
    }

    public static /* synthetic */ zzevf zzc(zzeve zzeveVar, Exception exc) {
        zzeveVar.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevf(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdf)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdk)).booleanValue()) {
                A4.a aVarZza = zzfsa.zza(Tasks.forResult(null), null);
                zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzevc
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final A4.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgdb.zzh(new zzevf(null, -1)) : zzgdb.zzh(new zzevf(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                };
                zzgdm zzgdmVar = this.zzc;
                A4.a aVarZzn = zzgdb.zzn(aVarZza, zzgciVar, zzgdmVar);
                if (((Boolean) zzbep.zza.zze()).booleanValue()) {
                    aVarZzn = zzgdb.zzo(aVarZzn, ((Long) zzbep.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgdb.zze(aVarZzn, Exception.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzevd
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        return zzeve.zzc(this.zza, (Exception) obj);
                    }
                }, zzgdmVar);
            }
        }
        return zzgdb.zzh(new zzevf(null, -1));
    }
}
