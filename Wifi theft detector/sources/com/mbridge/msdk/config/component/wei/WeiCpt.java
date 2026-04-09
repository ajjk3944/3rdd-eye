package com.mbridge.msdk.config.component.wei;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

@RequiresApi(api = 23)
/* loaded from: classes3.dex */
public class WeiCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* renamed from: m, reason: collision with root package name */
    ComponentWebView f13767m;

    /* renamed from: n, reason: collision with root package name */
    boolean f13768n;

    /* renamed from: o, reason: collision with root package name */
    boolean f13769o;

    /* renamed from: p, reason: collision with root package name */
    com.mbridge.msdk.config.component.wei.monitor.b f13770p;

    /* renamed from: q, reason: collision with root package name */
    com.mbridge.msdk.config.component.wei.monitor.a f13771q;

    /* renamed from: r, reason: collision with root package name */
    WebMessagePort f13772r;

    /* renamed from: h, reason: collision with root package name */
    final String f13762h = "1100001";

    /* renamed from: i, reason: collision with root package name */
    final String f13763i = "1100002";

    /* renamed from: j, reason: collision with root package name */
    final String f13764j = "1100003";

    /* renamed from: k, reason: collision with root package name */
    final String f13765k = "1100004";

    /* renamed from: l, reason: collision with root package name */
    final String f13766l = "SenderPortKey_";

    /* renamed from: s, reason: collision with root package name */
    HashMap<String, WebMessagePort> f13773s = new HashMap<>();

    /* renamed from: t, reason: collision with root package name */
    ConcurrentLinkedQueue<com.mbridge.msdk.config.component.wei.model.a> f13774t = new ConcurrentLinkedQueue<>();

    public class a implements com.mbridge.msdk.config.dynamic.baseview.webview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageFinished(WebView webView, String str) {
            WeiCpt.this.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f13768n || weiCpt.f13769o) {
                return;
            }
            weiCpt.f13769o = true;
            weiCpt.a(weiCpt.a("905003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeiCpt.this.f13771q.b(webView);
            WeiCpt.this.f13771q.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905002", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f13769o || weiCpt.f13768n) {
                return;
            }
            weiCpt.f13768n = true;
            weiCpt.a("905004", String.valueOf(i10), str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onRenderProcessGone(WebView webView) {
            WeiCpt.this.a("905005", "1100003", "WebView did crash");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.a(StatisticData.ERROR_CODE_NOT_FOUND), "redirect");
            HashMap map2 = new HashMap();
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("url"), str);
            map.put(com.mbridge.msdk.config.component.common.util.c.a("data"), map2);
            HashMap map3 = new HashMap();
            map3.put(com.mbridge.msdk.config.component.common.util.c.a("js_interaction"), map);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905006", map3));
            return false;
        }
    }

    public class b extends WebMessagePort.WebMessageCallback {
        public b() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WeiCpt.this.a(webMessage);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebMessagePort f13777a;

        public c(WebMessagePort webMessagePort) {
            this.f13777a = webMessagePort;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13777a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str) {
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public synchronized void b(Map<String, Object> map) {
        try {
            this.f13092f = "905001";
            com.mbridge.msdk.config.component.wei.model.a aVar = new com.mbridge.msdk.config.component.wei.model.a(map);
            this.f13774t.add(aVar);
            ViewGroup viewGroupE = e();
            if (viewGroupE == null) {
                return;
            }
            if (TextUtils.isEmpty(aVar.h())) {
                this.f13767m = (ComponentWebView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, ComponentWebView.class);
            } else {
                View viewFindViewWithTag = viewGroupE.findViewWithTag(aVar.h());
                if (viewFindViewWithTag instanceof WebView) {
                    this.f13767m = (ComponentWebView) viewFindViewWithTag;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f13767m != null) {
            while (!this.f13774t.isEmpty()) {
                final com.mbridge.msdk.config.component.wei.model.a aVarPoll = this.f13774t.poll();
                if (aVarPoll != null) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.wei.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13779a.a(aVarPoll);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (!TextUtils.isEmpty(aVar.b())) {
            if (com.mbridge.msdk.config.component.common.util.c.a("320").equals(aVar.b())) {
                c(aVar);
                b(aVar);
            } else if (com.mbridge.msdk.config.component.common.util.c.a("322").equals(aVar.b())) {
                this.f13767m.reload();
            } else if (com.mbridge.msdk.config.component.common.util.c.a("319").equals(aVar.b())) {
                if (this.f13767m.getVisibility() != 0) {
                    this.f13767m.setVisibility(0);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.a("325").equals(aVar.b())) {
                this.f13767m.setVisibility(8);
            } else if (com.mbridge.msdk.config.component.common.util.c.a("321").equals(aVar.b())) {
                String strA = com.mbridge.msdk.config.dynamic.baseview.webview.util.a.a(aVar.c());
                if (!TextUtils.isEmpty(strA)) {
                    d(strA);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.a("307").equals(aVar.b())) {
                if (this.f13767m.getParent() != null && (this.f13767m.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f13767m.getParent()).removeView(this.f13767m);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.a("323").equals(aVar.b())) {
                if (this.f13767m.canGoForward()) {
                    this.f13767m.goForward();
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.a("324").equals(aVar.b()) && this.f13767m.canGoBack()) {
                this.f13767m.goBack();
            }
        }
        if (aVar.e() == null || aVar.e().isEmpty()) {
            return;
        }
        a(this.f13767m, aVar.e());
    }

    private void c(com.mbridge.msdk.config.component.wei.model.a aVar) {
        this.f13771q = new com.mbridge.msdk.config.component.wei.monitor.a();
        this.f13770p = new com.mbridge.msdk.config.component.wei.monitor.b(aVar.a());
        this.f13767m.setWebViewEventListener(new a());
        if (aVar.i()) {
            this.f13770p.a(this.f13767m);
        }
    }

    public void d(String str) {
        try {
            ComponentWebView componentWebView = this.f13767m;
            if (componentWebView == null || componentWebView.isDestroyed()) {
                return;
            }
            this.f13767m.evaluateJavascript(str, new ValueCallback() { // from class: com.mbridge.msdk.config.component.wei.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    WeiCpt.c((String) obj);
                }
            });
        } catch (Throwable th) {
            q0.b("WeiCpt", th.getMessage());
        }
    }

    private void b(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (TextUtils.isEmpty(aVar.g()) && TextUtils.isEmpty(aVar.d())) {
            if (this.f13767m.hasXmlUrl()) {
                this.f13767m.loadXMLUrl();
                return;
            } else {
                a("905004", "1100001", "Input parameter error");
                return;
            }
        }
        if (!TextUtils.isEmpty(aVar.g())) {
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                this.f13767m.loadUrl(aVar.g());
                return;
            } else {
                this.f13767m.loadUrl(strF);
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.d())) {
            return;
        }
        this.f13767m.loadDataWithBaseURL("", aVar.d(), "text/html", C.UTF8_NAME, null);
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        String str;
        String strValueOf;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = this.f13087a.get(com.mbridge.msdk.config.component.common.util.c.a("16"));
                str = "";
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.a("116"));
                    Object obj3 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.a("125"));
                    String strValueOf2 = obj2 instanceof String ? String.valueOf(obj2) : "";
                    strValueOf = obj3 instanceof String ? String.valueOf(obj3) : "";
                    str = strValueOf2;
                } else {
                    strValueOf = "";
                }
                Object obj4 = map.get(com.mbridge.msdk.config.component.common.util.c.a("16"));
                if (obj4 instanceof Map) {
                    Object obj5 = ((Map) obj4).get(com.mbridge.msdk.config.component.common.util.c.a("116"));
                    Object obj6 = ((Map) obj4).get(com.mbridge.msdk.config.component.common.util.c.a("125"));
                    if (obj5 instanceof String) {
                        String str2 = (String) obj5;
                        if (!TextUtils.isEmpty(str2)) {
                            return str2.equals(str);
                        }
                    }
                    if (obj6 instanceof String) {
                        String str3 = (String) obj6;
                        return !TextUtils.isEmpty(str3) && str3.hashCode() == strValueOf.hashCode();
                    }
                }
            } catch (Throwable th) {
                q0.b("WeiCpt", th.getMessage(), th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    public void a(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        this.f13772r = webMessagePortArrCreateWebMessageChannel[0];
        webView.postWebMessage(new WebMessage("port_ready", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), Uri.EMPTY);
        this.f13772r.setWebMessageCallback(new b());
    }

    public void a(WebMessage webMessage) {
        if (webMessage == null) {
            return;
        }
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            Map<String, Object> mapA = new e().a(data);
            String strValueOf = String.valueOf(mapA.get(com.mbridge.msdk.config.component.common.util.c.a("action")));
            String str = "SenderPortKey_" + System.currentTimeMillis() + "_" + strValueOf;
            WebMessagePort[] ports = webMessage.getPorts();
            if (ports != null && ports.length > 0) {
                this.f13773s.put(str, ports[0]);
            }
            Map<String, Object> map = new HashMap<>();
            map.put("webview", this.f13767m);
            map.put("superview", this.f13767m.getParent());
            HashMap map2 = new HashMap();
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("action"), strValueOf);
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("reply_name"), str);
            Object obj = mapA.get(com.mbridge.msdk.config.component.common.util.c.a("data"));
            String strA = com.mbridge.msdk.config.component.common.util.c.a("data");
            if (obj == null) {
                obj = "";
            }
            map2.put(strA, obj);
            map2.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "mv");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("js_interaction"), map2);
            map.put(com.mbridge.msdk.config.component.common.util.c.a("click_x"), String.valueOf(this.f13767m.getxInScreen()));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("click_y"), String.valueOf(this.f13767m.getyInScreen()));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("click_time"), String.valueOf(this.f13767m.getClickTimeStamp()));
            a(a("905006", map));
        } catch (Throwable th) {
            q0.b("WeiCpt", th.getMessage(), th);
        }
    }

    @RequiresApi(api = 23)
    public void a(WebView webView, List<Map<String, Object>> list) {
        String strValueOf;
        WebMessage webMessage;
        WebMessagePort webMessagePort;
        for (Map<String, Object> map : list) {
            try {
                strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.a(StatisticData.ERROR_CODE_NOT_FOUND)));
                Map<String, Object> mapA = com.mbridge.msdk.config.component.common.util.c.a(map);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (mapA.containsKey(com.mbridge.msdk.config.component.common.util.c.a("128"))) {
                    try {
                        jSONObject2 = new JSONObject((Map) mapA.get(com.mbridge.msdk.config.component.common.util.c.a("128")));
                    } catch (Exception e10) {
                        q0.b("WeiCpt", e10.getMessage(), e10);
                    }
                }
                jSONObject.put(com.mbridge.msdk.config.component.common.util.c.a("action"), strValueOf);
                jSONObject.put(com.mbridge.msdk.config.component.common.util.c.a("data"), jSONObject2);
                webMessage = new WebMessage(jSONObject.toString());
            } catch (Throwable th) {
                q0.b("WeiCpt", th.getMessage(), th);
            }
            if (this.f13773s.containsKey(strValueOf) && (webMessagePort = this.f13773s.get(strValueOf)) != null) {
                webMessagePort.postMessage(webMessage);
                this.f13773s.remove(strValueOf);
                this.f13767m.postDelayed(new c(webMessagePort), 3000L);
                return;
            } else {
                WebMessagePort webMessagePort2 = this.f13772r;
                if (webMessagePort2 != null) {
                    webMessagePort2.postMessage(webMessage);
                } else {
                    webView.postWebMessage(webMessage, Uri.EMPTY);
                }
            }
        }
    }
}
