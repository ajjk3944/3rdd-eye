package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5146l {

    /* renamed from: a, reason: collision with root package name */
    public final C5143i f42571a;

    /* renamed from: b, reason: collision with root package name */
    public final C5147m f42572b;

    /* renamed from: c, reason: collision with root package name */
    public final C5144j f42573c;

    public C5146l(C5143i c5143i, C5147m c5147m, C5144j c5144j) {
        this.f42571a = c5143i;
        this.f42572b = c5147m;
        this.f42573c = c5144j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5146l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C5146l c5146l = (C5146l) obj;
        return kotlin.jvm.internal.l.b(this.f42571a, c5146l.f42571a) && kotlin.jvm.internal.l.b(this.f42572b, c5146l.f42572b) && kotlin.jvm.internal.l.b(this.f42573c, c5146l.f42573c);
    }

    public final int hashCode() {
        C5143i c5143i = this.f42571a;
        int iHashCode = (c5143i != null ? c5143i.hashCode() : 0) * 31;
        C5147m c5147m = this.f42572b;
        int iHashCode2 = (iHashCode + (c5147m != null ? c5147m.hashCode() : 0)) * 31;
        C5144j c5144j = this.f42573c;
        return iHashCode2 + (c5144j != null ? c5144j.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f42571a + ", serviceCaptorConfig=" + this.f42572b + ", contentObserverCaptorConfig=" + this.f42573c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5146l(D d10) {
        C5157x c5157xA = d10.a();
        C5143i c5143i = c5157xA != null ? new C5143i(c5157xA) : null;
        F fC = d10.c();
        C5147m c5147m = fC != null ? new C5147m(fC) : null;
        C5159z c5159zB = d10.b();
        this(c5143i, c5147m, c5159zB != null ? new C5144j(c5159zB) : null);
    }
}
