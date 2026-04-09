package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends WebView {
    private boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private lh f7419le;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7420lh;
    public long ouw;
    private final HashSet<String> vt;
    private boolean yu;

    public fkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.vt = new HashSet<>();
        this.ouw = System.currentTimeMillis();
        ko.vt("TTAD.PangleWebView", "init: ");
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new le.ouw());
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        ko.vt("TTAD.PangleWebView", "addJavascriptInterface: " + str + ", " + this);
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        } else {
            super.addJavascriptInterface(obj, str);
            this.vt.add(str);
        }
    }

    @Override // android.webkit.WebView
    public final void clearCache(boolean z3) {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        } else {
            super.clearCache(z3);
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ko.vt("TTAD.PangleWebView", "destroy() called, ".concat(String.valueOf(this)));
        if (this.f7420lh) {
            return;
        }
        this.f7420lh = true;
        super.destroy();
    }

    @Override // android.webkit.WebView
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f7420lh && !this.fkw) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            ko.fkw("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        } else {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView
    public final void goBackOrForward(int i4) {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        } else {
            super.goBackOrForward(i4);
        }
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        } else {
            super.goForward();
        }
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
            ko.lh("TTAD.PangleWebView", "loadUrl: ", e2);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ko.vt("TTAD.PangleWebView", "onAttachedToWindow: ".concat(String.valueOf(this)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ko.vt("TTAD.PangleWebView", "onDetachedFromWindow: ".concat(String.valueOf(this)));
        if (this.yu) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f7420lh || this.fkw) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        if (this.f7420lh || this.fkw) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i4, i10);
        }
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "onPause: has destroyed or recycler");
            return;
        }
        try {
            super.onPause();
        } catch (Exception e2) {
            ko.lh("TTAD.PangleWebView", "onPause: ", e2);
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "onResume: has destroyed or recycler");
            return;
        }
        try {
            super.onResume();
        } catch (Exception e2) {
            ko.lh("TTAD.PangleWebView", "onResume: ", e2);
        }
    }

    @Override // android.webkit.WebView
    public final void pauseTimers() {
        ko.vt("TTAD.PangleWebView", "pauseTimers: ");
        if (this.f7420lh || this.fkw) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public final void reload() {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "reload: has destroyed or recycler");
        } else {
            super.reload();
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (this.f7420lh || this.fkw) {
            ko.vt("TTAD.PangleWebView", "removeJavascriptInterface: has destroyed or recycler, name=".concat(String.valueOf(str)));
        } else {
            super.removeJavascriptInterface(str);
            this.vt.remove(str);
        }
    }

    @Override // android.webkit.WebView
    public final void resumeTimers() {
        ko.vt("TTAD.PangleWebView", "resumeTimers: ");
        if (this.f7420lh || this.fkw) {
            return;
        }
        super.resumeTimers();
    }

    public final void setDestroyOnDetached(boolean z3) {
        ko.vt("TTAD.PangleWebView", "setDestroyOnDetached() called with: destroyOnDetached = [" + z3 + "]");
        this.yu = z3;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (this.f7419le == null) {
            ko.vt("arbitrage_click", "mTouchListenerProxy == null");
            super.setOnTouchListener(onTouchListener);
        } else {
            ko.vt("arbitrage_click", "mTouchListenerProxy != null");
            this.f7419le.ouw(onTouchListener);
            super.setOnTouchListener(this.f7419le);
        }
    }

    public final void setRecycler(boolean z3) {
        this.fkw = z3;
    }

    public final void setTouchListenerProxy(lh lhVar) {
        this.f7419le = lhVar;
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (this.f7420lh || this.fkw) {
            ko.fkw("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            ko.lh("TTAD.PangleWebView", "stopLoading: ", e2);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        if (!this.f7420lh && !this.fkw) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                ko.lh("TTAD.PangleWebView", "loadUrl: ", e2);
                return;
            }
        }
        ko.fkw("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
