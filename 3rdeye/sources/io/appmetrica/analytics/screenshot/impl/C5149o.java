package io.appmetrica.analytics.screenshot.impl;

import c9.C2091l;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5149o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42578a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42579b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42580c;

    public C5149o(boolean z10, List list, long j4) {
        this.f42578a = z10;
        this.f42579b = list;
        this.f42580c = j4;
    }

    public final long a() {
        return this.f42580c;
    }

    public final boolean b() {
        return this.f42578a;
    }

    public final List c() {
        return this.f42579b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        sb.append(this.f42578a);
        sb.append(", mediaStoreColumnNames='");
        sb.append(this.f42579b);
        sb.append("', detectWindowSeconds=");
        return androidx.work.s.f(sb, this.f42580c, ')');
    }

    public C5149o() {
        this(new L().f42508a, C2091l.t(new L().f42510c), new L().f42509b);
    }
}
