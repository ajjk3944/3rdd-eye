package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a91 {
    public static final boolean a(JSONObject jsonNative, String... keys) {
        kotlin.jvm.internal.l.f(jsonNative, "jsonNative");
        kotlin.jvm.internal.l.f(keys, "keys");
        for (String str : keys) {
            if (!jsonNative.has(str)) {
                return false;
            }
        }
        return true;
    }
}
