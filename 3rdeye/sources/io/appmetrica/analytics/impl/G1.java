package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class G1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f39468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f39469b;

    public G1(I1 i12, Bundle bundle) {
        this.f39469b = i12;
        this.f39468a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39469b.f39601b.resumeUserSession(this.f39468a);
    }
}
