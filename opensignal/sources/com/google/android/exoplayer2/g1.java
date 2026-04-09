package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes.dex */
public interface g1 {
    void H(Player$Listener player$Listener);

    void L(d1 d1Var);

    void c0(Player$Listener player$Listener);

    void clearVideoSurface();

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    Looper getApplicationLooper();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    List getCurrentCues();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    w1 getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    ob.j getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    void getMaxSeekToPreviousPosition();

    p0 getMediaMetadata();

    boolean getPlayWhenReady();

    b1 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    rb.v getVideoSize();

    boolean isPlayingAd();

    n p0();

    void prepare();

    c1 r0();

    void release();

    void seekTo(int i10, long j);

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);
}
