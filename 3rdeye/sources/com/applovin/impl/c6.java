package com.applovin.impl;

import com.applovin.impl.C2132m0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c6 extends e6 {
    public c6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(b4 b4Var) throws JSONException {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", b4Var.b());
        Map mapA = b4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.e6
    public int g() {
        return ((Integer) this.f21692a.a(l4.f19888b1)).intValue();
    }

    public abstract b4 h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        b4 b4VarH = h();
        if (b4VarH == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Reporting pending reward: " + b4VarH + "...");
        }
        a(a(b4VarH), new a());
    }

    public class a implements C2132m0.e {
        public a() {
        }

        @Override // com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            c6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            c6.this.a(i);
        }
    }
}
