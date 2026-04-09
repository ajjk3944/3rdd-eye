package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zf2 extends WebChromeClient {
    public final jg2 a;

    public zf2(jg2 jg2Var) {
        this.a = jg2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof ag2)) {
            return webView.getContext();
        }
        ag2 ag2Var = (ag2) webView;
        Activity activityG = ag2Var.g();
        return activityG != null ? activityG : ag2Var.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        sg2 sg2Var;
        su1 su1Var;
        try {
            jg2 jg2Var = this.a;
            if (jg2Var != null && (sg2Var = jg2Var.f.s) != null && (su1Var = sg2Var.B) != null && su1Var != null && !su1Var.a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                su1Var.b(sb.toString());
                return false;
            }
            lf4 lf4Var = hg4.C.c;
            AlertDialog.Builder builderK = lf4.k(context);
            builderK.setTitle(str2);
            if (!z) {
                builderK.setMessage(str3).setPositiveButton(R.string.ok, new xf2(jsResult, 1)).setNegativeButton(R.string.cancel, new xf2(jsResult, 0)).setOnCancelListener(new uo(2, jsResult)).create().show();
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
            builderK.setView(linearLayout).setPositiveButton(R.string.ok, new qm1(jsPromptResult, editText, 1)).setNegativeButton(R.string.cancel, new k70(5, jsPromptResult)).setOnCancelListener(new uo(3, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException unused) {
            gi2.q0(5);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof ag2)) {
            gi2.i0("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        jh1 jh1VarZ0 = ((ag2) webView).z0();
        if (jh1VarZ0 == null) {
            gi2.i0("Tried to close an AdWebView not associated with an overlay.");
        } else {
            jh1VarZ0.y();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
        ex0.q(sb, "JS: ", strMessage, " (", strSourceId);
        String strK = ga1.k(sb, ":", iLineNumber, ")");
        if (strK.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = yf2.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            gi2.Z(strK);
        } else if (i == 2) {
            gi2.i0(strK);
        } else if (i == 3 || i == 4 || i != 5) {
            gi2.f0(strK);
        } else {
            gi2.U(strK);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        sg2 sg2Var = this.a.f.s;
        if (sg2Var != null) {
            webView2.setWebViewClient(sg2Var);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            lf4 lf4Var = hg4.C.c;
            jg2 jg2Var = this.a;
            boolean z = lf4.c(jg2Var.getContext(), "android.permission.ACCESS_FINE_LOCATION") || lf4.c(jg2Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            iz1 iz1Var = mz1.Yd;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z, true);
            }
            if (((Boolean) tw1Var.c.a(mz1.Zd)).booleanValue()) {
                gi2.U("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        jh1 jh1VarZ0 = this.a.f.z0();
        if (jh1VarZ0 == null) {
            gi2.i0("Could not get ad overlay when hiding custom view.");
        } else {
            jh1VarZ0.r();
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
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        jh1 jh1VarZ0 = this.a.f.z0();
        if (jh1VarZ0 == null) {
            gi2.i0("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = jh1VarZ0.g;
        FrameLayout frameLayout = new FrameLayout(activity);
        jh1VarZ0.m = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        jh1VarZ0.m.addView(view, -1, -1);
        activity.setContentView(jh1VarZ0.m);
        jh1VarZ0.w = true;
        jh1VarZ0.n = customViewCallback;
        jh1VarZ0.l = true;
        jh1VarZ0.I3(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
