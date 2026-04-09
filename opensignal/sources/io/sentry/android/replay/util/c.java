package io.sentry.android.replay.util;

import br.l;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11999a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f12000d;

    public c(Runnable runnable, String str) {
        l.e(str, "taskName");
        l.e(runnable, "delegate");
        this.f11999a = str;
        this.f12000d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12000d.run();
    }
}
