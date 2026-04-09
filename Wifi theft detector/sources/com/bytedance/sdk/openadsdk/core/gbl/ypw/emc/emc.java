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
import javax.jmdns.impl.constants.DNSConstants;

/* loaded from: classes.dex */
class emc extends View {

    /* renamed from: aa, reason: collision with root package name */
    private boolean[] f9289aa;
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
    private C0148emc[] wad;
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
    public static class C0148emc implements Animator.AnimatorListener {
        private final int emc;
        private final emc ypw;

        public C0148emc(emc emcVar, int i10) {
            this.ypw = emcVar;
            this.emc = i10;
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

        public ypw(emc emcVar, int i10) {
            this.ypw = emcVar;
            this.emc = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.ypw.f9289aa[this.emc] = false;
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
        this.f9289aa = new boolean[3];
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
        int i10 = emcVar.emc;
        emcVar.emc = i10 - 1;
        return i10;
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
        float f10 = this.ycc;
        canvas.drawRoundRect(rectF, f10, f10, this.msw);
        int i10 = this.emc;
        this.mxo = i10 / DNSConstants.DNS_TTL;
        int i11 = i10 % DNSConstants.DNS_TTL;
        this.tp = i11;
        this.vw = i11 / 60;
        this.ra = i11 % 60;
        this.wo = this.dg;
        this.xxg = this.bw;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.yz = width;
        float f11 = this.wo * 3.0f;
        this.wpn = f11;
        float f12 = width - f11;
        this.pxa = f12;
        this.wa = f12 > 0.0f ? f12 / 2.0f : 10.0f;
        emc(this.mxo, this.vw, this.ra);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.hxp.centerY();
        float f13 = this.xxg;
        emc(canvas, paddingLeft, fCenterY - (f13 / 2.0f), this.wo, f13, String.format("%02d", Integer.valueOf(this.mxo)), 0);
        float paddingLeft2 = this.wa + getPaddingLeft() + this.wo;
        float fCenterY2 = this.hxp.centerY();
        float f14 = this.xxg;
        emc(canvas, paddingLeft2, fCenterY2 - (f14 / 2.0f), this.wo, f14, String.format("%02d", Integer.valueOf(this.vw)), 1);
        float paddingLeft3 = ((this.wo + this.wa) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.hxp.centerY();
        float f15 = this.xxg;
        emc(canvas, paddingLeft3, fCenterY3 - (f15 / 2.0f), this.wo, f15, String.format("%02d", Integer.valueOf(this.ra)), 2);
        emc(canvas, getPaddingLeft() + this.wo + (this.wa / 2.0f), this.hxp.centerY());
        emc(canvas, getPaddingLeft() + (this.wo * 2.0f) + ((this.wa * 3.0f) / 2.0f), this.hxp.centerY());
        com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw ypwVar = this.uym;
        if (ypwVar == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int[] iArrEmc = ypwVar.emc(i10, i11);
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
        this.wad = new C0148emc[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.rqm[i10] = new ypw(this, i10);
            this.wad[i10] = new C0148emc(this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ypw(int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.cf[i10] = fFloatValue;
        this.ylm[i10] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.iyl >= 16) {
            invalidate();
            this.iyl = jCurrentTimeMillis;
        }
    }

    public void emc(int i10, int i11, int i12, int i13, int i14, float f10) {
        int iMin = Math.min(i10, 360060);
        this.ypw = i11;
        this.xq = i12;
        this.dg = i13;
        this.bw = i14;
        this.ycc = f10;
        this.emc = iMin;
        this.ru.post(this.but);
        Paint paint = this.msw;
        if (paint != null) {
            paint.setColor(this.ypw);
        }
        float[] fArr = this.cuf;
        float f11 = this.ycc;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[1] = f11;
        fArr[0] = f11;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.rtt;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f11;
        fArr2[6] = f11;
        fArr2[5] = f11;
        fArr2[4] = f11;
        invalidate();
    }

    public void ypw() {
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimator = this.yzg[i10];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.yzg[i10].cancel();
            }
            ValueAnimator valueAnimator2 = this.ul[i10];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.ul[i10].cancel();
            }
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.ypw ypwVar) {
        this.uym = ypwVar;
    }

    private void emc(Canvas canvas, float f10, float f11, float f12, float f13, String str, int i10) {
        this.ee.set(f10, f11, f12 + f10, f13 + f11);
        float fCenterY = this.ee.centerY();
        float fCenterY2 = this.ee.centerY() - ((this.zz.getPaint().descent() + this.zz.getPaint().ascent()) / 2.0f);
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
        boolean z10 = this.f9289aa[i10];
        if (z10 || this.sba[i10]) {
            if (z10) {
                canvas.save();
                this.sz.reset();
                this.sup.save();
                this.sup.rotateX(this.cf[i10]);
                this.sup.getMatrix(this.sz);
                this.sz.preTranslate(-this.ee.centerX(), -fCenterY);
                this.sz.postTranslate(this.ee.centerX(), fCenterY);
                canvas.concat(this.sz);
                this.xmt.reset();
                this.xmt.addRoundRect(this.db, this.cuf, direction);
                this.msw.setColor(this.ypw);
                canvas.drawPath(this.xmt, this.msw);
                int alpha = this.mkp.getAlpha();
                this.mkp.setAlpha((int) (this.ylm[i10] * 255.0f));
                canvas.drawText(this.gbl[i10], this.ee.centerX(), fCenterY2, this.mkp);
                this.mkp.setAlpha(alpha);
                this.sup.restore();
                canvas.restore();
            }
            if (this.sba[i10]) {
                canvas.save();
                this.sz.reset();
                this.sup.save();
                this.sup.rotateX(this.vk[i10]);
                this.sup.getMatrix(this.sz);
                this.sz.preTranslate(-this.ee.centerX(), -fCenterY);
                this.sz.postTranslate(this.ee.centerX(), fCenterY);
                canvas.concat(this.sz);
                this.lt.reset();
                this.lt.addRoundRect(this.sb, this.rtt, direction);
                this.msw.setColor(this.xq);
                canvas.drawPath(this.lt, this.msw);
                int alpha2 = this.mkp.getAlpha();
                this.mkp.setAlpha((int) (this.sra[i10] * 255.0f));
                canvas.drawText(this.qh[i10], this.ee.centerX(), fCenterY2, this.mkp);
                this.mkp.setAlpha(alpha2);
                this.sup.restore();
                canvas.restore();
            }
        }
    }

    private void emc(Canvas canvas, float f10, float f11) {
        canvas.drawText(":", f10, f11 - ((this.mkp.descent() + this.mkp.ascent()) / 2.0f), this.mkp);
    }

    @SuppressLint({"DefaultLocale"})
    private void emc(int i10, int i11, int i12) {
        String str = this.gbl[0];
        String str2 = String.format("%02d", Integer.valueOf(i10));
        if (!str2.equals(str) && !this.f9289aa[0] && !this.sba[0] && str != null) {
            emc(0, str, str2);
        }
        String str3 = this.gbl[1];
        String str4 = String.format("%02d", Integer.valueOf(i11));
        if (!str4.equals(str3) && !this.f9289aa[1] && !this.sba[1] && str3 != null) {
            emc(1, str3, str4);
        }
        String str5 = this.gbl[2];
        String str6 = String.format("%02d", Integer.valueOf(i12));
        if (!str6.equals(str5) && !this.f9289aa[2] && !this.sba[2] && str5 != null) {
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

    private void emc(final int i10, String str, String str2) {
        this.gbl[i10] = str;
        this.qh[i10] = str2;
        this.f9289aa[i10] = true;
        this.sba[i10] = true;
        this.cf[i10] = 0.0f;
        this.vk[i10] = 90.0f;
        this.ylm[i10] = 1.0f;
        this.sra[i10] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.yzg;
        ValueAnimator valueAnimator = valueAnimatorArr[i10];
        if (valueAnimator == null) {
            valueAnimatorArr[i10] = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.yzg[i10].setDuration(250L);
            this.yzg[i10].setInterpolator(this.rie);
            this.yzg[i10].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f9285a.ypw(i10, valueAnimator2);
                }
            });
            this.yzg[i10].addListener(this.rqm[i10]);
        } else {
            valueAnimator.setFloatValues(0.0f, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.ul;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i10];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i10] = ValueAnimator.ofFloat(-90.0f, 0.0f);
            this.ul[i10].setDuration(250L);
            this.ul[i10].setInterpolator(this.rie);
            this.ul[i10].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.emc.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f9287a.emc(i10, valueAnimator3);
                }
            });
            this.ul[i10].addListener(this.wad[i10]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, 0.0f);
        }
        if (this.yzg[i10].isRunning()) {
            this.yzg[i10].cancel();
        }
        if (this.ul[i10].isRunning()) {
            this.ul[i10].cancel();
        }
        this.yzg[i10].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void emc(int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.vk[i10] = fFloatValue;
        this.sra[i10] = (fFloatValue + 90.0f) / 90.0f;
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
