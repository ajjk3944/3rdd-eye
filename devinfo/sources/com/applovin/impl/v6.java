package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class v6 extends q6 {
    public v6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private o4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(a0.g.s("results", jSONObject), 0, new JSONObject());
        r0.c(jSONObject2, this.f4287a);
        r0.b(jSONObject, this.f4287a);
        r0.a(jSONObject, this.f4287a);
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
        return o4.a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        o4 o4VarB = b(jSONObject);
        a(o4VarB);
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Pending reward handled: " + o4VarB);
        }
    }

    public abstract void a(o4 o4Var);

    @Override // com.applovin.impl.q6
    public int g() {
        return ((Integer) this.f4287a.a(x4.f6022e1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements q0.e {
        public a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f4289c.b(v6Var.f4288b, "Reward validation succeeded with code " + i4 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = v6.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var2 = v6.this;
                    v6Var2.f4289c.b(v6Var2.f4288b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = v6.this.f4289c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var3 = v6.this;
                v6Var3.f4289c.a(v6Var3.f4288b, "Reward validation succeeded with code " + i4 + " and response: " + jSONObject);
            }
            v6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f4289c.b(v6Var.f4288b, "Reward validation failed with error code " + i4 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = v6.this.f4289c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var2 = v6.this;
                v6Var2.f4289c.b(v6Var2.f4288b, "Reward validation failed with code " + i4 + " and error: " + str2);
            }
            v6.this.a(i4);
        }
    }
}
