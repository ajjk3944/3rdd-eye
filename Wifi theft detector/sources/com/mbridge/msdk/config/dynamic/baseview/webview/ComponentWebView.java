package com.mbridge.msdk.config.dynamic.baseview.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* loaded from: classes3.dex */
public class ComponentWebView extends WebView implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f13985a;

    /* renamed from: b, reason: collision with root package name */
    private b f13986b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.client.a f13987c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13988d;

    /* renamed from: e, reason: collision with root package name */
    private XMLView f13989e;

    /* renamed from: f, reason: collision with root package name */
    private float f13990f;

    /* renamed from: g, reason: collision with root package name */
    private float f13991g;

    /* renamed from: h, reason: collision with root package name */
    private long f13992h;

    /* renamed from: i, reason: collision with root package name */
    private String f13993i;

    public ComponentWebView(@NonNull Context context) {
        super(context);
        this.f13985a = "ComponentWebView";
        this.f13992h = -1L;
        a();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f13988d) {
            return;
        }
        try {
            this.f13988d = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th) {
            q0.b("ComponentWebView", th.getMessage());
        }
    }

    public long getClickTimeStamp() {
        return this.f13992h;
    }

    public float getxInScreen() {
        return this.f13990f;
    }

    public float getyInScreen() {
        return this.f13991g;
    }

    public boolean hasXmlUrl() {
        return !TextUtils.isEmpty(this.f13993i);
    }

    public boolean isDestroyed() {
        return this.f13988d;
    }

    public void loadXMLUrl() {
        if (TextUtils.isEmpty(this.f13993i)) {
            return;
        }
        loadUrl(this.f13993i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13989e = d.a((View) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.f13990f = motionEvent.getRawX();
                this.f13991g = motionEvent.getRawY();
                this.f13992h = System.currentTimeMillis();
            }
        } catch (Exception e10) {
            q0.b("ComponentWebView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: w6.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24834a.a(view);
            }
        });
    }

    public void setWebViewEventListener(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        b bVar = this.f13986b;
        if (bVar != null) {
            bVar.a(aVar);
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar2 = this.f13987c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setXmlUrl(String.valueOf(obj));
            }
        } catch (Exception e10) {
            q0.b("ComponentWebView", "setXmlData异常: " + e10.getMessage());
        }
    }

    public void setXmlUrl(String str) {
        this.f13993i = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }

    private void a() {
        b();
        b bVar = new b();
        this.f13986b = bVar;
        setWebViewClient(bVar);
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar = new com.mbridge.msdk.config.dynamic.baseview.webview.client.a();
        this.f13987c = aVar;
        setWebChromeClient(aVar);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context);
        this.f13985a = "ComponentWebView";
        this.f13992h = -1L;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.f13989e;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.f13989e, view.getTag(), null);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13985a = "ComponentWebView";
        this.f13992h = -1L;
        a();
    }

    @RequiresApi(api = 21)
    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13985a = "ComponentWebView";
        this.f13992h = -1L;
        a();
    }
}
