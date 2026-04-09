package com.yandex.mobile.ads.impl;

import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.q4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4185q4 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4191r4 f32014a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f32015b;

    public C4185q4(EnumC4191r4 adLoadingPhaseType, Map<String, ? extends Object> reportParameters) {
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        kotlin.jvm.internal.l.f(reportParameters, "reportParameters");
        this.f32014a = adLoadingPhaseType;
        this.f32015b = reportParameters;
    }

    public final EnumC4191r4 a() {
        return this.f32014a;
    }

    public final Map<String, Object> b() {
        return this.f32015b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4185q4)) {
            return false;
        }
        C4185q4 c4185q4 = (C4185q4) obj;
        return this.f32014a == c4185q4.f32014a && kotlin.jvm.internal.l.b(this.f32015b, c4185q4.f32015b);
    }

    public final int hashCode() {
        return this.f32015b.hashCode() + (this.f32014a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f32014a + ", reportParameters=" + this.f32015b + ")";
    }
}
