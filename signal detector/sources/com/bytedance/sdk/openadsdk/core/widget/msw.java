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

/* loaded from: classes.dex */
public class msw extends View {
    private static final int[] emc = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final Paint bw;
    private final ArrayList<emc> dg;
    private int msw;
    private int uym;
    private final RectF xq;
    private final Paint ycc;
    private final RectF ypw;
    private int zz;

    public static final class emc {
        float dg;
        public Paint emc;
        float xq;
        public float ypw;

        public emc(Paint paint, float f2, float f5, float f6) {
            this.emc = paint;
            this.ypw = f2;
            this.xq = f5;
            this.dg = f6;
        }
    }

    public msw(Context context) {
        super(context);
        this.ypw = new RectF();
        this.xq = new RectF();
        this.dg = new ArrayList<>();
        this.ycc = new Paint();
        Paint paint = new Paint();
        this.bw = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void emc() {
        if (this.uym <= 0) {
            return;
        }
        int width = (int) (((this.msw * 1.0f) / 100.0f) * getWidth());
        this.xq.right = Math.max(this.zz, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.ypw;
        int i = this.uym;
        canvas.drawRoundRect(rectF, i, i, this.bw);
        RectF rectF2 = this.xq;
        int i3 = this.uym;
        canvas.drawRoundRect(rectF2, i3, i3, this.ycc);
        int iSave = canvas.save();
        canvas.translate(this.xq.right - this.zz, 0.0f);
        ArrayList<emc> arrayList = this.dg;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            emc emcVar = arrayList.get(i6);
            i6++;
            emc emcVar2 = emcVar;
            canvas.drawCircle(emcVar2.xq, emcVar2.dg, emcVar2.ypw, emcVar2.emc);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        int i8 = i3 / 2;
        this.uym = i8;
        this.zz = i8 * 5;
        float f2 = i;
        float f5 = i3;
        this.ypw.set(0.0f, 0.0f, f2, f5);
        this.xq.set(0.0f, 0.0f, 0.0f, f5);
        this.ycc.setShader(new LinearGradient(0.0f, 0.0f, f2, f5, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.dg.clear();
        float f6 = this.uym / 4.0f;
        for (int i9 : emc) {
            Paint paint = new Paint();
            paint.setColor(i9);
            this.dg.add(new emc(paint, this.uym / 2.0f, f6, f5 / 2.0f));
            f6 += (this.uym / 2.0f) * 3.0f;
        }
        emc();
    }

    public void setProgress(int i) {
        int i3 = this.msw;
        if (i3 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i3 == i) {
            return;
        }
        this.msw = i;
        emc();
    }
}
