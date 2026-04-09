package com.iab.omid.library.mmadbridge.adsession.media;

import org.json.JSONException;
import org.json.JSONObject;
import t5.d;
import t5.g;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12506a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f12507b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12508c;

    /* renamed from: d, reason: collision with root package name */
    public final Position f12509d;

    public b(boolean z10, Float f10, boolean z11, Position position) {
        this.f12506a = z10;
        this.f12507b = f10;
        this.f12508c = z11;
        this.f12509d = position;
    }

    public static b b(boolean z10, Position position) {
        g.c(position, "Position is null");
        return new b(false, null, z10, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f12506a);
            if (this.f12506a) {
                jSONObject.put("skipOffset", this.f12507b);
            }
            jSONObject.put("autoPlay", this.f12508c);
            jSONObject.put("position", this.f12509d);
            return jSONObject;
        } catch (JSONException e10) {
            d.b("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }
}
