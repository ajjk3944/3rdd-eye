package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int i4, int i10) {
        getHolder().setFixedSize(i4, i10);
        requestLayout();
        invalidate();
    }
}
