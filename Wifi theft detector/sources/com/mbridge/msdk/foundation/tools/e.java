package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f15399a;

    /* renamed from: b, reason: collision with root package name */
    public int f15400b;

    /* renamed from: c, reason: collision with root package name */
    public String f15401c;

    /* renamed from: d, reason: collision with root package name */
    public String f15402d;

    /* renamed from: e, reason: collision with root package name */
    public String f15403e;

    /* renamed from: f, reason: collision with root package name */
    public String f15404f;

    /* renamed from: g, reason: collision with root package name */
    public String f15405g;

    /* renamed from: h, reason: collision with root package name */
    public String f15406h;

    /* renamed from: j, reason: collision with root package name */
    public String f15408j;

    /* renamed from: k, reason: collision with root package name */
    public String f15409k;

    /* renamed from: m, reason: collision with root package name */
    public int f15411m;

    /* renamed from: n, reason: collision with root package name */
    public String f15412n;

    /* renamed from: o, reason: collision with root package name */
    public String f15413o;

    /* renamed from: p, reason: collision with root package name */
    public String f15414p;

    /* renamed from: r, reason: collision with root package name */
    public String f15416r;

    /* renamed from: s, reason: collision with root package name */
    public String f15417s;

    /* renamed from: t, reason: collision with root package name */
    public String f15418t;

    /* renamed from: v, reason: collision with root package name */
    public String f15420v;

    /* renamed from: q, reason: collision with root package name */
    public String f15415q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f15407i = m0.t();

    /* renamed from: u, reason: collision with root package name */
    public String f15419u = m0.q();

    /* renamed from: l, reason: collision with root package name */
    public String f15410l = g.d();

    public e(Context context) {
        int iS = m0.s(context);
        this.f15412n = String.valueOf(iS);
        this.f15413o = m0.a(context, iS);
        this.f15408j = m0.l(context);
        this.f15403e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f15402d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f15418t = String.valueOf(v0.g(context));
        this.f15417s = String.valueOf(v0.f(context));
        this.f15416r = String.valueOf(v0.d(context));
        this.f15420v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.f15405g = m0.s();
        this.f15411m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f15414p = "landscape";
        } else {
            this.f15414p = "portrait";
        }
        this.f15404f = com.mbridge.msdk.foundation.same.a.V;
        this.f15406h = com.mbridge.msdk.foundation.same.a.f15032g;
        this.f15409k = m0.v();
        this.f15401c = g.e();
        this.f15399a = g.a();
        this.f15400b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f15407i);
                jSONObject.put("system_version", this.f15419u);
                jSONObject.put("network_type", this.f15412n);
                jSONObject.put("network_type_str", this.f15413o);
                jSONObject.put("device_ua", this.f15408j);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.F());
                jSONObject.put("opensdk_ver", m0.C() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("brand", this.f15405g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f15399a);
                jSONObject.put("adid_limit_dev", this.f15400b);
            }
            jSONObject.put("plantform", this.f15415q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f15410l);
                jSONObject.put("az_aid_info", this.f15401c);
            }
            jSONObject.put("appkey", this.f15403e);
            jSONObject.put("appId", this.f15402d);
            jSONObject.put("screen_width", this.f15418t);
            jSONObject.put("screen_height", this.f15417s);
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, this.f15414p);
            jSONObject.put("scale", this.f15416r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f15404f);
            jSONObject.put("c", this.f15406h);
            jSONObject.put("web_env", this.f15420v);
            jSONObject.put("f", this.f15409k);
            jSONObject.put("misk_spt", this.f15411m);
            if (m0.z() != 0) {
                jSONObject.put("tun", m0.z());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f15196f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f15399a);
                jSONObject2.put("adid_limit_dev", this.f15400b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
