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
import ch.n;
import java.io.Serializable;
import java.util.List;
import oh.t;
import z4.c;

/* loaded from: classes.dex */
public class Media3VideoListenerImpl implements q0, Serializable {
    private static final String TAG = "Media3VideoListenerImpl";
    private static final long serialVersionUID = 357147534791200014L;
    private final t mVideoTest;

    public Media3VideoListenerImpl(t tVar) {
        this.mVideoTest = tVar;
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

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
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
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(n0 n0Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlayerError(m0 m0Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(m0 m0Var) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(g0 g0Var) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // androidx.media3.common.q0
    public void onRenderedFirstFrame() {
        n.b(TAG, "onRenderedFirstFrame() called");
        this.mVideoTest.J();
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // androidx.media3.common.q0
    public void onTimelineChanged(a1 a1Var, int i10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(e1 e1Var) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onTracksChanged(g1 g1Var) {
    }

    @Override // androidx.media3.common.q0
    public void onVideoSizeChanged(h1 h1Var) {
        int i10 = h1Var.f1695a;
        int i11 = h1Var.f1696d;
        n.b(TAG, "onVideoSizeChanged() called with: videoSize = [" + h1Var + "]");
        this.mVideoTest.y(i10, i11);
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onCues(c cVar) {
    }

    @Override // androidx.media3.common.q0
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(r0 r0Var, r0 r0Var2, int i10) {
    }
}
