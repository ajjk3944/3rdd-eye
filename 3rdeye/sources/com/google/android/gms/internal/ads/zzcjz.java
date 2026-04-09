package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcjz extends com.google.android.gms.ads.internal.client.zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdps zzc;
    private final zzedg zzd;
    private final zzejm zze;
    private final zzdug zzf;
    private final zzbym zzg;
    private final zzdpx zzh;
    private final zzdvb zzi;
    private final zzbfv zzj;
    private final zzfhp zzk;
    private final zzfdk zzl;
    private final zzctg zzm;
    private final zzdsc zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime());

    public zzcjz(Context context, VersionInfoParcel versionInfoParcel, zzdps zzdpsVar, zzedg zzedgVar, zzejm zzejmVar, zzdug zzdugVar, zzbym zzbymVar, zzdpx zzdpxVar, zzdvb zzdvbVar, zzbfv zzbfvVar, zzfhp zzfhpVar, zzfdk zzfdkVar, zzctg zzctgVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdpsVar;
        this.zzd = zzedgVar;
        this.zze = zzejmVar;
        this.zzf = zzdugVar;
        this.zzg = zzbymVar;
        this.zzh = zzdpxVar;
        this.zzi = zzdvbVar;
        this.zzj = zzbfvVar;
        this.zzk = zzfhpVar;
        this.zzl = zzfdkVar;
        this.zzm = zzctgVar;
        this.zzn = zzdscVar;
    }

    public static /* synthetic */ void zzc(zzcjz zzcjzVar, Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (zzcjzVar.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbph zzbphVar : ((zzbpi) it.next()).zza) {
                    String str = zzbphVar.zzb;
                    for (String str2 : zzbphVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzedh zzedhVarZza = zzcjzVar.zzd.zza(str3, jSONObject);
                    if (zzedhVarZza != null) {
                        zzfdm zzfdmVar = (zzfdm) zzedhVarZza.zzb;
                        if (!zzfdmVar.zzC() && zzfdmVar.zzB()) {
                            zzfdmVar.zzj(zzcjzVar.zza, (zzeew) zzedhVarZza.zzc, (List) entry.getValue());
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcv e4) {
                    String strI = C1154e9.i("Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk(strI, e4);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi() {
        this.zzf.zzq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(boolean z10) throws IOException, RemoteException {
        try {
            Context context = this.zza;
            zzfrs.zza(context).zzc(z10);
            if (z10) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzk() {
        if (this.zzo) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        Context context = this.zza;
        zzbdc.zza(context);
        com.google.android.gms.ads.internal.zzv.zzp().zzu(context, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zzf();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzel)).booleanValue()) {
            this.zzh.zzf();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjv)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzli)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj.zza(new zzbuq());
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdj)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfds.zzb(this.zza.zza, true);
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeO)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeP)).booleanValue()) {
                zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjz zzcjzVar = this.zza;
                        com.google.android.gms.ads.internal.zzv.zzf().zzd(zzcjzVar.zza, zzcjzVar.zzn);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws JSONException {
        String strZzq;
        Runnable runnable;
        Context context = this.zza;
        zzbdc.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeq)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzr();
                strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(context);
            } catch (RemoteException | RuntimeException e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strZzq = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strZzq) ? str : strZzq;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzej)).booleanValue();
        zzbct zzbctVar = zzbdc.zzbc;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgdm zzgdmVar = zzcad.zzf;
                    final zzcjz zzcjzVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcjz.zzc(zzcjzVar, runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            com.google.android.gms.ads.internal.zzv.zza().zzc(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp, this.zzi.zzq());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        this.zzi.zzh(zzdnVar, zzdva.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
            zzauVar.zzn(str);
            zzauVar.zzo(this.zzb.afmaVersion);
            zzauVar.zzr();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbpo zzbpoVar) throws RemoteException {
        this.zzl.zzf(zzbpoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzp(boolean z10) {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzq(float f10) {
        com.google.android.gms.ads.internal.zzv.zzt().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzr(String str) {
        Context context = this.zza;
        zzbdc.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzej)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zza().zzc(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzq());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs(zzbmi zzbmiVar) throws RemoteException {
        this.zzf.zzs(zzbmiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjG)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(com.google.android.gms.ads.internal.client.zzfx zzfxVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzfxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzv.zzt().zze();
    }

    public final void zzx() {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
            String strZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzi();
            if (com.google.android.gms.ads.internal.zzv.zzu().zzj(this.zza, strZzi, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(false);
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzw("");
        }
    }
}
