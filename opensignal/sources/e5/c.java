package e5;

import androidx.media3.common.Metadata;
import androidx.media3.common.e1;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public interface c {
    void onAudioAttributesChanged(a aVar, androidx.media3.common.f fVar);

    void onAudioCodecError(a aVar, Exception exc);

    void onAudioDecoderInitialized(a aVar, String str, long j);

    void onAudioDecoderInitialized(a aVar, String str, long j, long j7);

    void onAudioDecoderReleased(a aVar, String str);

    void onAudioDisabled(a aVar, d5.c cVar);

    void onAudioEnabled(a aVar, d5.c cVar);

    void onAudioInputFormatChanged(a aVar, androidx.media3.common.r rVar);

    void onAudioInputFormatChanged(a aVar, androidx.media3.common.r rVar, d5.d dVar);

    void onAudioPositionAdvancing(a aVar, long j);

    void onAudioSessionIdChanged(a aVar, int i10);

    void onAudioSinkError(a aVar, Exception exc);

    void onAudioUnderrun(a aVar, int i10, long j, long j7);

    void onAvailableCommandsChanged(a aVar, androidx.media3.common.o0 o0Var);

    void onBandwidthEstimate(a aVar, int i10, long j, long j7);

    void onCues(a aVar, List list);

    void onCues(a aVar, z4.c cVar);

    void onDecoderDisabled(a aVar, int i10, d5.c cVar);

    void onDecoderEnabled(a aVar, int i10, d5.c cVar);

    void onDecoderInitialized(a aVar, int i10, String str, long j);

    void onDecoderInputFormatChanged(a aVar, int i10, androidx.media3.common.r rVar);

    void onDeviceInfoChanged(a aVar, androidx.media3.common.m mVar);

    void onDeviceVolumeChanged(a aVar, int i10, boolean z10);

    void onDownstreamFormatChanged(a aVar, o5.v vVar);

    void onDrmKeysLoaded(a aVar);

    void onDrmKeysRemoved(a aVar);

    void onDrmKeysRestored(a aVar);

    void onDrmSessionAcquired(a aVar);

    void onDrmSessionAcquired(a aVar, int i10);

    void onDrmSessionManagerError(a aVar, Exception exc);

    void onDrmSessionReleased(a aVar);

    void onDroppedVideoFrames(a aVar, int i10, long j);

    void onEvents(s0 s0Var, b bVar);

    void onIsLoadingChanged(a aVar, boolean z10);

    void onIsPlayingChanged(a aVar, boolean z10);

    void onLoadCanceled(a aVar, o5.q qVar, o5.v vVar);

    void onLoadCompleted(a aVar, o5.q qVar, o5.v vVar);

    void onLoadError(a aVar, o5.q qVar, o5.v vVar, IOException iOException, boolean z10);

    void onLoadStarted(a aVar, o5.q qVar, o5.v vVar);

    void onLoadingChanged(a aVar, boolean z10);

    void onMaxSeekToPreviousPositionChanged(a aVar, long j);

    void onMediaItemTransition(a aVar, androidx.media3.common.e0 e0Var, int i10);

    void onMediaMetadataChanged(a aVar, androidx.media3.common.g0 g0Var);

    void onMetadata(a aVar, Metadata metadata);

    void onPlayWhenReadyChanged(a aVar, boolean z10, int i10);

    void onPlaybackParametersChanged(a aVar, androidx.media3.common.n0 n0Var);

    void onPlaybackStateChanged(a aVar, int i10);

    void onPlaybackSuppressionReasonChanged(a aVar, int i10);

    void onPlayerError(a aVar, androidx.media3.common.m0 m0Var);

    void onPlayerErrorChanged(a aVar, androidx.media3.common.m0 m0Var);

    void onPlayerReleased(a aVar);

    void onPlayerStateChanged(a aVar, boolean z10, int i10);

    void onPlaylistMetadataChanged(a aVar, androidx.media3.common.g0 g0Var);

    void onPositionDiscontinuity(a aVar, int i10);

    void onPositionDiscontinuity(a aVar, r0 r0Var, r0 r0Var2, int i10);

    void onRenderedFirstFrame(a aVar, Object obj, long j);

    void onRepeatModeChanged(a aVar, int i10);

    void onSeekBackIncrementChanged(a aVar, long j);

    void onSeekForwardIncrementChanged(a aVar, long j);

    void onSeekProcessed(a aVar);

    void onSeekStarted(a aVar);

    void onShuffleModeChanged(a aVar, boolean z10);

    void onSkipSilenceEnabledChanged(a aVar, boolean z10);

    void onSurfaceSizeChanged(a aVar, int i10, int i11);

    void onTimelineChanged(a aVar, int i10);

    void onTrackSelectionParametersChanged(a aVar, e1 e1Var);

    void onTracksChanged(a aVar, g1 g1Var);

    void onUpstreamDiscarded(a aVar, o5.v vVar);

    void onVideoCodecError(a aVar, Exception exc);

    void onVideoDecoderInitialized(a aVar, String str, long j);

    void onVideoDecoderInitialized(a aVar, String str, long j, long j7);

    void onVideoDecoderReleased(a aVar, String str);

    void onVideoDisabled(a aVar, d5.c cVar);

    void onVideoEnabled(a aVar, d5.c cVar);

    void onVideoFrameProcessingOffset(a aVar, long j, int i10);

    void onVideoInputFormatChanged(a aVar, androidx.media3.common.r rVar);

    void onVideoInputFormatChanged(a aVar, androidx.media3.common.r rVar, d5.d dVar);

    void onVideoSizeChanged(a aVar, int i10, int i11, int i12, float f10);

    void onVideoSizeChanged(a aVar, h1 h1Var);

    void onVolumeChanged(a aVar, float f10);
}
