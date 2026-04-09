package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbnr implements zzbkd {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbof zzb;
    final /* synthetic */ zzbnb zzc;
    final /* synthetic */ zzbog zzd;

    public zzbnr(zzbog zzbogVar, long j4, zzbof zzbofVar, zzbnb zzbnbVar) {
        this.zza = j4;
        this.zzb = zzbofVar;
        this.zzc = zzbnbVar;
        this.zzd = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - this.zza) + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbog zzbogVar = this.zzd;
        synchronized (zzbogVar.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbof zzbofVar = this.zzb;
            if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                zzbogVar.zzi = 0;
                zzbnb zzbnbVar = this.zzc;
                zzbnbVar.zzq("/log", zzbkc.zzg);
                zzbnbVar.zzq("/result", zzbkc.zzo);
                zzbofVar.zzi(zzbnbVar);
                zzbogVar.zzh = zzbofVar;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
