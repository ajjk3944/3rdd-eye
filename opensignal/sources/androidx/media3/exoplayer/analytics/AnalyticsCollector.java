package androidx.media3.exoplayer.analytics;

import android.os.Looper;
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
import androidx.media3.common.r;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import d5.d;
import e5.c;
import i5.g;
import java.io.IOException;
import java.util.List;
import o5.f0;
import o5.q;
import o5.v;
import o5.z;

/* loaded from: classes.dex */
public interface AnalyticsCollector extends q0, f0, g {
    void addListener(c cVar);

    void notifySeekStarted();

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(f fVar) {
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j7);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(d5.c cVar);

    void onAudioEnabled(d5.c cVar);

    void onAudioInputFormatChanged(r rVar, d dVar);

    void onAudioPositionAdvancing(long j);

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(int i10) {
    }

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j, long j7);

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(o0 o0Var) {
    }

    void onBandwidthSample(int i10, long j, long j7);

    @Override // androidx.media3.common.q0
    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(List list) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(m mVar) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override // o5.f0
    /* bridge */ /* synthetic */ default void onDownstreamFormatChanged(int i10, z zVar, v vVar) {
    }

    /* bridge */ /* synthetic */ default void onDrmKeysLoaded(int i10, z zVar) {
    }

    /* bridge */ /* synthetic */ default void onDrmKeysRemoved(int i10, z zVar) {
    }

    /* bridge */ /* synthetic */ default void onDrmKeysRestored(int i10, z zVar) {
    }

    @Deprecated
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, z zVar) {
    }

    /* bridge */ /* synthetic */ default void onDrmSessionManagerError(int i10, z zVar, Exception exc) {
    }

    /* bridge */ /* synthetic */ default void onDrmSessionReleased(int i10, z zVar) {
    }

    void onDroppedFrames(int i10, long j);

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onEvents(s0 s0Var, p0 p0Var) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onIsLoadingChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onIsPlayingChanged(boolean z10) {
    }

    @Override // o5.f0
    /* bridge */ /* synthetic */ default void onLoadCanceled(int i10, z zVar, q qVar, v vVar) {
    }

    @Override // o5.f0
    /* bridge */ /* synthetic */ default void onLoadCompleted(int i10, z zVar, q qVar, v vVar) {
    }

    @Override // o5.f0
    /* bridge */ /* synthetic */ default void onLoadError(int i10, z zVar, q qVar, v vVar, IOException iOException, boolean z10) {
    }

    @Override // o5.f0
    /* bridge */ /* synthetic */ default void onLoadStarted(int i10, z zVar, q qVar, v vVar) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onMediaItemTransition(e0 e0Var, int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(g0 g0Var) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(n0 n0Var) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlayerError(m0 m0Var) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(m0 m0Var) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(g0 g0Var) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onRenderedFirstFrame() {
    }

    void onRenderedFirstFrame(Object obj, long j);

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onRepeatModeChanged(int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.q0
    @Deprecated
    /* bridge */ /* synthetic */ default void onSeekProcessed() {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onTimelineChanged(a1 a1Var, int i10) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(e1 e1Var) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onTracksChanged(g1 g1Var) {
    }

    @Override // o5.f0
    /* bridge */ /* synthetic */ default void onUpstreamDiscarded(int i10, z zVar, v vVar) {
    }

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j7);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(d5.c cVar);

    void onVideoEnabled(d5.c cVar);

    void onVideoFrameProcessingOffset(long j, int i10);

    void onVideoInputFormatChanged(r rVar, d dVar);

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(h1 h1Var) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onVolumeChanged(float f10) {
    }

    void release();

    void removeListener(c cVar);

    void setPlayer(s0 s0Var, Looper looper);

    void updateMediaPeriodQueueInfo(List<z> list, z zVar);

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onCues(z4.c cVar) {
    }

    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, z zVar, int i11) {
    }

    @Override // androidx.media3.common.q0
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(r0 r0Var, r0 r0Var2, int i10) {
    }
}
