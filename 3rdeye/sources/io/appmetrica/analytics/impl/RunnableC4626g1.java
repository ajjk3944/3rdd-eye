package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4626g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f40911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40912b;

    public RunnableC4626g1(C4859p1 c4859p1, ExternalAttribution externalAttribution) {
        this.f40912b = c4859p1;
        this.f40911a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40912b).a(this.f40911a);
    }
}
