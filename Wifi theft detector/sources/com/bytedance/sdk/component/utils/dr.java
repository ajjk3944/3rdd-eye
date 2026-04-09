package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hxp;
import com.bytedance.sdk.component.zz.ycc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dr {
    private static final HashMap<String, emc> emc = new HashMap<>();

    public static com.bytedance.sdk.component.zz.ycc emc(Context context, AttributeSet attributeSet, int i10, ycc.xq xqVar) {
        WebView webViewEmc = emc(context, attributeSet, i10, xqVar, false);
        if (webViewEmc == null) {
            return null;
        }
        com.bytedance.sdk.component.zz.ycc yccVar = new com.bytedance.sdk.component.zz.ycc(context, true, xqVar);
        yccVar.setWebView(webViewEmc);
        yccVar.bw();
        return yccVar;
    }

    public static WebView ypw(Context context, AttributeSet attributeSet, int i10, ycc.xq xqVar) {
        return emc(context, attributeSet, i10, xqVar, true);
    }

    public static void ypw(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        try {
            yccVar.removeAllViews();
            yccVar.uym();
            yccVar.setWebChromeClient(null);
            yccVar.setWebViewClient(null);
            yccVar.setDownloadListener(null);
            yccVar.setJavaScriptEnabled(true);
            yccVar.setCacheMode(-1);
            yccVar.setSupportZoom(false);
            yccVar.setUseWideViewPort(true);
            yccVar.setJavaScriptCanOpenWindowsAutomatically(true);
            yccVar.setDomStorageEnabled(true);
            yccVar.setBuiltInZoomControls(false);
            yccVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            yccVar.setLoadWithOverviewMode(false);
            yccVar.setDefaultTextEncodingName(C.UTF8_NAME);
            yccVar.setDefaultFontSize(16);
            WebView webView = yccVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.zz.bw) {
                ((com.bytedance.sdk.component.zz.bw) webView).emc();
            }
        } catch (Throwable unused) {
        }
    }

    private static WebView emc(Context context, AttributeSet attributeSet, int i10, ycc.xq xqVar, boolean z10) {
        WebView webViewYpw;
        emc emcVar;
        if (xqVar == null || attributeSet != null || i10 != 0 || (emcVar = emc.get(xqVar.sz)) == null) {
            webViewYpw = null;
        } else {
            webViewYpw = emcVar.ypw();
            if (webViewYpw != null) {
                if (webViewYpw instanceof com.bytedance.sdk.component.zz.bw) {
                    ((com.bytedance.sdk.component.zz.bw) webViewYpw).setRecycler(false);
                }
                emc(xqVar, false);
            }
        }
        if (webViewYpw != null || !z10) {
            return webViewYpw;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        emc(xqVar, true);
        return i10 != 0 ? new com.bytedance.sdk.component.zz.bw(context, attributeSet, i10) : new com.bytedance.sdk.component.zz.bw(context, attributeSet);
    }

    public static class emc {
        private final String dg;
        public final HashSet<String> emc = new HashSet<>();
        private final ArrayList<WebView> xq = new ArrayList<>();
        public final int ypw;

        public emc(String str, JSONObject jSONObject) {
            this.dg = str;
            this.ypw = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.emc.add(strOptString);
                    }
                }
            }
        }

        public boolean emc(WebView webView) {
            if (webView != null && this.xq.size() < this.ypw && !this.xq.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.zz.bw) {
                        ((com.bytedance.sdk.component.zz.bw) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.xq.add(webView);
                    return true;
                }
            }
            return false;
        }

        public int xq() {
            return this.xq.size();
        }

        public WebView ypw() {
            if (this.xq.isEmpty()) {
                return null;
            }
            return this.xq.remove(0);
        }

        public HashSet<String> emc() {
            return this.emc;
        }
    }

    private static void emc(final ycc.xq xqVar, final boolean z10) {
        hxp.emc("webview_allocate", new hxp.emc() { // from class: com.bytedance.sdk.component.utils.dr.1
            @Override // com.bytedance.sdk.component.utils.hxp.emc
            public JSONObject emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put("scene", xqVar.sz);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        WebView webView;
        if (yccVar == null || (webView = yccVar.getWebView()) == null) {
            return;
        }
        emc emcVar = emc.get(yccVar.getScene().sz);
        if (emcVar != null && emcVar.emc(webView)) {
            ypw(yccVar);
        } else {
            emc(webView);
        }
    }

    private static void emc(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static boolean ypw(ycc.xq xqVar) {
        return (xqVar == null || emc.get(xqVar.sz) == null) ? false : true;
    }

    public static void emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    emc emcVar = new emc(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = emcVar.emc().iterator();
                    while (it.hasNext()) {
                        emc.put(it.next(), emcVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int emc(ycc.xq xqVar) {
        emc emcVar;
        if (xqVar == null || (emcVar = emc.get(xqVar.sz)) == null) {
            return 0;
        }
        return emcVar.xq();
    }
}
