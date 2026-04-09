package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import com.yandex.mobile.ads.common.AdError;

/* loaded from: classes3.dex */
public final class vk2 implements AdError {

    /* renamed from: a, reason: collision with root package name */
    private final String f34613a;

    public vk2(String description) {
        kotlin.jvm.internal.l.f(description, "description");
        this.f34613a = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk2) && kotlin.jvm.internal.l.b(this.f34613a, ((vk2) obj).f34613a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f34613a;
    }

    public final int hashCode() {
        return this.f34613a.hashCode();
    }

    public final String toString() {
        return C1154e9.i("YandexAdError(description=", this.f34613a, ")");
    }
}
