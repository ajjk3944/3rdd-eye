package o5;

import android.os.Handler;

/* loaded from: classes.dex */
public interface b0 {
    void addDrmEventListener(Handler handler, i5.g gVar);

    void addEventListener(Handler handler, f0 f0Var);

    x createPeriod(z zVar, r5.b bVar, long j);

    void disable(a0 a0Var);

    void enable(a0 a0Var);

    default androidx.media3.common.a1 getInitialTimeline() {
        return null;
    }

    androidx.media3.common.e0 getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError();

    void prepareSource(a0 a0Var, b5.b0 b0Var, e5.o0 o0Var);

    void releasePeriod(x xVar);

    void releaseSource(a0 a0Var);

    void removeDrmEventListener(i5.g gVar);

    void removeEventListener(f0 f0Var);
}
