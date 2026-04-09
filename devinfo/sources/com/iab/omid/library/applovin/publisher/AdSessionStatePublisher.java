package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private String f20964a;

    /* renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.b f20965b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f20966c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f20967d;

    /* renamed from: e, reason: collision with root package name */
    private a f20968e;

    /* renamed from: f, reason: collision with root package name */
    private long f20969f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f20964a = str;
        this.f20965b = new com.iab.omid.library.applovin.weakreference.b(null);
    }

    public void a() {
        this.f20969f = f.b();
        this.f20968e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f20965b.clear();
    }

    public AdEvents c() {
        return this.f20966c;
    }

    public MediaEvents d() {
        return this.f20967d;
    }

    public boolean e() {
        return this.f20965b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f20964a);
    }

    public void g() {
        h.a().b(getWebView(), this.f20964a);
    }

    public WebView getWebView() {
        return this.f20965b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f20964a, f10);
    }

    public void b(String str, long j) {
        if (j >= this.f20969f) {
            this.f20968e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f20964a, str);
        }
    }

    public void a(WebView webView) {
        this.f20965b = new com.iab.omid.library.applovin.weakreference.b(webView);
    }

    public void b(boolean z3) {
        if (e()) {
            h.a().a(getWebView(), this.f20964a, z3 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f20966c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f20964a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f20964a, errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.3-Applovin");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f20967d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f20969f) {
            a aVar = this.f20968e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f20968e = aVar2;
                h.a().b(getWebView(), this.f20964a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f20964a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f20964a, jSONObject);
    }

    public void a(boolean z3) {
        if (e()) {
            h.a().c(getWebView(), this.f20964a, z3 ? "foregrounded" : "backgrounded");
        }
    }

    public void i() {
    }
}
