package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f14870a;

    /* renamed from: b, reason: collision with root package name */
    private String f14871b;

    /* renamed from: c, reason: collision with root package name */
    private String f14872c;

    /* renamed from: d, reason: collision with root package name */
    private int f14873d;

    /* renamed from: e, reason: collision with root package name */
    private int f14874e;

    /* renamed from: f, reason: collision with root package name */
    private String f14875f;

    /* renamed from: g, reason: collision with root package name */
    private String f14876g;

    /* renamed from: h, reason: collision with root package name */
    private String f14877h;

    /* renamed from: i, reason: collision with root package name */
    private int f14878i;

    /* renamed from: j, reason: collision with root package name */
    private String f14879j;

    /* renamed from: k, reason: collision with root package name */
    private int f14880k;

    /* renamed from: l, reason: collision with root package name */
    private String f14881l;

    /* renamed from: m, reason: collision with root package name */
    private int f14882m;

    /* renamed from: n, reason: collision with root package name */
    private String f14883n;

    /* renamed from: o, reason: collision with root package name */
    private String f14884o;

    /* renamed from: p, reason: collision with root package name */
    private int f14885p;

    /* renamed from: q, reason: collision with root package name */
    private String f14886q;

    public String a() {
        return this.f14870a;
    }

    public String b() {
        return this.f14872c;
    }

    public int c() {
        return this.f14873d;
    }

    public String d() {
        return this.f14871b;
    }

    public void e(int i10) {
        this.f14882m = i10;
    }

    public void f(int i10) {
        this.f14885p = i10;
    }

    public String g() {
        return this.f14876g;
    }

    public void h(String str) {
        this.f14881l = str;
    }

    public void i(String str) {
        this.f14883n = str;
    }

    public String j() {
        return this.f14879j;
    }

    public void k(String str) {
        this.f14886q = str;
    }

    public String l() {
        return this.f14881l;
    }

    public int m() {
        return this.f14882m;
    }

    public String n() {
        return this.f14883n;
    }

    public String o() {
        return this.f14884o;
    }

    public int p() {
        return this.f14885p;
    }

    public String q() {
        return this.f14886q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f14870a + ", click_duration=" + this.f14871b + ", lastUrl=" + this.f14879j + ", code=" + this.f14874e + ", excepiton=" + this.f14876g + ", header=" + this.f14877h + ", content=" + this.f14875f + ", type=" + this.f14885p + ", click_type=" + this.f14873d + "]";
    }

    public void a(int i10) {
        this.f14873d = i10;
    }

    public void b(String str) {
        this.f14872c = str;
    }

    public void c(int i10) {
        this.f14878i = i10;
    }

    public void d(int i10) {
        this.f14880k = i10;
    }

    public int e() {
        return this.f14874e;
    }

    public String f() {
        return this.f14875f;
    }

    public void g(String str) {
        this.f14879j = str;
    }

    public String h() {
        return this.f14877h;
    }

    public int i() {
        return this.f14878i;
    }

    public void j(String str) {
        this.f14884o = str;
    }

    public int k() {
        return this.f14880k;
    }

    public void a(String str) {
        this.f14870a = str;
    }

    public void b(int i10) {
        this.f14874e = i10;
    }

    public void c(String str) {
        this.f14871b = str;
    }

    public void d(String str) {
        this.f14875f = str;
    }

    public void e(String str) {
        this.f14876g = str;
    }

    public void f(String str) {
        this.f14877h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, eVar.p());
            jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th) {
            q0.b("ClickTime", th.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f14694r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th) {
                q0.b("ClickTime", th.getMessage());
            }
        }
        return arrayList;
    }
}
