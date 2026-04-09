package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class y52 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35639a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35640b;

    /* renamed from: c, reason: collision with root package name */
    private final aa2 f35641c;

    public y52(String event, String trackingUrl, aa2 aa2Var) {
        kotlin.jvm.internal.l.f(event, "event");
        kotlin.jvm.internal.l.f(trackingUrl, "trackingUrl");
        this.f35639a = event;
        this.f35640b = trackingUrl;
        this.f35641c = aa2Var;
    }

    public final String a() {
        return this.f35639a;
    }

    public final aa2 b() {
        return this.f35641c;
    }

    public final String c() {
        return this.f35640b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y52)) {
            return false;
        }
        y52 y52Var = (y52) obj;
        return kotlin.jvm.internal.l.b(this.f35639a, y52Var.f35639a) && kotlin.jvm.internal.l.b(this.f35640b, y52Var.f35640b) && kotlin.jvm.internal.l.b(this.f35641c, y52Var.f35641c);
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f35640b, this.f35639a.hashCode() * 31, 31);
        aa2 aa2Var = this.f35641c;
        return iA + (aa2Var == null ? 0 : aa2Var.hashCode());
    }

    public final String toString() {
        String str = this.f35639a;
        String str2 = this.f35640b;
        aa2 aa2Var = this.f35641c;
        StringBuilder sbD = j6.l.d("TrackingEvent(event=", str, ", trackingUrl=", str2, ", offset=");
        sbD.append(aa2Var);
        sbD.append(")");
        return sbD.toString();
    }
}
