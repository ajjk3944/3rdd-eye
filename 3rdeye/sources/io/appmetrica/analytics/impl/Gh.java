package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Gh {

    /* renamed from: a, reason: collision with root package name */
    public final C4683i6 f39533a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39535c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f39536d;

    /* renamed from: e, reason: collision with root package name */
    public final Qh f39537e;

    public Gh(C4683i6 c4683i6, boolean z10, int i, HashMap map, Qh qh) {
        this.f39533a = c4683i6;
        this.f39534b = z10;
        this.f39535c = i;
        this.f39536d = map;
        this.f39537e = qh;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f39533a + ", serviceDataReporterType=" + this.f39535c + ", environment=" + this.f39537e + ", isCrashReport=" + this.f39534b + ", trimmedFields=" + this.f39536d + ')';
    }
}
