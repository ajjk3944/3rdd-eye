package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzfst;
import com.google.android.gms.internal.ads.zzfsu;
import com.google.android.gms.internal.ads.zzfsv;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftr;
import com.google.android.gms.internal.ads.zzfts;
import com.google.android.gms.internal.ads.zzftt;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzfuh;
import com.vungle.ads.internal.presenter.g;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzz {
    private zzfts zzf;
    private zzcfe zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfsv zzd = null;
    private String zzb = null;

    public static /* synthetic */ void zza(zzz zzzVar, String str, Map map) {
        zzcfe zzcfeVar = zzzVar.zzc;
        if (zzcfeVar != null) {
            zzcfeVar.zzd(str, map);
        }
    }

    private final zzftu zzl() {
        zzftt zzfttVarZzc = zzftu.zzc();
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzlK)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfttVarZzc.zzb(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfttVarZzc.zza(this.zzb);
        }
        return zzfttVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zzb(zzcfe zzcfeVar, Context context) {
        this.zzc = zzcfeVar;
        if (!zzk(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zzf("on_play_store_bind", map);
    }

    public final void zzc() {
        zzfsv zzfsvVar;
        if (!this.zze || (zzfsvVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfsvVar.zza(zzl(), this.zzf);
            zze("onLMDOverlayCollapse");
        }
    }

    public final void zzd() {
        zzfsv zzfsvVar;
        if (!this.zze || (zzfsvVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfst zzfstVarZzc = zzfsu.zzc();
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzlK)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfstVarZzc.zzb(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfstVarZzc.zza(this.zzb);
        }
        zzfsvVar.zzb(zzfstVarZzc.zzc(), this.zzf);
    }

    public final void zze(String str) {
        zzf(str, new HashMap());
    }

    public final void zzf(final String str, final Map map) {
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzz.zza(this.zza, str, map);
            }
        });
    }

    public final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzf("onError", map);
        }
    }

    public final void zzh() {
        zzfsv zzfsvVar;
        if (!this.zze || (zzfsvVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfsvVar.zzc(zzl(), this.zzf);
            zze("onLMDOverlayExpand");
        }
    }

    public final void zzi(zzftr zzftrVar) {
        if (!TextUtils.isEmpty(zzftrVar.zzb())) {
            if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzlK)).booleanValue()) {
                this.zza = zzftrVar.zzb();
            }
        }
        switch (zzftrVar.zza()) {
            case 8152:
                zze("onLMDOverlayOpened");
                break;
            case 8153:
                zze("onLMDOverlayClicked");
                break;
            case 8155:
                zze("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(g.ERROR, String.valueOf(zzftrVar.zza()));
                zzf("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(zzcfe zzcfeVar, zzftp zzftpVar) {
        if (zzcfeVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfeVar;
        if (!this.zze && !zzk(zzcfeVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlK)).booleanValue()) {
            this.zzb = zzftpVar.zzh();
        }
        zzm();
        zzfsv zzfsvVar = this.zzd;
        if (zzfsvVar != null) {
            zzfsvVar.zzd(zzftpVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfuh.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfsw.zza(context);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
