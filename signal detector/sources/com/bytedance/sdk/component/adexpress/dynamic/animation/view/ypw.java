package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dg.uym;

/* loaded from: classes.dex */
public class ypw extends ImageView implements IAnimation {
    private float bw;
    private float dg;
    xq emc;
    private float xq;
    private uym ycc;
    private float ypw;

    public ypw(Context context) {
        super(context);
        this.emc = new xq();
    }

    public uym getBrickNativeValue() {
        return this.ycc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.bw;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        uym uymVar;
        super.onDraw(canvas);
        this.emc.emc(canvas, this, this);
        if (getRippleValue() == 0.0f || (uymVar = this.ycc) == null || uymVar.ypw() <= 0) {
            return;
        }
        ((ViewGroup) getParent()).setClipChildren(false);
        ((ViewGroup) getParent().getParent()).setClipChildren(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        this.emc.emc(this, i, i3);
    }

    public void setBrickNativeValue(uym uymVar) {
        this.ycc = uymVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f2) {
        this.dg = f2;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f2) {
        this.ypw = f2;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f2) {
        this.xq = f2;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f2) {
        this.bw = f2;
        this.emc.emc(this, f2);
    }
}
