package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f16219a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f16220b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f16221c;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    public class RunnableC0291a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16222a;

        public RunnableC0291a(Context context) {
            this.f16222a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f16219a == null) {
                try {
                    Boolean unused = a.f16219a = Boolean.valueOf(a.a(this.f16222a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f16219a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVarB;
        try {
            gVarB = h.b().b(c.n().b());
        } catch (Exception unused) {
            gVarB = null;
        }
        if (gVarB != null) {
            f16221c = Boolean.valueOf(gVarB.G0());
        } else {
            f16221c = Boolean.FALSE;
        }
        Boolean bool = f16221c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f16219a == null) {
                try {
                    f16219a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f16219a = Boolean.FALSE;
                }
            }
            if (f16219a == null) {
                f16219a = new Boolean(false);
            }
            return f16219a.booleanValue();
        }
        if (f16219a == null && f16220b == null) {
            f16220b = new Handler(Looper.getMainLooper());
            f16220b.post(new RunnableC0291a(context));
        }
        if (f16219a == null) {
            return true;
        }
        return f16219a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }
}
