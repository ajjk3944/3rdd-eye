package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4474a4 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final C4769lf f40508a;

    public C4474a4(C4769lf c4769lf) {
        super(c4769lf.e(), "[ClientApiTrackingStatusToggle]");
        this.f40508a = c4769lf;
    }

    public final void a(boolean z10) {
        updateState(z10);
        this.f40508a.f(z10);
    }
}
