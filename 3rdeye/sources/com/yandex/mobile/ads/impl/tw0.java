package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2097r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tw0 implements mg<sw0> {

    /* renamed from: a, reason: collision with root package name */
    private final cw0 f33787a;

    /* renamed from: b, reason: collision with root package name */
    private final le2 f33788b;

    /* renamed from: c, reason: collision with root package name */
    private final bj0 f33789c;

    /* renamed from: d, reason: collision with root package name */
    private final pj0 f33790d;

    public tw0(Context context, mp1 reporter, qj base64EncodingParameters, cw0 mediaParser, le2 videoParser, bj0 imageParser, pj0 imageValuesParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        kotlin.jvm.internal.l.f(mediaParser, "mediaParser");
        kotlin.jvm.internal.l.f(videoParser, "videoParser");
        kotlin.jvm.internal.l.f(imageParser, "imageParser");
        kotlin.jvm.internal.l.f(imageValuesParser, "imageValuesParser");
        this.f33787a = mediaParser;
        this.f33788b = videoParser;
        this.f33789c = imageParser;
        this.f33790d = imageValuesParser;
    }

    @Override // com.yandex.mobile.ads.impl.mg
    public final sw0 a(JSONObject jsonAsset) throws k61, JSONException {
        Object objA;
        Object objB;
        Object objA2;
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        if (!jsonAsset.has(AppMeasurementSdk.ConditionalUserProperty.VALUE) || jsonAsset.isNull(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            fp0.b(new Object[0]);
            throw new k61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        kotlin.jvm.internal.l.c(jSONObject);
        cw0 cw0Var = this.f33787a;
        if (!jSONObject.has("media") || jSONObject.isNull("media")) {
            objA = null;
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("media");
            kotlin.jvm.internal.l.c(jSONObject2);
            objA = cw0Var.a(jSONObject2);
        }
        ku0 ku0Var = (ku0) objA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        ArrayList arrayListA = jSONArrayOptJSONArray != null ? this.f33790d.a(jSONArrayOptJSONArray) : null;
        bj0 bj0Var = this.f33789c;
        if (!jSONObject.has("image") || jSONObject.isNull("image")) {
            objB = null;
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
            kotlin.jvm.internal.l.c(jSONObject3);
            objB = bj0Var.b(jSONObject3);
        }
        jj0 jj0Var = (jj0) objB;
        if ((arrayListA == null || arrayListA.isEmpty()) && jj0Var != null) {
            arrayListA = C2092m.X(jj0Var);
        }
        le2 le2Var = this.f33788b;
        if (!jSONObject.has("video") || jSONObject.isNull("video")) {
            objA2 = null;
        } else {
            JSONObject jSONObject4 = jSONObject.getJSONObject("video");
            kotlin.jvm.internal.l.c(jSONObject4);
            objA2 = le2Var.a(jSONObject4);
        }
        ya2 ya2Var = (ya2) objA2;
        if (ku0Var != null || ((arrayListA != null && !arrayListA.isEmpty()) || ya2Var != null)) {
            return new sw0(ku0Var, ya2Var, arrayListA != null ? C2097r.I0(arrayListA) : null);
        }
        fp0.b(new Object[0]);
        throw new k61("Native Ad json has not required attributes");
    }
}
