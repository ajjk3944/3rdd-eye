package com.opensignal.sdk.common.measurements.videotest.exoplayer;

import ch.n;
import com.google.android.exoplayer2.Player$Listener;
import java.io.Serializable;
import java.util.List;
import oh.t;

/* loaded from: classes.dex */
public class ExoPlayerVideoListener214Impl implements Serializable, Player$Listener {
    private static final String TAG = "ExoPlayerVideoListener214Impl";
    private static final long serialVersionUID = 2271362874618772131L;
    private final t mVideoTest;

    public ExoPlayerVideoListener214Impl(t tVar) {
        this.mVideoTest = tVar;
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onRenderedFirstFrame() {
        n.b(TAG, "onRenderedFirstFrame() called");
        this.mVideoTest.J();
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onSurfaceSizeChanged(int i10, int i11) {
        n.b(TAG, "onSurfaceSizeChanged() called with: width = [" + i10 + "], height = [" + i11 + "]");
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        n.b(TAG, "onVideoSizeChanged() called with: width = [" + i10 + "], height = [" + i11 + "], unappliedRotationDegrees = [" + i12 + "], pixelWidthHeightRatio = [" + f10 + "]");
        this.mVideoTest.y(i10, i11);
    }
}
