package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    protected final u f7498g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7499h;

    public r5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f7498g = uVar;
        this.f7499h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f7498g.e());
        if (this.f7498g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f7498g.f().getLabel());
        }
        if (this.f7498g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f7498g.g().getLabel());
        }
        return map;
    }

    public abstract i5 a(JSONObject jSONObject);

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Unable to fetch " + this.f7498g + " ad: server returned " + i10);
        }
        this.f6218a.g().a(d2.f5765z, this.f7498g, new AppLovinError(i10, str));
    }

    public void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f6218a);
        r0.b(jSONObject, this.f6218a);
        r0.a(jSONObject, this.f6218a);
        u.a(jSONObject);
        this.f6218a.q0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f7498g.e());
        if (this.f7498g.f() != null) {
            map.put("size", this.f7498g.f().getLabel());
        }
        if (this.f7498g.g() != null) {
            map.put("require", this.f7498g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        u4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Fetching next ad of zone: " + this.f7498g);
        }
        if (((Boolean) this.f6218a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "User is connected to a VPN");
        }
        n7.a(this.f6218a, this.f6219b);
        this.f6218a.g().a(d2.f5761x, this.f7498g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f6218a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f6218a.a(x4.f8481h3)).booleanValue()) {
                aVarA = u4.a.a(((Integer) this.f6218a.a(x4.f8576s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f6218a.A().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f6218a.a(x4.D5)).booleanValue() && !((Boolean) this.f6218a.a(x4.f8632z5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f6218a.a(x4.f8510k5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6218a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                u4.a aVarA2 = u4.a.a(((Integer) this.f6218a.a(x4.f8584t5)).intValue());
                Map mapA = n7.a(this.f6218a.A().a(h(), false, false));
                if (!((Boolean) this.f6218a.a(x4.M6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (n7.h(a()) || n7.j(a())) {
                map.putAll(this.f6218a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f7499h)) {
                map.put("sts", this.f7499h);
            }
            a.C0086a c0086aF = com.applovin.impl.sdk.network.a.a(this.f6218a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f6218a.a(x4.W2)).intValue()).c(((Boolean) this.f6218a.a(x4.X2)).booleanValue()).d(((Boolean) this.f6218a.a(x4.Y2)).booleanValue()).c(((Integer) this.f6218a.a(x4.V2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0086aF.a(andResetCustomPostBody);
                c0086aF.b(((Boolean) this.f6218a.a(x4.N5)).booleanValue());
            }
            a aVar = new a(c0086aF.a(), this.f6218a);
            aVar.c(x4.f8514l0);
            aVar.b(x4.f8523m0);
            this.f6218a.q0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Unable to fetch ad for zone id: " + this.f7498g, th);
            }
            a(0, th.getMessage());
        }
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) throws JSONException {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f6417l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f6417l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
                CollectionUtils.putStringIfValid("ad_zone_id", r5.this.f7498g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f6417l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f6417l.b()), map);
                this.f6218a.g().d(d2.f5763y, map);
                r5.this.b(jSONObject);
                return;
            }
            r5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r5.this.a(i10, str2);
            this.f6218a.D().a("fetchAd", str, i10, str2);
        }
    }
}
