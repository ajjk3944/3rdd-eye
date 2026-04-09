package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.List;
import ob.j;
import rb.v;
import x9.q;
import y9.b;
import ya.m;
import ya.r;
import z9.e;

/* loaded from: classes.dex */
public interface AnalyticsListener {
    void onAudioAttributesChanged(q qVar, b bVar);

    void onAudioCodecError(q qVar, Exception exc);

    void onAudioDecoderInitialized(q qVar, String str, long j);

    void onAudioDecoderInitialized(q qVar, String str, long j, long j7);

    void onAudioDecoderReleased(q qVar, String str);

    void onAudioDisabled(q qVar, z9.b bVar);

    void onAudioEnabled(q qVar, z9.b bVar);

    void onAudioInputFormatChanged(q qVar, Format format);

    void onAudioInputFormatChanged(q qVar, Format format, e eVar);

    void onAudioPositionAdvancing(q qVar, long j);

    void onAudioSessionIdChanged(q qVar, int i10);

    void onAudioSinkError(q qVar, Exception exc);

    void onAudioUnderrun(q qVar, int i10, long j, long j7);

    void onAvailableCommandsChanged(q qVar, c1 c1Var);

    void onBandwidthEstimate(q qVar, int i10, long j, long j7);

    void onDecoderDisabled(q qVar, int i10, z9.b bVar);

    void onDecoderEnabled(q qVar, int i10, z9.b bVar);

    void onDecoderInitialized(q qVar, int i10, String str, long j);

    void onDecoderInputFormatChanged(q qVar, int i10, Format format);

    void onDownstreamFormatChanged(q qVar, r rVar);

    void onDrmKeysLoaded(q qVar);

    void onDrmKeysRemoved(q qVar);

    void onDrmKeysRestored(q qVar);

    void onDrmSessionAcquired(q qVar);

    void onDrmSessionAcquired(q qVar, int i10);

    void onDrmSessionManagerError(q qVar, Exception exc);

    void onDrmSessionReleased(q qVar);

    void onDroppedVideoFrames(q qVar, int i10, long j);

    void onEvents(g1 g1Var, x9.r rVar);

    void onIsLoadingChanged(q qVar, boolean z10);

    void onIsPlayingChanged(q qVar, boolean z10);

    void onLoadCanceled(q qVar, m mVar, r rVar);

    void onLoadCompleted(q qVar, m mVar, r rVar);

    void onLoadError(q qVar, m mVar, r rVar, IOException iOException, boolean z10);

    void onLoadStarted(q qVar, m mVar, r rVar);

    void onLoadingChanged(q qVar, boolean z10);

    void onMaxSeekToPreviousPositionChanged(q qVar, int i10);

    void onMediaItemTransition(q qVar, n0 n0Var, int i10);

    void onMediaMetadataChanged(q qVar, p0 p0Var);

    void onMetadata(q qVar, Metadata metadata);

    void onPlayWhenReadyChanged(q qVar, boolean z10, int i10);

    void onPlaybackParametersChanged(q qVar, b1 b1Var);

    void onPlaybackStateChanged(q qVar, int i10);

    void onPlaybackSuppressionReasonChanged(q qVar, int i10);

    void onPlayerError(q qVar, z0 z0Var);

    void onPlayerReleased(q qVar);

    void onPlayerStateChanged(q qVar, boolean z10, int i10);

    void onPlaylistMetadataChanged(q qVar, p0 p0Var);

    void onPositionDiscontinuity(q qVar, int i10);

    void onPositionDiscontinuity(q qVar, f1 f1Var, f1 f1Var2, int i10);

    void onRenderedFirstFrame(q qVar, Object obj, long j);

    void onRepeatModeChanged(q qVar, int i10);

    void onSeekBackIncrementChanged(q qVar, long j);

    void onSeekForwardIncrementChanged(q qVar, long j);

    void onSeekProcessed(q qVar);

    void onSeekStarted(q qVar);

    void onShuffleModeChanged(q qVar, boolean z10);

    void onSkipSilenceEnabledChanged(q qVar, boolean z10);

    void onStaticMetadataChanged(q qVar, List list);

    void onSurfaceSizeChanged(q qVar, int i10, int i11);

    void onTimelineChanged(q qVar, int i10);

    void onTracksChanged(q qVar, TrackGroupArray trackGroupArray, j jVar);

    void onUpstreamDiscarded(q qVar, r rVar);

    void onVideoCodecError(q qVar, Exception exc);

    void onVideoDecoderInitialized(q qVar, String str, long j);

    void onVideoDecoderInitialized(q qVar, String str, long j, long j7);

    void onVideoDecoderReleased(q qVar, String str);

    void onVideoDisabled(q qVar, z9.b bVar);

    void onVideoEnabled(q qVar, z9.b bVar);

    void onVideoFrameProcessingOffset(q qVar, long j, int i10);

    void onVideoInputFormatChanged(q qVar, Format format);

    void onVideoInputFormatChanged(q qVar, Format format, e eVar);

    void onVideoSizeChanged(q qVar, int i10, int i11, int i12, float f10);

    void onVideoSizeChanged(q qVar, v vVar);

    void onVolumeChanged(q qVar, float f10);
}
