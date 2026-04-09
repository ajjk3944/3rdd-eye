package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbog {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfhp zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private zzbof zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbog(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, zzfhp zzfhpVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfhpVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public static /* synthetic */ void zzg(zzbog zzbogVar, zzbnb zzbnbVar) {
        if (zzbnbVar.zzi()) {
            zzbogVar.zzi = 1;
        }
    }

    public static /* synthetic */ void zzh(zzbog zzbogVar, zzavs zzavsVar, zzbof zzbofVar) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbnj zzbnjVar = new zzbnj(zzbogVar.zzb, zzbogVar.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbnjVar.zzk(new zzbnm(zzbogVar, arrayList, jCurrentTimeMillis, zzbofVar, zzbnjVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbnjVar.zzq("/jsLoaded", new zzbnr(zzbogVar, jCurrentTimeMillis, zzbofVar, zzbnjVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            zzbns zzbnsVar = new zzbns(zzbogVar, null, zzbnjVar, zzbyVar);
            zzbyVar.zzb(zzbnsVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbnjVar.zzq("/requestReload", zzbnsVar);
            String str = zzbogVar.zzc;
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbnjVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbnjVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbnjVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbnu(zzbogVar, zzbofVar, zzbnjVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzd)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhT)).booleanValue()) {
                zzbofVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhV)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbofVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbofVar.zzg();
            }
        }
    }

    public static /* synthetic */ void zzi(zzbog zzbogVar, zzbof zzbofVar, final zzbnb zzbnbVar, ArrayList arrayList, long j4) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (zzbogVar.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhT)).booleanValue()) {
                        zzbofVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbofVar.zzg();
                    }
                    zzgdm zzgdmVar = zzcad.zzf;
                    Objects.requireNonNull(zzbnbVar);
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbnbVar.zzc();
                        }
                    });
                    com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbofVar.zze() + ". Update status(onEngLoadedTimeout) is " + zzbogVar.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - j4) + " ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzboa zzb(zzavs zzavsVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbof zzbofVar = this.zzh;
                        if (zzbofVar != null && this.zzi == 0) {
                            zzbofVar.zzj(new zzcam() { // from class: com.google.android.gms.internal.ads.zzbno
                                @Override // com.google.android.gms.internal.ads.zzcam
                                public final void zza(Object obj2) {
                                    zzbog.zzg(this.zza, (zzbnb) obj2);
                                }
                            }, new zzcak() { // from class: com.google.android.gms.internal.ads.zzbnp
                                @Override // com.google.android.gms.internal.ads.zzcak
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbof zzbofVar2 = this.zzh;
        if (zzbofVar2 != null && zzbofVar2.zze() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zzd(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zzd(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final zzbof zzd(zzavs zzavsVar) {
        zzfhb zzfhbVarZza = zzfha.zza(this.zzb, 6);
        zzfhbVarZza.zzi();
        final zzbof zzbofVar = new zzbof(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzavs zzavsVar2 = null;
        zzcad.zzf.execute(new Runnable(zzavsVar2, zzbofVar) { // from class: com.google.android.gms.internal.ads.zzbnq
            public final /* synthetic */ zzbof zzb;

            {
                this.zzb = zzbofVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbog.zzh(this.zza, null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbofVar.zzj(new zzbnv(this, zzbofVar, zzfhbVarZza), new zzbnw(this, zzbofVar, zzfhbVarZza));
        return zzbofVar;
    }
}
