package com.bytedance.adsdk.ugeno.bly.le;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ouw.pno;
import com.bytedance.adsdk.ugeno.ouw.ra;
import com.bytedance.adsdk.ugeno.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends TextView implements IAnimation, ra {
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f6829le;

    /* renamed from: lh, reason: collision with root package name */
    private pno f6830lh;
    yu ouw;
    private float ra;
    private float vt;
    private float yu;

    public ouw(Context context) {
        super(context);
        this.yu = -1.0f;
        this.f6829le = 1.0f;
        this.ra = 0.0f;
        this.f6830lh = new pno(this);
    }

    private int ouw(CharSequence charSequence, TextPaint textPaint, int i4, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i4, Layout.Alignment.ALIGN_NORMAL, this.f6829le, this.ra, true).getHeight();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(canvas);
        }
    }

    public final float getBorderRadius() {
        return this.f6830lh.ouw;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRipple() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRubIn() {
        return this.f6830lh.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getShine() {
        return this.f6830lh.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getStretch() {
        return this.f6830lh.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(canvas, this);
            this.ouw.ouw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.fkw();
        }
        if (z3 && this.yu > 0.0f) {
            int compoundPaddingLeft = ((i11 - i4) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            int compoundPaddingBottom = ((i12 - i10) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            CharSequence text = getText();
            if (text != null && text.length() != 0 && compoundPaddingBottom > 0 && compoundPaddingLeft > 0 && this.fkw != 0.0f) {
                TextPaint paint = getPaint();
                float fMax = this.fkw;
                int iOuw = ouw(text, paint, compoundPaddingLeft, fMax);
                while (iOuw > compoundPaddingBottom && fMax > this.yu) {
                    Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.yu);
                    fMax = Math.max(fMax - 1.0f, this.yu);
                    iOuw = ouw(text, paint, compoundPaddingLeft, fMax);
                }
                Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
                setTextSize(0, fMax);
                setLineSpacing(this.ra, this.f6829le);
            }
        }
        super.onLayout(z3, i4, i10, i11, i12);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i10) {
        yu yuVar = this.ouw;
        if (yuVar == null) {
            super.onMeasure(i4, i10);
        } else {
            int[] iArrOuw = yuVar.ouw(i4, i10);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i4, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        this.f6830lh.ouw(i4);
    }

    public final void setBorderRadius(float f10) {
        pno pnoVar = this.f6830lh;
        if (pnoVar != null) {
            pnoVar.ouw(f10);
        }
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f6829le = f11;
        this.ra = f10;
    }

    public final void setMinTextSize(float f10) {
        this.yu = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public final void setRipple(float f10) {
        this.vt = f10;
        pno pnoVar = this.f6830lh;
        if (pnoVar != null) {
            pnoVar.vt(f10);
        }
        postInvalidate();
    }

    public final void setRubIn(float f10) {
        pno pnoVar = this.f6830lh;
        if (pnoVar != null) {
            pnoVar.fkw(f10);
        }
    }

    public final void setShine(float f10) {
        pno pnoVar = this.f6830lh;
        if (pnoVar != null) {
            pnoVar.lh(f10);
        }
    }

    public final void setStretch(float f10) {
        pno pnoVar = this.f6830lh;
        if (pnoVar != null) {
            pnoVar.yu(f10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(float f10) {
        super.setTextSize(f10);
        this.fkw = getTextSize();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f10) {
        super.setTextSize(i4, f10);
        this.fkw = getTextSize();
    }
}
