package com.applovin.impl;

import com.applovin.impl.i4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class f5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    protected final C2145t f19351g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19352h;

    public f5(C2145t c2145t, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f19351g = c2145t;
        this.f19352h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f19351g.e());
        if (this.f19351g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f19351g.f().getLabel());
        }
        if (this.f19351g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f19351g.g().getLabel());
        }
        return map;
    }

    public abstract w4 a(JSONObject jSONObject);

    public void a(int i, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Unable to fetch " + this.f19351g + " ad: server returned " + i);
        }
        this.f21692a.g().a(y1.f21805m, this.f19351g, new AppLovinError(i, str));
    }

    public void b(JSONObject jSONObject) {
        AbstractC2135n0.c(jSONObject, this.f21692a);
        AbstractC2135n0.b(jSONObject, this.f21692a);
        AbstractC2135n0.a(jSONObject, this.f21692a);
        C2145t.a(jSONObject);
        this.f21692a.q0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f19351g.e());
        if (this.f19351g.f() != null) {
            map.put("size", this.f19351g.f().getLabel());
        }
        if (this.f19351g.g() != null) {
            map.put("require", this.f19351g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        i4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Fetching next ad of zone: " + this.f19351g);
        }
        if (((Boolean) this.f21692a.a(l4.f19768J3)).booleanValue() && a7.j() && com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "User is connected to a VPN");
        }
        a7.a(this.f21692a, this.f21693b);
        this.f21692a.g().a(y1.f21801k, this.f19351g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f21692a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f21692a.a(l4.f19876Z2)).booleanValue()) {
                aVarA = i4.a.a(((Integer) this.f21692a.a(l4.f19837T4)).intValue());
                JSONObject jSONObject = new JSONObject(this.f21692a.B().a(h(), false, true));
                HashMap map2 = new HashMap();
                if (!((Boolean) this.f21692a.a(l4.f19908d5)).booleanValue() && !((Boolean) this.f21692a.a(l4.f19878Z4)).booleanValue()) {
                    map2.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f21692a.a(l4.f19783L4)).booleanValue()) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21692a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = map2;
            } else {
                i4.a aVarA2 = i4.a.a(((Integer) this.f21692a.a(l4.f19844U4)).intValue());
                Map mapA = a7.a(this.f21692a.B().a(h(), false, false));
                if (!((Boolean) this.f21692a.a(l4.f19947i6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (a7.f(a()) || a7.h(a())) {
                map.putAll(this.f21692a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f19352h)) {
                map.put("sts", this.f19352h);
            }
            a.C0320a c0320aF = com.applovin.impl.sdk.network.a.a(this.f21692a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f21692a.a(l4.f19801O2)).intValue()).c(((Boolean) this.f21692a.a(l4.f19808P2)).booleanValue()).d(((Boolean) this.f21692a.a(l4.f19815Q2)).booleanValue()).c(((Integer) this.f21692a.a(l4.f19794N2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0320aF.a(andResetCustomPostBody);
                c0320aF.b(((Boolean) this.f21692a.a(l4.f19984n5)).booleanValue());
            }
            a aVar = new a(c0320aF.a(), this.f21692a);
            aVar.c(l4.f19995p0);
            aVar.b(l4.f20003q0);
            this.f21692a.q0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Unable to fetch ad for zone id: " + this.f19351g, th);
            }
            a(0, th.getMessage());
        }
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f21904l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f21904l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid(ImagesContract.URL, StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), map);
                CollectionUtils.putStringIfValid("ad_zone_id", f5.this.f19351g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f21904l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f21904l.b()), map);
                this.f21692a.g().d(y1.f21803l, map);
                f5.this.b(jSONObject);
                return;
            }
            f5.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            f5.this.a(i, str2);
            this.f21692a.E().a("fetchAd", str, i, str2);
        }
    }
}
