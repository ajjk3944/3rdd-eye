package com.bytedance.sdk.component.adexpress.le;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends View {
    private List<Integer> bly;

    /* renamed from: cf, reason: collision with root package name */
    private Paint f7365cf;
    private float fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f7366jg;

    /* renamed from: le, reason: collision with root package name */
    private int f7367le;

    /* renamed from: lh, reason: collision with root package name */
    private float f7368lh;
    private float mwh;
    private int ouw;
    private List<Integer> pno;
    private boolean ra;
    private float ryl;
    private Paint tlj;
    private int vt;
    private int yu;

    public yu(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.tlj.setShader(new LinearGradient(this.ryl, 0.0f, this.mwh, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i4 = 0;
        while (true) {
            if (i4 >= this.pno.size()) {
                break;
            }
            Integer num = this.pno.get(i4);
            this.tlj.setAlpha(num.intValue());
            Integer num2 = this.bly.get(i4);
            if (this.f7368lh + num2.intValue() < this.fkw) {
                canvas.drawCircle(this.ryl, this.mwh, this.f7368lh + num2.intValue(), this.tlj);
            }
            if (num.intValue() > 0 && num2.intValue() < this.fkw) {
                this.pno.set(i4, Integer.valueOf(num.intValue() - this.f7367le > 0 ? num.intValue() - (this.f7367le * 3) : 1));
                this.bly.set(i4, Integer.valueOf(num2.intValue() + this.f7367le));
            }
            i4++;
        }
        List<Integer> list = this.bly;
        if (list.get(list.size() - 1).intValue() >= this.fkw / this.yu) {
            this.pno.add(255);
            this.bly.add(0);
        }
        if (this.bly.size() >= 3) {
            this.bly.remove(0);
            this.pno.remove(0);
        }
        this.tlj.setAlpha(255);
        this.tlj.setColor(this.vt);
        canvas.drawCircle(this.ryl, this.mwh, this.f7368lh, this.f7365cf);
        if (this.ra) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        float f10 = i4 / 2.0f;
        this.ryl = f10;
        this.mwh = i10 / 2.0f;
        float f11 = f10 - (this.f7366jg / 2.0f);
        this.fkw = f11;
        this.f7368lh = f11 / 4.0f;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            invalidate();
        }
    }

    public final void ouw() {
        this.ra = true;
        invalidate();
    }

    public final void setColor(int i4) {
        this.ouw = i4;
    }

    public final void setCoreColor(int i4) {
        this.vt = i4;
    }

    public final void setCoreRadius(int i4) {
        this.f7368lh = i4;
    }

    public final void setDiffuseSpeed(int i4) {
        this.f7367le = i4;
    }

    public final void setDiffuseWidth(int i4) {
        this.yu = i4;
    }

    public final void setMaxWidth(int i4) {
        this.fkw = i4;
    }

    public final void vt() {
        this.ra = false;
        this.bly.clear();
        this.pno.clear();
        this.pno.add(255);
        this.bly.add(0);
        invalidate();
    }

    private yu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private yu(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, -1);
        this.ouw = -1;
        this.vt = -65536;
        this.f7368lh = 18.0f;
        this.yu = 3;
        this.fkw = 50.0f;
        this.f7367le = 2;
        this.ra = false;
        this.pno = new ArrayList();
        this.bly = new ArrayList();
        this.f7366jg = 24;
        Paint paint = new Paint();
        this.tlj = paint;
        paint.setAntiAlias(true);
        this.tlj.setStrokeWidth(this.f7366jg);
        this.pno.add(255);
        this.bly.add(0);
        Paint paint2 = new Paint();
        this.f7365cf = paint2;
        paint2.setAntiAlias(true);
        this.f7365cf.setColor(Color.parseColor("#0FFFFFFF"));
        this.f7365cf.setStyle(Paint.Style.FILL);
    }
}
