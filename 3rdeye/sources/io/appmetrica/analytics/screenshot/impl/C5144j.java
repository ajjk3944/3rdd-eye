package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5144j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42566a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42567b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42568c;

    public C5144j(boolean z10, List list, long j4) {
        this.f42566a = z10;
        this.f42567b = list;
        this.f42568c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5144j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C5144j c5144j = (C5144j) obj;
        return this.f42566a == c5144j.f42566a && kotlin.jvm.internal.l.b(this.f42567b, c5144j.f42567b) && this.f42568c == c5144j.f42568c;
    }

    public final int hashCode() {
        int iHashCode = (this.f42567b.hashCode() + ((this.f42566a ? 1231 : 1237) * 31)) * 31;
        long j4 = this.f42568c;
        return ((int) (j4 ^ (j4 >>> 32))) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb.append(this.f42566a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.f42567b);
        sb.append(", detectWindowSeconds=");
        return androidx.work.s.f(sb, this.f42568c, ')');
    }

    public C5144j(C5159z c5159z) {
        this(c5159z.b(), c5159z.c(), c5159z.a());
    }
}
