package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18635a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f18636b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18637c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f18638d;

    private VastProperties(boolean z6, Float f2, boolean z7, Position position) {
        this.f18635a = z6;
        this.f18636b = f2;
        this.f18637c = z7;
        this.f18638d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z6, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z6, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z6, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z6, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f18635a);
            if (this.f18635a) {
                jSONObject.put("skipOffset", this.f18636b);
            }
            jSONObject.put("autoPlay", this.f18637c);
            jSONObject.put("position", this.f18638d);
            return jSONObject;
        } catch (JSONException e6) {
            d.a("VastProperties: JSON error", e6);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f18638d;
    }

    public Float getSkipOffset() {
        return this.f18636b;
    }

    public boolean isAutoPlay() {
        return this.f18637c;
    }

    public boolean isSkippable() {
        return this.f18635a;
    }
}
