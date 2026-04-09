package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzazy implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzazq zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbaa zze;

    public zzazy(zzbaa zzbaaVar, final zzazq zzazqVar, final WebView webView, final boolean z10) {
        this.zzb = zzazqVar;
        this.zzc = webView;
        this.zzd = z10;
        this.zze = zzbaaVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazx
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.zza.zze.zzc(zzazqVar, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
