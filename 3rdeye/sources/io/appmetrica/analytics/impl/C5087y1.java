package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5087y1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f42097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f42098b;

    public C5087y1(I1 i12, Configuration configuration) {
        this.f42098b = i12;
        this.f42097a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f42098b.f39601b.onConfigurationChanged(this.f42097a);
    }
}
