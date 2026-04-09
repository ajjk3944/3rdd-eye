package ya;

import android.os.Handler;
import com.google.android.exoplayer2.w1;

/* loaded from: classes.dex */
public interface x {
    void addDrmEventListener(Handler handler, ba.e eVar);

    void addEventListener(Handler handler, b0 b0Var);

    t createPeriod(v vVar, pb.b bVar, long j);

    void disable(w wVar);

    void enable(w wVar);

    default w1 getInitialTimeline() {
        return null;
    }

    com.google.android.exoplayer2.n0 getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError();

    void prepareSource(w wVar, pb.u0 u0Var);

    void releasePeriod(t tVar);

    void releaseSource(w wVar);

    void removeDrmEventListener(ba.e eVar);

    void removeEventListener(b0 b0Var);
}
