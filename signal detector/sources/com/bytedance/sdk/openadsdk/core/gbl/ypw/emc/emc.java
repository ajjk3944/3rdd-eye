package com.bytedance.sdk.openadsdk.core.gbl.ypw.emc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes.dex */
class emc extends View {
    private boolean[] aa;
    private final Runnable but;
    private int bw;
    private float[] cf;
    private final float[] cuf;
    private final RectF db;
    private int dg;
    private final Path dr;
    private final RectF ee;
    private int emc;
    private String[] gbl;
    private final RectF hxp;
    private long iyl;
    private final Path lt;
    private Paint mkp;
    private Paint msw;
    private int mxo;
    private float pxa;
    private String[] qh;
    private int ra;
    private final AccelerateDecelerateInterpolator rie;
    private ypw[] rqm;
    private final float[] rtt;
    private Handler ru;
    private final RectF sb;
    private boolean[] sba;
    private final Path sf;
    private float[] sra;
    private Camera sup;
    private Matrix sz;
    private int tp;
    private ValueAnimator[] ul;
    private com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw uym;
    private float[] vk;
    private int vw;
    private float wa;
    private C0063emc[] wad;
    private float wo;
    private float wpn;
    private final Path xmt;
    private int xq;
    private float xxg;
    private float ycc;
    private float[] ylm;
    private int ypw;
    private float yz;
    private ValueAnimator[] yzg;
    private com.bytedance.adsdk.ugeno.zz.ycc.emc zz;

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.emc$emc, reason: collision with other inner class name */
    public static class C0063emc implements Animator.AnimatorListener {
        private final int emc;
        private final emc ypw;

        public C0063emc(emc emcVar, int i) {
            this.ypw = emcVar;
            this.emc = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.ypw.sba[this.emc] = false;
            this.ypw.gbl[this.emc] = this.ypw.qh[this.emc];
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class ypw implements Animator.AnimatorListener {
        private final int emc;
        private final emc ypw;

        public ypw(emc emcVar, int i) {
            this.ypw = emcVar;
            this.emc = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.ypw.aa[this.emc] = false;
            this.ypw.ul[this.emc].start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public emc(Context context) {
        super(context);
        this.ru = new Handler(Looper.getMainLooper());
        this.gbl = new String[3];
        this.sup = new Camera();
        this.sz = new Matrix();
        this.qh = new String[3];
        this.cf = new float[3];
        this.vk = new float[3];
        this.aa = new boolean[3];
        this.sba = new boolean[3];
        this.yzg = new ValueAnimator[3];
        this.ul = new ValueAnimator[3];
        this.ylm = new float[3];
        this.sra = new float[3];
        this.rie = new AccelerateDecelerateInterpolator();
        this.hxp = new RectF();
        this.ee = new RectF();
        this.db = new RectF();
        this.sb = new RectF();
        this.sf = new Path();
        this.dr = new Path();
        this.xmt = new Path();
        this.lt = new Path();
        this.cuf = new float[8];
        this.rtt = new float[8];
        this.iyl = 0L;
        this.but = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.emc.1
            @Override // java.lang.Runnable
            public void run() {
                emc.emc(emc.this);
                emc.this.invalidate();
                if (emc.this.emc > 0) {
                    emc.this.ru.postDelayed(this, 1000L);
                } else {
                    emc.this.ru.removeCallbacks(this);
                    emc.this.ypw();
                }
            }
        };
        dg();
        bw();
        xq();
    }

    public static /* synthetic */ int emc(emc emcVar) {
        int i = emcVar.emc;
        emcVar.emc = i - 1;
        return i;
    }

    @Override // android.view.View
    @SuppressLint({"DefaultLocale"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.dg <= 0 || this.bw <= 0) {
            return;
        }
        this.hxp.set((getWidth() - this.dg) / 2.0f, (getHeight() - this.bw) / 2.0f, (getWidth() + this.dg) / 2.0f, (getHeight() + this.bw) / 2.0f);
        RectF rectF = this.hxp;
        float f2 = this.ycc;
        canvas.drawRoundRect(rectF, f2, f2, this.msw);
        int i = this.emc;
        this.mxo = i / 3600;
        int i3 = i % 3600;
        this.tp = i3;
        this.vw = i3 / 60;
        this.ra = i3 % 60;
        this.wo = this.dg;
        this.xxg = this.bw;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.yz = width;
        float f5 = this.wo * 3.0f;
        this.wpn = f5;
        float f6 = width - f5;
        this.pxa = f6;
        this.wa = f6 > 0.0f ? f6 / 2.0f : 10.0f;
        emc(this.mxo, this.vw, this.ra);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.hxp.centerY();
        float f7 = this.xxg;
        emc(canvas, paddingLeft, fCenterY - (f7 / 2.0f), this.wo, f7, String.format("%02d", Integer.valueOf(this.mxo)), 0);
        float paddingLeft2 = this.wa + getPaddingLeft() + this.wo;
        float fCenterY2 = this.hxp.centerY();
        float f8 = this.xxg;
        emc(canvas, paddingLeft2, fCenterY2 - (f8 / 2.0f), this.wo, f8, String.format("%02d", Integer.valueOf(this.vw)), 1);
        float paddingLeft3 = ((this.wo + this.wa) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.hxp.centerY();
        float f9 = this.xxg;
        emc(canvas, paddingLeft3, fCenterY3 - (f9 / 2.0f), this.wo, f9, String.format("%02d", Integer.valueOf(this.ra)), 2);
        emc(canvas, (this.wa / 2.0f) + getPaddingLeft() + this.wo, this.hxp.centerY());
        emc(canvas, ((this.wa * 3.0f) / 2.0f) + (this.wo * 2.0f) + getPaddingLeft(), this.hxp.centerY());
        com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw ypwVar = this.uym;
        if (ypwVar == null) {
            super.onMeasure(i, i3);
            return;
        }
        int[] iArrEmc = ypwVar.emc(i, i3);
        if (this.bw > 0) {
            int mode = View.MeasureSpec.getMode(iArrEmc[1]);
            int size = View.MeasureSpec.getSize(iArrEmc[1]);
            if (mode == 0 || size > this.bw) {
                iArrEmc[1] = View.MeasureSpec.makeMeasureSpec(this.bw, 1073741824);
            }
        }
        super.onMeasure(iArrEmc[0], iArrEmc[1]);
    }

    private void bw() {
        if (this.zz == null) {
            com.bytedance.adsdk.ugeno.zz.ycc.emc emcVar = new com.bytedance.adsdk.ugeno.zz.ycc.emc(getContext());
            this.zz = emcVar;
            this.mkp = emcVar.getPaint();
        }
    }

    private void dg() {
        Paint paint = new Paint();
        this.msw = paint;
        paint.setColor(this.ypw);
        this.msw.setAntiAlias(true);
    }

    private void xq() {
        this.rqm = new ypw[3];
        this.wad = new C0063emc[3];
        for (int i = 0; i < 3; i++) {
            this.rqm[i] = new ypw(this, i);
            this.wad[i] = new C0063emc(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ypw(int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.cf[i] = fFloatValue;
        this.ylm[i] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.iyl >= 16) {
            invalidate();
            this.iyl = jCurrentTimeMillis;
        }
    }

    public void emc(int i, int i3, int i6, int i7, int i8, float f2) {
        int iMin = Math.min(i, 360060);
        this.ypw = i3;
        this.xq = i6;
        this.dg = i7;
        this.bw = i8;
        this.ycc = f2;
        this.emc = iMin;
        this.ru.post(this.but);
        Paint paint = this.msw;
        if (paint != null) {
            paint.setColor(this.ypw);
        }
        float[] fArr = this.cuf;
        float f5 = this.ycc;
        fArr[3] = f5;
        fArr[2] = f5;
        fArr[1] = f5;
        fArr[0] = f5;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.rtt;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f5;
        fArr2[6] = f5;
        fArr2[5] = f5;
        fArr2[4] = f5;
        invalidate();
    }

    public void ypw() {
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.yzg[i];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.yzg[i].cancel();
            }
            ValueAnimator valueAnimator2 = this.ul[i];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.ul[i].cancel();
            }
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw ypwVar) {
        this.uym = ypwVar;
    }

    private void emc(Canvas canvas, float f2, float f5, float f6, float f7, String str, int i) {
        this.ee.set(f2, f5, f6 + f2, f7 + f5);
        float fCenterY = this.ee.centerY();
        float fCenterY2 = this.ee.centerY() - ((this.zz.getPaint().ascent() + this.zz.getPaint().descent()) / 2.0f);
        RectF rectF = this.db;
        RectF rectF2 = this.ee;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, fCenterY);
        this.sf.reset();
        Path path = this.sf;
        RectF rectF3 = this.db;
        float[] fArr = this.cuf;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.msw.setColor(this.ypw);
        canvas.drawPath(this.sf, this.msw);
        this.mkp.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.ee.centerX(), fCenterY2, this.mkp);
        RectF rectF4 = this.sb;
        RectF rectF5 = this.ee;
        rectF4.set(rectF5.left, fCenterY, rectF5.right, rectF5.bottom);
        this.dr.reset();
        this.dr.addRoundRect(this.sb, this.rtt, direction);
        this.msw.setColor(this.xq);
        canvas.drawPath(this.dr, this.msw);
        canvas.drawText(str, this.ee.centerX(), fCenterY2, this.zz.getPaint());
        boolean z6 = this.aa[i];
        if (z6 || this.sba[i]) {
            if (z6) {
                canvas.save();
                this.sz.reset();
                this.sup.save();
                this.sup.rotateX(this.cf[i]);
                this.sup.getMatrix(this.sz);
                this.sz.preTranslate(-this.ee.centerX(), -fCenterY);
                this.sz.postTranslate(this.ee.centerX(), fCenterY);
                canvas.concat(this.sz);
                this.xmt.reset();
                this.xmt.addRoundRect(this.db, this.cuf, direction);
                this.msw.setColor(this.ypw);
                canvas.drawPath(this.xmt, this.msw);
                int alpha = this.mkp.getAlpha();
                this.mkp.setAlpha((int) (this.ylm[i] * 255.0f));
                canvas.drawText(this.gbl[i], this.ee.centerX(), fCenterY2, this.mkp);
                this.mkp.setAlpha(alpha);
                this.sup.restore();
                canvas.restore();
            }
            if (this.sba[i]) {
                canvas.save();
                this.sz.reset();
                this.sup.save();
                this.sup.rotateX(this.vk[i]);
                this.sup.getMatrix(this.sz);
                this.sz.preTranslate(-this.ee.centerX(), -fCenterY);
                this.sz.postTranslate(this.ee.centerX(), fCenterY);
                canvas.concat(this.sz);
                this.lt.reset();
                this.lt.addRoundRect(this.sb, this.rtt, direction);
                this.msw.setColor(this.xq);
                canvas.drawPath(this.lt, this.msw);
                int alpha2 = this.mkp.getAlpha();
                this.mkp.setAlpha((int) (this.sra[i] * 255.0f));
                canvas.drawText(this.qh[i], this.ee.centerX(), fCenterY2, this.mkp);
                this.mkp.setAlpha(alpha2);
                this.sup.restore();
                canvas.restore();
            }
        }
    }

    private void emc(Canvas canvas, float f2, float f5) {
        canvas.drawText(":", f2, f5 - ((this.mkp.ascent() + this.mkp.descent()) / 2.0f), this.mkp);
    }

    @SuppressLint({"DefaultLocale"})
    private void emc(int i, int i3, int i6) {
        String str = this.gbl[0];
        String str2 = String.format("%02d", Integer.valueOf(i));
        if (!str2.equals(str) && !this.aa[0] && !this.sba[0] && str != null) {
            emc(0, str, str2);
        }
        String str3 = this.gbl[1];
        String str4 = String.format("%02d", Integer.valueOf(i3));
        if (!str4.equals(str3) && !this.aa[1] && !this.sba[1] && str3 != null) {
            emc(1, str3, str4);
        }
        String str5 = this.gbl[2];
        String str6 = String.format("%02d", Integer.valueOf(i6));
        if (!str6.equals(str5) && !this.aa[2] && !this.sba[2] && str5 != null) {
            emc(2, str5, str6);
        }
        String[] strArr = this.gbl;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    private void emc(final int i, String str, String str2) {
        this.gbl[i] = str;
        this.qh[i] = str2;
        final int i3 = 1;
        this.aa[i] = true;
        this.sba[i] = true;
        this.cf[i] = 0.0f;
        this.vk[i] = 90.0f;
        this.ylm[i] = 1.0f;
        this.sra[i] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.yzg;
        ValueAnimator valueAnimator = valueAnimatorArr[i];
        if (valueAnimator == null) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.yzg[i].setDuration(250L);
            this.yzg[i].setInterpolator(this.rie);
            final int i6 = 0;
            this.yzg[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ emc f6833b;

                {
                    this.f6833b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i6) {
                        case 0:
                            this.f6833b.ypw(i, valueAnimator2);
                            break;
                        default:
                            this.f6833b.emc(i, valueAnimator2);
                            break;
                    }
                }
            });
            this.yzg[i].addListener(this.rqm[i]);
        } else {
            valueAnimator.setFloatValues(0.0f, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.ul;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i] = ValueAnimator.ofFloat(-90.0f, 0.0f);
            this.ul[i].setDuration(250L);
            this.ul[i].setInterpolator(this.rie);
            this.ul[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ emc f6833b;

                {
                    this.f6833b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i3) {
                        case 0:
                            this.f6833b.ypw(i, valueAnimator22);
                            break;
                        default:
                            this.f6833b.emc(i, valueAnimator22);
                            break;
                    }
                }
            });
            this.ul[i].addListener(this.wad[i]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, 0.0f);
        }
        if (this.yzg[i].isRunning()) {
            this.yzg[i].cancel();
        }
        if (this.ul[i].isRunning()) {
            this.ul[i].cancel();
        }
        this.yzg[i].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void emc(int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.vk[i] = fFloatValue;
        this.sra[i] = (fFloatValue + 90.0f) / 90.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.iyl >= 16) {
            invalidate();
            this.iyl = jCurrentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.zz.ycc.emc emc() {
        return this.zz;
    }

    public void emc(com.bytedance.adsdk.ugeno.zz.ycc.emc emcVar) {
        this.zz = emcVar;
    }
}
