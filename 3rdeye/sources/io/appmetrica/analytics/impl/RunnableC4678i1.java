package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4678i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f41031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41032b;

    public RunnableC4678i1(C4859p1 c4859p1, Activity activity) {
        this.f41032b = c4859p1;
        this.f41031a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1 c4859p1 = this.f41032b;
        Uk uk = c4859p1.f41409h;
        Activity activity = this.f41031a;
        InterfaceC4507bb interfaceC4507bb = c4859p1.d().f39254a;
        if (activity != null) {
            uk.f40253f.a(activity);
        }
        if (uk.f40252e.a(activity, EnumC4831o.PAUSED)) {
            interfaceC4507bb.b(activity);
        }
    }
}
