package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i01 {
    public final Context a;
    public final WebView b;
    public final vs1 c;
    public final m83 d;
    public final int e;
    public final pv2 f;
    public final boolean g;
    public final ld2 h = md2.f;
    public final eb3 i;
    public final jd4 j;
    public final k63 k;
    public final sa4 l;

    public i01(WebView webView, vs1 vs1Var, pv2 pv2Var, eb3 eb3Var, m83 m83Var, jd4 jd4Var, k63 k63Var, sa4 sa4Var) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = vs1Var;
        this.f = pv2Var;
        mz1.a(context);
        iz1 iz1Var = mz1.sa;
        tw1 tw1Var = tw1.e;
        this.e = ((Integer) tw1Var.c.a(iz1Var)).intValue();
        this.g = ((Boolean) tw1Var.c.a(mz1.ta)).booleanValue();
        this.i = eb3Var;
        this.d = m83Var;
        this.j = jd4Var;
        this.k = k63Var;
        this.l = sa4Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            hg4 hg4Var = hg4.C;
            hg4Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strG = this.c.b.g(this.a, str, this.b);
            if (!this.g) {
                return strG;
            }
            hg4Var.k.getClass();
            a30.B(this.f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strG;
        } catch (RuntimeException e) {
            gi2.c0("Exception getting click signals. ", e);
            hg4.C.h.d("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i);
            gi2.Z(sb.toString());
            return "";
        }
        try {
            return (String) md2.a.c(new gs1(this, str, 2)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            gi2.c0("Exception getting click signals with timeout. ", e);
            hg4.C.h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        lf4 lf4Var = hg4.C.c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        a02 a02Var = new a02(this, string);
        if (((Boolean) x02.e.w()).booleanValue()) {
            this.j.a(this.b, a02Var);
            return string;
        }
        if (((Boolean) tw1.e.c.a(mz1.va)).booleanValue()) {
            this.h.execute(new gi(this, bundle, a02Var, 13));
            return string;
        }
        ug0.r(this.a, new b3((a3) new a3(1).i1(bundle)), a02Var);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            hg4 hg4Var = hg4.C;
            hg4Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strI = this.c.b.i(this.a, this.b, null);
            if (!this.g) {
                return strI;
            }
            hg4Var.k.getClass();
            a30.B(this.f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strI;
        } catch (RuntimeException e) {
            gi2.c0("Exception getting view signals. ", e);
            hg4.C.h.d("TaggingLibraryJsInterface.getViewSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i);
            gi2.Z(sb.toString());
            return "";
        }
        try {
            return (String) md2.a.c(new xs1(1, this)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            gi2.c0("Exception getting view signals with timeout. ", e);
            hg4.C.h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) tw1.e.c.a(mz1.xa)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        md2.a.execute(new n62(this, str, 1));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i4 = 1;
                if (i5 != 1) {
                    i4 = 2;
                    if (i5 != 2) {
                        i4 = 3;
                        if (i5 != 3) {
                            i4 = -1;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.c.b.f(MotionEvent.obtain(0L, i3, i4, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            gi2.c0("Failed to parse the touch string. ", e);
            hg4.C.h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e3) {
            e = e3;
            gi2.c0("Failed to parse the touch string. ", e);
            hg4.C.h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}
