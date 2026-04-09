package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import i6.c;
import i6.d;
import java.util.Date;
import k6.g;
import k6.h;
import n6.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q6.b;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    public String f12641a;

    /* renamed from: b, reason: collision with root package name */
    public b f12642b;

    /* renamed from: c, reason: collision with root package name */
    public i6.a f12643c;

    /* renamed from: d, reason: collision with root package name */
    public a f12644d;

    /* renamed from: e, reason: collision with root package name */
    public long f12645e;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f12641a = str;
        this.f12642b = new b(null);
    }

    public void a() {
        this.f12645e = f.b();
        this.f12644d = a.AD_STATE_IDLE;
    }

    public void b(float f10) {
        h.a().c(s(), this.f12641a, f10);
    }

    public void c(WebView webView) {
        this.f12642b = new b(webView);
    }

    public void d(i6.a aVar) {
        this.f12643c = aVar;
    }

    public void e(c cVar) {
        h.a().e(s(), this.f12641a, cVar.c());
    }

    public void f(i6.h hVar, d dVar) throws JSONException {
        g(hVar, dVar, null);
    }

    public void g(i6.h hVar, d dVar, JSONObject jSONObject) throws JSONException {
        String strJ = hVar.j();
        JSONObject jSONObject2 = new JSONObject();
        n6.c.h(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        n6.c.h(jSONObject2, "adSessionType", dVar.d());
        n6.c.h(jSONObject2, "deviceInfo", n6.b.d());
        n6.c.h(jSONObject2, "deviceCategory", n6.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        n6.c.h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        n6.c.h(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, dVar.i().b());
        n6.c.h(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, dVar.i().c());
        n6.c.h(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        n6.c.h(jSONObject4, "libraryVersion", "1.5.7-Vungle");
        n6.c.h(jSONObject4, "appId", g.c().a().getApplicationContext().getPackageName());
        n6.c.h(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (dVar.e() != null) {
            n6.c.h(jSONObject2, "contentUrl", dVar.e());
        }
        if (dVar.f() != null) {
            n6.c.h(jSONObject2, "customReferenceData", dVar.f());
        }
        dVar.j();
        JSONObject jSONObject5 = new JSONObject();
        for (i6.g gVar : dVar.k()) {
            n6.c.h(jSONObject5, gVar.c(), gVar.d());
        }
        h.a().f(s(), strJ, jSONObject2, jSONObject5, jSONObject);
    }

    public void h(String str, long j10) {
        if (j10 >= this.f12645e) {
            a aVar = this.f12644d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f12644d = aVar2;
                h.a().l(s(), this.f12641a, str);
            }
        }
    }

    public void i(Date date) throws JSONException {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        n6.c.h(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().i(s(), jSONObject);
    }

    public void j(JSONObject jSONObject) {
        h.a().m(s(), this.f12641a, jSONObject);
    }

    public void k(boolean z10) {
        if (p()) {
            h.a().n(s(), this.f12641a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void l() {
        this.f12642b.clear();
    }

    public void m(String str, long j10) {
        if (j10 >= this.f12645e) {
            this.f12644d = a.AD_STATE_VISIBLE;
            h.a().l(s(), this.f12641a, str);
        }
    }

    public void n(boolean z10) {
        if (p()) {
            h.a().d(s(), this.f12641a, z10 ? "locked" : "unlocked");
        }
    }

    public i6.a o() {
        return this.f12643c;
    }

    public boolean p() {
        return this.f12642b.get() != 0;
    }

    public void q() {
        h.a().b(s(), this.f12641a);
    }

    public void r() {
        h.a().k(s(), this.f12641a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView s() {
        return (WebView) this.f12642b.get();
    }

    public void t() {
        j(null);
    }

    public void u() {
    }
}
