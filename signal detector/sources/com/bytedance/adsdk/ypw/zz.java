package com.bytedance.adsdk.ypw;

import A.f;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ypw.bw.sra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class zz extends Drawable implements Animatable, Drawable.Callback {
    private boolean aa;
    private final com.bytedance.adsdk.ypw.ycc.xq bw;
    private com.bytedance.adsdk.ypw.ypw.emc cf;
    private Paint cuf;
    private boolean db;
    private uym dg;
    private Canvas dr;
    private yzg ee;
    String emc;
    private final ValueAnimator.AnimatorUpdateListener gbl;
    private boolean hxp;
    private RectF iyl;
    private RectF lt;
    private Rect mkp;
    private boolean msw;
    private RectF mxo;
    private dg qh;
    private View ra;
    private boolean rie;
    private Rect rtt;
    private final ArrayList<emc> ru;
    private final Matrix sb;
    private boolean sba;
    private Bitmap sf;
    private boolean sra;
    private com.bytedance.adsdk.ypw.ypw.ypw sup;
    private String sz;
    private Matrix tp;
    private com.bytedance.adsdk.ypw.xq.xq.ypw ul;
    private boolean uym;
    private Map<String, Typeface> vk;
    private Matrix vw;
    private boolean wo;
    private Rect xmt;
    ul xq;
    private boolean ycc;
    private int ylm;
    xq ypw;
    private boolean yzg;
    private ypw zz;

    public interface emc {
        void emc(uym uymVar);
    }

    public enum ypw {
        NONE,
        PLAY,
        RESUME
    }

    public zz() {
        com.bytedance.adsdk.ypw.ycc.xq xqVar = new com.bytedance.adsdk.ypw.ycc.xq();
        this.bw = xqVar;
        this.ycc = true;
        this.uym = false;
        this.msw = false;
        this.zz = ypw.NONE;
        this.ru = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ypw.zz.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (zz.this.ul != null) {
                    zz.this.ul.emc(zz.this.bw.ycc());
                }
            }
        };
        this.gbl = animatorUpdateListener;
        this.sba = false;
        this.yzg = true;
        this.ylm = 255;
        this.ee = yzg.AUTOMATIC;
        this.db = false;
        this.sb = new Matrix();
        this.wo = false;
        xqVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean cuf() {
        return this.ycc || this.uym;
    }

    private Context iyl() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private void lt() {
        uym uymVar = this.dg;
        if (uymVar == null) {
            return;
        }
        this.db = this.ee.emc(Build.VERSION.SDK_INT, uymVar.emc(), uymVar.ypw());
    }

    private com.bytedance.adsdk.ypw.ypw.emc mkp() {
        if (getCallback() == null) {
            return null;
        }
        if (this.cf == null) {
            com.bytedance.adsdk.ypw.ypw.emc emcVar = new com.bytedance.adsdk.ypw.ypw.emc(getCallback(), this.ypw);
            this.cf = emcVar;
            String str = this.emc;
            if (str != null) {
                emcVar.emc(str);
            }
        }
        return this.cf;
    }

    private void mxo() {
        if (this.dr != null) {
            return;
        }
        this.dr = new Canvas();
        this.mxo = new RectF();
        this.tp = new Matrix();
        this.vw = new Matrix();
        this.xmt = new Rect();
        this.lt = new RectF();
        this.cuf = new com.bytedance.adsdk.ypw.emc.emc();
        this.rtt = new Rect();
        this.mkp = new Rect();
        this.iyl = new RectF();
    }

    private com.bytedance.adsdk.ypw.ypw.ypw rtt() {
        com.bytedance.adsdk.ypw.ypw.ypw ypwVar = this.sup;
        if (ypwVar != null && !ypwVar.emc(iyl())) {
            this.sup = null;
        }
        if (this.sup == null) {
            this.sup = new com.bytedance.adsdk.ypw.ypw.ypw(getCallback(), this.sz, this.qh, this.dg.vk());
        }
        return this.sup;
    }

    private boolean tp() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    public void aa() {
        this.bw.removeAllUpdateListeners();
        this.bw.addUpdateListener(this.gbl);
    }

    public boolean bw() {
        return this.sba;
    }

    public float cf() {
        return this.bw.vk();
    }

    public uym db() {
        return this.dg;
    }

    public String dg() {
        return this.sz;
    }

    public float dr() {
        return this.bw.ycc();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        bw.emc("Drawable#draw");
        try {
            if (this.db) {
                emc(canvas, this.ul);
            } else {
                emc(canvas);
            }
        } catch (Throwable unused) {
        }
        this.wo = false;
        bw.ypw("Drawable#draw");
    }

    public boolean ee() {
        return this.vk == null && this.xq == null && this.dg.qh().size() > 0;
    }

    public void gbl() {
        if (this.ul == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.6
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.gbl();
                }
            });
            return;
        }
        lt();
        if (cuf() || ylm() == 0) {
            if (isVisible()) {
                this.bw.gbl();
                this.zz = ypw.NONE;
            } else {
                this.zz = ypw.PLAY;
            }
        }
        if (cuf()) {
            return;
        }
        xq((int) (vk() < 0.0f ? qh() : cf()));
        this.bw.sup();
        if (isVisible()) {
            return;
        }
        this.zz = ypw.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ylm;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        uym uymVar = this.dg;
        if (uymVar == null) {
            return -1;
        }
        return uymVar.dg().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        uym uymVar = this.dg;
        if (uymVar == null) {
            return -1;
        }
        return uymVar.dg().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ul hxp() {
        return this.xq;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.wo) {
            return;
        }
        this.wo = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return sra();
    }

    public sba msw() {
        uym uymVar = this.dg;
        if (uymVar != null) {
            return uymVar.xq();
        }
        return null;
    }

    public float qh() {
        return this.bw.cf();
    }

    public boolean rie() {
        if (isVisible()) {
            return this.bw.isRunning();
        }
        ypw ypwVar = this.zz;
        return ypwVar == ypw.PLAY || ypwVar == ypw.RESUME;
    }

    public void ru() {
        if (this.bw.isRunning()) {
            this.bw.cancel();
            if (!isVisible()) {
                this.zz = ypw.NONE;
            }
        }
        this.dg = null;
        this.ul = null;
        this.sup = null;
        this.bw.msw();
        invalidateSelf();
    }

    public void sb() {
        this.ru.clear();
        this.bw.cancel();
        if (isVisible()) {
            return;
        }
        this.zz = ypw.NONE;
    }

    public void sba() {
        this.bw.removeAllListeners();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.ylm = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z6, z7);
        if (z6) {
            ypw ypwVar = this.zz;
            if (ypwVar == ypw.PLAY) {
                gbl();
                return visible;
            }
            if (ypwVar == ypw.RESUME) {
                sz();
                return visible;
            }
        } else {
            if (this.bw.isRunning()) {
                sf();
                this.zz = ypw.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.zz = ypw.NONE;
            }
        }
        return visible;
    }

    public void sf() {
        this.ru.clear();
        this.bw.sz();
        if (isVisible()) {
            return;
        }
        this.zz = ypw.NONE;
    }

    public boolean sra() {
        com.bytedance.adsdk.ypw.ycc.xq xqVar = this.bw;
        if (xqVar == null) {
            return false;
        }
        return xqVar.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        gbl();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        sup();
    }

    public void sup() {
        this.ru.clear();
        this.bw.sup();
        if (isVisible()) {
            return;
        }
        this.zz = ypw.NONE;
    }

    public void sz() {
        if (this.ul == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.7
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.sz();
                }
            });
            return;
        }
        lt();
        if (cuf() || ylm() == 0) {
            if (isVisible()) {
                this.bw.qh();
                this.zz = ypw.NONE;
            } else {
                this.zz = ypw.RESUME;
            }
        }
        if (cuf()) {
            return;
        }
        xq((int) (vk() < 0.0f ? qh() : cf()));
        this.bw.sup();
        if (isVisible()) {
            return;
        }
        this.zz = ypw.NONE;
    }

    @SuppressLint({"WrongConstant"})
    public int ul() {
        return this.bw.getRepeatMode();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean uym() {
        return this.db;
    }

    public float vk() {
        return this.bw.ru();
    }

    public RectF xmt() {
        return this.mxo;
    }

    public boolean xq() {
        return this.yzg;
    }

    public yzg ycc() {
        return this.db ? yzg.SOFTWARE : yzg.HARDWARE;
    }

    public int ylm() {
        return this.bw.getRepeatCount();
    }

    public int yzg() {
        return (int) this.bw.uym();
    }

    public boolean zz() {
        return this.hxp;
    }

    public void bw(boolean z6) {
        this.hxp = z6;
    }

    public void dg(boolean z6) {
        if (this.rie == z6) {
            return;
        }
        this.rie = z6;
        com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar = this.ul;
        if (ypwVar != null) {
            ypwVar.emc(z6);
        }
    }

    public void emc(View view) {
        this.ra = view;
    }

    public void uym(boolean z6) {
        this.uym = z6;
    }

    public void xq(boolean z6) {
        this.sra = z6;
        uym uymVar = this.dg;
        if (uymVar != null) {
            uymVar.ypw(z6);
        }
    }

    public void ycc(boolean z6) {
        this.msw = z6;
    }

    public com.bytedance.adsdk.ypw.xq.xq.ypw ypw() {
        return this.ul;
    }

    public void bw(int i) {
        this.bw.setRepeatCount(i);
    }

    public View emc() {
        return this.ra;
    }

    public void msw(boolean z6) {
        this.bw.xq(z6);
    }

    public void uym(String str) {
        this.emc = str;
        com.bytedance.adsdk.ypw.ypw.emc emcVarMkp = mkp();
        if (emcVarMkp != null) {
            emcVarMkp.emc(str);
        }
    }

    public ru ycc(String str) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            return null;
        }
        return uymVar.vk().get(str);
    }

    public void ypw(boolean z6) {
        this.sba = z6;
    }

    public Bitmap bw(String str) {
        com.bytedance.adsdk.ypw.ypw.ypw ypwVarRtt = rtt();
        if (ypwVarRtt != null) {
            return ypwVarRtt.emc(str);
        }
        return null;
    }

    public void emc(boolean z6, Context context) {
        if (this.aa == z6) {
            return;
        }
        this.aa = z6;
        if (this.dg != null) {
            emc(context);
        }
    }

    public void ypw(final int i) {
        if (this.dg == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.10
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.ypw(i);
                }
            });
        } else {
            this.bw.ypw(i + 0.99f);
        }
    }

    public void xq(final String str) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.13
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar2) {
                    zz.this.xq(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ypw.xq.ycc yccVarXq = uymVar.xq(str);
        if (yccVarXq != null) {
            ypw((int) (yccVarXq.emc + yccVarXq.ypw));
            return;
        }
        throw new IllegalArgumentException(f.m("Cannot find marker with name ", str, "."));
    }

    public void dg(final String str) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.2
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar2) {
                    zz.this.dg(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ypw.xq.ycc yccVarXq = uymVar.xq(str);
        if (yccVarXq != null) {
            int i = (int) yccVarXq.emc;
            emc(i, ((int) yccVarXq.ypw) + i);
            return;
        }
        throw new IllegalArgumentException(f.m("Cannot find marker with name ", str, "."));
    }

    public void ypw(final float f2) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.11
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar2) {
                    zz.this.ypw(f2);
                }
            });
        } else {
            this.bw.ypw(com.bytedance.adsdk.ypw.ycc.bw.emc(uymVar.ycc(), this.dg.uym(), f2));
        }
    }

    public void emc(boolean z6) {
        if (z6 != this.yzg) {
            this.yzg = z6;
            com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar = this.ul;
            if (ypwVar != null) {
                ypwVar.ypw(z6);
            }
            invalidateSelf();
        }
    }

    public void ypw(final String str) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.12
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar2) {
                    zz.this.ypw(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ypw.xq.ycc yccVarXq = uymVar.xq(str);
        if (yccVarXq != null) {
            emc((int) yccVarXq.emc);
            return;
        }
        throw new IllegalArgumentException(f.m("Cannot find marker with name ", str, "."));
    }

    public void emc(String str) {
        this.sz = str;
    }

    public boolean emc(uym uymVar, Context context) {
        if (this.dg == uymVar) {
            return false;
        }
        this.wo = true;
        ru();
        this.dg = uymVar;
        emc(context);
        this.bw.emc(uymVar);
        dg(this.bw.getAnimatedFraction());
        Iterator it = new ArrayList(this.ru).iterator();
        while (it.hasNext()) {
            emc emcVar = (emc) it.next();
            if (emcVar != null) {
                emcVar.emc(uymVar);
            }
            it.remove();
        }
        this.ru.clear();
        uymVar.ypw(this.sra);
        lt();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void xq(float f2) {
        this.bw.xq(f2);
    }

    public void xq(final int i) {
        if (this.dg == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.4
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.xq(i);
                }
            });
        } else {
            this.bw.emc(i);
        }
    }

    public void dg(final float f2) {
        if (this.dg == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.5
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.dg(f2);
                }
            });
            return;
        }
        bw.emc("Drawable#setProgress");
        this.bw.emc(this.dg.emc(f2));
        bw.ypw("Drawable#setProgress");
    }

    public void ypw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.bw.removeUpdateListener(animatorUpdateListener);
    }

    public void ypw(Animator.AnimatorListener animatorListener) {
        this.bw.removeListener(animatorListener);
    }

    private void ypw(int i, int i3) {
        Bitmap bitmap = this.sf;
        if (bitmap != null && bitmap.getWidth() >= i && this.sf.getHeight() >= i3) {
            if (this.sf.getWidth() > i || this.sf.getHeight() > i3) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.sf, 0, 0, i, i3);
                this.sf = bitmapCreateBitmap;
                this.dr.setBitmap(bitmapCreateBitmap);
                this.wo = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
        this.sf = bitmapCreateBitmap2;
        this.dr.setBitmap(bitmapCreateBitmap2);
        this.wo = true;
    }

    public void dg(int i) {
        this.bw.setRepeatMode(i);
    }

    public void emc(yzg yzgVar) {
        this.ee = yzgVar;
        lt();
    }

    private void emc(Context context) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            return;
        }
        com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar = new com.bytedance.adsdk.ypw.xq.xq.ypw(this, sra.emc(uymVar), uymVar.sz(), uymVar, context);
        this.ul = ypwVar;
        if (this.rie) {
            ypwVar.emc(true);
        }
        this.ul.ypw(this.yzg);
    }

    public void emc(final int i) {
        if (this.dg == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.8
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.emc(i);
                }
            });
        } else {
            this.bw.emc(i);
        }
    }

    public void emc(final float f2) {
        uym uymVar = this.dg;
        if (uymVar == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.9
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar2) {
                    zz.this.emc(f2);
                }
            });
        } else {
            emc((int) com.bytedance.adsdk.ypw.ycc.bw.emc(uymVar.ycc(), this.dg.uym(), f2));
        }
    }

    public void emc(final int i, final int i3) {
        if (this.dg == null) {
            this.ru.add(new emc() { // from class: com.bytedance.adsdk.ypw.zz.3
                @Override // com.bytedance.adsdk.ypw.zz.emc
                public void emc(uym uymVar) {
                    zz.this.emc(i, i3);
                }
            });
        } else {
            this.bw.emc(i, i3 + 0.99f);
        }
    }

    public void emc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.bw.addUpdateListener(animatorUpdateListener);
    }

    public void emc(Animator.AnimatorListener animatorListener) {
        this.bw.addListener(animatorListener);
    }

    public void emc(Boolean bool) {
        this.ycc = bool.booleanValue();
    }

    public void emc(dg dgVar) {
        this.qh = dgVar;
        com.bytedance.adsdk.ypw.ypw.ypw ypwVar = this.sup;
        if (ypwVar != null) {
            ypwVar.emc(dgVar);
        }
    }

    public void emc(xq xqVar) {
        this.ypw = xqVar;
        com.bytedance.adsdk.ypw.ypw.emc emcVar = this.cf;
        if (emcVar != null) {
            emcVar.emc(xqVar);
        }
    }

    public void emc(Map<String, Typeface> map) {
        if (map == this.vk) {
            return;
        }
        this.vk = map;
        invalidateSelf();
    }

    public void emc(ul ulVar) {
        this.xq = ulVar;
    }

    public Bitmap emc(String str, Bitmap bitmap) {
        com.bytedance.adsdk.ypw.ypw.ypw ypwVarRtt = rtt();
        if (ypwVarRtt == null) {
            return null;
        }
        Bitmap bitmapEmc = ypwVarRtt.emc(str, bitmap);
        invalidateSelf();
        return bitmapEmc;
    }

    public Typeface emc(com.bytedance.adsdk.ypw.xq.xq xqVar) {
        Map<String, Typeface> map = this.vk;
        if (map != null) {
            String strEmc = xqVar.emc();
            if (map.containsKey(strEmc)) {
                return map.get(strEmc);
            }
            String strYpw = xqVar.ypw();
            if (map.containsKey(strYpw)) {
                return map.get(strYpw);
            }
            String str = xqVar.emc() + "-" + xqVar.xq();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.ypw.ypw.emc emcVarMkp = mkp();
        if (emcVarMkp != null) {
            return emcVarMkp.emc(xqVar);
        }
        return null;
    }

    private void emc(Canvas canvas) {
        com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar = this.ul;
        uym uymVar = this.dg;
        if (ypwVar == null || uymVar == null) {
            return;
        }
        this.sb.reset();
        if (!getBounds().isEmpty()) {
            this.sb.preScale(r2.width() / uymVar.dg().width(), r2.height() / uymVar.dg().height());
            this.sb.preTranslate(r2.left, r2.top);
        }
        ypwVar.emc(canvas, this.sb, this.ylm);
    }

    private void emc(Canvas canvas, com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar) {
        if (this.dg == null || ypwVar == null) {
            return;
        }
        mxo();
        canvas.getMatrix(this.tp);
        canvas.getClipBounds(this.xmt);
        emc(this.xmt, this.lt);
        this.tp.mapRect(this.lt);
        emc(this.lt, this.xmt);
        if (this.yzg) {
            this.mxo.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            ypwVar.emc(this.mxo, (Matrix) null, false);
        }
        this.tp.mapRect(this.mxo);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        emc(this.mxo, fWidth, fHeight);
        if (!tp()) {
            RectF rectF = this.mxo;
            Rect rect = this.xmt;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.mxo.width());
        int iCeil2 = (int) Math.ceil(this.mxo.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        ypw(iCeil, iCeil2);
        if (this.wo) {
            this.sb.set(this.tp);
            this.sb.preScale(fWidth, fHeight);
            Matrix matrix = this.sb;
            RectF rectF2 = this.mxo;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.sf.eraseColor(0);
            ypwVar.emc(this.dr, this.sb, this.ylm);
            this.tp.invert(this.vw);
            this.vw.mapRect(this.iyl, this.mxo);
            emc(this.iyl, this.mkp);
        }
        this.rtt.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.sf, this.rtt, this.mkp, this.cuf);
    }

    private void emc(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void emc(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void emc(RectF rectF, float f2, float f5) {
        rectF.set(rectF.left * f2, rectF.top * f5, rectF.right * f2, rectF.bottom * f5);
    }
}
