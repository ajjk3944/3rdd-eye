package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class pno extends View {
    private static final int[] ouw = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int bly;
    private final Paint fkw;

    /* renamed from: le, reason: collision with root package name */
    private final Paint f8499le;

    /* renamed from: lh, reason: collision with root package name */
    private final RectF f8500lh;
    private int pno;
    private int ra;
    private final RectF vt;
    private final ArrayList<ouw> yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw {

        /* renamed from: lh, reason: collision with root package name */
        float f8501lh;
        public Paint ouw;
        public float vt;
        float yu;

        public ouw(Paint paint, float f10, float f11, float f12) {
            this.ouw = paint;
            this.vt = f10;
            this.f8501lh = f11;
            this.yu = f12;
        }
    }

    public pno(Context context) {
        super(context);
        this.vt = new RectF();
        this.f8500lh = new RectF();
        this.yu = new ArrayList<>();
        this.f8499le = new Paint();
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void ouw() {
        if (this.ra <= 0) {
            return;
        }
        int width = (int) (((this.pno * 1.0f) / 100.0f) * getWidth());
        this.f8500lh.right = Math.max(this.bly, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.vt;
        int i4 = this.ra;
        canvas.drawRoundRect(rectF, i4, i4, this.fkw);
        RectF rectF2 = this.f8500lh;
        int i10 = this.ra;
        canvas.drawRoundRect(rectF2, i10, i10, this.f8499le);
        int iSave = canvas.save();
        canvas.translate(this.f8500lh.right - this.bly, 0.0f);
        ArrayList<ouw> arrayList = this.yu;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ouw ouwVar = arrayList.get(i11);
            i11++;
            ouw ouwVar2 = ouwVar;
            canvas.drawCircle(ouwVar2.f8501lh, ouwVar2.yu, ouwVar2.vt, ouwVar2.ouw);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        int i13 = i10 / 2;
        this.ra = i13;
        this.bly = i13 * 5;
        float f10 = i4;
        float f11 = i10;
        this.vt.set(0.0f, 0.0f, f10, f11);
        this.f8500lh.set(0.0f, 0.0f, 0.0f, f11);
        this.f8499le.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.yu.clear();
        float f12 = this.ra / 4.0f;
        for (int i14 : ouw) {
            Paint paint = new Paint();
            paint.setColor(i14);
            this.yu.add(new ouw(paint, this.ra / 2.0f, f12, f11 / 2.0f));
            f12 += (this.ra / 2.0f) * 3.0f;
        }
        ouw();
    }

    public void setProgress(int i4) {
        int i10 = this.pno;
        if (i10 == i4) {
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 100) {
            i4 = 100;
        }
        if (i10 == i4) {
            return;
        }
        this.pno = i4;
        ouw();
    }
}
