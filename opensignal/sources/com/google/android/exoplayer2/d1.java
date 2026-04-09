package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes.dex */
public interface d1 {
    void onAvailableCommandsChanged(c1 c1Var);

    void onEvents(g1 g1Var, e1 e1Var);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onLoadingChanged(boolean z10);

    void onMaxSeekToPreviousPositionChanged(int i10);

    void onMediaItemTransition(n0 n0Var, int i10);

    void onMediaMetadataChanged(p0 p0Var);

    void onPlayWhenReadyChanged(boolean z10, int i10);

    void onPlaybackParametersChanged(b1 b1Var);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerError(z0 z0Var);

    void onPlayerErrorChanged(z0 z0Var);

    void onPlayerStateChanged(boolean z10, int i10);

    void onPlaylistMetadataChanged(p0 p0Var);

    void onPositionDiscontinuity(int i10);

    void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10);

    void onRepeatModeChanged(int i10);

    void onSeekBackIncrementChanged(long j);

    void onSeekForwardIncrementChanged(long j);

    void onSeekProcessed();

    void onShuffleModeEnabledChanged(boolean z10);

    void onStaticMetadataChanged(List list);

    void onTimelineChanged(w1 w1Var, int i10);

    void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar);
}
