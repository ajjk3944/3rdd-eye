package androidx.media3.common;

import java.util.List;

/* loaded from: classes.dex */
public interface q0 {
    void onAudioAttributesChanged(f fVar);

    void onAudioSessionIdChanged(int i10);

    void onAvailableCommandsChanged(o0 o0Var);

    void onCues(List list);

    void onCues(z4.c cVar);

    void onDeviceInfoChanged(m mVar);

    void onDeviceVolumeChanged(int i10, boolean z10);

    void onEvents(s0 s0Var, p0 p0Var);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onLoadingChanged(boolean z10);

    void onMaxSeekToPreviousPositionChanged(long j);

    void onMediaItemTransition(e0 e0Var, int i10);

    void onMediaMetadataChanged(g0 g0Var);

    void onMetadata(Metadata metadata);

    void onPlayWhenReadyChanged(boolean z10, int i10);

    void onPlaybackParametersChanged(n0 n0Var);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerError(m0 m0Var);

    void onPlayerErrorChanged(m0 m0Var);

    void onPlayerStateChanged(boolean z10, int i10);

    void onPlaylistMetadataChanged(g0 g0Var);

    void onPositionDiscontinuity(int i10);

    void onPositionDiscontinuity(r0 r0Var, r0 r0Var2, int i10);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i10);

    void onSeekBackIncrementChanged(long j);

    void onSeekForwardIncrementChanged(long j);

    void onSeekProcessed();

    void onShuffleModeEnabledChanged(boolean z10);

    void onSkipSilenceEnabledChanged(boolean z10);

    void onSurfaceSizeChanged(int i10, int i11);

    void onTimelineChanged(a1 a1Var, int i10);

    void onTrackSelectionParametersChanged(e1 e1Var);

    void onTracksChanged(g1 g1Var);

    void onVideoSizeChanged(h1 h1Var);

    void onVolumeChanged(float f10);
}
