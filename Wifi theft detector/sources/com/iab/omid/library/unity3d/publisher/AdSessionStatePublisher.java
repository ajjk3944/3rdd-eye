package com.iab.omid.library.unity3d.publisher;

import a6.g;
import android.webkit.WebView;
import androidx.appcompat.app.z;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d6.c;
import d6.f;
import g6.b;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.d;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    public String f12576a;

    /* renamed from: b, reason: collision with root package name */
    public b f12577b;

    /* renamed from: c, reason: collision with root package name */
    public y5.a f12578c;

    /* renamed from: d, reason: collision with root package name */
    public a f12579d;

    /* renamed from: e, reason: collision with root package name */
    public long f12580e;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f12576a = str;
        this.f12577b = new b(null);
    }

    public void a() {
        this.f12580e = f.b();
        this.f12579d = a.AD_STATE_IDLE;
    }

    public void b(float f10) {
        g.a().c(r(), this.f12576a, f10);
    }

    public void c(WebView webView) {
        this.f12577b = new b(webView);
    }

    public void d(String str, long j10) {
        if (j10 >= this.f12580e) {
            a aVar = this.f12579d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f12579d = aVar2;
                g.a().d(r(), this.f12576a, str);
            }
        }
    }

    public void e(Date date) throws JSONException {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.i(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        g.a().i(r(), jSONObject);
    }

    public void f(JSONObject jSONObject) {
        g.a().m(r(), this.f12576a, jSONObject);
    }

    public void g(y5.a aVar) {
        this.f12578c = aVar;
    }

    public void h(y5.c cVar) {
        g.a().e(r(), this.f12576a, cVar.c());
    }

    public void i(y5.f fVar, d dVar) throws JSONException {
        j(fVar, dVar, null);
    }

    public void j(y5.f fVar, d dVar, JSONObject jSONObject) throws JSONException {
        String strO = fVar.o();
        JSONObject jSONObject2 = new JSONObject();
        c.i(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        c.i(jSONObject2, "adSessionType", dVar.c());
        c.i(jSONObject2, "deviceInfo", d6.b.d());
        c.i(jSONObject2, "deviceCategory", d6.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.i(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.i(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, dVar.h().b());
        c.i(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, dVar.h().c());
        c.i(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.i(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        c.i(jSONObject4, "appId", a6.f.c().a().getApplicationContext().getPackageName());
        c.i(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (dVar.d() != null) {
            c.i(jSONObject2, "contentUrl", dVar.d());
        }
        if (dVar.e() != null) {
            c.i(jSONObject2, "customReferenceData", dVar.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        Iterator it = dVar.i().iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
        g.a().f(r(), strO, jSONObject2, jSONObject5, jSONObject);
    }

    public void k(boolean z10) {
        if (o()) {
            g.a().l(r(), this.f12576a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void l() {
        this.f12577b.clear();
    }

    public void m(String str, long j10) {
        if (j10 >= this.f12580e) {
            this.f12579d = a.AD_STATE_VISIBLE;
            g.a().d(r(), this.f12576a, str);
        }
    }

    public y5.a n() {
        return this.f12578c;
    }

    public boolean o() {
        return this.f12577b.get() != 0;
    }

    public void p() {
        g.a().b(r(), this.f12576a);
    }

    public void q() {
        g.a().k(r(), this.f12576a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView r() {
        return (WebView) this.f12577b.get();
    }

    public void s() {
        f(null);
    }

    public void t() {
    }
}
