package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.i;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.h f11736d;

    public h(Window.Callback callback, io.sentry.android.core.internal.util.h hVar) {
        super(callback);
        this.f11736d = hVar;
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final void onContentChanged() throws Throwable {
        super.onContentChanged();
        this.f11736d.run();
    }
}
