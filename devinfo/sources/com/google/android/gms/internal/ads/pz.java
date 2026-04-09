package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pz extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final b00 f15155a;

    public pz(b00 b00Var) {
        this.f15155a = b00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof qz)) {
            return webView.getContext();
        }
        qz qzVar = (qz) webView;
        Activity activityA1 = qzVar.A1();
        return activityA1 != null ? activityA1 : qzVar.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z3) {
        i00 i00Var;
        ua.a aVar;
        try {
            b00 b00Var = this.f15155a;
            if (b00Var != null && (i00Var = b00Var.f9521a.f10645n) != null && (aVar = i00Var.f12101w) != null && aVar != null && !aVar.a()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb2.append("window.");
                sb2.append(str);
                sb2.append("('");
                sb2.append(str3);
                sb2.append("')");
                aVar.b(sb2.toString());
                return false;
            }
            ya.f0 f0Var = ua.j.C.f35261c;
            AlertDialog.Builder builderL = ya.f0.l(context);
            builderL.setTitle(str2);
            if (!z3) {
                builderL.setMessage(str3).setPositiveButton(R.string.ok, new nz(jsResult, 1)).setNegativeButton(R.string.cancel, new nz(jsResult, 0)).setOnCancelListener(new mz(0, jsResult)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderL.setView(linearLayout).setPositiveButton(R.string.ok, new nh0(2, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new us(1, jsPromptResult)).setOnCancelListener(new mz(1, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e2) {
            za.i.i("Fail to display Dialog.", e2);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof qz)) {
            za.i.h("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        xa.i iVarK0 = ((qz) webView).k0();
        if (iVarK0 == null) {
            za.i.h("Tried to close an AdWebView not associated with an overlay.");
        } else {
            iVarK0.m();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb2 = new StringBuilder(je.u.l(length + 6 + String.valueOf(strSourceId).length(), 1, String.valueOf(iLineNumber).length(), 1));
        je.u.B(sb2, "JS: ", strMessage, " (", strSourceId);
        String strV = je.u.v(sb2, ":", iLineNumber, ")");
        if (strV.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i4 = oz.f14816a[consoleMessage.messageLevel().ordinal()];
        if (i4 == 1) {
            za.i.e(strV);
        } else if (i4 == 2) {
            za.i.h(strV);
        } else if (i4 == 3 || i4 == 4 || i4 != 5) {
            za.i.g(strV);
        } else {
            za.i.c(strV);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        i00 i00Var = this.f15155a.f9521a.f10645n;
        if (i00Var != null) {
            webView2.setWebViewClient(i00Var);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        long j10 = 5242880 - j9;
        if (j10 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j8 > j10 || j8 > 1048576) {
                j8 = 0;
            }
        } else if (j8 == 0) {
            j8 = Math.min(Math.min(131072L, j10) + j, 1048576L);
        } else {
            if (j8 <= Math.min(1048576 - j, j10)) {
                j += j8;
            }
            j8 = j;
        }
        quotaUpdater.updateQuota(j8);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            ya.f0 f0Var = ua.j.C.f35261c;
            b00 b00Var = this.f15155a;
            boolean z3 = ya.f0.d(b00Var.getContext(), "android.permission.ACCESS_FINE_LOCATION") || ya.f0.d(b00Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            pk pkVar = sk.f16408xe;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z3, true);
            }
            if (((Boolean) sVar.f36166c.a(sk.f16425ye)).booleanValue()) {
                za.i.c("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        xa.i iVarK0 = this.f15155a.f9521a.k0();
        if (iVarK0 == null) {
            za.i.h("Could not get ad overlay when hiding custom view.");
        } else {
            iVarK0.h();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
        xa.i iVarK0 = this.f15155a.f9521a.k0();
        if (iVarK0 == null) {
            za.i.h("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = iVarK0.f37044b;
        FrameLayout frameLayout = new FrameLayout(activity);
        iVarK0.f37049h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        iVarK0.f37049h.addView(view, -1, -1);
        activity.setContentView(iVarK0.f37049h);
        iVarK0.f37058r = true;
        iVarK0.f37050i = customViewCallback;
        iVarK0.g = true;
        iVarK0.p4(i4);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
