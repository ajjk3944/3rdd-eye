package com.opensignal.sdk.common.measurements.videotest.exoplayer;

import ab.g;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import ob.j;
import oh.a;
import oh.b;
import oh.c;
import oh.m;
import oh.t;
import p.l2;
import ph.d;
import ph.e;
import ph.h;
import rb.v;
import x9.q;
import x9.r;

/* loaded from: classes.dex */
public class ExoPlayerAnalyticsListener extends a implements AnalyticsListener {
    private static final String TAG = "ExoPlayerAnalyticsListener";
    private static final long serialVersionUID = 8895625645709092032L;

    public ExoPlayerAnalyticsListener(t tVar) {
        super(tVar);
    }

    private static d getEventInfo(MediaSourceEventListener.LoadEventInfo loadEventInfo) {
        return new d(loadEventInfo);
    }

    private static b getEventTime(q qVar) {
        return new b(qVar.f25181a, new g(qVar.f25186f), qVar.f25187g, qVar.f25185e, qVar.f25189i, qVar.j);
    }

    private static e getMediaLoadData(MediaSourceEventListener.MediaLoadData mediaLoadData) {
        return new e(mediaLoadData);
    }

    private static h getVideoFormat(Format format) {
        return new h(format);
    }

    @Override // oh.a
    public String getTAG() {
        return TAG;
    }

    @Override // oh.a
    public int getVideoTrackType() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(q qVar, y9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioCodecError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(q qVar, String str, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(q qVar, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDisabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioEnabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(q qVar, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioSinkError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioUnderrun(q qVar, int i10, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q qVar, c1 c1Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(q qVar, int i10, long j, long j7) {
        onBandwidthEstimate(getEventTime(qVar), i10, j, j7);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderDisabled(q qVar, int i10, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDecoderEnabled(q qVar, int i10, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInitialized(q qVar, int i10, String str, long j) {
        onDecoderInitialized(getEventTime(qVar), i10, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInputFormatChanged(q qVar, int i10, Format format) {
        onDecoderInputFormatChanged(getEventTime(qVar), i10, getVideoFormat(format));
    }

    public void onDownstreamFormatChanged(q qVar, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        onDownstreamFormatChanged(getEventTime(qVar), getMediaLoadData(mediaLoadData));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(q qVar, int i10, long j) {
        onDroppedVideoFrames(getEventTime(qVar), i10, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onEvents(g1 g1Var, r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(q qVar, boolean z10) {
        onIsPlayingChanged(getEventTime(qVar), z10);
    }

    public void onLoadCanceled(q qVar, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        onLoadCanceled(getEventTime(qVar), getEventInfo(loadEventInfo), getMediaLoadData(mediaLoadData));
    }

    public void onLoadCompleted(q qVar, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        onLoadCompleted(getEventTime(qVar), getEventInfo(loadEventInfo), getMediaLoadData(mediaLoadData));
    }

    public void onLoadError(q qVar, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        onLoadError(getEventTime(qVar), getEventInfo(loadEventInfo), getMediaLoadData(mediaLoadData), iOException, z10);
    }

    public void onLoadStarted(q qVar, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        onLoadStarted(getEventTime(qVar), getEventInfo(loadEventInfo), getMediaLoadData(mediaLoadData));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadingChanged(q qVar, boolean z10) {
        onLoadingChanged(getEventTime(qVar), z10);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMediaItemTransition(q qVar, n0 n0Var, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(q qVar, p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onMetadata(q qVar, Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(q qVar, boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(q qVar, b1 b1Var) {
        onPlaybackParametersChanged(getEventTime(qVar), new m(b1Var.f4071b, b1Var.f4070a));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackStateChanged(q qVar, int i10) {
        onPlaybackStateChanged(getEventTime(qVar), i10);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(q qVar, int i10) {
    }

    public void onPlayerError(q qVar, n nVar) {
        b eventTime = getEventTime(qVar);
        Objects.requireNonNull(nVar);
        onPlayerError(eventTime, 1);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlayerReleased(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerStateChanged(q qVar, boolean z10, int i10) {
        onPlayerStateChanged(getEventTime(qVar), i10);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(q qVar, p0 p0Var) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(q qVar, f1 f1Var, f1 f1Var2, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(q qVar, Object obj, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(q qVar, long j) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(q qVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(q qVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(q qVar, List list) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(q qVar, int i10, int i11) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onTimelineChanged(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onTracksChanged(q qVar, TrackGroupArray trackGroupArray, j jVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(q qVar, ya.r rVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoCodecError(q qVar, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(q qVar, String str, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(q qVar, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoDisabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoEnabled(q qVar, z9.b bVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoFrameProcessingOffset(q qVar, long j, int i10) {
        onVideoFrameProcessingOffset(getEventTime(qVar), j, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(q qVar, Format format, z9.e eVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(q qVar, v vVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onVolumeChanged(q qVar, float f10) {
    }

    private static c getEventInfo(ya.m mVar) {
        return new o2.g(mVar);
    }

    private static oh.d getMediaLoadData(ya.r rVar) {
        return new l2(rVar);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(q qVar, String str, long j, long j7) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(q qVar, Format format, z9.e eVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(q qVar, ya.r rVar) {
        onDownstreamFormatChanged(getEventTime(qVar), getMediaLoadData(rVar));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(q qVar, int i10) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(q qVar, ya.m mVar, ya.r rVar) {
        onLoadCanceled(getEventTime(qVar), getEventInfo(mVar), getMediaLoadData(rVar));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(q qVar, ya.m mVar, ya.r rVar) {
        onLoadCompleted(getEventTime(qVar), getEventInfo(mVar), getMediaLoadData(rVar));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(q qVar, ya.m mVar, ya.r rVar, IOException iOException, boolean z10) {
        onLoadError(getEventTime(qVar), getEventInfo(mVar), getMediaLoadData(rVar), iOException, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(q qVar, ya.m mVar, ya.r rVar) {
        onLoadStarted(getEventTime(qVar), getEventInfo(mVar), getMediaLoadData(rVar));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(q qVar, z0 z0Var) {
        onPlayerError(getEventTime(qVar), z0Var.f4795a);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(q qVar, int i10) {
        onPositionDiscontinuity(getEventTime(qVar), i10);
    }

    public void onRenderedFirstFrame(q qVar, Surface surface) {
        onRenderedFirstFrame(getEventTime(qVar), surface);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(q qVar, String str, long j) {
        onVideoDecoderInitialized(getEventTime(qVar), str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(q qVar, Format format) {
        onVideoInputFormatChanged(getEventTime(qVar), getVideoFormat(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(q qVar, int i10, int i11, int i12, float f10) {
        onVideoSizeChanged(getEventTime(qVar), i10, i11, i12, f10);
    }
}
