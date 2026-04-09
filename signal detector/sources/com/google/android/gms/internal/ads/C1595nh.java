package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595nh {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f15795a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1433kh f15796b;

    public C1595nh(ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh, L6 l6) {
        this.f15795a = l6;
        this.f15796b = viewTreeObserverOnGlobalLayoutListenerC1433kh;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC2907C.m("Click string is empty, not proceeding.");
            return "";
        }
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f15796b;
        H6 h6 = viewTreeObserverOnGlobalLayoutListenerC1433kh.f15206b;
        if (h6 == null) {
            AbstractC2907C.m("Signal utils is empty, ignoring.");
            return "";
        }
        F6 f6 = h6.f8555b;
        if (f6 == null) {
            AbstractC2907C.m("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh.getContext() != null) {
            return f6.c(viewTreeObserverOnGlobalLayoutListenerC1433kh.getContext(), str, viewTreeObserverOnGlobalLayoutListenerC1433kh, viewTreeObserverOnGlobalLayoutListenerC1433kh.f15204a.f17316a);
        }
        AbstractC2907C.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f15796b;
        H6 h6 = viewTreeObserverOnGlobalLayoutListenerC1433kh.f15206b;
        if (h6 == null) {
            AbstractC2907C.m("Signal utils is empty, ignoring.");
            return "";
        }
        F6 f6 = h6.f8555b;
        if (f6 == null) {
            AbstractC2907C.m("Signals object is empty, ignoring.");
            return "";
        }
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh.getContext() != null) {
            return f6.i(viewTreeObserverOnGlobalLayoutListenerC1433kh.getContext(), viewTreeObserverOnGlobalLayoutListenerC1433kh, viewTreeObserverOnGlobalLayoutListenerC1433kh.f15204a.f17316a);
        }
        AbstractC2907C.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() throws JSONException {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f15796b;
        H9.a(viewTreeObserverOnGlobalLayoutListenerC1433kh.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.We)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            C1649oh c1649oh = viewTreeObserverOnGlobalLayoutListenerC1433kh.f15228n;
            C0712Rj c0712Rj = c1649oh != null ? c1649oh.f16000O : null;
            if (c0712Rj != null) {
                long j6 = c0712Rj.f11035a.get();
                if (j6 > 0) {
                    jSONObject.put("plcmtid", j6);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e6) {
            AbstractC2907C.n("Error constructing JSON.", e6);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            u2.k.h("URL is empty, ignoring message");
        } else {
            C2911G.f23576l.post(new CD(this, 18, str));
        }
    }
}
