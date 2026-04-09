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
import com.bytedance.sdk.openadsdk.core.le.yu;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class NiceImageView extends yu {
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f7810cf;
    private Path ex;
    private int fkw;

    /* renamed from: jg, reason: collision with root package name */
    private final Xfermode f7811jg;
    private final Path jqy;
    private int ko;

    /* renamed from: le, reason: collision with root package name */
    private int f7812le;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7813lh;
    private int mwh;
    private final Context ouw;
    private int pno;
    private RectF qbp;
    private int ra;
    private int rn;
    private int ryl;

    /* renamed from: th, reason: collision with root package name */
    private final float[] f7814th;
    private int tlj;
    private final float[] vm;
    private final Paint vpp;
    private boolean vt;
    private int yu;
    private float zih;
    private final RectF zin;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void lh() {
        if (this.vt) {
            return;
        }
        int i4 = 0;
        if (this.pno <= 0) {
            float[] fArr = this.vm;
            int i10 = this.bly;
            float f10 = i10;
            fArr[1] = f10;
            fArr[0] = f10;
            int i11 = this.tlj;
            float f11 = i11;
            fArr[3] = f11;
            fArr[2] = f11;
            int i12 = this.ryl;
            float f12 = i12;
            fArr[5] = f12;
            fArr[4] = f12;
            int i13 = this.f7810cf;
            float f13 = i13;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.f7814th;
            int i14 = this.yu;
            float f14 = i10 - (i14 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i11 - (i14 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i12 - (i14 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i13 - (i14 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.vm;
            if (i4 >= fArr3.length) {
                return;
            }
            int i15 = this.pno;
            fArr3[i4] = i15;
            this.f7814th[i4] = i15 - (this.yu / 2.0f);
            i4++;
        }
    }

    private void ouw(Canvas canvas, int i4, int i10, float f10) {
        ouw(i4, i10);
        this.jqy.addCircle(this.ko / 2.0f, this.rn / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.jqy, this.vpp);
    }

    private void vt() {
        if (!this.vt) {
            this.qbp.set(0.0f, 0.0f, this.ko, this.rn);
            if (this.f7813lh) {
                this.qbp = this.zin;
                return;
            }
            return;
        }
        float fMin = Math.min(this.ko, this.rn) / 2.0f;
        this.zih = fMin;
        RectF rectF = this.qbp;
        int i4 = this.ko;
        int i10 = this.rn;
        rectF.set((i4 / 2.0f) - fMin, (i10 / 2.0f) - fMin, (i4 / 2.0f) + fMin, (i10 / 2.0f) + fMin);
    }

    private void yu() {
        if (this.vt) {
            return;
        }
        this.f7812le = 0;
    }

    public void isCircle(boolean z3) {
        this.vt = z3;
        yu();
        vt();
        invalidate();
    }

    public void isCoverSrc(boolean z3) {
        this.f7813lh = z3;
        vt();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.qbp, null, 31);
        if (!this.f7813lh) {
            int i4 = this.ko;
            int i10 = this.yu;
            int i11 = this.f7812le;
            int i12 = this.rn;
            canvas.scale((((i4 - (i10 * 2)) - (i11 * 2)) * 1.0f) / i4, (((i12 - (i10 * 2)) - (i11 * 2)) * 1.0f) / i12, i4 / 2.0f, i12 / 2.0f);
        }
        super.onDraw(canvas);
        this.vpp.reset();
        this.jqy.reset();
        if (this.vt) {
            this.jqy.addCircle(this.ko / 2.0f, this.rn / 2.0f, this.zih, Path.Direction.CCW);
        } else {
            this.jqy.addRoundRect(this.qbp, this.f7814th, Path.Direction.CCW);
        }
        this.vpp.setAntiAlias(true);
        this.vpp.setStyle(Paint.Style.FILL);
        this.vpp.setXfermode(this.f7811jg);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.jqy, this.vpp);
        } else {
            this.ex.addRect(this.qbp, Path.Direction.CCW);
            this.ex.op(this.jqy, Path.Op.DIFFERENCE);
            canvas.drawPath(this.ex, this.vpp);
        }
        this.vpp.setXfermode(null);
        int i13 = this.mwh;
        if (i13 != 0) {
            this.vpp.setColor(i13);
            canvas.drawPath(this.jqy, this.vpp);
        }
        canvas.restore();
        if (this.vt) {
            int i14 = this.yu;
            if (i14 > 0) {
                ouw(canvas, i14, this.fkw, this.zih - (i14 / 2.0f));
            }
            int i15 = this.f7812le;
            if (i15 > 0) {
                ouw(canvas, i15, this.ra, (this.zih - this.yu) - (i15 / 2.0f));
                return;
            }
            return;
        }
        int i16 = this.yu;
        if (i16 > 0) {
            int i17 = this.fkw;
            RectF rectF = this.zin;
            float[] fArr = this.vm;
            ouw(i16, i17);
            this.jqy.addRoundRect(rectF, fArr, Path.Direction.CCW);
            canvas.drawPath(this.jqy, this.vpp);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.ko = i4;
        this.rn = i10;
        ouw();
        vt();
    }

    public void setBorderColor(int i4) {
        this.fkw = i4;
        invalidate();
    }

    public void setBorderWidth(int i4) {
        this.yu = osn.ouw(this.ouw, i4);
        ouw(false);
    }

    public void setCornerBottomLeftRadius(int i4) {
        this.f7810cf = osn.ouw(this.ouw, i4);
        ouw(true);
    }

    public void setCornerBottomRightRadius(int i4) {
        this.ryl = osn.ouw(this.ouw, i4);
        ouw(true);
    }

    public void setCornerRadius(int i4) {
        this.pno = osn.ouw(this.ouw, i4);
        ouw(false);
    }

    public void setCornerTopLeftRadius(int i4) {
        this.bly = osn.ouw(this.ouw, i4);
        ouw(true);
    }

    public void setCornerTopRightRadius(int i4) {
        this.tlj = osn.ouw(this.ouw, i4);
        ouw(true);
    }

    public void setInnerBorderColor(int i4) {
        this.ra = i4;
        invalidate();
    }

    public void setInnerBorderWidth(int i4) {
        this.f7812le = osn.ouw(this.ouw, i4);
        yu();
        invalidate();
    }

    public void setMaskColor(int i4) {
        this.mwh = i4;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.fkw = -1;
        this.ra = -1;
        this.ouw = context;
        this.pno = osn.ouw(context, 10.0f);
        this.vm = new float[8];
        this.f7814th = new float[8];
        this.zin = new RectF();
        this.qbp = new RectF();
        this.vpp = new Paint();
        this.jqy = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f7811jg = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f7811jg = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.ex = new Path();
        }
        lh();
        yu();
    }

    private void ouw(int i4, int i10) {
        this.jqy.reset();
        this.vpp.setStrokeWidth(i4);
        this.vpp.setColor(i10);
        this.vpp.setStyle(Paint.Style.STROKE);
    }

    private void ouw() {
        if (this.vt) {
            return;
        }
        RectF rectF = this.zin;
        int i4 = this.yu;
        rectF.set(i4 / 2.0f, i4 / 2.0f, this.ko - (i4 / 2.0f), this.rn - (i4 / 2.0f));
    }

    private void ouw(boolean z3) {
        if (z3) {
            this.pno = 0;
        }
        lh();
        ouw();
        invalidate();
    }
}
