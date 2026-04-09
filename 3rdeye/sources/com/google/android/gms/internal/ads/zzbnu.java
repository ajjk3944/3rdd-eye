package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbnu implements Runnable {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzbnb zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbog zze;

    public zzbnu(zzbog zzbogVar, zzbof zzbofVar, zzbnb zzbnbVar, ArrayList arrayList, long j4) {
        this.zza = zzbofVar;
        this.zzb = zzbnbVar;
        this.zzc = arrayList;
        this.zzd = j4;
        this.zze = zzbogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbog zzbogVar = this.zze;
        synchronized (zzbogVar.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbof zzbofVar = this.zza;
                if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhT)).booleanValue()) {
                        zzbofVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbofVar.zzg();
                    }
                    zzgdm zzgdmVar = zzcad.zzf;
                    final zzbnb zzbnbVar = this.zzb;
                    Objects.requireNonNull(zzbnbVar);
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbnbVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzd));
                    int iZze = zzbofVar.zze();
                    int i = zzbogVar.zzi;
                    ArrayList arrayList = this.zzc;
                    String strConcat = arrayList.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(arrayList.get(0)));
                    com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i + strConcat + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
