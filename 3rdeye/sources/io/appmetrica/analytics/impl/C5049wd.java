package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5049wd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f41968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f41969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41970c;

    public C5049wd(Bd bd, AdRevenue adRevenue, boolean z10) {
        this.f41968a = bd;
        this.f41969b = adRevenue;
        this.f41970c = z10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Bd.a(this.f41968a).reportAdRevenue(this.f41969b, this.f41970c);
    }
}
