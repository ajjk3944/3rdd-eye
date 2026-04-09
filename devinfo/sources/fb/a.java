package fb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.cl;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ud0;
import com.google.android.gms.internal.ads.zl;
import ec.g1;
import ec.p1;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23859a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f23860b;

    /* renamed from: c, reason: collision with root package name */
    public final oe f23861c;

    /* renamed from: d, reason: collision with root package name */
    public final jq0 f23862d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23863e;

    /* renamed from: f, reason: collision with root package name */
    public final ud0 f23864f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final ex f23865h = fx.f11279f;

    /* renamed from: i, reason: collision with root package name */
    public final ct0 f23866i;
    public final z j;

    /* renamed from: k, reason: collision with root package name */
    public final v f23867k;

    /* renamed from: l, reason: collision with root package name */
    public final y f23868l;

    public a(WebView webView, oe oeVar, ud0 ud0Var, ct0 ct0Var, jq0 jq0Var, z zVar, v vVar, y yVar) {
        this.f23860b = webView;
        Context context = webView.getContext();
        this.f23859a = context;
        this.f23861c = oeVar;
        this.f23864f = ud0Var;
        sk.a(context);
        pk pkVar = sk.Ra;
        va.s sVar = va.s.f36163e;
        this.f23863e = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        this.g = ((Boolean) sVar.f36166c.a(sk.Sa)).booleanValue();
        this.f23866i = ct0Var;
        this.f23862d = jq0Var;
        this.j = zVar;
        this.f23867k = vVar;
        this.f23868l = yVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            ua.j jVar = ua.j.C;
            jVar.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strH = this.f23861c.f14684b.h(this.f23859a, str, this.f23860b);
            if (!this.g) {
                return strH;
            }
            jVar.f35267k.getClass();
            u6.t.B(this.f23864f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strH;
        } catch (RuntimeException e2) {
            za.i.f("Exception getting click signals. ", e2);
            ua.j.C.f35265h.f("TaggingLibraryJsInterface.getClickSignals", e2);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i4) {
        if (i4 <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 51);
            sb2.append("Invalid timeout for getting click signals. Timeout=");
            sb2.append(i4);
            za.i.e(sb2.toString());
            return "";
        }
        try {
            return (String) fx.f11274a.e(new p1(3, this, str)).get(Math.min(i4, this.f23863e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            za.i.f("Exception getting click signals with timeout. ", e2);
            ua.j.C.f35265h.f("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e2);
            return e2 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() throws Throwable {
        ya.f0 f0Var = ua.j.C.f35261c;
        String string = UUID.randomUUID().toString();
        Bundle bundleG = r5.c.g("query_info_type", "requester_type_6");
        cl clVar = new cl(this, string);
        if (((Boolean) zl.f19114e.u()).booleanValue()) {
            this.j.a(this.f23860b, clVar);
            return string;
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Ua)).booleanValue()) {
            o7.d.m(this.f23859a, new pa.g((pa.f) new pa.f(7).l(bundleG)), clVar);
            return string;
        }
        this.f23865h.execute(new b4.o(this, bundleG, clVar, false, 13));
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            ua.j jVar = ua.j.C;
            jVar.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strI = this.f23861c.f14684b.i(this.f23859a, this.f23860b, null);
            if (!this.g) {
                return strI;
            }
            jVar.f35267k.getClass();
            u6.t.B(this.f23864f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strI;
        } catch (RuntimeException e2) {
            za.i.f("Exception getting view signals. ", e2);
            ua.j.C.f35265h.f("TaggingLibraryJsInterface.getViewSignals", e2);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i4) {
        if (i4 <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 50);
            sb2.append("Invalid timeout for getting view signals. Timeout=");
            sb2.append(i4);
            za.i.e(sb2.toString());
            return "";
        }
        try {
            return (String) fx.f11274a.e(new g1(2, this)).get(Math.min(i4, this.f23863e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            za.i.f("Exception getting view signals with timeout. ", e2);
            ua.j.C.f35265h.f("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e2);
            return e2 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Wa)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        fx.f11274a.execute(new r(0, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i4;
        int i10;
        int i11;
        float f10;
        int i12;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i4 = jSONObject.getInt("x");
            i10 = jSONObject.getInt("y");
            i11 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            if (i13 != 0) {
                i12 = 1;
                if (i13 != 1) {
                    i12 = 2;
                    if (i13 != 2) {
                        i12 = 3;
                        if (i13 != 3) {
                            i12 = -1;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
        }
        try {
            this.f23861c.f14684b.b(MotionEvent.obtain(0L, i11, i12, i4, i10, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e10) {
            e = e10;
            za.i.f("Failed to parse the touch string. ", e);
            ua.j.C.f35265h.f("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e11) {
            e = e11;
            za.i.f("Failed to parse the touch string. ", e);
            ua.j.C.f35265h.f("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}
