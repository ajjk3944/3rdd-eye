package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5097yb extends JSONObject {
    public C5097yb() {
    }

    public final Long a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (!has(str)) {
            return "";
        }
        try {
            return getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public C5097yb(String str) {
        super(str);
    }
}
