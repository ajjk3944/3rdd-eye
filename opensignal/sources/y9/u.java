package y9;

import ak.x0;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.v0;
import d5.y0;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.a1;
import zc.c1;
import zc.d2;
import zc.j0;
import zc.l1;
import zc.o1;
import zc.p3;
import zc.r0;
import zc.w0;

/* loaded from: classes.dex */
public final class u implements v3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25995a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25996d;

    public /* synthetic */ u(int i10, Object obj) {
        this.f25995a = i10;
        this.f25996d = obj;
    }

    public static u j(String str) {
        return new u(5, (TextUtils.isEmpty(str) || str.length() > 1) ? l1.UNINITIALIZED : o1.e(str.charAt(0)));
    }

    public JSONObject a(x0 x0Var) throws JSONException {
        z4.f fVar = (z4.f) this.f25996d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("server_selection_latency_threshold", x0Var.f781a);
            jSONObject.put("server_selection_latency_threshold_2g", x0Var.f782b);
            jSONObject.put("server_selection_latency_threshold_2gp", x0Var.f783c);
            jSONObject.put("server_selection_latency_threshold_3g", x0Var.f784d);
            jSONObject.put("server_selection_latency_threshold_3gp", x0Var.f785e);
            jSONObject.put("server_selection_latency_threshold_4g", x0Var.f786f);
            jSONObject.put("server_selection_method", x0Var.f787g);
            jSONObject.put("download_servers", fVar.b(x0Var.f788h));
            jSONObject.put("upload_servers", fVar.b(x0Var.f789i));
            jSONObject.put("latency_servers", fVar.b(x0Var.j));
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("TestConfigMapper", e4, e4);
        }
    }

    public x0 b(JSONObject jSONObject, x0 x0Var) throws JSONException {
        List listG;
        List listG2;
        List listG3;
        z4.f fVar = (z4.f) this.f25996d;
        if (jSONObject == null) {
            return x0Var;
        }
        try {
            int iOptInt = jSONObject.optInt("server_selection_latency_threshold", x0Var.f781a);
            int iOptInt2 = jSONObject.optInt("server_selection_latency_threshold_2g", x0Var.f782b);
            int iOptInt3 = jSONObject.optInt("server_selection_latency_threshold_2gp", x0Var.f783c);
            int iOptInt4 = jSONObject.optInt("server_selection_latency_threshold_3g", x0Var.f784d);
            int iOptInt5 = jSONObject.optInt("server_selection_latency_threshold_3gp", x0Var.f785e);
            int iOptInt6 = jSONObject.optInt("server_selection_latency_threshold_4g", x0Var.f786f);
            String strOptString = jSONObject.optString("server_selection_method", x0Var.f787g);
            br.l.d(strOptString, "optString(...)");
            if (jSONObject.has("download_servers")) {
                JSONArray jSONArray = jSONObject.getJSONArray("download_servers");
                br.l.d(jSONArray, "getJSONArray(...)");
                listG = fVar.g(jSONArray);
            } else {
                listG = x0Var.f788h;
            }
            List list = listG;
            if (jSONObject.has("upload_servers")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("upload_servers");
                br.l.d(jSONArray2, "getJSONArray(...)");
                listG2 = fVar.g(jSONArray2);
            } else {
                listG2 = x0Var.f789i;
            }
            List list2 = listG2;
            if (jSONObject.has("latency_servers")) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("latency_servers");
                br.l.d(jSONArray3, "getJSONArray(...)");
                listG3 = fVar.g(jSONArray3);
            } else {
                listG3 = x0Var.j;
            }
            return new x0(iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, iOptInt6, strOptString, list, list2, listG3);
        } catch (JSONException e4) {
            ch.n.e("TestConfigMapper", e4);
            cj.a.G(e4);
            return x0Var;
        }
    }

    public void c(Exception exc) {
        qb.b.q("MediaCodecAudioRenderer", "Audio sink error", exc);
        xr.a aVar = ((v) this.f25996d).f25997a1;
        Handler handler = (Handler) aVar.f25482d;
        if (handler != null) {
            handler.post(new h(aVar, exc, 1));
        }
    }

    @Override // v3.m
    public boolean d(View view) {
        js.e eVar = (js.e) this.f25996d;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) eVar.f13797d;
        if (viewPager2.M) {
            viewPager2.b(currentItem, true);
        }
        return true;
    }

    public void e(xe.b bVar) {
        i1 i1Var = (i1) this.f25996d;
        ArrayList arrayList = i1Var.f5069c;
        synchronized (arrayList) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i10)).first)) {
                        e0.p("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f1 f1Var = new f1(bVar);
            arrayList.add(new Pair(bVar, f1Var));
            if (i1Var.f5072f != null) {
                try {
                    i1Var.f5072f.registerOnMeasurementEventListener(f1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    e0.p("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            i1Var.c(new v0(i1Var, f1Var, 4));
        }
    }

    public rr.f f(xr.o oVar) {
        br.l.e(oVar, "javaClass");
        Class cls = oVar.f25509a;
        qs.c cVarC = oVar.c();
        if (hs.f.SOURCE != null) {
            Class<?> declaringClass = cls.getDeclaringClass();
            xr.o oVar2 = declaringClass != null ? new xr.o(declaringClass) : null;
            if (oVar2 != null) {
                rr.f fVarF = f(oVar2);
                at.n nVarZ0 = fVarF != null ? fVarF.z0() : null;
                rr.i iVarC = nVarZ0 != null ? nVarZ0.c(qs.g.e(cls.getSimpleName()), zr.d.FROM_JAVA_LOADER) : null;
                if (iVarC instanceof rr.f) {
                    return (rr.f) iVarC;
                }
            } else {
                es.s sVar = (es.s) mq.o.t0(e5.H(((ds.d) this.f25996d).c(cVarC.e())));
                if (sVar != null) {
                    es.x xVar = sVar.G.f8283d;
                    xVar.getClass();
                    return xVar.w(qs.g.e(cls.getSimpleName()), oVar);
                }
            }
        }
        return null;
    }

    public void g(int i10, String str, List list, boolean z10, boolean z11) {
        su.b bVar;
        w0 w0Var = (w0) this.f25996d;
        int i11 = i10 - 1;
        if (i11 == 0) {
            j0 j0Var = ((c1) w0Var.f1504d).f26889y;
            c1.g(j0Var);
            bVar = j0Var.J;
        } else if (i11 != 1) {
            if (i11 == 3) {
                j0 j0Var2 = ((c1) w0Var.f1504d).f26889y;
                c1.g(j0Var2);
                bVar = j0Var2.K;
            } else if (i11 != 4) {
                j0 j0Var3 = ((c1) w0Var.f1504d).f26889y;
                c1.g(j0Var3);
                bVar = j0Var3.I;
            } else if (z10) {
                j0 j0Var4 = ((c1) w0Var.f1504d).f26889y;
                c1.g(j0Var4);
                bVar = j0Var4.G;
            } else if (z11) {
                j0 j0Var5 = ((c1) w0Var.f1504d).f26889y;
                c1.g(j0Var5);
                bVar = j0Var5.F;
            } else {
                j0 j0Var6 = ((c1) w0Var.f1504d).f26889y;
                c1.g(j0Var6);
                bVar = j0Var6.H;
            }
        } else if (z10) {
            j0 j0Var7 = ((c1) w0Var.f1504d).f26889y;
            c1.g(j0Var7);
            bVar = j0Var7.D;
        } else if (z11) {
            j0 j0Var8 = ((c1) w0Var.f1504d).f26889y;
            c1.g(j0Var8);
            bVar = j0Var8.B;
        } else {
            j0 j0Var9 = ((c1) w0Var.f1504d).f26889y;
            c1.g(j0Var9);
            bVar = j0Var9.E;
        }
        int size = list.size();
        if (size == 1) {
            bVar.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            bVar.d(list.get(0), list.get(1), str);
        } else if (size != 3) {
            bVar.b(str);
        } else {
            bVar.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void h(String str, String str2, Bundle bundle) {
        switch (this.f25995a) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                d2 d2Var = (d2) this.f25996d;
                if (!TextUtils.isEmpty(str)) {
                    d2Var.getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }
                ((c1) d2Var.f1504d).G.getClass();
                d2Var.x1("auto", "_err", bundle, true, true, System.currentTimeMillis());
                return;
            default:
                p3 p3Var = (p3) this.f25996d;
                if (!TextUtils.isEmpty(str)) {
                    p3Var.J().B1(new o.e(this, str, str2, bundle, 10));
                    return;
                }
                c1 c1Var = p3Var.H;
                if (c1Var != null) {
                    j0 j0Var = c1Var.f26889y;
                    c1.g(j0Var);
                    j0Var.B.c(str2, "AppId not known when logging event");
                }
                return;
        }
    }

    public void i(String str, Bundle bundle) {
        String string;
        c1 c1Var = (c1) this.f25996d;
        a1 a1Var = c1Var.B;
        r0 r0Var = c1Var.f26888x;
        c1.g(a1Var);
        a1Var.s1();
        if (c1Var.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        c1.e(r0Var);
        r0Var.T.o(string);
        y0 y0Var = r0Var.U;
        c1Var.G.getClass();
        y0Var.f(System.currentTimeMillis());
    }

    public boolean k() {
        if (!l()) {
            return false;
        }
        c1 c1Var = (c1) this.f25996d;
        c1Var.G.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r0 r0Var = c1Var.f26888x;
        c1.e(r0Var);
        return jCurrentTimeMillis - r0Var.U.e() > c1Var.f26887r.z1(null, zc.u.f27188j0);
    }

    public boolean l() {
        r0 r0Var = ((c1) this.f25996d).f26888x;
        c1.e(r0Var);
        return r0Var.U.e() > 0;
    }

    public u(z4.f fVar, cj.a aVar) {
        this.f25995a = 12;
        br.l.e(fVar, "testServerItemMapper");
        this.f25996d = fVar;
    }

    public u(u uVar, cj.a aVar) {
        this.f25995a = 11;
        br.l.e(uVar, "testConfigMapper");
        this.f25996d = uVar;
    }
}
