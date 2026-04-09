package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class o6 extends q6 {
    public o6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(o4 o4Var) throws JSONException {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", o4Var.b());
        Map mapA = o4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.q6
    public int g() {
        return ((Integer) this.f6218a.a(x4.f8461f1)).intValue();
    }

    public abstract o4 h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        o4 o4VarH = h();
        if (o4VarH == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Reporting pending reward: " + o4VarH + "...");
        }
        a(a(o4VarH), new a());
    }

    public class a implements q0.e {
        public a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            o6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            o6.this.a(i10);
        }
    }
}
