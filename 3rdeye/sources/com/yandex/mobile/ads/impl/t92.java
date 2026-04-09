package com.yandex.mobile.ads.impl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t92 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33493a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f33494b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33495c = true;

    /* renamed from: d, reason: collision with root package name */
    private final ij1 f33496d;

    private t92(boolean z10, Float f10, ij1 ij1Var) {
        this.f33493a = z10;
        this.f33494b = f10;
        this.f33496d = ij1Var;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f33493a);
            if (this.f33493a) {
                jSONObject.put("skipOffset", this.f33494b);
            }
            jSONObject.put("autoPlay", this.f33495c);
            jSONObject.put("position", this.f33496d);
            return jSONObject;
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e4);
            return jSONObject;
        }
    }

    public static t92 a(ij1 ij1Var) {
        return new t92(false, null, ij1Var);
    }

    public static t92 a(float f10, ij1 ij1Var) {
        return new t92(true, Float.valueOf(f10), ij1Var);
    }
}
