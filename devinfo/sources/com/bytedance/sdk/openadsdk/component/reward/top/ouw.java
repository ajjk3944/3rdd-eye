package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface ouw<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i4);

    void setListener(vt vtVar);

    void setShowDislike(boolean z3);

    void setShowEndCardNextAd(boolean z3, vpp vppVar);

    void setShowPlayableNextAd(boolean z3, vpp vppVar);

    void setShowSkip(boolean z3);

    void setShowSound(boolean z3);

    void setSkipEnable(boolean z3);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z3);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
