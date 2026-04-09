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

        public emc(Paint paint, float f10, float f11, float f12) {
            this.emc = paint;
            this.ypw = f10;
            this.xq = f11;
            this.dg = f12;
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
        int i10 = this.uym;
        canvas.drawRoundRect(rectF, i10, i10, this.bw);
        RectF rectF2 = this.xq;
        int i11 = this.uym;
        canvas.drawRoundRect(rectF2, i11, i11, this.ycc);
        int iSave = canvas.save();
        canvas.translate(this.xq.right - this.zz, 0.0f);
        ArrayList<emc> arrayList = this.dg;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            emc emcVar = arrayList.get(i12);
            i12++;
            emc emcVar2 = emcVar;
            canvas.drawCircle(emcVar2.xq, emcVar2.dg, emcVar2.ypw, emcVar2.emc);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.uym = i14;
        this.zz = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.ypw.set(0.0f, 0.0f, f10, f11);
        this.xq.set(0.0f, 0.0f, 0.0f, f11);
        this.ycc.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.dg.clear();
        float f12 = this.uym / 4.0f;
        for (int i15 : emc) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.dg.add(new emc(paint, this.uym / 2.0f, f12, f11 / 2.0f));
            f12 += (this.uym / 2.0f) * 3.0f;
        }
        emc();
    }

    public void setProgress(int i10) {
        int i11 = this.msw;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.msw = i10;
        emc();
    }
}
