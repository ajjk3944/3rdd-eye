package t8;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.b;
import androidx.databinding.g;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.i;
import g8.k;
import g8.l;
import g8.s;
import g8.u;
import java.util.Timer;
import java.util.TimerTask;
import l8.g1;
import l8.s0;
import l8.u0;

/* loaded from: classes3.dex */
public class c extends u8.a<g1> implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public String f24434c;

    /* renamed from: d, reason: collision with root package name */
    public k8.b f24435d = new k8.b(getContext());

    /* renamed from: e, reason: collision with root package name */
    public ValueCallback f24436e;

    /* renamed from: f, reason: collision with root package name */
    public ValueCallback f24437f;

    /* renamed from: g, reason: collision with root package name */
    public Timer f24438g;

    /* renamed from: h, reason: collision with root package name */
    public TimerTask f24439h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24440i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24441j;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f24442a;

        public a(boolean z10) {
            this.f24442a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((g1) c.this.f24548a).f23256y.setVisibility(8);
            if (this.f24442a) {
                ((g1) c.this.f24548a).B.setVisibility(0);
                ((g1) c.this.f24548a).f23257z.setVisibility(8);
                c.this.f24441j = false;
            } else {
                ((g1) c.this.f24548a).f23257z.setVisibility(0);
                ((g1) c.this.f24548a).B.setVisibility(8);
                c.this.f24441j = true;
            }
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            c.this.A(false);
        }
    }

    /* renamed from: t8.c$c, reason: collision with other inner class name */
    public class C0485c extends WebChromeClient {

        /* renamed from: t8.c$c$a */
        public class a implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f24446a;

            public a(JsResult jsResult) {
                this.f24446a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f24446a.cancel();
            }
        }

        /* renamed from: t8.c$c$b */
        public class b implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f24448a;

            public b(JsResult jsResult) {
                this.f24448a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f24448a.confirm();
            }
        }

        /* renamed from: t8.c$c$c, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0486c implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsPromptResult f24450a;

            public DialogInterfaceOnClickListenerC0486c(JsPromptResult jsPromptResult) {
                this.f24450a = jsPromptResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f24450a.cancel();
            }
        }

        /* renamed from: t8.c$c$d */
        public class d implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ u0 f24452a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JsPromptResult f24453b;

            public d(u0 u0Var, JsPromptResult jsPromptResult) {
                this.f24452a = u0Var;
                this.f24453b = jsPromptResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f24453b.confirm(this.f24452a.f23338w.getText().toString());
            }
        }

        public C0485c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (c.this.f24549b.isFinishing()) {
                return false;
            }
            c.this.A(true);
            new b.a(c.this.f24549b).o(R.string.confirm).g(str2).l(android.R.string.ok, new b(jsResult)).h(android.R.string.cancel, new a(jsResult)).d(false).a().show();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            u0 u0Var = (u0) g.d(LayoutInflater.from(c.this.f24549b), R.layout.dialog_js_prompt, null, false);
            u0Var.f23338w.setText(str3);
            if (c.this.f24549b.isFinishing()) {
                return false;
            }
            c.this.A(true);
            new b.a(c.this.f24549b).p(str2).q(u0Var.x()).l(android.R.string.ok, new d(u0Var, jsPromptResult)).h(android.R.string.cancel, new DialogInterfaceOnClickListenerC0486c(jsPromptResult)).a().show();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (c.this.f24436e != null) {
                c.this.f24436e.onReceiveValue(null);
            }
            c.this.f24437f = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            if (fileChooserParams == null || fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length <= 0) {
                intent.setType("*/*");
            } else {
                intent.setType(fileChooserParams.getAcceptTypes()[0]);
            }
            c cVar = c.this;
            cVar.startActivityForResult(Intent.createChooser(intent, cVar.getString(R.string.file_chooser)), 1000);
            return true;
        }

        public /* synthetic */ C0485c(c cVar, a aVar) {
            this();
        }
    }

    public class d extends WebViewClient {

        public class a implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ HttpAuthHandler f24456a;

            public a(HttpAuthHandler httpAuthHandler) {
                this.f24456a = httpAuthHandler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f24456a.cancel();
            }
        }

        public class b implements DialogInterface.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s0 f24458a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HttpAuthHandler f24459b;

            public b(s0 s0Var, HttpAuthHandler httpAuthHandler) {
                this.f24458a = s0Var;
                this.f24459b = httpAuthHandler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f24459b.proceed(this.f24458a.f23327x.getText().toString(), this.f24458a.f23326w.getText().toString());
            }
        }

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c.this.A(true);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            k.a("error url : " + webView.getUrl());
            if (webResourceRequest.isForMainFrame()) {
                c.this.A(false);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            try {
                s0 s0Var = (s0) g.d(LayoutInflater.from(c.this.getContext()), R.layout.dialog_js_http_auth, null, false);
                s0Var.f23328y.setText(String.format(c.this.getString(R.string.http_auth_tip), c.this.f24434c));
                s0Var.f23326w.requestFocus();
                if (c.this.f24549b.isFinishing()) {
                    return;
                }
                new b.a(c.this.f24549b).o(R.string.auth_title).q(s0Var.x()).l(R.string.login, new b(s0Var, httpAuthHandler)).h(R.string.cancel, new a(httpAuthHandler)).d(false).a().show();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* synthetic */ d(c cVar, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }
    }

    public final void A(boolean z10) {
        if (this.f24440i) {
            TimerTask timerTask = this.f24439h;
            if (timerTask != null) {
                timerTask.cancel();
            }
            Timer timer = this.f24438g;
            if (timer != null) {
                timer.cancel();
            }
            l.b(new a(z10));
        }
        this.f24440i = false;
    }

    public final String B() {
        return i.a(u.b(getContext()).gateway);
    }

    public final void C() {
        ((g1) this.f24548a).B.getSettings().setJavaScriptEnabled(true);
        ((g1) this.f24548a).B.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        ((g1) this.f24548a).B.getSettings().setSupportZoom(true);
        ((g1) this.f24548a).B.getSettings().setBuiltInZoomControls(true);
        ((g1) this.f24548a).B.getSettings().setDisplayZoomControls(false);
        ((g1) this.f24548a).B.getSettings().setUseWideViewPort(true);
        ((g1) this.f24548a).B.getSettings().setLoadWithOverviewMode(true);
        a aVar = null;
        ((g1) this.f24548a).B.setWebViewClient(new d(this, aVar));
        ((g1) this.f24548a).B.setWebChromeClient(new C0485c(this, aVar));
        ((g1) this.f24548a).B.getSettings().setSaveFormData(true);
        ((g1) this.f24548a).B.getSettings().setUserAgentString("Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1");
    }

    public final void D() {
        if (this.f24440i) {
            return;
        }
        this.f24440i = true;
        ((g1) this.f24548a).f23256y.setVisibility(0);
        ((g1) this.f24548a).f23257z.setVisibility(8);
        TimerTask timerTask = this.f24439h;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f24438g;
        if (timer != null) {
            timer.cancel();
        }
        this.f24438g = new Timer();
        b bVar = new b();
        this.f24439h = bVar;
        this.f24438g.schedule(bVar, 20000L);
    }

    @Override // u8.a
    public int f() {
        return R.layout.fragment_router;
    }

    @Override // u8.a
    public void g(Bundle bundle) {
        C();
        D();
        this.f24434c = "http://" + B();
        k.a("mCurrentUrl : " + this.f24434c);
        ((g1) this.f24548a).B.loadUrl(this.f24434c);
    }

    @Override // u8.a
    public void i() {
        ((g1) this.f24548a).A.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_router_notice) {
            return;
        }
        s.y(this.f24549b);
    }

    public void z() {
        ((g1) this.f24548a).B.destroy();
    }

    @Override // u8.a
    public void h() {
    }
}
