package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class F1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f39396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f39397c;

    public F1(I1 i12, int i, Bundle bundle) {
        this.f39397c = i12;
        this.f39395a = i;
        this.f39396b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f39397c.f39601b.reportData(this.f39395a, this.f39396b);
    }
}
