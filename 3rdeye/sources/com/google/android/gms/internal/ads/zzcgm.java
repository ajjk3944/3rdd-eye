package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.vungle.ads.internal.g;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzcgm extends zzcfm {
    public zzcgm(zzcfe zzcfeVar, zzbca zzbcaVar, boolean z10, zzecd zzecdVar) {
        super(zzcfeVar, zzbcaVar, z10, new zzbsr(zzcfeVar, zzcfeVar.zzE(), new zzbck(zzcfeVar.getContext())), null, zzecdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzY(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcfe)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfe zzcfeVar = (zzcfe) webView;
        zzbxy zzbxyVar = this.zza;
        if (zzbxyVar != null) {
            zzbxyVar.zze(str, map, 1);
        }
        zzfqj.zza();
        zzfqp zzfqpVar = zzfqp.zza;
        if (!g.AD_MRAID_JS_FILE_NAME.equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return zzc(str, map);
        }
        if (zzcfeVar.zzN() != null) {
            zzcfeVar.zzN().zzI();
        }
        if (zzcfeVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzad);
        } else if (zzcfeVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzac);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzab);
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        return com.google.android.gms.ads.internal.util.zzs.zzy(zzcfeVar.getContext(), zzcfeVar.zzm().afmaVersion, str2);
    }
}
