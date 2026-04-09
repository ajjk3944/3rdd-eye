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
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.ycc.dg;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class NiceImageView extends dg {

    /* renamed from: aa, reason: collision with root package name */
    private float f9262aa;
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
            int i10 = this.dg;
            if (i10 > 0) {
                emc(canvas, i10, this.bw, this.ylm, this.sba);
                return;
            }
            return;
        }
        int i11 = this.dg;
        if (i11 > 0) {
            emc(canvas, i11, this.bw, this.f9262aa - (i11 / 2.0f));
        }
        int i12 = this.ycc;
        if (i12 > 0) {
            emc(canvas, i12, this.uym, (this.f9262aa - this.dg) - (i12 / 2.0f));
        }
    }

    private void xq() {
        if (this.ypw) {
            return;
        }
        int i10 = 0;
        if (this.msw <= 0) {
            float[] fArr = this.sba;
            int i11 = this.zz;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.ru;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.sup;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.gbl;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.yzg;
            int i15 = this.dg;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.sba;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.msw;
            fArr3[i10] = i16;
            this.yzg[i10] = i16 - (this.dg / 2.0f);
            i10++;
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
        this.f9262aa = fMin;
        RectF rectF = this.ul;
        int i10 = this.cf;
        int i11 = this.vk;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    public void isCircle(boolean z10) {
        this.ypw = z10;
        dg();
        ypw();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.xq = z10;
        ypw();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.ul, null, 31);
        if (!this.xq) {
            int i10 = this.cf;
            int i11 = this.dg;
            int i12 = this.ycc;
            int i13 = this.vk;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.sra.reset();
        this.rie.reset();
        if (this.ypw) {
            this.rie.addCircle(this.cf / 2.0f, this.vk / 2.0f, this.f9262aa, Path.Direction.CCW);
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
        int i14 = this.sz;
        if (i14 != 0) {
            this.sra.setColor(i14);
            canvas.drawPath(this.rie, this.sra);
        }
        canvas.restore();
        emc(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.cf = i10;
        this.vk = i11;
        emc();
        ypw();
    }

    public void setBorderColor(@ColorInt int i10) {
        this.bw = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.dg = vw.ypw(this.emc, i10);
        emc(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.gbl = vw.ypw(this.emc, i10);
        emc(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.sup = vw.ypw(this.emc, i10);
        emc(true);
    }

    public void setCornerRadius(int i10) {
        this.msw = vw.ypw(this.emc, i10);
        emc(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.zz = vw.ypw(this.emc, i10);
        emc(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.ru = vw.ypw(this.emc, i10);
        emc(true);
    }

    public void setInnerBorderColor(@ColorInt int i10) {
        this.uym = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.ycc = vw.ypw(this.emc, i10);
        dg();
        invalidate();
    }

    public void setMaskColor(@ColorInt int i10) {
        this.sz = i10;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
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

    private void emc(Canvas canvas, int i10, int i11, float f10) {
        emc(i10, i11);
        this.rie.addCircle(this.cf / 2.0f, this.vk / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.rie, this.sra);
    }

    private void emc(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        emc(i10, i11);
        this.rie.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.rie, this.sra);
    }

    private void emc(int i10, int i11) {
        this.rie.reset();
        this.sra.setStrokeWidth(i10);
        this.sra.setColor(i11);
        this.sra.setStyle(Paint.Style.STROKE);
    }

    private void emc() {
        if (this.ypw) {
            return;
        }
        RectF rectF = this.ylm;
        int i10 = this.dg;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.cf - (i10 / 2.0f), this.vk - (i10 / 2.0f));
    }

    private void emc(boolean z10) {
        if (z10) {
            this.msw = 0;
        }
        xq();
        emc();
        invalidate();
    }
}
