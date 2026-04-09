package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: r, reason: collision with root package name */
    private static final String f12990r = "o";

    /* renamed from: a, reason: collision with root package name */
    private int f12991a;

    /* renamed from: b, reason: collision with root package name */
    private int f12992b;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f12994d;

    /* renamed from: e, reason: collision with root package name */
    private f f12995e;

    /* renamed from: f, reason: collision with root package name */
    private String f12996f;

    /* renamed from: g, reason: collision with root package name */
    private String f12997g;

    /* renamed from: h, reason: collision with root package name */
    private WebView f12998h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12999i;

    /* renamed from: j, reason: collision with root package name */
    private String f13000j;

    /* renamed from: k, reason: collision with root package name */
    private int f13001k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13003m;

    /* renamed from: n, reason: collision with root package name */
    boolean f13004n;

    /* renamed from: o, reason: collision with root package name */
    boolean f13005o;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13002l = false;

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f13006p = new d();

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f13007q = new e();

    /* renamed from: c, reason: collision with root package name */
    private Handler f12993c = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13008a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13010c;

        public a(String str, String str2, Context context) {
            this.f13008a = str;
            this.f13009b = str2;
            this.f13010c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f13008a, this.f13009b, this.f13010c, oVar.f12996f);
        }
    }

    public class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13012a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13013b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13014c;

        public b(String str, String str2, Context context) {
            this.f13012a = str;
            this.f13013b = str2;
            this.f13014c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.f13003m) {
                    o.this.f13001k = 0;
                    o.this.f();
                    return;
                }
                o.this.f13005o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f13004n = true;
                }
                synchronized (o.f12990r) {
                    try {
                        o.this.f12996f = str;
                        if (o.this.f12995e == null || !o.this.f12995e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.f13003m = true;
                            o.this.f();
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f12990r) {
                o.this.f13003m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f12995e != null) {
                o.this.f12995e.a(i10, webView.getUrl(), str, o.this.f13000j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f13012a) || TextUtils.isEmpty(this.f13013b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f13014c).a(this.f13013b, this.f13012a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f12990r) {
                    o.this.f13003m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f12995e != null) {
                    o.this.f12995e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f13000j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                q0.b(o.f12990r, th.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.f12990r) {
                try {
                    o oVar = o.this;
                    oVar.f13005o = true;
                    oVar.c();
                    if (o.this.f13003m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f12996f = str;
                    if (o.this.f12995e != null && o.this.f12995e.c(str)) {
                        o.this.f13003m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.f12999i) {
                        HashMap map = new HashMap();
                        if (o.this.f12998h.getUrl() != null) {
                            map.put("Referer", o.this.f12998h.getUrl());
                        }
                        o.this.f12998h.loadUrl(str, map);
                    } else {
                        o.this.f12998h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.f13003m) {
                        o oVar = o.this;
                        if (!oVar.f13005o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f12995e != null) {
                        o.this.f12995e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f13002l = true;
            o.this.f13001k = 1;
            o.this.e();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f13002l = true;
            o.this.f13001k = 2;
            o.this.e();
        }
    }

    public interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f12991a = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        this.f12992b = 3000;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f12994d = gVarD;
        if (gVarD == null) {
            this.f12994d = com.mbridge.msdk.setting.h.b().a();
        }
        this.f12999i = this.f12994d.M0();
        this.f12991a = (int) this.f12994d.s0();
        this.f12992b = (int) this.f12994d.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f12993c.removeCallbacks(this.f13006p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f12993c.removeCallbacks(this.f13007q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f12990r) {
            try {
                try {
                    b();
                    this.f12998h.destroy();
                    f fVar = this.f12995e;
                    if (fVar != null) {
                        fVar.a(this.f12996f, this.f13002l, this.f13000j);
                    }
                } catch (Exception e10) {
                    q0.b(f12990r, e10.getMessage());
                } catch (Throwable th) {
                    q0.b(f12990r, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f12990r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.f12995e;
                        if (fVar != null) {
                            fVar.a(this.f12996f, this.f13002l, this.f13000j);
                        }
                    } catch (Exception e10) {
                        q0.b(f12990r, e10.getMessage());
                    }
                } finally {
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f12993c.postDelayed(this.f13006p, this.f12992b);
    }

    private void j() {
        this.f12993c.postDelayed(this.f13007q, this.f12991a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f12997g = str4;
            this.f12996f = str3;
            this.f12995e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f12996f = str3;
            this.f12995e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f12996f);
        } else {
            this.f12993c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f12997g)) {
                this.f12998h.getSettings().setDefaultTextEncodingName("utf-8");
                this.f12992b = 2000;
                this.f12991a = 2000;
                q0.c(f12990r, this.f12997g);
                this.f12998h.loadDataWithBaseURL(str3, this.f12997g, "*/*", "utf-8", str3);
                return;
            }
            if (this.f12999i) {
                HashMap map = new HashMap();
                if (this.f12998h.getUrl() != null) {
                    map.put("Referer", this.f12998h.getUrl());
                }
                this.f12998h.loadUrl(str3, map);
                return;
            }
            this.f12998h.loadUrl(str3);
        } catch (Throwable th) {
            try {
                f fVar = this.f12995e;
                if (fVar != null) {
                    fVar.a(0, this.f12996f, th.getMessage(), this.f13000j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f12998h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f12998h.getSettings().setCacheMode(2);
        this.f12998h.getSettings().setLoadsImagesAutomatically(false);
        this.f12998h.setWebViewClient(new b(str2, str, context));
        this.f12998h.setWebChromeClient(new c());
    }
}
