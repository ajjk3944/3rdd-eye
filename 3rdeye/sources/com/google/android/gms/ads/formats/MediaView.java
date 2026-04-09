package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@Deprecated
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
    }

    public void setMediaContent(MediaContent mediaContent) {
    }
}
