package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12336a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f12337b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12338c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f12339d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f12336a = z10;
        this.f12337b = f10;
        this.f12338c = z11;
        this.f12339d = position;
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
            jSONObject.put("skippable", this.f12336a);
            if (this.f12336a) {
                jSONObject.put("skipOffset", this.f12337b);
            }
            jSONObject.put("autoPlay", this.f12338c);
            jSONObject.put("position", this.f12339d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f12339d;
    }

    public Float getSkipOffset() {
        return this.f12337b;
    }

    public boolean isAutoPlay() {
        return this.f12338c;
    }

    public boolean isSkippable() {
        return this.f12336a;
    }
}
