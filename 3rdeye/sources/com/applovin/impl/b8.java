package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl("about:blank");
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void b(WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new C.V(webView, 9));
    }

    public static String c(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static String b(String str, Map map) {
        String str2;
        str.getClass();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    public static String d(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onPreloadEvent", str2, map);
    }

    public static String a(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbD = j6.l.d("javascript:", str, "('", str2, "',");
        sbD.append(jSONObject);
        sbD.append(");");
        return sbD.toString();
    }

    public static void a(WebView webView, String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (webView == null) {
            return;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new C.T(18, webView, str));
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Unable to forward to WebView", th);
            }
            kVar.E().a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new D(1, webView, str));
    }
}
