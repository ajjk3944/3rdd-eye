package androidx.media3.common;

/* loaded from: classes.dex */
public interface s0 {
    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    a1 getCurrentTimeline();

    g1 getCurrentTracks();

    boolean getPlayWhenReady();

    n0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    m0 getPlayerError();

    long getTotalBufferedDuration();

    boolean isPlayingAd();
}
