package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5145k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42569a;

    /* renamed from: b, reason: collision with root package name */
    public final C5146l f42570b;

    public C5145k(boolean z10, C5146l c5146l) {
        this.f42569a = z10;
        this.f42570b = c5146l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5145k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C5145k c5145k = (C5145k) obj;
        return this.f42569a == c5145k.f42569a && kotlin.jvm.internal.l.b(this.f42570b, c5145k.f42570b);
    }

    public final int hashCode() {
        int i = (this.f42569a ? 1231 : 1237) * 31;
        C5146l c5146l = this.f42570b;
        return i + (c5146l != null ? c5146l.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f42569a + ", config=" + this.f42570b + ')';
    }
}
