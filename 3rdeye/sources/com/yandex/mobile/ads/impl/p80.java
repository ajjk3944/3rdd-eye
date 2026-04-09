package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import b9.C1992A;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class p80 {

    /* renamed from: a, reason: collision with root package name */
    private final ws0 f31638a;

    public p80(ws0 mainThreadHandler) {
        kotlin.jvm.internal.l.f(mainThreadHandler, "mainThreadHandler");
        this.f31638a = mainThreadHandler;
    }

    public final void a(final InterfaceC5480a<C1992A> onFastApp, final InterfaceC5480a<C1992A> onSlowApp) {
        kotlin.jvm.internal.l.f(onFastApp, "onFastApp");
        kotlin.jvm.internal.l.f(onSlowApp, "onSlowApp");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f31638a.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.C3
            @Override // java.lang.Runnable
            public final void run() {
                p80.a(jElapsedRealtime, onFastApp, onSlowApp);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(long j4, InterfaceC5480a onFastApp, InterfaceC5480a onSlowApp) {
        kotlin.jvm.internal.l.f(onFastApp, "$onFastApp");
        kotlin.jvm.internal.l.f(onSlowApp, "$onSlowApp");
        if (SystemClock.elapsedRealtime() - j4 <= 5000) {
            onFastApp.invoke();
        } else {
            onSlowApp.invoke();
        }
    }
}
