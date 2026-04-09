package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.yu.ra;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ImageView implements IAnimation {
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private ra f7227le;

    /* renamed from: lh, reason: collision with root package name */
    private float f7228lh;
    lh ouw;
    private float vt;
    private float yu;

    public vt(Context context) {
        super(context);
        this.ouw = new lh();
    }

    public final ra getBrickNativeValue() {
        return this.f7227le;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getMarqueeValue() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getRippleValue() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getShineValue() {
        return this.f7228lh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final float getStretchValue() {
        return this.fkw;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ra raVar;
        super.onDraw(canvas);
        this.ouw.ouw(canvas, this, this);
        if (getRippleValue() == 0.0f || (raVar = this.f7227le) == null || raVar.vt() <= 0) {
            return;
        }
        ((ViewGroup) getParent()).setClipChildren(false);
        ((ViewGroup) getParent().getParent()).setClipChildren(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.ouw.ouw(this, i4, i10);
    }

    public final void setBrickNativeValue(ra raVar) {
        this.f7227le = raVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setMarqueeValue(float f10) {
        this.yu = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setRippleValue(float f10) {
        this.vt = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setShineValue(float f10) {
        this.f7228lh = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public final void setStretchValue(float f10) {
        this.fkw = f10;
        this.ouw.ouw(this, f10);
    }
}
