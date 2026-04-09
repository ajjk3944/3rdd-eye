package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends View implements ouw<lh> {
    private ouw<lh> ouw;

    public lh(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void clickSkip() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void clickSound(String str) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final View getCloseButton() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.getCloseButton();
        }
        return null;
    }

    public final View getITopLayout() {
        Object obj = this.ouw;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        setMeasuredDimension(0, 0);
    }

    public final lh ouw(vpp vppVar) {
        if (this.ouw == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(vppVar);
            this.ouw = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ouw(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setCountDownFor1InN(CharSequence charSequence, int i4) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setCountDownFor1InN(charSequence, i4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setListener(vt vtVar) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setListener(vtVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowDislike(boolean z3) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowDislike(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowEndCardNextAd(boolean z3, vpp vppVar) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowEndCardNextAd(z3, vppVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowPlayableNextAd(boolean z3, vpp vppVar) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowPlayableNextAd(z3, vppVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowSkip(boolean z3) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowSkip(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowSound(boolean z3) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowSound(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSkipEnable(boolean z3) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSkipEnable(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSkipInvisiable() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSkipText(CharSequence charSequence) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSoundMute(boolean z3) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSoundMute(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setTime(CharSequence charSequence, CharSequence charSequence2) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void showCloseButton() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void showCountDownText() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void showSkipButton() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.showSkipButton();
        }
    }

    private lh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private lh(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void ouw(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(rn.upp);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }
}
