package com.singular.sdk;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.singular.sdk.internal.SingularLog;
import io.appmetrica.analytics.impl.Oo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SingularJSInterface {
    private static final SingularLog logger = SingularLog.getLogger("SingularJSInterface");
    Context mContext;
    int webViewId;

    public SingularJSInterface(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public boolean event(String str) {
        logger.debug("event(name=" + str + ")");
        return Singular.event(str);
    }

    @JavascriptInterface
    public void revenue(String str, double d10) throws JSONException {
        logger.debug("revenue(currency=" + str + ", amount=" + d10 + ")");
        Singular.revenue(str, d10);
    }

    @JavascriptInterface
    public void setCustomUserId(String str) throws JSONException {
        logger.debug("setCustomUserId(customUserId=" + str + ")");
        Singular.setCustomUserId(str);
    }

    @JavascriptInterface
    public void setWebViewId(int i) {
        logger.debug("setWebViewId(id=" + i + ")");
        this.webViewId = i;
    }

    @JavascriptInterface
    public void unsetCustomUserId() throws JSONException {
        logger.debug("unsetCustomUserId()");
        Singular.unsetCustomUserId();
    }

    @JavascriptInterface
    public void event(String str, String str2) throws JSONException {
        logger.debug(Oo.h("event(name=", str, ", JSONString=", str2, ")"));
        Singular.eventJSON(str, new JSONObject(str2));
    }
}
