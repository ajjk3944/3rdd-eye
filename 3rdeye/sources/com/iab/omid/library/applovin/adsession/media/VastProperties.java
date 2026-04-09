package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23527a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f23528b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23529c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f23530d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f23527a = z10;
        this.f23528b = f10;
        this.f23529c = z11;
        this.f23530d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23527a);
            if (this.f23527a) {
                jSONObject.put("skipOffset", this.f23528b);
            }
            jSONObject.put("autoPlay", this.f23529c);
            jSONObject.put("position", this.f23530d);
            return jSONObject;
        } catch (JSONException e4) {
            d.a("VastProperties: JSON error", e4);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f23530d;
    }

    public Float getSkipOffset() {
        return this.f23528b;
    }

    public boolean isAutoPlay() {
        return this.f23529c;
    }

    public boolean isSkippable() {
        return this.f23527a;
    }
}
