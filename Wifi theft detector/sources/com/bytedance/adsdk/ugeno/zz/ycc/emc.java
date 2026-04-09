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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.emc(i10, i11, i12, i13);
        }
        if (z10 && this.dg > 0.0f) {
            emc(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        dg dgVar = this.emc;
        if (dgVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrEmc = dgVar.emc(i10, i11);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.ypw(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.xq.emc(i10);
    }

    public void setBorderRadius(float f10) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.emc(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.ycc = f11;
        this.uym = f10;
    }

    public void setMinTextSize(float f10) {
        this.dg = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.ypw = f10;
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.ypw(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.bw(f10);
        }
    }

    public void setShine(float f10) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.xq(f10);
        }
    }

    public void setStretch(float f10) {
        msw mswVar = this.xq;
        if (mswVar != null) {
            mswVar.dg(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.bw = getTextSize();
    }

    private void emc(int i10, int i11) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.bw == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.bw;
        int iEmc = emc(text, paint, i10, fMax);
        while (iEmc > i11 && fMax > this.dg) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.dg);
            fMax = Math.max(fMax - 1.0f, this.dg);
            iEmc = emc(text, paint, i10, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.uym, this.ycc);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.bw = getTextSize();
    }

    private int emc(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.ycc, this.uym, true).getHeight();
    }
}
