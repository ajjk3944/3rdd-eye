package androidx.media3.common;

import java.util.List;

/* loaded from: classes.dex */
final class ForwardingPlayer$ForwardingListener implements q0 {
    private final s forwardingPlayer;
    private final q0 listener;

    public ForwardingPlayer$ForwardingListener(s sVar, q0 q0Var) {
        this.listener = q0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForwardingPlayer$ForwardingListener) {
            throw null;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    @Override // androidx.media3.common.q0
    public void onAudioAttributesChanged(f fVar) {
        this.listener.onAudioAttributesChanged(fVar);
    }

    @Override // androidx.media3.common.q0
    public void onAudioSessionIdChanged(int i10) {
        this.listener.onAudioSessionIdChanged(i10);
    }

    @Override // androidx.media3.common.q0
    public void onAvailableCommandsChanged(o0 o0Var) {
        this.listener.onAvailableCommandsChanged(o0Var);
    }

    @Override // androidx.media3.common.q0
    public void onCues(List<z4.b> list) {
        this.listener.onCues(list);
    }

    @Override // androidx.media3.common.q0
    public void onDeviceInfoChanged(m mVar) {
        this.listener.onDeviceInfoChanged(mVar);
    }

    @Override // androidx.media3.common.q0
    public void onDeviceVolumeChanged(int i10, boolean z10) {
        this.listener.onDeviceVolumeChanged(i10, z10);
    }

    @Override // androidx.media3.common.q0
    public void onEvents(s0 s0Var, p0 p0Var) {
        this.listener.onEvents(null, p0Var);
    }

    @Override // androidx.media3.common.q0
    public void onIsLoadingChanged(boolean z10) {
        this.listener.onIsLoadingChanged(z10);
    }

    @Override // androidx.media3.common.q0
    public void onIsPlayingChanged(boolean z10) {
        this.listener.onIsPlayingChanged(z10);
    }

    @Override // androidx.media3.common.q0
    public void onLoadingChanged(boolean z10) {
        this.listener.onIsLoadingChanged(z10);
    }

    @Override // androidx.media3.common.q0
    public void onMaxSeekToPreviousPositionChanged(long j) {
        this.listener.onMaxSeekToPreviousPositionChanged(j);
    }

    @Override // androidx.media3.common.q0
    public void onMediaItemTransition(e0 e0Var, int i10) {
        this.listener.onMediaItemTransition(e0Var, i10);
    }

    @Override // androidx.media3.common.q0
    public void onMediaMetadataChanged(g0 g0Var) {
        this.listener.onMediaMetadataChanged(g0Var);
    }

    @Override // androidx.media3.common.q0
    public void onMetadata(Metadata metadata) {
        this.listener.onMetadata(metadata);
    }

    @Override // androidx.media3.common.q0
    public void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.listener.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // androidx.media3.common.q0
    public void onPlaybackParametersChanged(n0 n0Var) {
        this.listener.onPlaybackParametersChanged(n0Var);
    }

    @Override // androidx.media3.common.q0
    public void onPlaybackStateChanged(int i10) {
        this.listener.onPlaybackStateChanged(i10);
    }

    @Override // androidx.media3.common.q0
    public void onPlaybackSuppressionReasonChanged(int i10) {
        this.listener.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // androidx.media3.common.q0
    public void onPlayerError(m0 m0Var) {
        this.listener.onPlayerError(m0Var);
    }

    @Override // androidx.media3.common.q0
    public void onPlayerErrorChanged(m0 m0Var) {
        this.listener.onPlayerErrorChanged(m0Var);
    }

    @Override // androidx.media3.common.q0
    public void onPlayerStateChanged(boolean z10, int i10) {
        this.listener.onPlayerStateChanged(z10, i10);
    }

    @Override // androidx.media3.common.q0
    public void onPlaylistMetadataChanged(g0 g0Var) {
        this.listener.onPlaylistMetadataChanged(g0Var);
    }

    @Override // androidx.media3.common.q0
    public void onPositionDiscontinuity(int i10) {
        this.listener.onPositionDiscontinuity(i10);
    }

    @Override // androidx.media3.common.q0
    public void onRenderedFirstFrame() {
        this.listener.onRenderedFirstFrame();
    }

    @Override // androidx.media3.common.q0
    public void onRepeatModeChanged(int i10) {
        this.listener.onRepeatModeChanged(i10);
    }

    @Override // androidx.media3.common.q0
    public void onSeekBackIncrementChanged(long j) {
        this.listener.onSeekBackIncrementChanged(j);
    }

    @Override // androidx.media3.common.q0
    public void onSeekForwardIncrementChanged(long j) {
        this.listener.onSeekForwardIncrementChanged(j);
    }

    @Override // androidx.media3.common.q0
    public void onSeekProcessed() {
        this.listener.onSeekProcessed();
    }

    @Override // androidx.media3.common.q0
    public void onShuffleModeEnabledChanged(boolean z10) {
        this.listener.onShuffleModeEnabledChanged(z10);
    }

    @Override // androidx.media3.common.q0
    public void onSkipSilenceEnabledChanged(boolean z10) {
        this.listener.onSkipSilenceEnabledChanged(z10);
    }

    @Override // androidx.media3.common.q0
    public void onSurfaceSizeChanged(int i10, int i11) {
        this.listener.onSurfaceSizeChanged(i10, i11);
    }

    @Override // androidx.media3.common.q0
    public void onTimelineChanged(a1 a1Var, int i10) {
        this.listener.onTimelineChanged(a1Var, i10);
    }

    @Override // androidx.media3.common.q0
    public void onTrackSelectionParametersChanged(e1 e1Var) {
        this.listener.onTrackSelectionParametersChanged(e1Var);
    }

    @Override // androidx.media3.common.q0
    public void onTracksChanged(g1 g1Var) {
        this.listener.onTracksChanged(g1Var);
    }

    @Override // androidx.media3.common.q0
    public void onVideoSizeChanged(h1 h1Var) {
        this.listener.onVideoSizeChanged(h1Var);
    }

    @Override // androidx.media3.common.q0
    public void onVolumeChanged(float f10) {
        this.listener.onVolumeChanged(f10);
    }

    @Override // androidx.media3.common.q0
    public void onCues(z4.c cVar) {
        this.listener.onCues(cVar);
    }

    @Override // androidx.media3.common.q0
    public void onPositionDiscontinuity(r0 r0Var, r0 r0Var2, int i10) {
        this.listener.onPositionDiscontinuity(r0Var, r0Var2, i10);
    }
}
