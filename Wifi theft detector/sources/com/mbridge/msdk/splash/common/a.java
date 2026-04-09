package com.mbridge.msdk.splash.common;

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
    public String f17072e;

    /* renamed from: f, reason: collision with root package name */
    public String f17073f;

    /* renamed from: g, reason: collision with root package name */
    public String f17074g;

    /* renamed from: h, reason: collision with root package name */
    public String f17075h;

    /* renamed from: i, reason: collision with root package name */
    public String f17076i;

    /* renamed from: j, reason: collision with root package name */
    public String f17077j;

    /* renamed from: k, reason: collision with root package name */
    public String f17078k;

    /* renamed from: l, reason: collision with root package name */
    public String f17079l;

    /* renamed from: m, reason: collision with root package name */
    public String f17080m;

    /* renamed from: n, reason: collision with root package name */
    public String f17081n;

    /* renamed from: o, reason: collision with root package name */
    public String f17082o;

    /* renamed from: p, reason: collision with root package name */
    public int f17083p;

    /* renamed from: q, reason: collision with root package name */
    public int f17084q;

    /* renamed from: c, reason: collision with root package name */
    public String f17070c = "android";

    /* renamed from: a, reason: collision with root package name */
    public String f17068a = m0.t();

    /* renamed from: b, reason: collision with root package name */
    public String f17069b = m0.q();

    /* renamed from: d, reason: collision with root package name */
    public String f17071d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f17072e = String.valueOf(iS);
        this.f17073f = m0.a(context, iS);
        this.f17074g = m0.l(context);
        this.f17075h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f17076i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f17077j = String.valueOf(v0.g(context));
        this.f17078k = String.valueOf(v0.f(context));
        this.f17080m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f17079l = "landscape";
        } else {
            this.f17079l = "portrait";
        }
        this.f17081n = m0.v();
        this.f17082o = g.e();
        this.f17083p = g.a();
        this.f17084q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f17068a);
                jSONObject.put("system_version", this.f17069b);
                jSONObject.put("network_type", this.f17072e);
                jSONObject.put("network_type_str", this.f17073f);
                jSONObject.put("device_ua", this.f17074g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.F());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f17083p);
                jSONObject.put("adid_limit_dev", this.f17084q);
            }
            jSONObject.put("plantform", this.f17070c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f17071d);
                jSONObject.put("az_aid_info", this.f17082o);
            }
            jSONObject.put("appkey", this.f17075h);
            jSONObject.put("appId", this.f17076i);
            jSONObject.put("screen_width", this.f17077j);
            jSONObject.put("screen_height", this.f17078k);
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, this.f17079l);
            jSONObject.put("scale", this.f17080m);
            if (m0.z() != 0) {
                jSONObject.put("tun", m0.z());
            }
            jSONObject.put("f", this.f17081n);
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
