package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ov0;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public class CorePlaybackControlsContainer extends FrameLayout implements ov0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(Context context) {
        super(context);
        l.f(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public TextView getCountDownProgress() {
        return (TextView) findViewById(R.id.video_count_down_control);
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(R.id.video_mute_control);
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public ProgressBar getVideoProgress() {
        return (ProgressBar) findViewById(R.id.video_progress_control);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        l.f(context, "context");
    }
}
