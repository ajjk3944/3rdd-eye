package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20908a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f20909b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20910c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f20911d;

    private VastProperties(boolean z3, Float f10, boolean z10, Position position) {
        this.f20908a = z3;
        this.f20909b = f10;
        this.f20910c = z10;
        this.f20911d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z3, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z3, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z3, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z3, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f20908a);
            if (this.f20908a) {
                jSONObject.put("skipOffset", this.f20909b);
            }
            jSONObject.put("autoPlay", this.f20910c);
            jSONObject.put("position", this.f20911d);
            return jSONObject;
        } catch (JSONException e2) {
            d.a("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f20911d;
    }

    public Float getSkipOffset() {
        return this.f20909b;
    }

    public boolean isAutoPlay() {
        return this.f20910c;
    }

    public boolean isSkippable() {
        return this.f20908a;
    }
}
