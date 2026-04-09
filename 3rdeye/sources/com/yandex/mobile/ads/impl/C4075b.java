package com.yandex.mobile.ads.impl;

import c9.C2101v;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4075b {

    /* renamed from: a, reason: collision with root package name */
    private final String f25033a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Long> f25034b;

    public C4075b() {
        this(0);
    }

    public final String a() {
        return this.f25033a;
    }

    public final Set<Long> b() {
        return this.f25034b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4075b)) {
            return false;
        }
        C4075b c4075b = (C4075b) obj;
        return kotlin.jvm.internal.l.b(this.f25033a, c4075b.f25033a) && kotlin.jvm.internal.l.b(this.f25034b, c4075b.f25034b);
    }

    public final int hashCode() {
        return this.f25034b.hashCode() + (this.f25033a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f25033a + ", triggeredTestIds=" + this.f25034b + ")";
    }

    public /* synthetic */ C4075b(int i) {
        this("", C2101v.f18583b);
    }

    public C4075b(String experiments, Set<Long> triggeredTestIds) {
        kotlin.jvm.internal.l.f(experiments, "experiments");
        kotlin.jvm.internal.l.f(triggeredTestIds, "triggeredTestIds");
        this.f25033a = experiments;
        this.f25034b = triggeredTestIds;
    }
}
