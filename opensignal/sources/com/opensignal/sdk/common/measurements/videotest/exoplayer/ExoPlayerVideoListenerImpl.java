package com.opensignal.sdk.common.measurements.videotest.exoplayer;

import ch.n;
import java.io.Serializable;
import oh.t;
import rb.r;
import rb.v;

/* loaded from: classes.dex */
public class ExoPlayerVideoListenerImpl implements Serializable, r {
    private static final String TAG = "ExoPlayerVideoListener";
    private static final long serialVersionUID = 2271362874618772131L;
    private t mVideoTest;

    public ExoPlayerVideoListenerImpl(t tVar) {
        this.mVideoTest = tVar;
    }

    @Override // rb.r
    public void onRenderedFirstFrame() {
        n.b(TAG, "onRenderedFirstFrame() called");
        this.mVideoTest.J();
    }

    @Override // rb.r
    public void onSurfaceSizeChanged(int i10, int i11) {
        n.b(TAG, "onSurfaceSizeChanged() called with: width = [" + i10 + "], height = [" + i11 + "]");
    }

    @Override // rb.r
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(v vVar) {
    }

    @Override // rb.r
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        n.b(TAG, "onVideoSizeChanged() called with: width = [" + i10 + "], height = [" + i11 + "], unappliedRotationDegrees = [" + i12 + "], pixelWidthHeightRatio = [" + f10 + "]");
        this.mVideoTest.y(i10, i11);
    }
}
