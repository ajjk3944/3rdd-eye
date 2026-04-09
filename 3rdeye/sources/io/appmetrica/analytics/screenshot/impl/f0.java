package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42555a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42557c;

    public f0(boolean z10, List list, long j4) {
        this.f42555a = z10;
        this.f42556b = list;
        this.f42557c = j4;
    }

    public final long a() {
        return this.f42557c;
    }

    public final boolean b() {
        return this.f42555a;
    }

    public final List c() {
        return this.f42556b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb.append(this.f42555a);
        sb.append(", mediaStoreColumnNames=");
        sb.append(this.f42556b);
        sb.append(", detectWindowSeconds=");
        return androidx.work.s.f(sb, this.f42557c, ')');
    }

    public f0(C5149o c5149o) {
        this(c5149o.b(), c5149o.c(), c5149o.a());
    }
}
