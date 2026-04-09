package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wg {

    /* renamed from: a, reason: collision with root package name */
    private final lg f34964a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wg(Context context, mp1 mp1Var, jr0 jr0Var, int i) {
        jr0Var = (i & 4) != 0 ? new jr0(mp1Var) : jr0Var;
        this(context, mp1Var, jr0Var, new lg(context, mp1Var, jr0Var));
    }

    public final ArrayList a(JSONObject jsonNative, qj base64EncodingParameters) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonNative, "jsonNative");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jsonNative.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z10 = jSONObject.getBoolean("required");
            try {
                arrayList.add(this.f34964a.a(jSONObject, base64EncodingParameters));
            } catch (Throwable th) {
                if (z10) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public wg(Context context, mp1 reporter, jr0 linkJsonParser, lg assetJsonParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(linkJsonParser, "linkJsonParser");
        kotlin.jvm.internal.l.f(assetJsonParser, "assetJsonParser");
        this.f34964a = assetJsonParser;
    }
}
