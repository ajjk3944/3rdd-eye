package androidx.media3.exoplayer;

import a5.b;
import a5.w;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.a1;
import androidx.media3.common.e0;
import androidx.media3.common.e1;
import androidx.media3.common.f;
import androidx.media3.common.g0;
import androidx.media3.common.g1;
import androidx.media3.common.m;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.q0;
import androidx.media3.common.r;
import androidx.media3.common.s0;
import androidx.media3.common.t0;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.trackselection.z;
import d5.g;
import d5.h;
import d5.l;
import d5.n;
import d5.r0;
import d5.u0;
import d5.x0;
import e5.c;
import java.util.List;
import o5.b0;
import o5.b1;
import o5.h1;
import s5.d;
import t5.a;

/* loaded from: classes.dex */
public interface ExoPlayer extends s0 {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    void addAnalyticsListener(c cVar);

    void addAudioOffloadListener(h hVar);

    /* synthetic */ void addListener(q0 q0Var);

    /* synthetic */ void addMediaItem(int i10, e0 e0Var);

    /* synthetic */ void addMediaItem(e0 e0Var);

    /* synthetic */ void addMediaItems(int i10, List list);

    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i10, b0 b0Var);

    void addMediaSource(b0 b0Var);

    void addMediaSources(int i10, List<b0> list);

    void addMediaSources(List<b0> list);

    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(a aVar);

    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(d dVar);

    /* synthetic */ void clearVideoSurface();

    /* synthetic */ void clearVideoSurface(Surface surface);

    /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    /* synthetic */ void clearVideoTextureView(TextureView textureView);

    d5.s0 createMessage(r0 r0Var);

    /* synthetic */ void decreaseDeviceVolume();

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z10);

    AnalyticsCollector getAnalyticsCollector();

    /* synthetic */ Looper getApplicationLooper();

    /* synthetic */ f getAudioAttributes();

    @Deprecated
    g getAudioComponent();

    d5.c getAudioDecoderCounters();

    r getAudioFormat();

    int getAudioSessionId();

    /* synthetic */ o0 getAvailableCommands();

    /* synthetic */ int getBufferedPercentage();

    /* synthetic */ long getBufferedPosition();

    b getClock();

    /* synthetic */ long getContentBufferedPosition();

    /* synthetic */ long getContentDuration();

    @Override // androidx.media3.common.s0
    /* synthetic */ long getContentPosition();

    @Override // androidx.media3.common.s0
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // androidx.media3.common.s0
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    /* synthetic */ z4.c getCurrentCues();

    /* synthetic */ long getCurrentLiveOffset();

    /* synthetic */ Object getCurrentManifest();

    /* synthetic */ e0 getCurrentMediaItem();

    @Override // androidx.media3.common.s0
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // androidx.media3.common.s0
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // androidx.media3.common.s0
    /* synthetic */ long getCurrentPosition();

    @Override // androidx.media3.common.s0
    /* synthetic */ a1 getCurrentTimeline();

    @Deprecated
    h1 getCurrentTrackGroups();

    @Deprecated
    z getCurrentTrackSelections();

    @Override // androidx.media3.common.s0
    /* synthetic */ g1 getCurrentTracks();

    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Deprecated
    l getDeviceComponent();

    /* synthetic */ m getDeviceInfo();

    /* synthetic */ int getDeviceVolume();

    /* synthetic */ long getDuration();

    /* synthetic */ long getMaxSeekToPreviousPosition();

    /* synthetic */ e0 getMediaItemAt(int i10);

    /* synthetic */ int getMediaItemCount();

    /* synthetic */ g0 getMediaMetadata();

    /* synthetic */ int getNextMediaItemIndex();

    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // androidx.media3.common.s0
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // androidx.media3.common.s0
    /* synthetic */ n0 getPlaybackParameters();

    @Override // androidx.media3.common.s0
    /* synthetic */ int getPlaybackState();

    @Override // androidx.media3.common.s0
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // androidx.media3.common.s0
    d5.f getPlayerError();

    /* synthetic */ g0 getPlaylistMetadata();

    /* synthetic */ int getPreviousMediaItemIndex();

    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    u0 getRenderer(int i10);

    int getRendererCount();

    int getRendererType(int i10);

    /* synthetic */ int getRepeatMode();

    /* synthetic */ long getSeekBackIncrement();

    /* synthetic */ long getSeekForwardIncrement();

    x0 getSeekParameters();

    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    /* synthetic */ w getSurfaceSize();

    @Deprecated
    d5.m getTextComponent();

    @Override // androidx.media3.common.s0
    /* synthetic */ long getTotalBufferedDuration();

    /* synthetic */ e1 getTrackSelectionParameters();

    androidx.media3.exoplayer.trackselection.b0 getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    n getVideoComponent();

    d5.c getVideoDecoderCounters();

    r getVideoFormat();

    int getVideoScalingMode();

    /* synthetic */ androidx.media3.common.h1 getVideoSize();

    /* synthetic */ float getVolume();

    @Deprecated
    /* synthetic */ boolean hasNext();

    /* synthetic */ boolean hasNextMediaItem();

    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Deprecated
    /* synthetic */ boolean hasPrevious();

    /* synthetic */ boolean hasPreviousMediaItem();

    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    /* synthetic */ void increaseDeviceVolume();

    /* synthetic */ boolean isCommandAvailable(int i10);

    /* synthetic */ boolean isCurrentMediaItemDynamic();

    /* synthetic */ boolean isCurrentMediaItemLive();

    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    /* synthetic */ boolean isDeviceMuted();

    /* synthetic */ boolean isLoading();

    /* synthetic */ boolean isPlaying();

    @Override // androidx.media3.common.s0
    /* synthetic */ boolean isPlayingAd();

    boolean isTunnelingEnabled();

    /* synthetic */ void moveMediaItem(int i10, int i11);

    /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Deprecated
    /* synthetic */ void next();

    /* synthetic */ void pause();

    /* synthetic */ void play();

    /* synthetic */ void prepare();

    @Deprecated
    void prepare(b0 b0Var);

    @Deprecated
    void prepare(b0 b0Var, boolean z10, boolean z11);

    @Deprecated
    /* synthetic */ void previous();

    /* synthetic */ void release();

    void removeAnalyticsListener(c cVar);

    void removeAudioOffloadListener(h hVar);

    /* synthetic */ void removeListener(q0 q0Var);

    /* synthetic */ void removeMediaItem(int i10);

    /* synthetic */ void removeMediaItems(int i10, int i11);

    @Deprecated
    void retry();

    /* synthetic */ void seekBack();

    /* synthetic */ void seekForward();

    /* synthetic */ void seekTo(int i10, long j);

    /* synthetic */ void seekTo(long j);

    /* synthetic */ void seekToDefaultPosition();

    /* synthetic */ void seekToDefaultPosition(int i10);

    /* synthetic */ void seekToNext();

    /* synthetic */ void seekToNextMediaItem();

    @Deprecated
    /* synthetic */ void seekToNextWindow();

    /* synthetic */ void seekToPrevious();

    /* synthetic */ void seekToPreviousMediaItem();

    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    void setAudioAttributes(f fVar, boolean z10);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(androidx.media3.common.g gVar);

    void setCameraMotionListener(a aVar);

    /* synthetic */ void setDeviceMuted(boolean z10);

    /* synthetic */ void setDeviceVolume(int i10);

    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @Deprecated
    void setHandleWakeLock(boolean z10);

    /* synthetic */ void setMediaItem(e0 e0Var);

    /* synthetic */ void setMediaItem(e0 e0Var, long j);

    /* synthetic */ void setMediaItem(e0 e0Var, boolean z10);

    /* synthetic */ void setMediaItems(List list);

    /* synthetic */ void setMediaItems(List list, int i10, long j);

    /* synthetic */ void setMediaItems(List list, boolean z10);

    void setMediaSource(b0 b0Var);

    void setMediaSource(b0 b0Var, long j);

    void setMediaSource(b0 b0Var, boolean z10);

    void setMediaSources(List<b0> list);

    void setMediaSources(List<b0> list, int i10, long j);

    void setMediaSources(List<b0> list, boolean z10);

    void setPauseAtEndOfMediaItems(boolean z10);

    /* synthetic */ void setPlayWhenReady(boolean z10);

    /* synthetic */ void setPlaybackParameters(n0 n0Var);

    /* synthetic */ void setPlaybackSpeed(float f10);

    /* synthetic */ void setPlaylistMetadata(g0 g0Var);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(t0 t0Var);

    /* synthetic */ void setRepeatMode(int i10);

    void setSeekParameters(x0 x0Var);

    /* synthetic */ void setShuffleModeEnabled(boolean z10);

    void setShuffleOrder(b1 b1Var);

    void setSkipSilenceEnabled(boolean z10);

    /* synthetic */ void setTrackSelectionParameters(e1 e1Var);

    void setVideoChangeFrameRateStrategy(int i10);

    void setVideoFrameMetadataListener(d dVar);

    void setVideoScalingMode(int i10);

    /* synthetic */ void setVideoSurface(Surface surface);

    /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    /* synthetic */ void setVideoTextureView(TextureView textureView);

    /* synthetic */ void setVolume(float f10);

    void setWakeMode(int i10);

    /* synthetic */ void stop();

    @Deprecated
    /* synthetic */ void stop(boolean z10);
}
