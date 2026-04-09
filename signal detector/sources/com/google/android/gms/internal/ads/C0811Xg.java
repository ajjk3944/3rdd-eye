package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
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
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lefan.base.activity.PrivacyActivity;
import com.lefan.base.activity.WebUrlActivity;
import h.AbstractActivityC2349g;
import p2.C2771a;
import q2.C2841s;
import s2.BinderC2894d;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811Xg extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12434a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyEvent.Callback f12435b;

    public /* synthetic */ C0811Xg(AbstractActivityC2349g abstractActivityC2349g, int i) {
        this.f12434a = i;
        this.f12435b = abstractActivityC2349g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC0828Yg)) {
            return webView.getContext();
        }
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) webView;
        Activity activityH = interfaceC0828Yg.h();
        return activityH != null ? activityH : interfaceC0828Yg.getContext();
    }

    public boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z6) {
        C1649oh c1649oh;
        C2771a c2771a;
        try {
            C1273hh c1273hh = (C1273hh) this.f12435b;
            if (c1273hh != null && (c1649oh = c1273hh.f14532a.f15228n) != null && (c2771a = c1649oh.f15997K) != null && c2771a != null && !c2771a.a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                c2771a.b(sb.toString());
                return false;
            }
            C2911G c2911g = p2.j.f22785C.f22790c;
            AlertDialog.Builder builderL = C2911G.l(context);
            builderL.setTitle(str2);
            if (!z6) {
                builderL.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0777Vg(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0777Vg(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0760Ug(0, jsResult)).create().show();
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
            builderL.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0667Op(jsPromptResult, 2, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0485Ed(1, jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0760Ug(1, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e6) {
            u2.k.i("Fail to display Dialog.", e6);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        switch (this.f12434a) {
            case 0:
                if (!(webView instanceof InterfaceC0828Yg)) {
                    u2.k.h("Tried to close a WebView that wasn't an AdWebView.");
                    break;
                } else {
                    BinderC2894d binderC2894dX0 = ((InterfaceC0828Yg) webView).x0();
                    if (binderC2894dX0 != null) {
                        binderC2894dX0.z();
                        break;
                    } else {
                        u2.k.h("Tried to close an AdWebView not associated with an overlay.");
                        break;
                    }
                }
            default:
                super.onCloseWindow(webView);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.f12434a) {
            case 0:
                String strMessage = consoleMessage.message();
                String strSourceId = consoleMessage.sourceId();
                int iLineNumber = consoleMessage.lineNumber();
                int length = String.valueOf(strMessage).length();
                StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
                A.f.w(sb, "JS: ", strMessage, " (", strSourceId);
                String strN = A.f.n(sb, ":", iLineNumber, ")");
                if (!strN.contains("Application Cache")) {
                    int i = AbstractC0794Wg.f12247a[consoleMessage.messageLevel().ordinal()];
                    if (i == 1) {
                        u2.k.e(strN);
                    } else if (i == 2) {
                        u2.k.h(strN);
                    } else if (i == 3 || i == 4 || i != 5) {
                        u2.k.g(strN);
                    } else {
                        u2.k.c(strN);
                    }
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
        switch (this.f12434a) {
            case 0:
                WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
                WebView webView2 = new WebView(webView.getContext());
                C1649oh c1649oh = ((C1273hh) this.f12435b).f14532a.f15228n;
                if (c1649oh != null) {
                    webView2.setWebViewClient(c1649oh);
                }
                webViewTransport.setWebView(webView2);
                message.sendToTarget();
                return true;
            default:
                return super.onCreateWindow(webView, z6, z7, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j6, long j7, long j8, WebStorage.QuotaUpdater quotaUpdater) {
        switch (this.f12434a) {
            case 0:
                long j9 = 5242880 - j8;
                if (j9 > 0) {
                    if (j6 == 0) {
                        if (j7 > j9 || j7 > 1048576) {
                            j7 = 0;
                        }
                    } else if (j7 == 0) {
                        j7 = Math.min(Math.min(131072L, j9) + j6, 1048576L);
                    } else {
                        if (j7 <= Math.min(1048576 - j6, j9)) {
                            j6 += j7;
                        }
                        j7 = j6;
                    }
                    quotaUpdater.updateQuota(j7);
                    break;
                } else {
                    quotaUpdater.updateQuota(j6);
                    break;
                }
                break;
            default:
                super.onExceededDatabaseQuota(str, str2, j6, j7, j8, quotaUpdater);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        switch (this.f12434a) {
            case 0:
                if (callback != null) {
                    C1273hh c1273hh = (C1273hh) this.f12435b;
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    boolean z6 = C2911G.d(c1273hh.getContext(), "android.permission.ACCESS_FINE_LOCATION") || C2911G.d(c1273hh.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
                    E9 e9 = H9.ve;
                    C2841s c2841s = C2841s.f23267e;
                    if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                        callback.invoke(str, false, true);
                    } else {
                        callback.invoke(str, z6, true);
                    }
                    if (((Boolean) c2841s.f23270c.a(H9.we)).booleanValue()) {
                        u2.k.c("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                        break;
                    }
                }
                break;
            default:
                super.onGeolocationPermissionsShowPrompt(str, callback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        switch (this.f12434a) {
            case 0:
                BinderC2894d binderC2894dX0 = ((C1273hh) this.f12435b).f14532a.x0();
                if (binderC2894dX0 != null) {
                    binderC2894dX0.s();
                    break;
                } else {
                    u2.k.h("Could not get ad overlay when hiding custom view.");
                    break;
                }
            default:
                super.onHideCustomView();
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f12434a) {
            case 0:
                return a(b(webView), "alert", str, str2, null, jsResult, null, false);
            default:
                return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f12434a) {
            case 0:
                return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
            default:
                return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f12434a) {
            case 0:
                return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
            default:
                return super.onJsConfirm(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        switch (this.f12434a) {
            case 0:
                return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
            default:
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.f12434a) {
            case 1:
                PrivacyActivity privacyActivity = (PrivacyActivity) this.f12435b;
                super.onProgressChanged(webView, i);
                if (Build.VERSION.SDK_INT < 24) {
                    LinearProgressIndicator linearProgressIndicator = privacyActivity.f18765O;
                    if (linearProgressIndicator != null) {
                        linearProgressIndicator.setProgress(i);
                        break;
                    }
                } else {
                    LinearProgressIndicator linearProgressIndicator2 = privacyActivity.f18765O;
                    if (linearProgressIndicator2 != null) {
                        linearProgressIndicator2.setProgress(i, true);
                        break;
                    }
                }
                break;
            case 2:
                WebUrlActivity webUrlActivity = (WebUrlActivity) this.f12435b;
                super.onProgressChanged(webView, i);
                if (Build.VERSION.SDK_INT < 24) {
                    LinearProgressIndicator linearProgressIndicator3 = webUrlActivity.f18777P;
                    if (linearProgressIndicator3 != null) {
                        linearProgressIndicator3.setProgress(i);
                        break;
                    }
                } else {
                    LinearProgressIndicator linearProgressIndicator4 = webUrlActivity.f18777P;
                    if (linearProgressIndicator4 != null) {
                        linearProgressIndicator4.setProgress(i, true);
                        break;
                    }
                }
                break;
            default:
                super.onProgressChanged(webView, i);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        switch (this.f12434a) {
            case 1:
                super.onReceivedTitle(webView, str);
                com.bumptech.glide.d dVarR = ((PrivacyActivity) this.f12435b).r();
                if (dVarR != null) {
                    dVarR.X(str);
                    break;
                }
                break;
            case 2:
                super.onReceivedTitle(webView, str);
                com.bumptech.glide.d dVarR2 = ((WebUrlActivity) this.f12435b).r();
                if (dVarR2 != null) {
                    dVarR2.X(str);
                    break;
                }
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f12434a) {
            case 0:
                BinderC2894d binderC2894dX0 = ((C1273hh) this.f12435b).f14532a.x0();
                if (binderC2894dX0 != null) {
                    Activity activity = binderC2894dX0.f23460b;
                    FrameLayout frameLayout = new FrameLayout(activity);
                    binderC2894dX0.f23466h = frameLayout;
                    frameLayout.setBackgroundColor(-16777216);
                    binderC2894dX0.f23466h.addView(view, -1, -1);
                    activity.setContentView(binderC2894dX0.f23466h);
                    binderC2894dX0.f23453F = true;
                    binderC2894dX0.i = customViewCallback;
                    binderC2894dX0.f23465g = true;
                    binderC2894dX0.S3(i);
                    break;
                } else {
                    u2.k.h("Could not get ad overlay when showing custom view.");
                    customViewCallback.onCustomViewHidden();
                    break;
                }
            default:
                super.onShowCustomView(view, i, customViewCallback);
                break;
        }
    }

    public C0811Xg(C1273hh c1273hh) {
        this.f12434a = 0;
        this.f12435b = c1273hh;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f12434a) {
            case 0:
                onShowCustomView(view, -1, customViewCallback);
                break;
            default:
                super.onShowCustomView(view, customViewCallback);
                break;
        }
    }
}
