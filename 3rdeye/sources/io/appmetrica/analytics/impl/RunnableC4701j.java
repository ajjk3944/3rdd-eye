package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4701j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f41095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4753l f41096b;

    public RunnableC4701j(C4753l c4753l, Activity activity) {
        this.f41096b = c4753l;
        this.f41095a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41096b.a(this.f41095a);
    }
}
