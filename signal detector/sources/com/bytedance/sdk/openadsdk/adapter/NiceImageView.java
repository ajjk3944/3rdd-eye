package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.ycc.dg;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class NiceImageView extends dg {
    private float aa;
    private int bw;
    private int cf;
    private int dg;
    private final Context emc;
    private int gbl;
    private Path hxp;
    private int msw;
    private final Xfermode qh;
    private final Path rie;
    private int ru;
    private final float[] sba;
    private final Paint sra;
    private int sup;
    private int sz;
    private RectF ul;
    private int uym;
    private int vk;
    private boolean xq;
    private int ycc;
    private final RectF ylm;
    private boolean ypw;
    private final float[] yzg;
    private int zz;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void dg() {
        if (this.ypw) {
            return;
        }
        this.ycc = 0;
    }

    private void emc(Canvas canvas) {
        if (!this.ypw) {
            int i = this.dg;
            if (i > 0) {
                emc(canvas, i, this.bw, this.ylm, this.sba);
                return;
            }
            return;
        }
        int i3 = this.dg;
        if (i3 > 0) {
            emc(canvas, i3, this.bw, this.aa - (i3 / 2.0f));
        }
        int i6 = this.ycc;
        if (i6 > 0) {
            emc(canvas, i6, this.uym, (this.aa - this.dg) - (i6 / 2.0f));
        }
    }

    private void xq() {
        if (this.ypw) {
            return;
        }
        int i = 0;
        if (this.msw <= 0) {
            float[] fArr = this.sba;
            int i3 = this.zz;
            float f2 = i3;
            fArr[1] = f2;
            fArr[0] = f2;
            int i6 = this.ru;
            float f5 = i6;
            fArr[3] = f5;
            fArr[2] = f5;
            int i7 = this.sup;
            float f6 = i7;
            fArr[5] = f6;
            fArr[4] = f6;
            int i8 = this.gbl;
            float f7 = i8;
            fArr[7] = f7;
            fArr[6] = f7;
            float[] fArr2 = this.yzg;
            int i9 = this.dg;
            float f8 = i3 - (i9 / 2.0f);
            fArr2[1] = f8;
            fArr2[0] = f8;
            float f9 = i6 - (i9 / 2.0f);
            fArr2[3] = f9;
            fArr2[2] = f9;
            float f10 = i7 - (i9 / 2.0f);
            fArr2[5] = f10;
            fArr2[4] = f10;
            float f11 = i8 - (i9 / 2.0f);
            fArr2[7] = f11;
            fArr2[6] = f11;
            return;
        }
        while (true) {
            float[] fArr3 = this.sba;
            if (i >= fArr3.length) {
                return;
            }
            int i10 = this.msw;
            fArr3[i] = i10;
            this.yzg[i] = i10 - (this.dg / 2.0f);
            i++;
        }
    }

    private void ypw() {
        if (!this.ypw) {
            this.ul.set(0.0f, 0.0f, this.cf, this.vk);
            if (this.xq) {
                this.ul = this.ylm;
                return;
            }
            return;
        }
        float fMin = Math.min(this.cf, this.vk) / 2.0f;
        this.aa = fMin;
        RectF rectF = this.ul;
        int i = this.cf;
        int i3 = this.vk;
        rectF.set((i / 2.0f) - fMin, (i3 / 2.0f) - fMin, (i / 2.0f) + fMin, (i3 / 2.0f) + fMin);
    }

    public void isCircle(boolean z6) {
        this.ypw = z6;
        dg();
        ypw();
        invalidate();
    }

    public void isCoverSrc(boolean z6) {
        this.xq = z6;
        ypw();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.ul, null, 31);
        if (!this.xq) {
            int i = this.cf;
            int i3 = this.dg;
            int i6 = this.ycc;
            int i7 = this.vk;
            canvas.scale((((i - (i3 * 2)) - (i6 * 2)) * 1.0f) / i, (((i7 - (i3 * 2)) - (i6 * 2)) * 1.0f) / i7, i / 2.0f, i7 / 2.0f);
        }
        super.onDraw(canvas);
        this.sra.reset();
        this.rie.reset();
        if (this.ypw) {
            this.rie.addCircle(this.cf / 2.0f, this.vk / 2.0f, this.aa, Path.Direction.CCW);
        } else {
            this.rie.addRoundRect(this.ul, this.yzg, Path.Direction.CCW);
        }
        this.sra.setAntiAlias(true);
        this.sra.setStyle(Paint.Style.FILL);
        this.sra.setXfermode(this.qh);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.rie, this.sra);
        } else {
            this.hxp.addRect(this.ul, Path.Direction.CCW);
            this.hxp.op(this.rie, Path.Op.DIFFERENCE);
            canvas.drawPath(this.hxp, this.sra);
        }
        this.sra.setXfermode(null);
        int i8 = this.sz;
        if (i8 != 0) {
            this.sra.setColor(i8);
            canvas.drawPath(this.rie, this.sra);
        }
        canvas.restore();
        emc(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        this.cf = i;
        this.vk = i3;
        emc();
        ypw();
    }

    public void setBorderColor(int i) {
        this.bw = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.dg = vw.ypw(this.emc, i);
        emc(false);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.gbl = vw.ypw(this.emc, i);
        emc(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.sup = vw.ypw(this.emc, i);
        emc(true);
    }

    public void setCornerRadius(int i) {
        this.msw = vw.ypw(this.emc, i);
        emc(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.zz = vw.ypw(this.emc, i);
        emc(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.ru = vw.ypw(this.emc, i);
        emc(true);
    }

    public void setInnerBorderColor(int i) {
        this.uym = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.ycc = vw.ypw(this.emc, i);
        dg();
        invalidate();
    }

    public void setMaskColor(int i) {
        this.sz = i;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bw = -1;
        this.uym = -1;
        this.emc = context;
        this.msw = vw.ypw(context, 10.0f);
        this.sba = new float[8];
        this.yzg = new float[8];
        this.ylm = new RectF();
        this.ul = new RectF();
        this.sra = new Paint();
        this.rie = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.qh = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.qh = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.hxp = new Path();
        }
        xq();
        dg();
    }

    private void emc(Canvas canvas, int i, int i3, float f2) {
        emc(i, i3);
        this.rie.addCircle(this.cf / 2.0f, this.vk / 2.0f, f2, Path.Direction.CCW);
        canvas.drawPath(this.rie, this.sra);
    }

    private void emc(Canvas canvas, int i, int i3, RectF rectF, float[] fArr) {
        emc(i, i3);
        this.rie.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.rie, this.sra);
    }

    private void emc(int i, int i3) {
        this.rie.reset();
        this.sra.setStrokeWidth(i);
        this.sra.setColor(i3);
        this.sra.setStyle(Paint.Style.STROKE);
    }

    private void emc() {
        if (this.ypw) {
            return;
        }
        RectF rectF = this.ylm;
        int i = this.dg;
        rectF.set(i / 2.0f, i / 2.0f, this.cf - (i / 2.0f), this.vk - (i / 2.0f));
    }

    private void emc(boolean z6) {
        if (z6) {
            this.msw = 0;
        }
        xq();
        emc();
        invalidate();
    }
}
