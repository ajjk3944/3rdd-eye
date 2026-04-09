package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    public final int f25655a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final float f25656b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ci.class == obj.getClass()) {
            ci ciVar = (ci) obj;
            if (this.f25655a == ciVar.f25655a && Float.compare(ciVar.f25656b, this.f25656b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25656b) + ((this.f25655a + 527) * 31);
    }
}
