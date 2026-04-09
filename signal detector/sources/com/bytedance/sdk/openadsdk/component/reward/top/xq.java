package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vk;

/* loaded from: classes.dex */
public class xq extends View implements emc<xq> {
    private emc<xq> emc;

    public xq(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void clickSkip() {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void clickSound(String str) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.clickSound(str);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public xq emc(rie rieVar) {
        if (this.emc == null) {
            TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(rieVar);
            this.emc = topLayoutDislike2Load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                emc(topLayoutDislike2Load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public View getCloseButton() {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.emc;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setCountDownFor1InN(charSequence, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setListener(ypw ypwVar) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setListener(ypwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowDislike(boolean z6) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowDislike(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowEndCardNextAd(boolean z6, rie rieVar) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowEndCardNextAd(z6, rieVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowPlayableNextAd(boolean z6, rie rieVar) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowPlayableNextAd(z6, rieVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowSkip(boolean z6) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowSkip(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowSound(boolean z6) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowSound(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipEnable(boolean z6) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setSkipEnable(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipInvisiable() {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipText(CharSequence charSequence) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSoundMute(boolean z6) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setSoundMute(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void showCloseButton() {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void showCountDownText() {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void showSkipButton() {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.showSkipButton();
        }
    }

    public xq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public xq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void emc(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(vk.wcv);
        }
    }
}
