package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public String f12676e;

    /* renamed from: f, reason: collision with root package name */
    public String f12677f;

    /* renamed from: g, reason: collision with root package name */
    public String f12678g;

    /* renamed from: h, reason: collision with root package name */
    public String f12679h;

    /* renamed from: i, reason: collision with root package name */
    public String f12680i;

    /* renamed from: j, reason: collision with root package name */
    public String f12681j;

    /* renamed from: k, reason: collision with root package name */
    public String f12682k;

    /* renamed from: l, reason: collision with root package name */
    public String f12683l;

    /* renamed from: m, reason: collision with root package name */
    public String f12684m;

    /* renamed from: n, reason: collision with root package name */
    public String f12685n;

    /* renamed from: o, reason: collision with root package name */
    public String f12686o;

    /* renamed from: p, reason: collision with root package name */
    public int f12687p;

    /* renamed from: q, reason: collision with root package name */
    public int f12688q;

    /* renamed from: c, reason: collision with root package name */
    public String f12674c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f12672a = m0.t();

    /* renamed from: b, reason: collision with root package name */
    public String f12673b = m0.q();

    /* renamed from: d, reason: collision with root package name */
    public String f12675d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f12676e = String.valueOf(iS);
        this.f12677f = m0.a(context, iS);
        this.f12678g = m0.l(context);
        this.f12679h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f12680i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f12681j = String.valueOf(v0.g(context));
        this.f12682k = String.valueOf(v0.f(context));
        this.f12684m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f12683l = "landscape";
        } else {
            this.f12683l = "portrait";
        }
        this.f12685n = m0.v();
        this.f12686o = g.e();
        this.f12687p = g.a();
        this.f12688q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f12672a);
                jSONObject.put("system_version", this.f12673b);
                jSONObject.put("network_type", this.f12676e);
                jSONObject.put("network_type_str", this.f12677f);
                jSONObject.put("device_ua", this.f12678g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.F());
                jSONObject.put("opensdk_ver", m0.C() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f12687p);
                jSONObject.put("adid_limit_dev", this.f12688q);
            }
            jSONObject.put("plantform", this.f12674c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f12675d);
                jSONObject.put("az_aid_info", this.f12686o);
            }
            jSONObject.put("appkey", this.f12679h);
            jSONObject.put("appId", this.f12680i);
            jSONObject.put("screen_width", this.f12681j);
            jSONObject.put("screen_height", this.f12682k);
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, this.f12683l);
            jSONObject.put("scale", this.f12684m);
            if (m0.z() != 0) {
                jSONObject.put("tun", m0.z());
            }
            jSONObject.put("f", this.f12685n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
            return jSONObject;
        }
    }
}
