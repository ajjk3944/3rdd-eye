package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5147m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42574a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42575b;

    public C5147m(boolean z10, long j4) {
        this.f42574a = z10;
        this.f42575b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5147m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C5147m c5147m = (C5147m) obj;
        return this.f42574a == c5147m.f42574a && this.f42575b == c5147m.f42575b;
    }

    public final int hashCode() {
        int i = this.f42574a ? 1231 : 1237;
        long j4 = this.f42575b;
        return ((int) (j4 ^ (j4 >>> 32))) + (i * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        sb.append(this.f42574a);
        sb.append(", delaySeconds=");
        return androidx.work.s.f(sb, this.f42575b, ')');
    }

    public C5147m(F f10) {
        this(f10.b(), f10.a());
    }
}
