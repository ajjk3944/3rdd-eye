package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.List;
import s.C5537a;
import s.f;
import s.i;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzey.zzf().zzp(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzey.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzey.zzf().zzj();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzey.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzey.zzf();
        String[] strArrSplit = TextUtils.split("24.4.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzey.zzf().zzq(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzey.zzf().zzr(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzey.zzf().zzs(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z10) {
        return zzey.zzf().zzz(z10);
    }

    public static i registerCustomTabsSession(Context context, f fVar, String str, C5537a c5537a) {
        zzey.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbyy zzbyyVarZza = zzbuf.zza(context);
        if (zzbyyVarZza == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (i) ObjectWrapper.unwrap(zzbyyVarZza.zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(fVar), str, ObjectWrapper.wrap(c5537a)));
        } catch (RemoteException | IllegalArgumentException e4) {
            zzo.zzh("Unable to register custom tabs session. Error: ", e4);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzey.zzf().zzt(cls);
    }

    public static void registerWebView(WebView webView) {
        zzey.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbyy zzbyyVarZza = zzbuf.zza(webView.getContext());
        if (zzbyyVarZza == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zzbyyVarZza.zzj(ObjectWrapper.wrap(webView));
        } catch (RemoteException e4) {
            zzo.zzh("", e4);
        }
    }

    public static void setAppMuted(boolean z10) {
        zzey.zzf().zzu(z10);
    }

    public static void setAppVolume(float f10) {
        zzey.zzf().zzv(f10);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzey.zzf().zzw(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzey.zzf().zzx(requestConfiguration);
    }

    @Deprecated
    public static void startPreload(Context context, List<PreloadConfiguration> list, PreloadCallback preloadCallback) {
        zzey.zzf().zzh(context, list, preloadCallback);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzey.zzf().zzq(context, null, onInitializationCompleteListener);
    }
}
