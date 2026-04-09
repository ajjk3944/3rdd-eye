package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class bt2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bt2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws r13 {
        Bundle bundle;
        switch (this.a) {
            case 0:
                p21 p21Var = (p21) this.b;
                h83 h83Var = (h83) this.c;
                a83 a83Var = (a83) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (((Boolean) tw1.e.c.a(mz1.t2)).booleanValue()) {
                    ga1.n(hg4.C.k, ((jv2) p21Var.i).e, "native-assets-loading-basic-start");
                }
                tr2 tr2Var = new tr2();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (tr2Var) {
                    tr2Var.a = iOptInt;
                }
                String strOptString = jSONObject.optString("custom_template_id");
                synchronized (tr2Var) {
                    tr2Var.u = strOptString;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null;
                synchronized (tr2Var) {
                    tr2Var.y = strOptString2;
                }
                l83 l83Var = (l83) h83Var.a.g;
                if (!l83Var.h.contains(Integer.toString(tr2Var.q()))) {
                    int iQ = tr2Var.q();
                    throw new r13(ex0.j(new StringBuilder(String.valueOf(iQ).length() + 21), "Invalid template ID: ", iQ), 1);
                }
                if (tr2Var.q() == 3) {
                    if (tr2Var.g() == null) {
                        throw new r13("No custom template id for custom template ad response.", 1);
                    }
                    if (!l83Var.i.contains(tr2Var.g())) {
                        throw new r13("Unexpected custom template id in the response.", 1);
                    }
                }
                double dOptDouble = jSONObject.optDouble("rating", -1.0d);
                synchronized (tr2Var) {
                    tr2Var.r = dOptDouble;
                }
                String strOptString3 = jSONObject.optString("headline", null);
                if (a83Var.M) {
                    hg4 hg4Var = hg4.C;
                    lf4 lf4Var = hg4Var.c;
                    Resources resourcesC = hg4Var.h.c();
                    String string = resourcesC != null ? resourcesC.getString(R.string.s7) : "Test Ad";
                    strOptString3 = ex0.l(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString3).length()), string, " : ", strOptString3);
                }
                tr2Var.o("headline", strOptString3);
                tr2Var.o("body", jSONObject.optString("body", null));
                tr2Var.o("call_to_action", jSONObject.optString("call_to_action", null));
                tr2Var.o("store", jSONObject.optString("store", null));
                tr2Var.o("price", jSONObject.optString("price", null));
                tr2Var.o("advertiser", jSONObject.optString("advertiser", null));
                return tr2Var;
            case 1:
                if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue() && (bundle = ((fa2) this.b).r) != null) {
                    ga1.n(hg4.C.k, bundle, "http-response-ready");
                }
                return new ty2((zy2) ((q93) this.c).h.get(), (JSONObject) ((q93) this.d).h.get(), (ga2) ((q93) this.e).h.get());
            case 2:
                View view = (View) this.d;
                Activity activity = (Activity) this.e;
                lj3 lj3Var = (lj3) this.b;
                Context context = (Context) this.c;
                gk3 gk3Var = lj3Var.e;
                de3 de3VarB = lj3Var.a.b();
                if (de3VarB == null) {
                    gk3Var.b(15004);
                    return "";
                }
                String strE = de3VarB.e(context, view, activity);
                if (strE != null) {
                    return strE;
                }
                gk3Var.b(15007);
                return "";
            case 3:
                lj3 lj3Var2 = (lj3) this.b;
                Context context2 = (Context) this.c;
                String str = (String) this.d;
                View view2 = (View) this.e;
                gk3 gk3Var2 = lj3Var2.e;
                de3 de3VarB2 = lj3Var2.a.b();
                if (de3VarB2 == null) {
                    gk3Var2.b(15004);
                    return "";
                }
                String strH = de3VarB2.h(context2, str, view2, null);
                if (strH != null) {
                    return strH;
                }
                gk3Var2.b(15008);
                return "";
            case 4:
                View view3 = (View) this.d;
                Activity activity2 = (Activity) this.e;
                mj3 mj3Var = (mj3) this.b;
                Context context3 = (Context) this.c;
                HashMap map = new HashMap();
                mj3Var.e.e(20106, new ea1(mj3Var, map, context3, view3, (Object) activity2, 4));
                String strI = mj3Var.i(map);
                map.clear();
                return strI;
            default:
                mj3 mj3Var2 = (mj3) this.b;
                Context context4 = (Context) this.c;
                String str2 = (String) this.d;
                View view4 = (View) this.e;
                HashMap map2 = new HashMap();
                mj3Var2.e.e(20106, new ea1(mj3Var2, map2, context4, view4, (Object) str2, 5));
                String strI2 = mj3Var2.i(map2);
                map2.clear();
                return strI2;
        }
    }
}
