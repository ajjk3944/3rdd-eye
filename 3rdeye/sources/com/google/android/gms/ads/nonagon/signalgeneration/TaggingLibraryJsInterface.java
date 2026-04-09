package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzgdm;
import g0.C4356c;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzavs zzc;
    private final zzfcs zzd;
    private final int zze;
    private final zzdsh zzf;
    private final boolean zzg;
    private final zzgdm zzh = zzcad.zzf;
    private final zzfjq zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    public TaggingLibraryJsInterface(WebView webView, zzavs zzavsVar, zzdsh zzdshVar, zzfjq zzfjqVar, zzfcs zzfcsVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzavsVar;
        this.zzf = zzdshVar;
        zzbdc.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjP)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjQ)).booleanValue();
        this.zzi = zzfjqVar;
        this.zzd = zzfcsVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    public static /* synthetic */ void zze(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        zzfcs zzfcsVar;
        Uri uriZza = Uri.parse(str);
        try {
            uriZza = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmk)).booleanValue() || (zzfcsVar = taggingLibraryJsInterface.zzd) == null) ? taggingLibraryJsInterface.zzc.zza(uriZza, taggingLibraryJsInterface.zza, taggingLibraryJsInterface.zzb, null) : zzfcsVar.zza(uriZza, taggingLibraryJsInterface.zza, taggingLibraryJsInterface.zzb, null);
        } catch (zzavt e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "TaggingLibraryJsInterface.recordClick");
        }
        taggingLibraryJsInterface.zzi.zzd(uriZza.toString(), null, null, null);
    }

    public static /* synthetic */ void zzf(TaggingLibraryJsInterface taggingLibraryJsInterface, Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzaa zzaaVarZzs = com.google.android.gms.ads.internal.zzv.zzs();
        Context context = taggingLibraryJsInterface.zza;
        CookieManager cookieManagerZza = zzaaVarZzs.zza(context);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(taggingLibraryJsInterface.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            String strZzd = this.zzc.zzc().zzd(this.zza, str, this.zzb);
            if (!this.zzg) {
                return strZzd;
            }
            zzaa.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzd;
        } catch (RuntimeException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            String strH = C4356c.h(i, "Invalid timeout for getting click signals. Timeout=");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(strH);
            return "";
        }
        try {
            return (String) zzcad.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e4 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzr();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbu zzbuVar = new zzbu(this, string);
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbuVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjS)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.zzf(this.zza, bundle, zzbuVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbuVar);
        return string;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            String strZzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (!this.zzg) {
                return strZzh;
            }
            zzaa.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzh;
        } catch (RuntimeException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String strH = C4356c.h(i, "Invalid timeout for getting view signals. Timeout=");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(strH);
            return "";
        }
        try {
            return (String) zzcad.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e4 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjU)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.zze(this.zza, str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) throws JSONException {
        int i;
        int i10;
        int i11;
        float f10;
        int i12;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i10 = jSONObject.getInt("y");
            i11 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            if (i13 != 0) {
                i12 = 1;
                if (i13 != 1) {
                    i12 = 2;
                    if (i13 != 2) {
                        i12 = 3;
                        if (i13 != 3) {
                            i12 = -1;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
        } catch (RuntimeException | JSONException e4) {
            e = e4;
        }
        try {
            this.zzc.zzd(MotionEvent.obtain(0L, i11, i12, i, i10, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e10) {
            e = e10;
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e11) {
            e = e11;
            int i142 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
