package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4600f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f40832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40833b;

    public RunnableC4600f1(C4859p1 c4859p1, AnrListener anrListener) {
        this.f40833b = c4859p1;
        this.f40832a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40833b).a(this.f40832a);
    }
}
