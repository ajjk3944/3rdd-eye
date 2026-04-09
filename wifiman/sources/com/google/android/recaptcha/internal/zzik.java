package com.google.android.recaptcha.internal;

import Yg.InterfaceC3661e;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class zzik extends WebViewClient {
    final /* synthetic */ zzja zza;

    zzik(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        long jZza = this.zza.zzh.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbk.zza;
        zzbk.zza(zzbl.zzg.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC3661e
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        zzbb zzbbVar = zzbb.zzc;
        zzba zzbaVar = (zzba) this.zza.zzd.get(Integer.valueOf(i10));
        if (zzbaVar == null) {
            zzbaVar = zzba.zzM;
        }
        zzbd zzbdVar = new zzbd(zzbbVar, zzbaVar, null);
        this.zza.zzA().hashCode();
        zzbdVar.getMessage();
        this.zza.zzA().a(zzbdVar);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC3661e
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzja zzjaVar = this.zza;
        Uri uri = Uri.parse(str);
        zzja.zzp(zzjaVar);
        AbstractC6492s.f(uri);
        if (!zzfk.zzc(uri) || zzja.zzp(this.zza).zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzQ, null);
        this.zza.zzA().hashCode();
        uri.toString();
        this.zza.zzA().a(zzbdVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
