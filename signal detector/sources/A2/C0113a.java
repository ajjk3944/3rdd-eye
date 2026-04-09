package A2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC1642oa;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.C1068du;
import com.google.android.gms.internal.ads.C2202yv;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.H9;
import j2.C2550f;
import j2.C2551g;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;

/* renamed from: A2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f218a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f219b;

    /* renamed from: c, reason: collision with root package name */
    public final H6 f220c;

    /* renamed from: d, reason: collision with root package name */
    public final C1068du f221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f222e;

    /* renamed from: f, reason: collision with root package name */
    public final C0852Zn f223f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f224g;

    /* renamed from: h, reason: collision with root package name */
    public final C0623Mf f225h = AbstractC0640Nf.f10010f;
    public final C2202yv i;

    /* renamed from: j, reason: collision with root package name */
    public final L f226j;

    /* renamed from: k, reason: collision with root package name */
    public final G f227k;

    /* renamed from: l, reason: collision with root package name */
    public final J f228l;

    public C0113a(WebView webView, H6 h6, C0852Zn c0852Zn, C2202yv c2202yv, C1068du c1068du, L l2, G g2, J j6) {
        this.f219b = webView;
        Context context = webView.getContext();
        this.f218a = context;
        this.f220c = h6;
        this.f223f = c0852Zn;
        H9.a(context);
        E9 e9 = H9.Pa;
        C2841s c2841s = C2841s.f23267e;
        this.f222e = ((Integer) c2841s.f23270c.a(e9)).intValue();
        this.f224g = ((Boolean) c2841s.f23270c.a(H9.Qa)).booleanValue();
        this.i = c2202yv;
        this.f221d = c1068du;
        this.f226j = l2;
        this.f227k = g2;
        this.f228l = j6;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            p2.j jVar = p2.j.f22785C;
            jVar.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strD = this.f220c.f8555b.d(this.f218a, this.f219b, str);
            if (!this.f224g) {
                return strD;
            }
            jVar.f22797k.getClass();
            I5.b.D(this.f223f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strD;
        } catch (RuntimeException e6) {
            u2.k.f("Exception getting click signals. ", e6);
            p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.getClickSignals", e6);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i);
            u2.k.e(sb.toString());
            return "";
        }
        try {
            return (String) AbstractC0640Nf.f10005a.b(new B(this, 0, str)).get(Math.min(i, this.f222e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            u2.k.f("Exception getting click signals with timeout. ", e6);
            p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e6);
            return e6 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        C2911G c2911g = p2.j.f22785C.f22790c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        z zVar = new z(this, string);
        if (((Boolean) AbstractC1642oa.f15959e.v()).booleanValue()) {
            this.f226j.a(this.f219b, zVar);
            return string;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Sa)).booleanValue()) {
            this.f225h.execute(new C(this, bundle, zVar, 0));
            return string;
        }
        C0117e.t(this.f218a, new C2551g((C2550f) new C2550f(1).b(bundle)), zVar);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            p2.j jVar = p2.j.f22785C;
            jVar.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strI = this.f220c.f8555b.i(this.f218a, this.f219b, null);
            if (!this.f224g) {
                return strI;
            }
            jVar.f22797k.getClass();
            I5.b.D(this.f223f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strI;
        } catch (RuntimeException e6) {
            u2.k.f("Exception getting view signals. ", e6);
            p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.getViewSignals", e6);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i);
            u2.k.e(sb.toString());
            return "";
        }
        try {
            return (String) AbstractC0640Nf.f10005a.b(new A(0, this)).get(Math.min(i, this.f222e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            u2.k.f("Exception getting view signals with timeout. ", e6);
            p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e6);
            return e6 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Ua)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC0640Nf.f10005a.execute(new A1.d(this, str, 3, false));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i;
        int i3;
        int i6;
        float f2;
        int i7;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i3 = jSONObject.getInt("y");
            i6 = jSONObject.getInt("duration_ms");
            f2 = (float) jSONObject.getDouble("force");
            int i8 = jSONObject.getInt("type");
            if (i8 != 0) {
                i7 = 1;
                if (i8 != 1) {
                    i7 = 2;
                    if (i8 != 2) {
                        i7 = 3;
                        if (i8 != 3) {
                            i7 = -1;
                        }
                    }
                }
            } else {
                i7 = 0;
            }
        } catch (RuntimeException | JSONException e6) {
            e = e6;
        }
        try {
            this.f220c.f8555b.b(MotionEvent.obtain(0L, i6, i7, i, i3, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e7) {
            e = e7;
            u2.k.f("Failed to parse the touch string. ", e);
            p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e8) {
            e = e8;
            u2.k.f("Failed to parse the touch string. ", e);
            p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}
