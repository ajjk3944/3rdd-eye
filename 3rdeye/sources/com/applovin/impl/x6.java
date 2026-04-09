package com.applovin.impl;

import N7.C1154e9;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x6 {

    public class a extends AbstractC2108b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f21739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f21740c;

        public a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
            this.f21738a = str;
            this.f21739b = aVar;
            this.f21740c = kVar;
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f21738a, null);
                l2.c(this.f21739b.e(), this.f21739b.g(), this.f21739b.i());
            }
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                l2.a(this.f21739b.e(), this.f21739b.g(), this.f21739b.i());
                this.f21740c.e().b(this);
            }
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        return b(uri, null, context, kVar);
    }

    public static void c(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String strEmptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter(com.vungle.ads.internal.presenter.g.ERROR));
        String strEmptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String strEmptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, strEmptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", strEmptyIfNull2, mapHashMap);
        CollectionUtils.putStringIfValid("details", strEmptyIfNull3, mapHashMap);
        if (bVar != null) {
            mapHashMap.putAll(a2.a((AppLovinAdImpl) bVar));
            mapHashMap.putAll(a2.a(bVar));
        }
        kVar.E().d(y1.f21760D0, mapHashMap);
    }

    public static boolean a(Uri uri, String str, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        boolean z10 = false;
        String strDefaultIfEmpty = null;
        if (uri == null) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return false;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            strDefaultIfEmpty = StringUtils.defaultIfEmpty(str, a(intent, uri, bVar, context));
            intent.setPackage(strDefaultIfEmpty);
            kVar.m0().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ImagesContract.URL, uri.toString());
            mapHashMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, strDefaultIfEmpty);
            if (bVar != null) {
                mapHashMap.putAll(a2.a((AppLovinAdImpl) bVar));
                mapHashMap.putAll(a2.a(bVar));
            }
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) kVar.B().L().get("ps_version"), mapHashMap);
            }
            kVar.E().a("UriUtils", Constants.PREF_CSI_REFERRER_KEY, th, mapHashMap);
        }
        if (!z10) {
            kVar.m0().resumeForClick();
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent(z10 ? "com.applovin.external_redirect_success" : "com.applovin.external_redirect_failure"), CollectionUtils.map(ImagesContract.URL, uri));
        return z10;
    }

    public static boolean b(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        return a(uri, null, bVar, context, kVar);
    }

    public static boolean b(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void b(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter(ImagesContract.URL);
        if (!StringUtils.isValidString(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find resource URL to preload from query parameters");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), CollectionUtils.map(com.vungle.ads.internal.presenter.g.ERROR, "Invalid URL"));
            return;
        }
        if (bVar == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Cannot preload resource: ad is null");
            }
            Map map = CollectionUtils.map(com.vungle.ads.internal.presenter.g.ERROR, "Invalid ad reference");
            map.put("resource_url", queryParameter);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            C1154e9.m("Attempting to preload resource: ", queryParameter, kVar.O(), "UriUtils");
        }
        kVar.q0().a((w4) new f6(kVar, false, "preloadResource", new Z.e(kVar, queryParameter, bVar, 5)), r5.b.CACHING);
    }

    private static String a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (!"market".equals(intent.getScheme()) && !"play.google.com".equals(uri.getHost())) {
            if ("https".equals(intent.getScheme()) && bVar != null) {
                if (bVar.l1()) {
                    String strG = com.applovin.impl.sdk.l.G();
                    if (a(strG, context)) {
                        return strG;
                    }
                }
                for (String str : bVar.X()) {
                    if (a(str, context)) {
                        return str;
                    }
                }
            }
            return null;
        }
        if (Boolean.FALSE.equals(a(context))) {
            return "com.android.vending";
        }
        return null;
    }

    private static boolean a(String str, Context context) {
        return (TextUtils.isEmpty(str) || context.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        com.applovin.impl.adview.b bVarF = aVar.f();
        String queryParameter = uri.getQueryParameter("n");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find url to load from query in original uri");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return;
        }
        o4 o4VarP0 = kVar.p0();
        n4 n4Var = n4.f20569N;
        String str = (String) o4VarP0.a(n4Var, null);
        if (uri.getQueryParameterNames().contains("browser")) {
            String queryParameter2 = uri.getQueryParameter("browser");
            String str2 = TextUtils.isEmpty(queryParameter2) ? null : queryParameter2;
            if (Boolean.parseBoolean(uri.getQueryParameter("retain_browser"))) {
                kVar.p0().b(n4Var, str2);
            }
            str = str2;
        }
        String queryParameter3 = uri.getQueryParameter("load_type");
        if ("external".equalsIgnoreCase(queryParameter3)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Loading new page externally: ", queryParameter, kVar.O(), "UriUtils");
            }
            a(queryParameter, str, aVar, kVar);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter3)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Loading new page in WebView: ", queryParameter, kVar.O(), "UriUtils");
            }
            bVarF.loadUrl(queryParameter);
            String queryParameter4 = uri.getQueryParameter(AppIntroBaseFragmentKt.ARG_BG_COLOR);
            if (StringUtils.isValidString(queryParameter4)) {
                bVarF.setBackgroundColor(Color.parseColor(queryParameter4));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter3)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Loading new page in slide-up webview: ", queryParameter, kVar.O(), "UriUtils");
            }
            kVar.e().a(new a(queryParameter, aVar, kVar));
            Intent intent = new Intent(com.applovin.impl.sdk.k.o(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.i0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.k.o().startActivity(intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter3)) {
            aVar.a(aVar.g(), aVar.i(), (Uri) null, bVarF.getAndClearLastClickEvent(), (Bundle) null);
            if (aVar.h() != null) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    C1154e9.m("Loading new page in Custom Tabs: ", queryParameter, kVar.O(), "UriUtils");
                }
                kVar.A().a(queryParameter, aVar, kVar.u0());
                return;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Custom Tabs not supported, loading new page externally: ", queryParameter, kVar.O(), "UriUtils");
            }
            a(queryParameter, str, aVar, kVar);
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            kVar.e0().e(com.applovin.impl.sdk.network.d.b().d(StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    public static Bundle a(Uri uri) {
        Bundle bundle = new Bundle();
        for (String str : uri.getQueryParameterNames()) {
            bundle.putString(str, uri.getQueryParameter(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar, String str, com.applovin.impl.sdk.ad.b bVar) {
        try {
            com.applovin.impl.sdk.m mVarH = kVar.H();
            Context contextO = com.applovin.impl.sdk.k.o();
            String strA = mVarH.a(com.applovin.impl.sdk.k.o(), str, bVar.getCachePrefix(), bVar.c0(), true, mVarH.a(str, bVar), bVar.i0(), a2.a((AppLovinAdImpl) bVar));
            if (strA != null) {
                String string = Uri.fromFile(mVarH.a(strA, contextO)).toString();
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Successfully cached resource at: " + string);
                }
                Map map = CollectionUtils.map("resource_url", str);
                map.put("cached_url", string);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_success"), map);
                return;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().k("UriUtils", "Failed to cache resource: " + str);
            }
            Map map2 = CollectionUtils.map(com.vungle.ads.internal.presenter.g.ERROR, "Failed to cache resource");
            map2.put("resource_url", str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map2);
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Exception while caching resource", th);
            }
            Map map3 = CollectionUtils.map(ImagesContract.URL, str);
            map3.putAll(a2.a((AppLovinAdImpl) bVar));
            map3.putAll(a2.a(bVar));
            kVar.E().a("UriUtils", "handlePreload", th, map3);
            Map map4 = CollectionUtils.map(com.vungle.ads.internal.presenter.g.ERROR, "Internal error while caching");
            map4.put("resource_url", str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map4);
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar) {
        Uri uri2;
        com.applovin.impl.sdk.ad.b bVar2;
        com.applovin.impl.sdk.k kVar2;
        Throwable th;
        w6 w6Var = new w6();
        Context contextA = a(uri.getQueryParameter("context_source"), appLovinAdView, kVar);
        Intent intent = null;
        try {
            w6Var.f(uri.getQueryParameter("identifier")).d(uri.getQueryParameter("action")).a(uri.getQueryParameter("data"), uri.getQueryParameter("type")).b(uri.getQueryParameter("flags")).e(uri.getQueryParameter("extras")).a(uri.getQueryParameter("categories")).a(uri.getQueryParameter("clip_data_uri"), uri.getQueryParameter("clip_data_mime_type"), uri.getQueryParameter("clip_data_label")).h(uri.getQueryParameter("source_bounds")).b(uri.getQueryParameter("component"), uri.getQueryParameter("class_name"), uri.getQueryParameter("package")).g(uri.getQueryParameter("selector_action"));
            if (!(contextA instanceof Activity)) {
                w6Var.b(String.valueOf(268435456));
            }
            Intent intentC = Boolean.parseBoolean(uri.getQueryParameter("use_chooser")) ? w6Var.c(uri.getQueryParameter("chooser_title")) : w6Var.a();
            try {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Attempting to launch intent with configuration:\n" + a(intentC));
                }
                if (intentC.resolveActivity(contextA.getPackageManager()) != null) {
                    contextA.startActivity(intentC);
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("UriUtils", "Successfully launched intent");
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_success"), null);
                    kVar.g().d(y1.f21769L, a(intentC, uri, bVar));
                    return;
                }
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("UriUtils", "No activity found to handle the intent");
                }
                uri2 = uri;
                bVar2 = bVar;
                kVar2 = kVar;
                try {
                    a("noActivityToHandleIntent", null, uri2, a(intentC, uri, bVar), bVar2, contextA, kVar2);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    intent = intentC;
                    kVar2.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar2.O().a("UriUtils", "Exception while launching intent", th);
                    }
                    a("intentLaunchException", th, uri2, a(intent, uri2, bVar2), bVar2, contextA, kVar2);
                }
            } catch (Throwable th3) {
                th = th3;
                uri2 = uri;
                bVar2 = bVar;
                kVar2 = kVar;
            }
        } catch (Throwable th4) {
            uri2 = uri;
            bVar2 = bVar;
            kVar2 = kVar;
            th = th4;
        }
    }

    private static Context a(String str, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar) {
        if ("application".equalsIgnoreCase(str)) {
            return com.applovin.impl.sdk.k.o();
        }
        if ("activity".equalsIgnoreCase(str)) {
            Activity activityB = r7.b(appLovinAdView, kVar);
            if (activityB != null) {
                return activityB;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().k("UriUtils", "Could not retrieve the activity context. Falling back to view context.");
            }
        }
        return appLovinAdView.getContext();
    }

    private static void a(String str, Throwable th, Uri uri, Map map, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_failure"), null);
        HashMap map2 = new HashMap(map);
        if (th != null) {
            kVar.E().a("UriUtils", "launchCustomIntent", th, map);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
        }
        CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, str, map2);
        kVar.g().d(y1.f21770M, map2);
        a(uri, bVar, context, kVar);
    }

    private static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("fallback_url");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find fallback URL to open from query parameters");
                return;
            }
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            C1154e9.m("Opening fallback URL: ", queryParameter, kVar.O(), "UriUtils");
        }
        b(Uri.parse(queryParameter), bVar, context, kVar);
    }

    private static Map a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar) {
        Map mapA = a2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid(ImagesContract.URL, uri.toString(), mapA);
        CollectionUtils.putStringIfValid("details", a(intent), mapA);
        return mapA;
    }

    private static String a(Intent intent) {
        if (intent == null) {
            return "Intent not available";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb = new StringBuilder("Identifier: ");
        sb.append(AbstractC2128k0.i() ? intent.getIdentifier() : null);
        sb.append("\nAction: ");
        sb.append(intent.getAction());
        sb.append("\nData: ");
        sb.append(intent.getData());
        sb.append("\nType: ");
        sb.append(intent.getType());
        sb.append("\nFlags: ");
        sb.append(intent.getFlags());
        sb.append("\nExtras: ");
        sb.append(intent.getExtras());
        sb.append("\nCategories: ");
        sb.append(intent.getCategories());
        sb.append("\nClipData: ");
        sb.append(intent.getClipData());
        sb.append("\nSourceBounds: ");
        sb.append(intent.getSourceBounds());
        sb.append("\nComponent: ");
        sb.append(component != null ? component.flattenToString() : intent.getPackage());
        sb.append("\nSelector: ");
        sb.append(intent.getSelector());
        return sb.toString();
    }

    private static void a(String str, String str2, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        a(Uri.parse(str), str2, aVar.g(), aVar.f().getContext(), kVar);
        l2.b(aVar.e(), aVar.g(), aVar.i());
    }

    public static Boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
