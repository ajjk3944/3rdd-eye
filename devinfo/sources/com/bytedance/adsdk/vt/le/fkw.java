package com.bytedance.adsdk.vt.le;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends ouw implements Choreographer.FrameCallback {

    /* renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.vt.ra f7054le;
    public float ouw = 1.0f;
    private boolean bly = false;
    private long tlj = 0;
    public float vt = 0.0f;

    /* renamed from: lh, reason: collision with root package name */
    public float f7055lh = 0.0f;

    /* renamed from: cf, reason: collision with root package name */
    private int f7053cf = 0;
    public float yu = -2.1474836E9f;
    public float fkw = 2.1474836E9f;
    protected boolean ra = false;
    public boolean pno = false;

    private void jg() {
        this.ouw = -this.ouw;
    }

    private boolean ko() {
        return this.ouw < 0.0f;
    }

    private void lh(boolean z3) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z3) {
            this.ra = false;
        }
    }

    private void rn() {
        if (isRunning()) {
            lh(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void bly() {
        lh(true);
        vt(ko());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        vt();
        lh(true);
    }

    public final void cf() {
        this.ra = true;
        rn();
        this.tlj = 0L;
        if (ko() && this.f7055lh == ryl()) {
            ouw(mwh());
        } else if (!ko() && this.f7055lh == mwh()) {
            ouw(ryl());
        }
        fkw();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        rn();
        if (this.f7054le == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("LottieValueAnimator#doFrame");
        long j8 = this.tlj;
        long j9 = j8 != 0 ? j - j8 : 0L;
        com.bytedance.adsdk.vt.ra raVar = this.f7054le;
        float fAbs = j9 / (raVar == null ? Float.MAX_VALUE : (1.0E9f / raVar.ryl) / Math.abs(this.ouw));
        float f10 = this.vt;
        if (ko()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        boolean zLh = ra.lh(f11, ryl(), mwh());
        float f12 = this.vt;
        float fVt = ra.vt(f11, ryl(), mwh());
        this.vt = fVt;
        if (this.pno) {
            fVt = (float) Math.floor(fVt);
        }
        this.f7055lh = fVt;
        this.tlj = j;
        if (!this.pno || this.vt != f12) {
            lh();
        }
        if (!zLh) {
            if (getRepeatCount() == -1 || this.f7053cf < getRepeatCount()) {
                ouw();
                this.f7053cf++;
                if (getRepeatMode() == 2) {
                    this.bly = !this.bly;
                    jg();
                } else {
                    float fMwh = ko() ? mwh() : ryl();
                    this.vt = fMwh;
                    this.f7055lh = fMwh;
                }
                this.tlj = j;
            } else {
                float fRyl = this.ouw < 0.0f ? ryl() : mwh();
                this.vt = fRyl;
                this.f7055lh = fRyl;
                lh(true);
                vt(ko());
            }
        }
        if (this.f7054le != null) {
            float f13 = this.f7055lh;
            if (f13 < this.yu || f13 > this.fkw) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.yu), Float.valueOf(this.fkw), Float.valueOf(this.f7055lh)));
            }
        }
        com.bytedance.adsdk.vt.fkw.vt("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fRyl;
        float fMwh;
        float fRyl2;
        if (this.f7054le == null) {
            return 0.0f;
        }
        if (ko()) {
            fRyl = mwh() - this.f7055lh;
            fMwh = mwh();
            fRyl2 = ryl();
        } else {
            fRyl = this.f7055lh - ryl();
            fMwh = mwh();
            fRyl2 = ryl();
        }
        return fRyl / (fMwh - fRyl2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(le());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        com.bytedance.adsdk.vt.ra raVar = this.f7054le;
        if (raVar == null) {
            return 0L;
        }
        return (long) raVar.ouw();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.ra;
    }

    public final float le() {
        com.bytedance.adsdk.vt.ra raVar = this.f7054le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.f7055lh;
        float f11 = raVar.tlj;
        return (f10 - f11) / (raVar.f7195cf - f11);
    }

    public final float mwh() {
        com.bytedance.adsdk.vt.ra raVar = this.f7054le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.fkw;
        return f10 == 2.1474836E9f ? raVar.f7195cf : f10;
    }

    public final void ouw(float f10) {
        if (this.vt == f10) {
            return;
        }
        float fVt = ra.vt(f10, ryl(), mwh());
        this.vt = fVt;
        if (this.pno) {
            fVt = (float) Math.floor(fVt);
        }
        this.f7055lh = fVt;
        this.tlj = 0L;
        lh();
    }

    public final void pno() {
        this.ra = true;
        ouw(ko());
        ouw((int) (ko() ? mwh() : ryl()));
        this.tlj = 0L;
        this.f7053cf = 0;
        rn();
    }

    public final void ra() {
        this.f7054le = null;
        this.yu = -2.1474836E9f;
        this.fkw = 2.1474836E9f;
    }

    public final float ryl() {
        com.bytedance.adsdk.vt.ra raVar = this.f7054le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.yu;
        return f10 == -2.1474836E9f ? raVar.tlj : f10;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 == 2 || !this.bly) {
            return;
        }
        this.bly = false;
        jg();
    }

    public final void tlj() {
        lh(true);
        yu();
    }

    public final void vt(float f10) {
        ouw(this.yu, f10);
    }

    @Override // com.bytedance.adsdk.vt.le.ouw
    public final void vt() {
        super.vt();
        vt(ko());
    }

    public final void ouw(int i4) {
        ouw(i4, (int) this.fkw);
    }

    public final void ouw(float f10, float f11) {
        if (f10 <= f11) {
            com.bytedance.adsdk.vt.ra raVar = this.f7054le;
            float f12 = raVar == null ? -3.4028235E38f : raVar.tlj;
            float f13 = raVar == null ? Float.MAX_VALUE : raVar.f7195cf;
            float fVt = ra.vt(f10, f12, f13);
            float fVt2 = ra.vt(f11, f12, f13);
            if (fVt == this.yu && fVt2 == this.fkw) {
                return;
            }
            this.yu = fVt;
            this.fkw = fVt2;
            ouw((int) ra.vt(this.f7055lh, fVt, fVt2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
    }
}
