package io.sentry.android.core;

import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes.dex */
public final class ScreenshotEventProcessor implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f11506a;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f11507d;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f11508g;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, f0 f0Var) {
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11506a = sentryAndroidOptions;
        this.f11507d = f0Var;
        this.f11508g = new io.sentry.android.core.internal.util.g(3, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            ic.a.b("Screenshot");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    @Override // io.sentry.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.t4 f(io.sentry.t4 r17, io.sentry.h0 r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.f(io.sentry.t4, io.sentry.h0):io.sentry.t4");
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, io.sentry.h0 h0Var) {
        return a0Var;
    }
}
