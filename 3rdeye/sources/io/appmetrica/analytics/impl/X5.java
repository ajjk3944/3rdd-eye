package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes3.dex */
public final class X5 {

    /* renamed from: a, reason: collision with root package name */
    public final C4805n f40372a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f40373b;

    /* renamed from: c, reason: collision with root package name */
    public Context f40374c;

    /* renamed from: d, reason: collision with root package name */
    public final W5 f40375d;

    public X5(C4805n c4805n) {
        this(c4805n, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f40374c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f40372a.a(applicationContext);
            this.f40372a.registerListener(this.f40375d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f40374c = applicationContext;
        }
    }

    public X5(C4805n c4805n, IReporter iReporter) {
        this.f40372a = c4805n;
        this.f40373b = iReporter;
        this.f40375d = new W5(this);
    }

    public /* synthetic */ X5(C4805n c4805n, int i) {
        this(c4805n, AbstractC4962t1.a());
    }

    public final synchronized Context a() {
        return this.f40374c;
    }
}
