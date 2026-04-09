package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcgk {
    private final zzcgl zza;
    private final zzcgj zzb;

    public zzcgk(zzcgl zzcglVar, zzcgj zzcgjVar) {
        this.zzb = zzcgjVar;
        this.zza = zzcglVar;
    }

    public static /* synthetic */ void zza(zzcgk zzcgkVar, String str) {
        Uri uri = Uri.parse(str);
        zzcfm zzcfmVarZzaO = ((zzcgd) zzcgkVar.zzb.zza).zzaO();
        if (zzcfmVarZzaO != null) {
            zzcfmVarZzaO.zzn(uri);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcgl zzcglVar = this.zza;
        zzavs zzavsVarZzI = ((zzcgr) zzcglVar).zzI();
        if (zzavsVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzavn zzavnVarZzc = zzavsVarZzI.zzc();
        if (zzavnVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcglVar.getContext() != null) {
            return zzavnVarZzc.zze(zzcglVar.getContext(), str, ((zzcgt) zzcglVar).zzF(), zzcglVar.zzi());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcgl zzcglVar = this.zza;
        zzavs zzavsVarZzI = ((zzcgr) zzcglVar).zzI();
        if (zzavsVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzavn zzavnVarZzc = zzavsVarZzI.zzc();
        if (zzavnVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcglVar.getContext() != null) {
            return zzavnVarZzc.zzh(zzcglVar.getContext(), ((zzcgt) zzcglVar).zzF(), zzcglVar.zzi());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgi
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgk.zza(this.zza, str);
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL is empty, ignoring message");
        }
    }
}
