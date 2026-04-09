package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes.dex */
class ForwardingPlayer$ForwardingEventListener implements d1 {
    private final d1 eventListener;
    private final i0 forwardingPlayer;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForwardingPlayer$ForwardingEventListener) {
            throw null;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.d1
    public void onAvailableCommandsChanged(c1 c1Var) {
        this.eventListener.onAvailableCommandsChanged(c1Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onEvents(g1 g1Var, e1 e1Var) {
        this.eventListener.onEvents(null, e1Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onIsLoadingChanged(boolean z10) {
        this.eventListener.onIsLoadingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onIsPlayingChanged(boolean z10) {
        this.eventListener.onIsPlayingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onLoadingChanged(boolean z10) {
        this.eventListener.onIsLoadingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onMaxSeekToPreviousPositionChanged(int i10) {
        this.eventListener.onMaxSeekToPreviousPositionChanged(i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onMediaItemTransition(n0 n0Var, int i10) {
        this.eventListener.onMediaItemTransition(n0Var, i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onMediaMetadataChanged(p0 p0Var) {
        this.eventListener.onMediaMetadataChanged(p0Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.eventListener.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaybackParametersChanged(b1 b1Var) {
        this.eventListener.onPlaybackParametersChanged(b1Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaybackStateChanged(int i10) {
        this.eventListener.onPlaybackStateChanged(i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaybackSuppressionReasonChanged(int i10) {
        this.eventListener.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayerError(z0 z0Var) {
        this.eventListener.onPlayerError(z0Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayerErrorChanged(z0 z0Var) {
        this.eventListener.onPlayerErrorChanged(z0Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayerStateChanged(boolean z10, int i10) {
        this.eventListener.onPlayerStateChanged(z10, i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaylistMetadataChanged(p0 p0Var) {
        this.eventListener.onPlaylistMetadataChanged(p0Var);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPositionDiscontinuity(int i10) {
        this.eventListener.onPositionDiscontinuity(i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onRepeatModeChanged(int i10) {
        this.eventListener.onRepeatModeChanged(i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onSeekBackIncrementChanged(long j) {
        this.eventListener.onSeekBackIncrementChanged(j);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onSeekForwardIncrementChanged(long j) {
        this.eventListener.onSeekForwardIncrementChanged(j);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onSeekProcessed() {
        this.eventListener.onSeekProcessed();
    }

    @Override // com.google.android.exoplayer2.d1
    public void onShuffleModeEnabledChanged(boolean z10) {
        this.eventListener.onShuffleModeEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    public void onStaticMetadataChanged(List<Metadata> list) {
        this.eventListener.onStaticMetadataChanged(list);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onTimelineChanged(w1 w1Var, int i10) {
        this.eventListener.onTimelineChanged(w1Var, i10);
    }

    @Override // com.google.android.exoplayer2.d1
    public void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar) {
        this.eventListener.onTracksChanged(trackGroupArray, jVar);
    }

    private ForwardingPlayer$ForwardingEventListener(i0 i0Var, d1 d1Var) {
        this.eventListener = d1Var;
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        this.eventListener.onPositionDiscontinuity(f1Var, f1Var2, i10);
    }
}
