package defpackage;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rw2 implements wm2, jo2, tn2 {
    public final zw2 f;
    public final String g;
    public final String h;
    public rm2 k;
    public nx2 l;
    public JSONObject p;
    public JSONObject q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String m = "";
    public String n = "";
    public String o = "";
    public int i = 0;
    public qw2 j = qw2.f;

    public rw2(zw2 zw2Var, l83 l83Var, String str) {
        this.f = zw2Var;
        this.h = str;
        this.g = l83Var.g;
    }

    public static JSONObject c(nx2 nx2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", nx2Var.h);
        jSONObject.put("errorCode", nx2Var.f);
        jSONObject.put("errorDescription", nx2Var.g);
        nx2 nx2Var2 = nx2Var.i;
        jSONObject.put("underlyingError", nx2Var2 == null ? null : c(nx2Var2));
        return jSONObject;
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
        zw2 zw2Var = this.f;
        if (zw2Var.f()) {
            p21 p21Var = h83Var.b;
            List list = (List) p21Var.f;
            if (!list.isEmpty()) {
                this.i = ((a83) list.get(0)).b;
            }
            c83 c83Var = (c83) p21Var.g;
            String str = c83Var.l;
            if (!TextUtils.isEmpty(str)) {
                this.m = str;
            }
            String str2 = c83Var.m;
            if (!TextUtils.isEmpty(str2)) {
                this.n = str2;
            }
            JSONObject jSONObject = c83Var.p;
            if (jSONObject.length() > 0) {
                this.q = jSONObject;
            }
            iz1 iz1Var = mz1.ca;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                if (zw2Var.w >= ((Long) tw1Var.c.a(mz1.da)).longValue()) {
                    this.t = true;
                    return;
                }
                String str3 = c83Var.n;
                if (!TextUtils.isEmpty(str3)) {
                    this.o = str3;
                }
                JSONObject jSONObject2 = c83Var.o;
                if (jSONObject2.length() > 0) {
                    this.p = jSONObject2;
                }
                JSONObject jSONObject3 = this.p;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.o)) {
                    length += this.o.length();
                }
                long j = length;
                synchronized (zw2Var) {
                    zw2Var.w += j;
                }
            }
        }
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) {
        if (((Boolean) tw1.e.c.a(mz1.ga)).booleanValue()) {
            return;
        }
        zw2 zw2Var = this.f;
        if (zw2Var.f()) {
            zw2Var.c(this.g, this);
        }
    }

    @Override // defpackage.tn2
    public final void I0(el2 el2Var) {
        zw2 zw2Var = this.f;
        if (zw2Var.f()) {
            this.k = el2Var.f;
            this.j = qw2.g;
            if (((Boolean) tw1.e.c.a(mz1.ga)).booleanValue()) {
                zw2Var.c(this.g, this);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.j);
        jSONObject.put("format", a83.a(this.i));
        if (((Boolean) tw1.e.c.a(mz1.ga)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.r);
            if (this.r) {
                jSONObject.put("shown", this.s);
            }
        }
        rm2 rm2Var = this.k;
        if (rm2Var != null) {
            jSONObjectB = b(rm2Var);
        } else {
            nx2 nx2Var = this.l;
            JSONObject jSONObjectB2 = null;
            if (nx2Var != null && (iBinder = nx2Var.j) != null) {
                rm2 rm2Var2 = (rm2) iBinder;
                jSONObjectB2 = b(rm2Var2);
                if (rm2Var2.j.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.l));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(rm2 rm2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", rm2Var.f);
        jSONObject.put("responseSecsSinceEpoch", rm2Var.k);
        jSONObject.put("responseId", rm2Var.g);
        iz1 iz1Var = mz1.Z9;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            String str = rm2Var.l;
            if (!TextUtils.isEmpty(str)) {
                gi2.U("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            jSONObject.put("adRequestUrl", this.m);
        }
        if (!TextUtils.isEmpty(this.n)) {
            jSONObject.put("postBody", this.n);
        }
        if (!TextUtils.isEmpty(this.o)) {
            jSONObject.put("adResponseBody", this.o);
        }
        Object obj = this.p;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) tw1Var.c.a(mz1.ca)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.t);
        }
        JSONArray jSONArray = new JSONArray();
        for (qh4 qh4Var : rm2Var.j) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", qh4Var.f);
            jSONObject2.put("latencyMillis", qh4Var.g);
            if (((Boolean) tw1.e.c.a(mz1.aa)).booleanValue()) {
                jSONObject2.put("credentials", sv1.f.a.j(qh4Var.i));
            }
            nx2 nx2Var = qh4Var.h;
            jSONObject2.put("error", nx2Var == null ? null : c(nx2Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        zw2 zw2Var = this.f;
        if (zw2Var.f()) {
            this.j = qw2.h;
            this.l = nx2Var;
            if (((Boolean) tw1.e.c.a(mz1.ga)).booleanValue()) {
                zw2Var.c(this.g, this);
            }
        }
    }
}
