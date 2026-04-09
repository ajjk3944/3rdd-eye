package com.iab.omid.library.mmadbridge.adsession.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import o5.g;
import org.json.JSONObject;
import q5.i;
import t5.c;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f12505a;

    public a(g gVar) {
        this.f12505a = gVar;
    }

    public static a g(o5.b bVar) {
        g gVar = (g) bVar;
        t5.g.c(bVar, "AdSession is null");
        t5.g.k(gVar);
        t5.g.h(gVar);
        t5.g.g(gVar);
        t5.g.m(gVar);
        a aVar = new a(gVar);
        gVar.t().d(aVar);
        return aVar;
    }

    public void a(InteractionType interactionType) {
        t5.g.c(interactionType, "InteractionType is null");
        t5.g.f(this.f12505a);
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, "interactionType", interactionType);
        this.f12505a.t().g("adUserInteraction", jSONObject);
    }

    public void b() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e("bufferFinish");
    }

    public void c() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e("bufferStart");
    }

    public void d() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public final void e(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    public final void f(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public void h() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e("firstQuartile");
    }

    public void i() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void j() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void k(PlayerState playerState) {
        t5.g.c(playerState, "PlayerState is null");
        t5.g.f(this.f12505a);
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, "state", playerState);
        this.f12505a.t().g("playerStateChange", jSONObject);
    }

    public void l() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void m() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e("skipped");
    }

    public void n(float f10, float f11) {
        e(f10);
        f(f11);
        t5.g.f(this.f12505a);
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, "duration", Float.valueOf(f10));
        c.h(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        c.h(jSONObject, "deviceVolume", Float.valueOf(i.d().c()));
        this.f12505a.t().g("start", jSONObject);
    }

    public void o() {
        t5.g.f(this.f12505a);
        this.f12505a.t().e("thirdQuartile");
    }

    public void p(float f10) {
        f(f10);
        t5.g.f(this.f12505a);
        JSONObject jSONObject = new JSONObject();
        c.h(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        c.h(jSONObject, "deviceVolume", Float.valueOf(i.d().c()));
        this.f12505a.t().g("volumeChange", jSONObject);
    }
}
