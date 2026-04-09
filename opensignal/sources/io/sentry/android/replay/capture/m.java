package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.android.replay.t;
import io.sentry.y5;

/* loaded from: classes.dex */
public interface m {
    void a(MotionEvent motionEvent);

    void b(t tVar);

    m c();

    void d(int i10, io.sentry.protocol.t tVar, y5 y5Var);

    void e(boolean z10, as.d dVar);

    void f(b1.d dVar);

    void pause();

    void stop();
}
