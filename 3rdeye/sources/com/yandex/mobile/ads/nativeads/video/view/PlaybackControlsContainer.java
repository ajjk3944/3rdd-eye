package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(Context context) {
        super(context);
        l.f(context, "context");
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, com.yandex.mobile.ads.impl.ov0
    public TextView getCountDownProgress() {
        View viewFindViewById = findViewById(R.id.video_count_down_control);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, com.yandex.mobile.ads.impl.ov0
    public CheckBox getMuteControl() {
        View viewFindViewById = findViewById(R.id.video_mute_control);
        if (viewFindViewById instanceof CheckBox) {
            return (CheckBox) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, com.yandex.mobile.ads.impl.ov0
    public ProgressBar getVideoProgress() {
        View viewFindViewById = findViewById(R.id.video_progress_control);
        if (viewFindViewById instanceof ProgressBar) {
            return (ProgressBar) viewFindViewById;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        l.f(context, "context");
    }
}
