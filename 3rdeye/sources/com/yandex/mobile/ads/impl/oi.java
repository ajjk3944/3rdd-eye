package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oi {
    public static ni a(JSONObject jsonValue) {
        kotlin.jvm.internal.l.f(jsonValue, "jsonValue");
        Object objOpt = jsonValue.opt("top");
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jsonValue.opt("right");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jsonValue.opt("left");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jsonValue.opt("bottom");
        return new ni(str, str2, str3, objOpt4 instanceof String ? (String) objOpt4 : null);
    }
}
