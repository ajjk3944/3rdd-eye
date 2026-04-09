package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    public xq emc(@NonNull rie rieVar) {
        if (this.emc == null) {
            TopLayoutDislike2 topLayoutDislike2M162load = new TopLayoutDislike2(getContext()).load(rieVar);
            this.emc = topLayoutDislike2M162load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                emc(topLayoutDislike2M162load, (ViewGroup) parent);
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
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setCountDownFor1InN(CharSequence charSequence, int i10) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setCountDownFor1InN(charSequence, i10);
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
    public void setShowDislike(boolean z10) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowEndCardNextAd(boolean z10, rie rieVar) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowEndCardNextAd(z10, rieVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowPlayableNextAd(boolean z10, rie rieVar) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowPlayableNextAd(z10, rieVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowSkip(boolean z10) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowSound(boolean z10) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipEnable(boolean z10) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setSkipEnable(z10);
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
    public void setSoundMute(boolean z10) {
        emc<xq> emcVar = this.emc;
        if (emcVar != null) {
            emcVar.setSoundMute(z10);
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

    public xq(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public xq(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
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
