package com.applovin.impl;

import N7.H7;
import com.applovin.impl.C2132m0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class i6 extends e6 {
    public i6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private b4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(H7.q("results", jSONObject), 0, new JSONObject());
        AbstractC2135n0.c(jSONObject2, this.f21692a);
        AbstractC2135n0.b(jSONObject, this.f21692a);
        AbstractC2135n0.a(jSONObject, this.f21692a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return b4.a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        b4 b4VarB = b(jSONObject);
        a(b4VarB);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Pending reward handled: " + b4VarB);
        }
    }

    public abstract void a(b4 b4Var);

    @Override // com.applovin.impl.e6
    public int g() {
        return ((Integer) this.f21692a.a(l4.f19881a1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        a(e(), new a());
    }

    public class a implements C2132m0.e {
        public a() {
        }

        @Override // com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i6.this.h()) {
                com.applovin.impl.sdk.o oVar = i6.this.f21694c;
                if (com.applovin.impl.sdk.o.a()) {
                    i6 i6Var = i6.this;
                    i6Var.f21694c.b(i6Var.f21693b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = i6.this.f21694c;
                if (com.applovin.impl.sdk.o.a()) {
                    i6 i6Var2 = i6.this;
                    i6Var2.f21694c.b(i6Var2.f21693b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = i6.this.f21694c;
            if (com.applovin.impl.sdk.o.a()) {
                i6 i6Var3 = i6.this;
                i6Var3.f21694c.a(i6Var3.f21693b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            i6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (i6.this.h()) {
                com.applovin.impl.sdk.o oVar = i6.this.f21694c;
                if (com.applovin.impl.sdk.o.a()) {
                    i6 i6Var = i6.this;
                    i6Var.f21694c.b(i6Var.f21693b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = i6.this.f21694c;
            if (com.applovin.impl.sdk.o.a()) {
                i6 i6Var2 = i6.this;
                i6Var2.f21694c.b(i6Var2.f21693b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            i6.this.a(i);
        }
    }
}
