package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflf {
    private final zzflq zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzflg zzg;

    private zzflf(zzflq zzflqVar, WebView webView, String str, List list, String str2, String str3, zzflg zzflgVar) {
        this.zza = zzflqVar;
        this.zzb = webView;
        this.zzg = zzflgVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzflf zzb(zzflq zzflqVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfmz.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzflf(zzflqVar, webView, null, null, str, str2, zzflg.HTML);
    }

    public static zzflf zzc(zzflq zzflqVar, WebView webView, String str, String str2) {
        zzfmz.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzflf(zzflqVar, webView, null, null, str, "", zzflg.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzflg zzd() {
        return this.zzg;
    }

    public final zzflq zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
