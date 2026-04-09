package com.opensignal.sdk.common.measurements.videotest.exoplayer;

import ch.n;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.d1;
import com.google.android.exoplayer2.e1;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import h0.b;
import java.io.Serializable;
import java.util.List;
import ob.j;
import oh.t;

/* loaded from: classes.dex */
public class ExoPlayerEventListenerImpl implements Serializable, d1 {
    private static final String TAG = "ExoPlayerEventListener";
    private static final long serialVersionUID = 2088451862166922777L;
    private boolean mIsPlayerReady = false;
    private final t mVideoTest;

    public ExoPlayerEventListenerImpl(t tVar) {
        this.mVideoTest = tVar;
    }

    private void onStateReady() {
        if (this.mIsPlayerReady) {
            return;
        }
        this.mIsPlayerReady = true;
        this.mVideoTest.v();
        this.mVideoTest.C();
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(c1 c1Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onEvents(g1 g1Var, e1 e1Var) {
    }

    public void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
        n.b(TAG, "onExperimentalOffloadSchedulingEnabledChanged() called with: offloadSchedulingEnabled = [" + z10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onIsLoadingChanged(boolean z10) {
        n.b(TAG, "onIsLoadingChanged() called with: isLoading = [" + z10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onIsPlayingChanged(boolean z10) {
        n.b(TAG, "onIsPlayingChanged() called with: isPlaying = [" + z10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onLoadingChanged(boolean z10) {
        n.b(TAG, "onLoadingChanged() called with: isLoading = [" + z10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMediaItemTransition(n0 n0Var, int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayWhenReadyChanged(boolean z10, int i10) {
        n.b(TAG, "onPlayWhenReadyChanged() called with: playWhenReady = [" + z10 + "], reason = [" + i10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaybackParametersChanged(b1 b1Var) {
        n.b(TAG, "onPlaybackParametersChanged() called with: playbackParameters = [" + b1Var + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaybackStateChanged(int i10) {
        n.b(TAG, b.m("onPlaybackStateChanged() called with: state = [", i10, "]"));
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlaybackSuppressionReasonChanged(int i10) {
        n.b(TAG, b.m("onPlaybackSuppressionReasonChanged() called with: playbackSuppressionReason = [", i10, "]"));
    }

    public void onPlayerError(com.google.android.exoplayer2.n nVar) {
        this.mVideoTest.w(nVar.toString());
        this.mVideoTest.r();
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(z0 z0Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayerStateChanged(boolean z10, int i10) {
        n.b(TAG, "onPlayerStateChanged() called with: playWhenReady = [" + z10 + "], playbackState = [" + i10 + "]");
        if (i10 == 2) {
            this.mVideoTest.z();
        } else {
            if (i10 != 3) {
                return;
            }
            onStateReady();
            this.mVideoTest.B();
        }
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    public void onRepeatModeChanged(int i10) {
        n.b(TAG, b.m("onRepeatModeChanged() called with: repeatMode = [", i10, "]"));
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.d1
    public void onSeekProcessed() {
        n.b(TAG, "onSeekProcessed() called");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onShuffleModeEnabledChanged(boolean z10) {
        n.b(TAG, "onShuffleModeEnabledChanged() called with: shuffleModeEnabled = [" + z10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
    }

    @Override // com.google.android.exoplayer2.d1
    public void onTimelineChanged(w1 w1Var, int i10) {
        n.b(TAG, "onTimelineChanged() called with: timeline = [" + w1Var + "], reason = [" + i10 + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onTracksChanged(TrackGroupArray trackGroupArray, j jVar) {
        n.b(TAG, "onTracksChanged() called with: trackGroups = [" + trackGroupArray + "], trackSelections = [" + jVar + "]");
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPositionDiscontinuity(int i10) {
        n.b(TAG, b.m("onPositionDiscontinuity() called with: reason = [", i10, "]"));
    }

    public void onTimelineChanged(w1 w1Var, Object obj, int i10) {
        StringBuilder sb2 = new StringBuilder("onTimelineChanged() called with: timeline = [");
        sb2.append(w1Var);
        sb2.append("], manifest = [");
        sb2.append(obj);
        sb2.append("], reason = [");
        n.b(TAG, b.i(i10, "]", sb2));
    }

    @Override // com.google.android.exoplayer2.d1
    public void onPlayerError(z0 z0Var) {
        this.mVideoTest.w(z0Var.toString());
        this.mVideoTest.r();
    }
}
