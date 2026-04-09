package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21034a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f21035b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21036c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f21037d;

    private VastProperties(boolean z3, Float f10, boolean z10, Position position) {
        this.f21034a = z3;
        this.f21035b = f10;
        this.f21036c = z10;
        this.f21037d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z3, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z3, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z3, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z3, position);
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21034a);
            if (this.f21034a) {
                jSONObject.put("skipOffset", this.f21035b);
            }
            jSONObject.put("autoPlay", this.f21036c);
            jSONObject.put("position", this.f21037d);
            return jSONObject;
        } catch (JSONException e2) {
            d.a("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    public final Position getPosition() {
        return this.f21037d;
    }

    public final Float getSkipOffset() {
        return this.f21035b;
    }

    public final boolean isAutoPlay() {
        return this.f21036c;
    }

    public final boolean isSkippable() {
        return this.f21034a;
    }
}
