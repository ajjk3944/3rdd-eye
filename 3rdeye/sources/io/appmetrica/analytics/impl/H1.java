package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class H1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f39556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f39557b;

    public H1(I1 i12, Bundle bundle) {
        this.f39557b = i12;
        this.f39556a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39557b.f39601b.pauseUserSession(this.f39556a);
    }
}
