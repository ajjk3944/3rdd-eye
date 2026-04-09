package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: a, reason: collision with root package name */
    private int f16157a;

    /* renamed from: b, reason: collision with root package name */
    private int f16158b;

    /* renamed from: c, reason: collision with root package name */
    protected ToolBar f16159c;

    /* renamed from: d, reason: collision with root package name */
    protected ToolBar f16160d;

    /* renamed from: e, reason: collision with root package name */
    protected ProgressBar f16161e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f16162f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f16163g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f16164h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f16165i;

    /* renamed from: j, reason: collision with root package name */
    protected BaseWebView f16166j;

    /* renamed from: k, reason: collision with root package name */
    private View.OnClickListener f16167k;

    /* renamed from: l, reason: collision with root package name */
    private View.OnClickListener f16168l;

    /* renamed from: m, reason: collision with root package name */
    private View.OnClickListener f16169m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f16170n;

    /* renamed from: o, reason: collision with root package name */
    private Handler f16171o;

    /* renamed from: p, reason: collision with root package name */
    private int f16172p;

    /* renamed from: q, reason: collision with root package name */
    private WebViewClient f16173q;

    /* renamed from: r, reason: collision with root package name */
    private String f16174r;

    /* renamed from: s, reason: collision with root package name */
    private i f16175s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16176t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f16177u;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f16172p + "ms");
            if (CommonWebView.this.f16175s != null) {
                CommonWebView.this.f16176t = false;
                CommonWebView.this.f16175s.a(CommonWebView.this.f16174r);
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f16161e.setVisible(true);
            CommonWebView.this.f16161e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th) {
                    q0.b("CommonWebView", th.getMessage());
                }
            }
            return true;
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f16161e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f16161e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f16166j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f16160d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f16166j.canGoBack()) {
                        CommonWebView.this.f16166j.goBack();
                    }
                    CommonWebView.this.f16160d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f16166j.canGoBack());
                    if (CommonWebView.this.f16167k != null) {
                        CommonWebView.this.f16167k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f16160d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f16166j.canGoForward()) {
                        CommonWebView.this.f16166j.goForward();
                    }
                    CommonWebView.this.f16160d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f16166j.canGoForward());
                    if (CommonWebView.this.f16168l != null) {
                        CommonWebView.this.f16168l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f16160d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f16166j.canGoBack());
                    CommonWebView.this.f16160d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f16166j.canGoForward());
                    CommonWebView.this.f16166j.reload();
                    if (CommonWebView.this.f16169m != null) {
                        CommonWebView.this.f16169m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f16163g != null) {
                        CommonWebView.this.f16163g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f16170n != null) {
                        CommonWebView.this.f16170n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f16166j.getUrl());
                }
            }
        }
    }

    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f16160d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f16160d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f16176t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f16174r = str;
            if (CommonWebView.this.f16176t) {
                return;
            }
            CommonWebView.this.f16176t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f16176t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f16174r = str;
            if (CommonWebView.this.f16176t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f16176t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16177u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f16165i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f16164h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f16159c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f16160d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f16166j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f16166j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f16159c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f16160d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f16159c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f16162f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f16162f, layoutParams);
        this.f16157a = v0.a(getContext(), 40.0f);
        this.f16158b = v0.a(getContext(), 40.0f);
        this.f16164h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f16165i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f16166j == null) {
                this.f16166j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f16166j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f16166j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f16164h);
            this.f16166j.setWebChromeClient(this.f16165i);
            addWebViewClient(bVar);
        } catch (Throwable th) {
            q0.b("CommonWebView", "webview is error", th);
        }
        this.f16162f.addView(this.f16166j);
    }

    public void loadUrl(String str) {
        this.f16166j.loadUrl(str);
        if (this.f16173q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f16167k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f16168l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f16170n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f16169m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f16165i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f16164h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f16159c.getParent()).removeView(this.f16159c);
        this.f16162f.addView(this.f16159c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f16159c.getParent()).removeView(this.f16159c);
        addView(this.f16159c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f16163g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f16172p = i10;
        if (this.f16171o == null) {
            this.f16171o = new Handler(Looper.getMainLooper());
        }
        if (this.f16173q == null) {
            g gVar = new g();
            this.f16173q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f16175s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f16159c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f16159c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f16160d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f16159c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() throws Resources.NotFoundException {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f16161e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f16161e);
        this.f16161e.initResource(true);
    }

    private void b() {
        if (this.f16160d != null) {
            return;
        }
        this.f16160d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f16158b);
        layoutParams.bottomMargin = 0;
        this.f16160d.setLayoutParams(layoutParams);
        this.f16160d.setBackgroundColor(-1);
        this.f16160d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f16160d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f16171o.postDelayed(this.f16177u, this.f16172p);
    }

    public void setToolBarTitle(String str) {
        this.f16159c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16177u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f16159c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f16159c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f16157a);
            layoutParams.addRule(10);
            this.f16159c.setLayoutParams(layoutParams);
            this.f16162f.addView(this.f16159c);
            return;
        }
        this.f16159c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f16157a));
        addView(this.f16159c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f16177u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            q0.b("CommonWebView", th.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.getScheme().equals("http") && !uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    uri2.setFlags(268435456);
                    getContext().startActivity(uri2);
                    return true;
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                } catch (Throwable th3) {
                    q0.b("CommonWebView", th3.getMessage());
                }
                q0.b("CommonWebView", th.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                q0.b("CommonWebView", "openDeepLink");
                return true;
            }
            if (!TextUtils.isEmpty(str)) {
                return !(str.startsWith("http") || str.startsWith(HttpRequest.DEFAULT_SCHEME));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f16171o.removeCallbacks(this.f16177u);
    }
}
