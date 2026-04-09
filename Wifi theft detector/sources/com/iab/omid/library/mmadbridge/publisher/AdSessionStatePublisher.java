package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import o5.d;
import o5.g;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.h;
import t5.c;
import t5.f;
import w5.b;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    public String f12510a;

    /* renamed from: b, reason: collision with root package name */
    public b f12511b;

    /* renamed from: c, reason: collision with root package name */
    public o5.a f12512c;

    /* renamed from: d, reason: collision with root package name */
    public com.iab.omid.library.mmadbridge.adsession.media.a f12513d;

    /* renamed from: e, reason: collision with root package name */
    public a f12514e;

    /* renamed from: f, reason: collision with root package name */
    public long f12515f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f12510a = str;
        this.f12511b = new b(null);
    }

    public void a() {
        this.f12515f = f.b();
        this.f12514e = a.AD_STATE_IDLE;
    }

    public void b(float f10) {
        h.a().c(w(), this.f12510a, f10);
    }

    public void c(WebView webView) {
        this.f12511b = new b(webView);
    }

    public void d(com.iab.omid.library.mmadbridge.adsession.media.a aVar) {
        this.f12513d = aVar;
    }

    public void e(String str) {
        g(str, null);
    }

    public void f(String str, long j10) {
        if (j10 >= this.f12515f) {
            a aVar = this.f12514e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f12514e = aVar2;
                h.a().m(w(), this.f12510a, str);
            }
        }
    }

    public void g(String str, JSONObject jSONObject) {
        h.a().e(w(), this.f12510a, str, jSONObject);
    }

    public void h(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().j(w(), jSONObject);
    }

    public void i(o5.a aVar) {
        this.f12512c = aVar;
    }

    public void j(o5.c cVar) {
        h.a().f(w(), this.f12510a, cVar.d());
    }

    public void k(g gVar, d dVar) {
        l(gVar, dVar, null);
    }

    public void l(g gVar, d dVar, JSONObject jSONObject) {
        String strS = gVar.s();
        JSONObject jSONObject2 = new JSONObject();
        c.h(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        c.h(jSONObject2, "adSessionType", dVar.c());
        c.h(jSONObject2, "deviceInfo", t5.b.d());
        c.h(jSONObject2, "deviceCategory", t5.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.h(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, dVar.h().b());
        c.h(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, dVar.h().c());
        c.h(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.h(jSONObject4, "libraryVersion", "1.4.13-Mmadbridge");
        c.h(jSONObject4, "appId", q5.g.c().a().getApplicationContext().getPackageName());
        c.h(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (dVar.d() != null) {
            c.h(jSONObject2, "contentUrl", dVar.d());
        }
        if (dVar.e() != null) {
            c.h(jSONObject2, "customReferenceData", dVar.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (o5.f fVar : dVar.i()) {
            c.h(jSONObject5, fVar.d(), fVar.e());
        }
        h.a().g(w(), strS, jSONObject2, jSONObject5, jSONObject);
    }

    public void m(JSONObject jSONObject) {
        h.a().n(w(), this.f12510a, jSONObject);
    }

    public void n(boolean z10) {
        if (t()) {
            h.a().o(w(), this.f12510a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void o() {
        this.f12511b.clear();
    }

    public void p(String str, long j10) {
        if (j10 >= this.f12515f) {
            this.f12514e = a.AD_STATE_VISIBLE;
            h.a().m(w(), this.f12510a, str);
        }
    }

    public void q(boolean z10) {
        if (t()) {
            h.a().d(w(), this.f12510a, z10 ? "locked" : "unlocked");
        }
    }

    public o5.a r() {
        return this.f12512c;
    }

    public com.iab.omid.library.mmadbridge.adsession.media.a s() {
        return this.f12513d;
    }

    public boolean t() {
        return this.f12511b.get() != 0;
    }

    public void u() {
        h.a().b(w(), this.f12510a);
    }

    public void v() {
        h.a().l(w(), this.f12510a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView w() {
        return (WebView) this.f12511b.get();
    }

    public void x() {
        m(null);
    }

    public void y() {
    }
}
