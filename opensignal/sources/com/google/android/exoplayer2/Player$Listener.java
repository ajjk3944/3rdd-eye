package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes.dex */
public interface Player$Listener extends rb.r, eb.k, pa.d, d1 {
    default void onAudioSessionIdChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onAvailableCommandsChanged(c1 c1Var) {
    }

    default void onCues(List<eb.b> list) {
    }

    default void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onEvents(g1 g1Var, e1 e1Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onIsLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onIsPlayingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.d1
    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onMediaItemTransition(n0 n0Var, int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onMediaMetadataChanged(p0 p0Var) {
    }

    default void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlaybackParametersChanged(b1 b1Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlaybackStateChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlayerError(z0 z0Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlayerErrorChanged(z0 z0Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPlaylistMetadataChanged(p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i10) {
    }

    @Override // rb.r
    default void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onRepeatModeChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onSeekBackIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onSeekForwardIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    /* bridge */ /* synthetic */ default void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onShuffleModeEnabledChanged(boolean z10) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.d1
    @Deprecated
    /* bridge */ /* synthetic */ default void onStaticMetadataChanged(List list) {
    }

    @Override // rb.r
    default void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onTimelineChanged(w1 w1Var, int i10) {
    }

    @Override // rb.r
    @Deprecated
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    default void onVolumeChanged(float f10) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
    }

    @Override // rb.r
    default void onVideoSizeChanged(rb.v vVar) {
    }

    default void onAudioAttributesChanged(y9.b bVar) {
    }

    default void onDeviceInfoChanged(aa.a aVar) {
    }

    @Override // com.google.android.exoplayer2.d1
    default void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar) {
    }
}
