package com.yandex.mobile.ads.impl;

import androidx.media3.common.Timeline;

/* loaded from: classes3.dex */
public final class oi1 {

    /* renamed from: a, reason: collision with root package name */
    private final Timeline.Period f31386a;

    /* renamed from: b, reason: collision with root package name */
    private Timeline f31387b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31388c;

    public /* synthetic */ oi1() {
        Timeline.Period period = new Timeline.Period();
        Timeline EMPTY = Timeline.EMPTY;
        kotlin.jvm.internal.l.e(EMPTY, "EMPTY");
        this(period, EMPTY, false);
    }

    public final Timeline.Period a() {
        return this.f31386a;
    }

    public final Timeline b() {
        return this.f31387b;
    }

    public final boolean c() {
        return this.f31388c;
    }

    public final void a(boolean z10) {
        this.f31388c = z10;
    }

    public final void a(Timeline timeline) {
        kotlin.jvm.internal.l.f(timeline, "<set-?>");
        this.f31387b = timeline;
    }

    public oi1(Timeline.Period period, Timeline timeline, boolean z10) {
        kotlin.jvm.internal.l.f(period, "period");
        kotlin.jvm.internal.l.f(timeline, "timeline");
        this.f31386a = period;
        this.f31387b = timeline;
        this.f31388c = z10;
    }
}
