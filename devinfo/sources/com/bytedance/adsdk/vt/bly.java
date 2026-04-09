package com.bytedance.adsdk.vt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import d.h;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends Drawable implements Animatable, Drawable.Callback {
    com.bytedance.adsdk.vt.vt.vt bly;
    private Rect bs;

    /* renamed from: cd, reason: collision with root package name */
    private int f7026cd;

    /* renamed from: cf, reason: collision with root package name */
    yu f7027cf;
    qbp ex;
    private Rect ey;
    private RectF fak;
    boolean fkw;
    private Matrix fqk;
    private Canvas fvf;
    public View jae;

    /* renamed from: jg, reason: collision with root package name */
    String f7028jg;
    public boolean jqy;
    private Matrix jvy;
    lh ko;
    RectF ksc;

    /* renamed from: le, reason: collision with root package name */
    public vt f7029le;

    /* renamed from: lh, reason: collision with root package name */
    boolean f7030lh;
    public Map<String, Typeface> mwh;

    /* renamed from: od, reason: collision with root package name */
    boolean f7031od;
    private Rect osn;
    public ra ouw;

    /* renamed from: pd, reason: collision with root package name */
    private Bitmap f7032pd;
    final ValueAnimator.AnimatorUpdateListener pno;
    com.bytedance.adsdk.vt.lh.lh.vt qbp;
    public final ArrayList<ouw> ra;
    public zin rn;
    private RectF rrs;
    com.bytedance.adsdk.vt.vt.ouw ryl;
    boolean tc;

    /* renamed from: th, reason: collision with root package name */
    boolean f7033th;
    String tlj;
    private Paint uoy;
    private final Matrix uq;
    public boolean vm;
    boolean vpp;
    public final com.bytedance.adsdk.vt.le.fkw vt;
    boolean yu;
    boolean zih;
    boolean zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum vt {
        NONE,
        PLAY,
        RESUME
    }

    public bly() {
        com.bytedance.adsdk.vt.le.fkw fkwVar = new com.bytedance.adsdk.vt.le.fkw();
        this.vt = fkwVar;
        this.f7030lh = true;
        this.yu = false;
        this.fkw = false;
        this.f7029le = vt.NONE;
        this.ra = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.bly.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (bly.this.qbp != null) {
                    bly.this.qbp.ouw(bly.this.vt.le());
                }
            }
        };
        this.pno = animatorUpdateListener;
        this.vm = false;
        this.f7033th = true;
        this.f7026cd = 255;
        this.ex = qbp.AUTOMATIC;
        this.tc = false;
        this.uq = new Matrix();
        this.f7031od = false;
        fkwVar.addUpdateListener(animatorUpdateListener);
    }

    private Context cf() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private boolean tlj() {
        return this.f7030lh || this.yu;
    }

    public final com.bytedance.adsdk.vt.vt.ouw bly() {
        if (getCallback() == null) {
            return null;
        }
        if (this.ryl == null) {
            com.bytedance.adsdk.vt.vt.ouw ouwVar = new com.bytedance.adsdk.vt.vt.ouw(getCallback(), this.ko);
            this.ryl = ouwVar;
            String str = this.f7028jg;
            if (str != null) {
                ouwVar.yu = str;
            }
        }
        return this.ryl;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0006, B:5:0x000a, B:9:0x0014, B:11:0x0018, B:14:0x0062, B:16:0x0091, B:18:0x00a8, B:20:0x00e2, B:22:0x00ec, B:26:0x0108, B:30:0x0126, B:32:0x012b, B:34:0x0131, B:37:0x013a, B:39:0x0142, B:43:0x0169, B:45:0x016d, B:46:0x01ab, B:41:0x014a, B:42:0x015a, B:25:0x00f5, B:17:0x00a2, B:47:0x01bc, B:51:0x01c5, B:53:0x01d4, B:54:0x01fe), top: B:59:0x0006 }] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.bly.draw(android.graphics.Canvas):void");
    }

    public final void fkw() {
        if (this.qbp == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.7
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.fkw();
                }
            });
            return;
        }
        vt();
        if (tlj() || this.vt.getRepeatCount() == 0) {
            if (isVisible()) {
                this.vt.cf();
                this.f7029le = vt.NONE;
            } else {
                this.f7029le = vt.RESUME;
            }
        }
        if (tlj()) {
            return;
        }
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        lh((int) (fkwVar.ouw < 0.0f ? fkwVar.ryl() : fkwVar.mwh()));
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f7029le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7026cd;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return -1;
        }
        return raVar.bly.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return -1;
        }
        return raVar.bly.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f7031od) {
            return;
        }
        this.f7031od = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return le();
    }

    public final boolean le() {
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return false;
        }
        return fkwVar.isRunning();
    }

    public final void lh() {
        if (this.vt.isRunning()) {
            this.vt.cancel();
            if (!isVisible()) {
                this.f7029le = vt.NONE;
            }
        }
        this.ouw = null;
        this.qbp = null;
        this.bly = null;
        this.vt.ra();
        invalidateSelf();
    }

    public final com.bytedance.adsdk.vt.vt.vt pno() {
        com.bytedance.adsdk.vt.vt.vt vtVar = this.bly;
        if (vtVar != null && !vtVar.ouw(cf())) {
            this.bly = null;
        }
        if (this.bly == null) {
            this.bly = new com.bytedance.adsdk.vt.vt.vt(getCallback(), this.tlj, this.f7027cf, this.ouw.f7198lh);
        }
        return this.bly;
    }

    public final void ra() {
        this.ra.clear();
        this.vt.tlj();
        if (isVisible()) {
            return;
        }
        this.f7029le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f7026cd = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        com.bytedance.adsdk.vt.le.yu.vt("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z3, z10);
        if (z3) {
            vt vtVar = this.f7029le;
            if (vtVar == vt.PLAY) {
                yu();
                return visible;
            }
            if (vtVar == vt.RESUME) {
                fkw();
                return visible;
            }
        } else {
            if (this.vt.isRunning()) {
                ra();
                this.f7029le = vt.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f7029le = vt.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        yu();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.ra.clear();
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f7029le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void yu() {
        if (this.qbp == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.6
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.yu();
                }
            });
            return;
        }
        vt();
        if (tlj() || this.vt.getRepeatCount() == 0) {
            if (isVisible()) {
                this.vt.pno();
                this.f7029le = vt.NONE;
            } else {
                this.f7029le = vt.PLAY;
            }
        }
        if (tlj()) {
            return;
        }
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        lh((int) (fkwVar.ouw < 0.0f ? fkwVar.ryl() : fkwVar.mwh()));
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f7029le = vt.NONE;
    }

    public final qbp ouw() {
        return this.tc ? qbp.SOFTWARE : qbp.HARDWARE;
    }

    public final void vt() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return;
        }
        this.tc = this.ex.ouw(Build.VERSION.SDK_INT, raVar.mwh, raVar.f7196jg);
    }

    public final void ouw(Context context) {
        ra raVar = this.ouw;
        if (raVar == null) {
            return;
        }
        com.bytedance.adsdk.vt.lh.lh.vt vtVar = new com.bytedance.adsdk.vt.lh.lh.vt(this, com.bytedance.adsdk.vt.fkw.qbp.ouw(raVar), raVar.pno, raVar, context);
        this.qbp = vtVar;
        if (this.vpp) {
            vtVar.ouw(true);
        }
        this.qbp.ryl = this.f7033th;
    }

    public final void vt(final int i4) {
        if (this.ouw == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.10
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(i4);
                }
            });
        } else {
            this.vt.vt(i4 + 0.99f);
        }
    }

    public final void lh(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.2
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            int i4 = (int) leVarVt.vt;
            ouw(i4, ((int) leVarVt.f7062lh) + i4);
            return;
        }
        throw new IllegalArgumentException(h.t("Cannot find marker with name ", str, "."));
    }

    public final void vt(final float f10) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.11
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(f10);
                }
            });
        } else {
            this.vt.vt(com.bytedance.adsdk.vt.le.ra.ouw(raVar.tlj, raVar.f7195cf, f10));
        }
    }

    public final void ouw(final int i4) {
        if (this.ouw == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.8
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(i4);
                }
            });
        } else {
            this.vt.ouw(i4);
        }
    }

    public final void ouw(final float f10) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.9
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(f10);
                }
            });
        } else {
            ouw((int) com.bytedance.adsdk.vt.le.ra.ouw(raVar.tlj, raVar.f7195cf, f10));
        }
    }

    public final void vt(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.13
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            vt((int) (leVarVt.vt + leVarVt.f7062lh));
            return;
        }
        throw new IllegalArgumentException(h.t("Cannot find marker with name ", str, "."));
    }

    public final void yu(int i4) {
        this.vt.setRepeatCount(i4);
    }

    public final void ouw(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.12
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            ouw((int) leVarVt.vt);
            return;
        }
        throw new IllegalArgumentException(h.t("Cannot find marker with name ", str, "."));
    }

    public final tlj yu(String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            return null;
        }
        return raVar.f7198lh.get(str);
    }

    public final void lh(final int i4) {
        if (this.ouw == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.4
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(i4);
                }
            });
        } else {
            this.vt.ouw(i4);
        }
    }

    public final void lh(final float f10) {
        if (this.ouw == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.5
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(f10);
                }
            });
            return;
        }
        fkw.ouw("Drawable#setProgress");
        this.vt.ouw(this.ouw.ouw(f10));
        fkw.vt("Drawable#setProgress");
    }

    public final void ouw(final int i4, final int i10) {
        if (this.ouw == null) {
            this.ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.3
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(i4, i10);
                }
            });
        } else {
            this.vt.ouw(i4, i10 + 0.99f);
        }
    }

    public final void ouw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vt.addUpdateListener(animatorUpdateListener);
    }

    public final void ouw(Animator.AnimatorListener animatorListener) {
        this.vt.addListener(animatorListener);
    }

    private static void ouw(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }
}
