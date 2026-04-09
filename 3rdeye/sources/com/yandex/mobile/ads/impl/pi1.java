package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;

/* loaded from: classes3.dex */
public final class pi1 {

    /* renamed from: a, reason: collision with root package name */
    private final Timeline.Period f31766a;

    /* renamed from: b, reason: collision with root package name */
    private Timeline f31767b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31768c;

    public /* synthetic */ pi1() {
        Timeline.Period period = new Timeline.Period();
        Timeline EMPTY = Timeline.EMPTY;
        kotlin.jvm.internal.l.e(EMPTY, "EMPTY");
        this(period, EMPTY, false);
    }

    public final Timeline.Period a() {
        return this.f31766a;
    }

    public final Timeline b() {
        return this.f31767b;
    }

    public final boolean c() {
        return this.f31768c;
    }

    public final void a(boolean z10) {
        this.f31768c = z10;
    }

    public final void a(Timeline timeline) {
        kotlin.jvm.internal.l.f(timeline, "<set-?>");
        this.f31767b = timeline;
    }

    public pi1(Timeline.Period period, Timeline timeline, boolean z10) {
        kotlin.jvm.internal.l.f(period, "period");
        kotlin.jvm.internal.l.f(timeline, "timeline");
        this.f31766a = period;
        this.f31767b = timeline;
        this.f31768c = z10;
    }
}
