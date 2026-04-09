package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes3.dex */
public final class ll2 implements ImpressionData {

    /* renamed from: a, reason: collision with root package name */
    private final C4108f4 f30037a;

    public ll2(C4108f4 impressionData) {
        kotlin.jvm.internal.l.f(impressionData, "impressionData");
        this.f30037a = impressionData;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ll2) && kotlin.jvm.internal.l.b(((ll2) obj).f30037a, this.f30037a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f30037a.c();
    }

    public final int hashCode() {
        return this.f30037a.hashCode();
    }
}
