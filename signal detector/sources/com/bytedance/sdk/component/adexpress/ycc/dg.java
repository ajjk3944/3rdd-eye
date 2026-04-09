package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dg extends View {
    private float bw;
    private int dg;
    private int emc;
    private Paint gbl;
    private List<Integer> msw;
    private int qh;
    private Paint ru;
    private float sup;
    private float sz;
    private boolean uym;
    private float xq;
    private int ycc;
    private int ypw;
    private List<Integer> zz;

    public dg(Context context) {
        this(context, null);
    }

    private void xq() {
        Paint paint = new Paint();
        this.ru = paint;
        paint.setAntiAlias(true);
        this.ru.setStrokeWidth(this.qh);
        this.msw.add(255);
        this.zz.add(0);
        Paint paint2 = new Paint();
        this.gbl = paint2;
        paint2.setAntiAlias(true);
        this.gbl.setColor(Color.parseColor("#0FFFFFFF"));
        this.gbl.setStyle(Paint.Style.FILL);
    }

    public void emc() {
        this.uym = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.ru.setShader(new LinearGradient(this.sup, 0.0f, this.sz, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.msw.size()) {
                break;
            }
            Integer num = this.msw.get(i);
            this.ru.setAlpha(num.intValue());
            Integer num2 = this.zz.get(i);
            if (this.xq + num2.intValue() < this.bw) {
                canvas.drawCircle(this.sup, this.sz, this.xq + num2.intValue(), this.ru);
            }
            if (num.intValue() > 0 && num2.intValue() < this.bw) {
                this.msw.set(i, Integer.valueOf(num.intValue() - this.ycc > 0 ? num.intValue() - (this.ycc * 3) : 1));
                this.zz.set(i, Integer.valueOf(num2.intValue() + this.ycc));
            }
            i++;
        }
        List<Integer> list = this.zz;
        if (list.get(list.size() - 1).intValue() >= this.bw / this.dg) {
            this.msw.add(255);
            this.zz.add(0);
        }
        if (this.zz.size() >= 3) {
            this.zz.remove(0);
            this.msw.remove(0);
        }
        this.ru.setAlpha(255);
        this.ru.setColor(this.ypw);
        canvas.drawCircle(this.sup, this.sz, this.xq, this.gbl);
        if (this.uym) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        float f2 = i / 2.0f;
        this.sup = f2;
        this.sz = i3 / 2.0f;
        float f5 = f2 - (this.qh / 2.0f);
        this.bw = f5;
        this.xq = f5 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (z6) {
            invalidate();
        }
    }

    public void setColor(int i) {
        this.emc = i;
    }

    public void setCoreColor(int i) {
        this.ypw = i;
    }

    public void setCoreRadius(int i) {
        this.xq = i;
    }

    public void setDiffuseSpeed(int i) {
        this.ycc = i;
    }

    public void setDiffuseWidth(int i) {
        this.dg = i;
    }

    public void setMaxWidth(int i) {
        this.bw = i;
    }

    public void ypw() {
        this.uym = false;
        this.zz.clear();
        this.msw.clear();
        this.msw.add(255);
        this.zz.add(0);
        invalidate();
    }

    public dg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public dg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.emc = -1;
        this.ypw = -65536;
        this.xq = 18.0f;
        this.dg = 3;
        this.bw = 50.0f;
        this.ycc = 2;
        this.uym = false;
        this.msw = new ArrayList();
        this.zz = new ArrayList();
        this.qh = 24;
        xq();
    }
}
