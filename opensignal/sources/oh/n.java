package oh;

import java.io.Serializable;

/* loaded from: classes.dex */
public interface n {
    void a(Serializable serializable);

    void b(Serializable serializable);

    void c(Serializable serializable);

    void clearVideoSurface();

    void d(Serializable serializable);

    int getBufferedPercentage();

    long getCurrentPosition();

    long getDuration();

    boolean isCurrentWindowLive();

    void release();

    void setPlayWhenReady(boolean z10);

    void setVolume(float f10);
}
