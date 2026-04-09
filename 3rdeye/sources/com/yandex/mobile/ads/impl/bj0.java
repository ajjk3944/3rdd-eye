package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bj0 {

    /* renamed from: a, reason: collision with root package name */
    private final d82 f25298a;

    /* renamed from: b, reason: collision with root package name */
    private final g02 f25299b;

    public /* synthetic */ bj0() {
        this(new d82(), new g02());
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jj0 b(JSONObject imageObject) throws k61, JSONException {
        f02 f02VarA;
        kotlin.jvm.internal.l.f(imageObject, "imageObject");
        int i = imageObject.getInt("w");
        int i10 = imageObject.getInt("h");
        this.f25298a.getClass();
        String strA = d82.a(ImagesContract.URL, imageObject);
        if (imageObject.has("smartCenterSettings")) {
            g02 g02Var = this.f25299b;
            JSONObject jSONObject = imageObject.getJSONObject("smartCenterSettings");
            kotlin.jvm.internal.l.e(jSONObject, "getJSONObject(...)");
            f02VarA = g02Var.a(jSONObject);
        } else {
            f02VarA = null;
        }
        String strOptString = imageObject.optString("sizeType");
        kotlin.jvm.internal.l.c(strOptString);
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        boolean zOptBoolean = imageObject.optBoolean("preload", true);
        String strOptString2 = imageObject.optString("preview");
        kotlin.jvm.internal.l.c(strOptString2);
        return new jj0(i, i10, strA, strOptString, f02VarA, zOptBoolean, strOptString2.length() > 0 ? strOptString2 : null);
    }

    public bj0(d82 urlJsonParser, g02 smartCenterSettingsParser) {
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(smartCenterSettingsParser, "smartCenterSettingsParser");
        this.f25298a = urlJsonParser;
        this.f25299b = smartCenterSettingsParser;
    }
}
