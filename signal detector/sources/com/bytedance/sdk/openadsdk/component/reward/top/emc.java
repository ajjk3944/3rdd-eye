package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public interface emc<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i);

    void setListener(ypw ypwVar);

    void setShowDislike(boolean z6);

    void setShowEndCardNextAd(boolean z6, rie rieVar);

    void setShowPlayableNextAd(boolean z6, rie rieVar);

    void setShowSkip(boolean z6);

    void setShowSound(boolean z6);

    void setSkipEnable(boolean z6);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z6);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
