package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* renamed from: h, reason: collision with root package name */
    private static String f17305h = "SplashSignal";

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f17306i = 0;

    /* renamed from: g, reason: collision with root package name */
    private b f17307g;

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.a(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f16244b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th) {
                q0.b(f17305h, "handlerH5Exception", th);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            c.b(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        q0.b(f17305h, MobileAdsBridgeBase.initializeMethodName + str);
        b bVar = this.f17307g;
        if (bVar != null) {
            bVar.init(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof b)) {
                return;
            }
            this.f17307g = (b) windVaneWebView.getObject();
        } catch (Throwable th) {
            q0.b(f17305h, MobileAdsBridgeBase.initializeMethodName, th);
        }
    }

    public void install(Object obj, String str) {
        b bVar = this.f17307g;
        if (bVar != null) {
            bVar.install(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            q0.b(f17305h, "onSignalCommunication");
            b bVar = this.f17307g;
            if (bVar != null) {
                bVar.c(obj, str);
            }
        } catch (Throwable th) {
            q0.b(f17305h, "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) throws JSONException {
        q0.b(f17305h, "openURL" + str);
        b bVar = this.f17307g;
        if (bVar != null) {
            bVar.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            q0.b(f17305h, "pauseCountDown");
            b bVar = this.f17307g;
            if (bVar != null) {
                bVar.e(obj, str);
            }
        } catch (Throwable th) {
            q0.b(f17305h, "pauseCountDown", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f16244b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                q0.b(f17305h, "readyStatus", th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            q0.b(f17305h, "reportUrls");
            b bVar = this.f17307g;
            if (bVar != null) {
                bVar.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            q0.b(f17305h, "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) throws JSONException {
        q0.b(f17305h, "resetCountdown" + str);
        b bVar = this.f17307g;
        if (bVar != null) {
            bVar.a(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            q0.b(f17305h, "resumeCountDown");
            b bVar = this.f17307g;
            if (bVar != null) {
                bVar.f(obj, str);
            }
        } catch (Throwable th) {
            q0.b(f17305h, "resumeCountDown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            q0.b(f17305h, "sendImpressions");
            b bVar = this.f17307g;
            if (bVar != null) {
                bVar.d(obj, str);
            }
        } catch (Throwable th) {
            q0.b(f17305h, "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        q0.b(f17305h, "toggleCloseBtn" + str);
        b bVar = this.f17307g;
        if (bVar != null) {
            bVar.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        q0.b(f17305h, "triggerCloseBtn" + str);
        b bVar = this.f17307g;
        if (bVar != null) {
            bVar.triggerCloseBtn(obj, str);
        }
    }
}
