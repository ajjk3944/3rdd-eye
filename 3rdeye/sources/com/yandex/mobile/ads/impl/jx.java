package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class jx {

    /* renamed from: a, reason: collision with root package name */
    private final List<k11> f29376a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b11> f29377b;

    public jx(List<k11> sdkLogs, List<b11> networkLogs) {
        kotlin.jvm.internal.l.f(sdkLogs, "sdkLogs");
        kotlin.jvm.internal.l.f(networkLogs, "networkLogs");
        this.f29376a = sdkLogs;
        this.f29377b = networkLogs;
    }

    public final List<b11> a() {
        return this.f29377b;
    }

    public final List<k11> b() {
        return this.f29376a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        return kotlin.jvm.internal.l.b(this.f29376a, jxVar.f29376a) && kotlin.jvm.internal.l.b(this.f29377b, jxVar.f29377b);
    }

    public final int hashCode() {
        return this.f29377b.hashCode() + (this.f29376a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f29376a + ", networkLogs=" + this.f29377b + ")";
    }
}
