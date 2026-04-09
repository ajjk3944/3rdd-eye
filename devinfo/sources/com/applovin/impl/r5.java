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
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class r5 extends i5 {
    protected final u g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5256h;

    public r5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.g = uVar;
        this.f5256h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.g.e());
        if (this.g.f() != null) {
            map.put("AppLovin-Ad-Size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            map.put("AppLovin-Ad-Type", this.g.g().getLabel());
        }
        return map;
    }

    public abstract i5 a(JSONObject jSONObject);

    public void a(int i4, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.b(this.f4288b, "Unable to fetch " + this.g + " ad: server returned " + i4);
        }
        this.f4287a.g().a(d2.f3919z, this.g, new AppLovinError(i4, str));
    }

    public void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f4287a);
        r0.b(jSONObject, this.f4287a);
        r0.a(jSONObject, this.f4287a);
        u.a(jSONObject);
        this.f4287a.q0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.g.e());
        if (this.g.f() != null) {
            map.put("size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            map.put("require", this.g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        u4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Fetching next ad of zone: " + this.g);
        }
        if (((Boolean) this.f4287a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "User is connected to a VPN");
        }
        n7.a(this.f4287a, this.f4288b);
        this.f4287a.g().a(d2.f3915x, this.g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f4287a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f4287a.a(x4.f6048h3)).booleanValue()) {
                aVarA = u4.a.a(((Integer) this.f4287a.a(x4.f6136s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f4287a.A().a(h(), false, true));
                HashMap map2 = new HashMap();
                if (!((Boolean) this.f4287a.a(x4.D5)).booleanValue() && !((Boolean) this.f4287a.a(x4.f6190z5)).booleanValue()) {
                    map2.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f4287a.a(x4.f6074k5)).booleanValue()) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4287a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = map2;
            } else {
                u4.a aVarA2 = u4.a.a(((Integer) this.f4287a.a(x4.f6144t5)).intValue());
                Map mapA = n7.a(this.f4287a.A().a(h(), false, false));
                if (!((Boolean) this.f4287a.a(x4.M6)).booleanValue()) {
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
                map.putAll(this.f4287a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f5256h)) {
                map.put("sts", this.f5256h);
            }
            a.C0022a c0022aF = com.applovin.impl.sdk.network.a.a(this.f4287a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f4287a.a(x4.W2)).intValue()).c(((Boolean) this.f4287a.a(x4.X2)).booleanValue()).d(((Boolean) this.f4287a.a(x4.Y2)).booleanValue()).c(((Integer) this.f4287a.a(x4.V2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0022aF.a(andResetCustomPostBody);
                c0022aF.b(((Boolean) this.f4287a.a(x4.N5)).booleanValue());
            }
            a aVar = new a(c0022aF.a(), this.f4287a);
            aVar.c(x4.f6078l0);
            aVar.b(x4.f6087m0);
            this.f4287a.q0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Unable to fetch ad for zone id: " + this.g, th2);
            }
            a(0, th2.getMessage());
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            if (i4 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f4443l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f4443l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i4), map);
                CollectionUtils.putStringIfValid("ad_zone_id", r5.this.g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f4443l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f4443l.b()), map);
                this.f4287a.g().d(d2.f3917y, map);
                r5.this.b(jSONObject);
                return;
            }
            r5.this.a(i4, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            r5.this.a(i4, str2);
            this.f4287a.D().a("fetchAd", str, i4, str2);
        }
    }
}
