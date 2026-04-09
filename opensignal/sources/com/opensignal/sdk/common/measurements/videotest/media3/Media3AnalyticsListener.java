package com.opensignal.sdk.common.measurements.videotest.media3;

import ab.g;
import android.annotation.SuppressLint;
import android.view.Surface;
import androidx.media3.common.Metadata;
import androidx.media3.common.e0;
import androidx.media3.common.e1;
import androidx.media3.common.f;
import androidx.media3.common.g0;
import androidx.media3.common.g1;
import androidx.media3.common.h1;
import androidx.media3.common.m0;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.r;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import ch.n;
import d5.d;
import e5.c;
import java.io.IOException;
import java.util.List;
import o5.q;
import o5.v;
import oh.a;
import oh.b;
import oh.m;
import oh.p;
import oh.t;

/* loaded from: classes.dex */
public class Media3AnalyticsListener extends a implements c {
    private static final String TAG = "Media3AnalyticsListener";
    private static final long serialVersionUID = -4548361614776202091L;

    public Media3AnalyticsListener(t tVar) {
        super(tVar);
    }

    private static b getEventTime(e5.a aVar) {
        return new b(aVar.f7788a, new g(aVar.f7793f), aVar.f7794g, aVar.f7792e, aVar.f7796i, aVar.j);
    }

    private static rh.a getLoadEventInfo(q qVar) {
        return new rh.a(qVar);
    }

    private static rh.b getMediaLoadData(v vVar) {
        return new rh.b(vVar);
    }

    private static m getPlaybackParameters(n0 n0Var) {
        return new m(n0Var.f1726d, n0Var.f1725a);
    }

    @Override // oh.a
    public String getTAG() {
        return TAG;
    }

    @Override // oh.a
    public int getVideoTrackType() {
        return 2;
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(e5.a aVar, f fVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioCodecError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(e5.a aVar, String str, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(e5.a aVar, String str) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDisabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioEnabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(e5.a aVar, r rVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(e5.a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioSinkError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioUnderrun(e5.a aVar, int i10, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(e5.a aVar, o0 o0Var) {
    }

    @Override // e5.c
    @SuppressLint({"DefaultLocale"})
    public void onBandwidthEstimate(e5.a aVar, int i10, long j, long j7) {
        StringBuilder sb2 = new StringBuilder("onBandwidthEstimate() called with: eventTime = [");
        sb2.append(aVar.f7788a);
        sb2.append("], totalLoadTimeMs = [");
        sb2.append(i10);
        sb2.append("], totalBytesLoaded = [");
        sb2.append(j);
        sb2.append("], bitrateEstimate = [");
        n.b(TAG, c7.a.n(j7, "]", sb2));
        onBandwidthEstimate(getEventTime(aVar), i10, j, j7);
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(e5.a aVar, List list) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderDisabled(e5.a aVar, int i10, d5.c cVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderEnabled(e5.a aVar, int i10, d5.c cVar) {
    }

    @Override // e5.c
    public void onDecoderInitialized(e5.a aVar, int i10, String str, long j) {
        StringBuilder sb2 = new StringBuilder("onDecoderInitialized() called with: eventTime = [");
        sb2.append(aVar.f7788a);
        sb2.append("], trackType = [");
        sb2.append(i10);
        sb2.append("], decoderName = [");
        sb2.append(str);
        sb2.append("], initializationDurationMs = [");
        n.b(TAG, c7.a.n(j, "]", sb2));
        if (i10 == 2) {
            onDecoderInitialized(getEventTime(aVar), i10, str, j);
        }
    }

    @Override // e5.c
    public void onDecoderInputFormatChanged(e5.a aVar, int i10, r rVar) {
        n.b(TAG, "onDecoderInputFormatChanged() called with: eventTime = [" + aVar.f7788a + "], trackType = [" + i10 + "], format = [" + rVar + "]");
        if (i10 == 2) {
            onDecoderInputFormatChanged(getEventTime(aVar), i10, new p(9, rVar));
        }
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(e5.a aVar, androidx.media3.common.m mVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(e5.a aVar, int i10, boolean z10) {
    }

    @Override // e5.c
    public void onDownstreamFormatChanged(e5.a aVar, v vVar) {
        n.b(TAG, "onDownstreamFormatChanged() called with: eventTime = [" + aVar + "], mediaLoadData = [" + vVar + "]");
        onDownstreamFormatChanged(getEventTime(aVar), getMediaLoadData(vVar));
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(e5.a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(e5.a aVar) {
    }

    @Override // e5.c
    public void onDroppedVideoFrames(e5.a aVar, int i10, long j) {
        n.b(TAG, "onDroppedVideoFrames() called with: eventTime = [" + aVar.f7788a + "], droppedFrames = [" + i10 + "], elapsedMs = [" + j + "]");
        onDroppedVideoFrames(getEventTime(aVar), i10, j);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public void onIsPlayingChanged(e5.a aVar, boolean z10) {
        n.b(TAG, "onIsPlayingChanged() called with: eventTime = [" + aVar.f7788a + "], isPlaying = [" + z10 + "]");
        onIsPlayingChanged(getEventTime(aVar), z10);
    }

    @Override // e5.c
    public void onLoadCanceled(e5.a aVar, q qVar, v vVar) {
        n.b(TAG, "onLoadCanceled() called with: eventTime = [" + aVar + "], loadEventInfo = [" + qVar + "], mediaLoadData = [" + vVar + "]");
        onLoadCanceled(getEventTime(aVar), getLoadEventInfo(qVar), getMediaLoadData(vVar));
    }

    @Override // e5.c
    public void onLoadCompleted(e5.a aVar, q qVar, v vVar) {
        n.b(TAG, "onLoadCompleted() called with: eventTime = [" + aVar + "], loadEventInfo = [" + qVar + "], mediaLoadData = [" + vVar + "]");
        onLoadCompleted(getEventTime(aVar), getLoadEventInfo(qVar), getMediaLoadData(vVar));
    }

    @Override // e5.c
    public void onLoadError(e5.a aVar, q qVar, v vVar, IOException iOException, boolean z10) {
        n.b(TAG, "onLoadError() called with: eventTime = [" + aVar + "], loadEventInfo = [" + qVar + "], mediaLoadData = [" + vVar + "], error = [" + iOException + "], wasCanceled = [" + z10 + "]");
        onLoadError(getEventTime(aVar), getLoadEventInfo(qVar), getMediaLoadData(vVar), iOException, z10);
    }

    @Override // e5.c
    public void onLoadStarted(e5.a aVar, q qVar, v vVar) {
        n.b(TAG, "onLoadStarted() called with: eventTime = [" + aVar + "], loadEventInfo = [" + qVar + "], mediaLoadData = [" + vVar + "]");
        onLoadStarted(getEventTime(aVar), getLoadEventInfo(qVar), getMediaLoadData(vVar));
    }

    @Override // e5.c
    public void onLoadingChanged(e5.a aVar, boolean z10) {
        n.b(TAG, "onLoadingChanged() called with: eventTime = [" + aVar.f7788a + "], isLoading = [" + z10 + "]");
        onLoadingChanged(getEventTime(aVar), z10);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaItemTransition(e5.a aVar, e0 e0Var, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(e5.a aVar, g0 g0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onMetadata(e5.a aVar, Metadata metadata) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(e5.a aVar, boolean z10, int i10) {
    }

    @Override // e5.c
    public void onPlaybackParametersChanged(e5.a aVar, n0 n0Var) {
        n.b(TAG, "onPlaybackParametersChanged() called with: eventTime = [" + aVar.f7788a + "], playbackParameters = [" + n0Var + "]");
        onPlaybackParametersChanged(getEventTime(aVar), getPlaybackParameters(n0Var));
    }

    @Override // e5.c
    public void onPlaybackStateChanged(e5.a aVar, int i10) {
        n.b(TAG, "onPlaybackStateChanged() called with: eventTime = [" + aVar + "], state = [" + i10 + "]");
        onPlaybackStateChanged(getEventTime(aVar), i10);
    }

    @Override // e5.c
    public void onPlaybackSuppressionReasonChanged(e5.a aVar, int i10) {
        n.b(TAG, "onPlaybackSuppressionReasonChanged() called with: eventTime = [" + aVar.f7788a + "], playbackSuppressionReason = [" + i10 + "]");
    }

    @Override // e5.c
    public void onPlayerError(e5.a aVar, m0 m0Var) {
        n.b(TAG, "onPlayerError() called with: eventTime = [" + aVar.f7788a + "], error = [" + m0Var + "]");
        onPlayerError(getEventTime(aVar), m0Var.f1722a);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(e5.a aVar, m0 m0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlayerReleased(e5.a aVar) {
    }

    @Override // e5.c
    public void onPlayerStateChanged(e5.a aVar, boolean z10, int i10) {
        onPlayerStateChanged(getEventTime(aVar), i10);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(e5.a aVar, g0 g0Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(e5.a aVar, r0 r0Var, r0 r0Var2, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(e5.a aVar, Object obj, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(e5.a aVar, long j) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed(e5.a aVar) {
    }

    @Override // e5.c
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(e5.a aVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(e5.a aVar, boolean z10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(e5.a aVar, int i10, int i11) {
    }

    @Override // e5.c
    public void onTimelineChanged(e5.a aVar, int i10) {
        n.b(TAG, "onTimelineChanged() called with: eventTime = [" + aVar.f7788a + "], reason = [" + i10 + "]");
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(e5.a aVar, e1 e1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onTracksChanged(e5.a aVar, g1 g1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(e5.a aVar, v vVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoCodecError(e5.a aVar, Exception exc) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(e5.a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(e5.a aVar, String str) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoDisabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoEnabled(e5.a aVar, d5.c cVar) {
    }

    @Override // e5.c
    public void onVideoFrameProcessingOffset(e5.a aVar, long j, int i10) {
        n.b(TAG, "onVideoFrameProcessingOffset() called with: eventTime = [" + aVar + "], totalProcessingOffsetUs = [" + j + "], frameCount = [" + i10 + "]");
        onVideoFrameProcessingOffset(getEventTime(aVar), j, i10);
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(e5.a aVar, r rVar, d dVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(e5.a aVar, h1 h1Var) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onVolumeChanged(e5.a aVar, float f10) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(e5.a aVar, String str, long j, long j7) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(e5.a aVar, r rVar, d dVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onCues(e5.a aVar, z4.c cVar) {
    }

    @Override // e5.c
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(e5.a aVar, int i10) {
    }

    @Override // e5.c
    public void onPositionDiscontinuity(e5.a aVar, int i10) {
        n.b(TAG, "onPositionDiscontinuity() called with: eventTime = [" + aVar.f7788a + "], reason = [" + i10 + "]");
        onPositionDiscontinuity(getEventTime(aVar), i10);
    }

    public void onRenderedFirstFrame(e5.a aVar, Surface surface) {
        n.b(TAG, "onRenderedFirstFrame() called with: eventTime = [" + aVar.f7788a + "], surface = [" + surface + "]");
        onRenderedFirstFrame(getEventTime(aVar), surface);
    }

    @Override // e5.c
    public void onVideoDecoderInitialized(e5.a aVar, String str, long j) {
        StringBuilder sb2 = new StringBuilder("onVideoDecoderInitialized() called with: eventTime = [");
        sb2.append(aVar);
        sb2.append("], decoderName = [");
        sb2.append(str);
        sb2.append("], initializationDurationMs = [");
        n.b(TAG, c7.a.n(j, "]", sb2));
        onVideoDecoderInitialized(getEventTime(aVar), str, j);
    }

    @Override // e5.c
    public void onVideoInputFormatChanged(e5.a aVar, r rVar) {
        n.b(TAG, "onVideoInputFormatChanged() called with: eventTime = [" + aVar + "], format = [" + rVar + "]");
        onVideoInputFormatChanged(getEventTime(aVar), new p(9, rVar));
    }

    @Override // e5.c
    public void onVideoSizeChanged(e5.a aVar, int i10, int i11, int i12, float f10) {
        n.b(TAG, "onVideoSizeChanged() called with: eventTime = [" + aVar.f7788a + "], width = [" + i10 + "], height = [" + i11 + "], unappliedRotationDegrees = [" + i12 + "], pixelWidthHeightRatio = [" + f10 + "]");
        onVideoSizeChanged(getEventTime(aVar), i10, i11, i12, f10);
    }

    public void onPlayerError(e5.a aVar, d5.f fVar) {
        n.b(TAG, "onPlayerError() called with: eventTime = [" + aVar.f7788a + "], error = [" + fVar + "]");
        onPlayerError(getEventTime(aVar), fVar.f6984g);
    }

    @Override // e5.c
    public void onEvents(s0 s0Var, e5.b bVar) {
    }
}
