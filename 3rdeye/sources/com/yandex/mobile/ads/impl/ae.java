package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final String f24626a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24627b;

    public ae(be appAdAnalyticsReportType, JSONObject payloadJson) {
        kotlin.jvm.internal.l.f(appAdAnalyticsReportType, "appAdAnalyticsReportType");
        kotlin.jvm.internal.l.f(payloadJson, "payloadJson");
        this.f24626a = appAdAnalyticsReportType.a();
        String string = payloadJson.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        this.f24627b = string;
    }

    public final String a() {
        return this.f24626a;
    }

    public final String b() {
        return this.f24627b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return kotlin.jvm.internal.l.b(aeVar.f24626a, this.f24626a) && kotlin.jvm.internal.l.b(aeVar.f24627b, this.f24627b);
    }

    public final int hashCode() {
        return this.f24627b.hashCode() + (this.f24626a.hashCode() * 31);
    }
}
