package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h00 {

    /* renamed from: a, reason: collision with root package name */
    public final mx0 f11674a;

    /* renamed from: b, reason: collision with root package name */
    public final e00 f11675b;

    public h00(e00 e00Var, mx0 mx0Var) {
        this.f11674a = mx0Var;
        this.f11675b = e00Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            ya.a0.m("Click string is empty, not proceeding.");
            return "";
        }
        e00 e00Var = this.f11675b;
        oe oeVar = e00Var.f10634b;
        if (oeVar == null) {
            ya.a0.m("Signal utils is empty, ignoring.");
            return "";
        }
        me meVar = oeVar.f14684b;
        if (meVar == null) {
            ya.a0.m("Signals object is empty, ignoring.");
            return "";
        }
        if (e00Var.getContext() != null) {
            return meVar.c(e00Var.getContext(), str, e00Var, e00Var.f10632a.f14823a);
        }
        ya.a0.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        e00 e00Var = this.f11675b;
        oe oeVar = e00Var.f10634b;
        if (oeVar == null) {
            ya.a0.m("Signal utils is empty, ignoring.");
            return "";
        }
        me meVar = oeVar.f14684b;
        if (meVar == null) {
            ya.a0.m("Signals object is empty, ignoring.");
            return "";
        }
        if (e00Var.getContext() != null) {
            return meVar.i(e00Var.getContext(), e00Var, e00Var.f10632a.f14823a);
        }
        ya.a0.m("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() throws JSONException {
        e00 e00Var = this.f11675b;
        sk.a(e00Var.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Ye)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            i00 i00Var = e00Var.f10645n;
            o50 o50Var = i00Var != null ? i00Var.A : null;
            if (o50Var != null) {
                long j = o50Var.f14565a.get();
                if (j > 0) {
                    jSONObject.put("plcmtid", j);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            ya.a0.n("Error constructing JSON.", e2);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            za.i.h("URL is empty, ignoring message");
        } else {
            ya.f0.f37440l.post(new q81(17, this, str));
        }
    }
}
