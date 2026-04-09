package com.bytedance.adsdk.ugeno.zz.ycc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.emc.msw;
import com.bytedance.adsdk.ugeno.emc.uym;

/* loaded from: classes.dex */
public class emc extends TextView implements IAnimation, uym {
    private float bw;
    private float dg;
    private dg emc;
    private float uym;
    private msw xq;
    private float ycc;
    private float ypw;

    public emc(Context context) {
        super(context);
        this.dg = -1.0f;
        this.ycc = 1.0f;
        this.uym = 0.0f;
        this.xq = new msw(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.ypw(canvas);
        }
    }

    public void emc(dg dgVar) {
        this.emc = dgVar;
    }

    public float getBorderRadius() {
        return this.xq.emc();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.emc.uym
    public float getRipple() {
        return this.ypw;
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getRubIn() {
        return this.xq.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getShine() {
        return this.xq.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getStretch() {
        return this.xq.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.emc(canvas, this);
            this.emc.emc(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.emc(i, i3, i6, i7);
        }
        if (z6 && this.dg > 0.0f) {
            emc(((i6 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i7 - i3) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z6, i, i3, i6, i7);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i3) {
        dg dgVar = this.emc;
        if (dgVar == null) {
            super.onMeasure(i, i3);
        } else {
            int[] iArrEmc = dgVar.emc(i, i3);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i6);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.xq.emc(i);
    }

    public void setBorderRadius(float f2) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.emc(f2);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f2, float f5) {
        super.setLineSpacing(f2, f5);
        this.ycc = f5;
        this.uym = f2;
    }

    public void setMinTextSize(float f2) {
        this.dg = f2;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f2) {
        this.ypw = f2;
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.ypw(f2);
        }
        postInvalidate();
    }

    public void setRubIn(float f2) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.bw(f2);
        }
    }

    public void setShine(float f2) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.xq(f2);
        }
    }

    public void setStretch(float f2) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.dg(f2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f2) {
        super.setTextSize(f2);
        this.bw = getTextSize();
    }

    private void emc(int i, int i3) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i3 <= 0 || i <= 0 || this.bw == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.bw;
        int iEmc = emc(text, paint, i, fMax);
        while (iEmc > i3 && fMax > this.dg) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.dg);
            fMax = Math.max(fMax - 1.0f, this.dg);
            iEmc = emc(text, paint, i, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.uym, this.ycc);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        this.bw = getTextSize();
    }

    private int emc(CharSequence charSequence, TextPaint textPaint, int i, float f2) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f2);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.ycc, this.uym, true).getHeight();
    }
}
