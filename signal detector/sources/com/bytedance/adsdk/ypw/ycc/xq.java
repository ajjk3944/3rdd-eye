package com.bytedance.adsdk.ypw.ycc;

import android.view.Choreographer;
import com.bytedance.adsdk.ypw.uym;

/* loaded from: classes.dex */
public class xq extends emc implements Choreographer.FrameCallback {
    private uym ru;
    private float ypw = 1.0f;
    private boolean xq = false;
    private long dg = 0;
    private float bw = 0.0f;
    private float ycc = 0.0f;
    private int uym = 0;
    private float msw = -2.1474836E9f;
    private float zz = 2.1474836E9f;
    protected boolean emc = false;
    private boolean gbl = false;

    private boolean ul() {
        return ru() < 0.0f;
    }

    private void ylm() {
        if (this.ru == null) {
            return;
        }
        float f2 = this.ycc;
        if (f2 < this.msw || f2 > this.zz) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.msw), Float.valueOf(this.zz), Float.valueOf(this.ycc)));
        }
    }

    private float yzg() {
        uym uymVar = this.ru;
        if (uymVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / uymVar.sup()) / Math.abs(this.ypw);
    }

    public void aa() {
        if (isRunning()) {
            dg(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        ypw();
        sba();
    }

    public float cf() {
        uym uymVar = this.ru;
        if (uymVar == null) {
            return 0.0f;
        }
        float f2 = this.msw;
        return f2 == -2.1474836E9f ? uymVar.ycc() : f2;
    }

    public void dg(boolean z6) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z6) {
            this.emc = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j6) {
        aa();
        if (this.ru == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.ypw.bw.emc("LottieValueAnimator#doFrame");
        float fYzg = (this.dg != 0 ? j6 - r1 : 0L) / yzg();
        float f2 = this.bw;
        if (ul()) {
            fYzg = -fYzg;
        }
        float f5 = f2 + fYzg;
        boolean zXq = bw.xq(f5, cf(), vk());
        float f6 = this.bw;
        float fYpw = bw.ypw(f5, cf(), vk());
        this.bw = fYpw;
        if (this.gbl) {
            fYpw = (float) Math.floor(fYpw);
        }
        this.ycc = fYpw;
        this.dg = j6;
        if (!this.gbl || this.bw != f6) {
            xq();
        }
        if (!zXq) {
            if (getRepeatCount() == -1 || this.uym < getRepeatCount()) {
                emc();
                this.uym++;
                if (getRepeatMode() == 2) {
                    this.xq = !this.xq;
                    zz();
                } else {
                    float fVk = ul() ? vk() : cf();
                    this.bw = fVk;
                    this.ycc = fVk;
                }
                this.dg = j6;
            } else {
                float fCf = this.ypw < 0.0f ? cf() : vk();
                this.bw = fCf;
                this.ycc = fCf;
                sba();
                ypw(ul());
            }
        }
        ylm();
        com.bytedance.adsdk.ypw.bw.ypw("LottieValueAnimator#doFrame");
    }

    public void emc(uym uymVar) {
        boolean z6 = this.ru == null;
        this.ru = uymVar;
        if (z6) {
            emc(Math.max(this.msw, uymVar.ycc()), Math.min(this.zz, uymVar.uym()));
        } else {
            emc((int) uymVar.ycc(), (int) uymVar.uym());
        }
        float f2 = this.ycc;
        this.ycc = 0.0f;
        this.bw = 0.0f;
        emc((int) f2);
        xq();
    }

    public void gbl() {
        this.emc = true;
        emc(ul());
        emc((int) (ul() ? vk() : cf()));
        this.dg = 0L;
        this.uym = 0;
        aa();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fCf;
        float fVk;
        float fCf2;
        if (this.ru == null) {
            return 0.0f;
        }
        if (ul()) {
            fCf = vk() - this.ycc;
            fVk = vk();
            fCf2 = cf();
        } else {
            fCf = this.ycc - cf();
            fVk = vk();
            fCf2 = cf();
        }
        return fCf / (fVk - fCf2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(ycc());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        uym uymVar = this.ru;
        if (uymVar == null) {
            return 0L;
        }
        return (long) uymVar.bw();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.emc;
    }

    public void msw() {
        this.ru = null;
        this.msw = -2.1474836E9f;
        this.zz = 2.1474836E9f;
    }

    public void qh() {
        this.emc = true;
        aa();
        this.dg = 0L;
        if (ul() && uym() == cf()) {
            emc(vk());
        } else if (!ul() && uym() == vk()) {
            emc(cf());
        }
        bw();
    }

    public float ru() {
        return this.ypw;
    }

    public void sba() {
        dg(true);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.xq) {
            return;
        }
        this.xq = false;
        zz();
    }

    public void sup() {
        sba();
        ypw(ul());
    }

    public void sz() {
        sba();
        dg();
    }

    public float uym() {
        return this.ycc;
    }

    public float vk() {
        uym uymVar = this.ru;
        if (uymVar == null) {
            return 0.0f;
        }
        float f2 = this.zz;
        return f2 == 2.1474836E9f ? uymVar.uym() : f2;
    }

    public void xq(boolean z6) {
        this.gbl = z6;
    }

    public float ycc() {
        uym uymVar = this.ru;
        if (uymVar == null) {
            return 0.0f;
        }
        return (this.ycc - uymVar.ycc()) / (this.ru.uym() - this.ru.ycc());
    }

    public void ypw(float f2) {
        emc(this.msw, f2);
    }

    public void zz() {
        xq(-ru());
    }

    public void xq(float f2) {
        this.ypw = f2;
    }

    @Override // com.bytedance.adsdk.ypw.ycc.emc
    public void ypw() {
        super.ypw();
        ypw(ul());
    }

    public void emc(float f2) {
        if (this.bw == f2) {
            return;
        }
        float fYpw = bw.ypw(f2, cf(), vk());
        this.bw = fYpw;
        if (this.gbl) {
            fYpw = (float) Math.floor(fYpw);
        }
        this.ycc = fYpw;
        this.dg = 0L;
        xq();
    }

    public void emc(int i) {
        emc(i, (int) this.zz);
    }

    public void emc(float f2, float f5) {
        if (f2 <= f5) {
            uym uymVar = this.ru;
            float fYcc = uymVar == null ? -3.4028235E38f : uymVar.ycc();
            uym uymVar2 = this.ru;
            float fUym = uymVar2 == null ? Float.MAX_VALUE : uymVar2.uym();
            float fYpw = bw.ypw(f2, fYcc, fUym);
            float fYpw2 = bw.ypw(f5, fYcc, fUym);
            if (fYpw == this.msw && fYpw2 == this.zz) {
                return;
            }
            this.msw = fYpw;
            this.zz = fYpw2;
            emc((int) bw.ypw(this.ycc, fYpw, fYpw2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f2 + ") must be <= maxFrame (" + f5 + ")");
    }
}
