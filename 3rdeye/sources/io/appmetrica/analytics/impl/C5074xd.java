package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5074xd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f42068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f42069b;

    public C5074xd(Bd bd, ModuleEvent moduleEvent) {
        this.f42068a = bd;
        this.f42069b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Bd.a(this.f42068a).reportEvent(this.f42069b);
    }
}
