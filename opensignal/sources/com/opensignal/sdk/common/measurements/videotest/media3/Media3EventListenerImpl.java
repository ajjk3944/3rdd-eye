package com.opensignal.sdk.common.measurements.videotest.media3;

import androidx.media3.common.Metadata;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.e1;
import androidx.media3.common.f;
import androidx.media3.common.g0;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.m;
import androidx.media3.common.m0;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.p0;
import androidx.media3.common.q0;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.exoplayer.trackselection.z;
import ch.n;
import h0.b;
import java.io.Serializable;
import java.util.List;
import oh.t;
import z4.c;

/* loaded from: classes.dex */
public class Media3EventListenerImpl implements q0, Serializable {
    private static final String TAG = "Media3EventListenerImpl";
    private static final long serialVersionUID = 1550836096220387528L;
    private boolean mIsPlayerReady = false;
    private final t mVideoTest;

    public Media3EventListenerImpl(t tVar) {
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

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(f fVar) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(o0 o0Var) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(m mVar) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onEvents(s0 s0Var, p0 p0Var) {
    }

    public void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
        n.b(TAG, "onExperimentalOffloadSchedulingEnabledChanged() called with: offloadSchedulingEnabled = [" + z10 + "]");
    }

    @Override // androidx.media3.common.q0
    public void onIsLoadingChanged(boolean z10) {
        n.b(TAG, "onIsLoadingChanged() called with: isLoading = [" + z10 + "]");
    }

    @Override // androidx.media3.common.q0
    public void onIsPlayingChanged(boolean z10) {
        n.b(TAG, "onIsPlayingChanged() called with: isPlaying = [" + z10 + "]");
    }

    @Override // androidx.media3.common.q0
    public void onLoadingChanged(boolean z10) {
        n.b(TAG, "onLoadingChanged() called with: isLoading = [" + z10 + "]");
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onMediaItemTransition(e0 e0Var, int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(g0 g0Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.q0
    public void onPlayWhenReadyChanged(boolean z10, int i10) {
        n.b(TAG, "onPlayWhenReadyChanged() called with: playWhenReady = [" + z10 + "], reason = [" + i10 + "]");
    }

    @Override // androidx.media3.common.q0
    public void onPlaybackParametersChanged(n0 n0Var) {
        n.b(TAG, "onPlaybackParametersChanged() called with: playbackParameters = [" + n0Var + "]");
    }

    @Override // androidx.media3.common.q0
    public void onPlaybackStateChanged(int i10) {
        n.b(TAG, b.m("onPlaybackStateChanged() called with: state = [", i10, "]"));
    }

    @Override // androidx.media3.common.q0
    public void onPlaybackSuppressionReasonChanged(int i10) {
        n.b(TAG, b.m("onPlaybackSuppressionReasonChanged() called with: playbackSuppressionReason = [", i10, "]"));
    }

    public void onPlayerError(d5.f fVar) {
        this.mVideoTest.w(fVar.toString());
        this.mVideoTest.r();
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(m0 m0Var) {
    }

    @Override // androidx.media3.common.q0
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

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(g0 g0Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(r0 r0Var, r0 r0Var2, int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.q0
    public void onRepeatModeChanged(int i10) {
        n.b(TAG, b.m("onRepeatModeChanged() called with: repeatMode = [", i10, "]"));
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    public void onSeekProcessed() {
        n.b(TAG, "onSeekProcessed() called");
    }

    @Override // androidx.media3.common.q0
    public void onShuffleModeEnabledChanged(boolean z10) {
        n.b(TAG, "onShuffleModeEnabledChanged() called with: shuffleModeEnabled = [" + z10 + "]");
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // androidx.media3.common.q0
    public void onTimelineChanged(a1 a1Var, int i10) {
        n.b(TAG, "onTimelineChanged() called with: timeline = [" + a1Var + "], reason = [" + i10 + "]");
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(e1 e1Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onTracksChanged(g1 g1Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h1 h1Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onCues(c cVar) {
    }

    @Override // androidx.media3.common.q0
    public void onPositionDiscontinuity(int i10) {
        n.b(TAG, b.m("onPositionDiscontinuity() called with: reason = [", i10, "]"));
    }

    public void onTimelineChanged(a1 a1Var, Object obj, int i10) {
        StringBuilder sb2 = new StringBuilder("onTimelineChanged() called with: timeline = [");
        sb2.append(a1Var);
        sb2.append("], manifest = [");
        sb2.append(obj);
        sb2.append("], reason = [");
        n.b(TAG, b.i(i10, "]", sb2));
    }

    public void onTracksChanged(o5.h1 h1Var, z zVar) {
        n.b(TAG, "onTracksChanged() called with: trackGroups = [" + h1Var + "], trackSelections = [" + zVar + "]");
    }

    @Override // androidx.media3.common.q0
    public void onPlayerError(m0 m0Var) {
        this.mVideoTest.w(m0Var.toString());
        this.mVideoTest.r();
    }
}
