package com.bytedance.adsdk.ugeno.yoga.ypw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.adsdk.ugeno.uym.msw;
import com.bytedance.adsdk.ugeno.yoga.bw;
import com.bytedance.adsdk.ugeno.yoga.dg;
import com.bytedance.adsdk.ugeno.yoga.qh;
import com.bytedance.adsdk.ugeno.yoga.ru;
import com.bytedance.adsdk.ugeno.yoga.sz;
import com.bytedance.adsdk.ugeno.yoga.ycc;
import com.bytedance.adsdk.ugeno.yoga.ypw.xq;
import com.bytedance.adsdk.ugeno.ypw.emc;
import org.json.JSONException;

/* loaded from: classes.dex */
public class emc extends com.bytedance.adsdk.ugeno.ypw.emc<xq> {
    private bw dpk;
    private ycc ge;
    private qh hh;
    private com.bytedance.adsdk.ugeno.yoga.emc nx;
    private com.bytedance.adsdk.ugeno.yoga.emc oa;
    private ru zhk;

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0101emc extends emc.C0102emc {
        public int cuf;
        public int db;
        public int dr;
        public int iyl;
        public int lt;
        public int mkp;
        public float mxo;
        private boolean ra;
        public int rtt;
        public float sb;
        public float sf;
        private boolean tp;
        private boolean vw;
        private boolean wo;
        public float xmt;
        private boolean xxg;
        private boolean yz;

        public C0101emc(com.bytedance.adsdk.ugeno.ypw.emc emcVar) {
            super(emcVar);
            this.db = 1;
            this.sb = 0.0f;
            this.sf = 1.0f;
            this.dr = com.bytedance.adsdk.ugeno.yoga.emc.AUTO.emc();
            this.xmt = -1.0f;
            this.lt = sz.RELATIVE.emc();
        }

        private void dg() {
            com.bytedance.adsdk.ugeno.ypw.emc emcVar = this.ee;
            if (emcVar instanceof emc) {
                if (((emc) emcVar).wd() == bw.ROW && this.ee.iyl() == -2 && this.emc == -1.0f && !this.ee.yz()) {
                    this.emc = -2.0f;
                    this.sf = 1.0f;
                    this.sb = 1.0f;
                    this.tp = true;
                    this.xmt = -1.0f;
                }
                if (((emc) this.ee).wd() == bw.COLUMN && this.ee.mxo() == -2 && this.ypw == -1.0f && !this.ee.yz()) {
                    this.ypw = -2.0f;
                    this.sf = 1.0f;
                    this.sb = 1.0f;
                    this.tp = true;
                    this.xmt = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ypw.emc.C0102emc
        public String toString() {
            return "LayoutParams{mOrder=" + this.db + ", mFlexGrow=" + this.sb + ", mFlexShrink=" + this.sf + ", mAlignSelf=" + this.dr + ", mFlexBasis=" + this.xmt + ", mPosition=" + this.lt + ", mTop=" + this.cuf + ", mBottom=" + this.rtt + ", mLeft=" + this.mkp + ", mRight=" + this.iyl + '}';
        }

        public boolean xq() {
            float f10 = this.emc;
            if (f10 == -1.0f && this.ypw == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.ypw == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.ypw.emc.C0102emc
        /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
        public xq.emc emc() {
            dg();
            xq.emc emcVar = new xq.emc((int) this.emc, (int) this.ypw);
            emcVar.sup((int) (this.ul ? this.ycc : this.bw));
            emcVar.qh((int) (this.ylm ? this.uym : this.bw));
            emcVar.gbl((int) (this.sra ? this.msw : this.bw));
            emcVar.sz((int) (this.rie ? this.zz : this.bw));
            emcVar.emc(this.db);
            emcVar.bw(this.dr);
            emcVar.ypw(this.sb);
            emcVar.xq(this.sf);
            emcVar.vk(this.xq);
            emcVar.aa(this.dg);
            if (this.tp) {
                emcVar.dg(this.xmt);
            }
            emcVar.ycc(this.lt);
            if (this.vw) {
                emcVar.uym(this.cuf);
            }
            if (this.ra) {
                emcVar.zz(this.rtt);
            }
            if (this.wo) {
                emcVar.msw(this.mkp);
            }
            if (this.xxg) {
                emcVar.ru(this.iyl);
            }
            if (this.yz && xq()) {
                float f10 = this.mxo;
                if (f10 > 0.0f) {
                    emcVar.cf(f10);
                    emcVar.xq(0.0f);
                    emcVar.ypw(0.0f);
                }
            }
            return emcVar;
        }

        @Override // com.bytedance.adsdk.ugeno.ypw.emc.C0102emc
        public void emc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.emc(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.tp = true;
                    float fEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                    this.xmt = fEmc;
                    this.xmt = msw.emc(context, fEmc);
                    break;
                case "bottom":
                    this.ra = true;
                    this.rtt = (int) msw.emc(context, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0));
                    break;
                case "top":
                    this.vw = true;
                    this.cuf = (int) msw.emc(context, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0));
                    break;
                case "left":
                    this.wo = true;
                    this.mkp = (int) msw.emc(context, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0));
                    break;
                case "order":
                    this.db = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1);
                    break;
                case "ratio":
                    this.yz = true;
                    this.mxo = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                    break;
                case "right":
                    this.xxg = true;
                    this.iyl = (int) msw.emc(context, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0));
                    break;
                case "position":
                    this.lt = sz.emc(str2).emc();
                    break;
                case "flexShrink":
                    this.sf = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.sb = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.dr = com.bytedance.adsdk.ugeno.yoga.emc.emc(str2).emc();
                    break;
            }
        }
    }

    public emc(Context context) {
        super(context);
        this.dpk = bw.ROW;
        this.hh = qh.NO_WRAP;
        this.ge = ycc.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.emc emcVar = com.bytedance.adsdk.ugeno.yoga.emc.STRETCH;
        this.oa = emcVar;
        this.nx = emcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void sf() {
        ImageView.ScaleType scaleType;
        if (this.wo) {
            com.bytedance.adsdk.ugeno.bw.emc().ypw().emc(this.zz, this.tp, new emc.InterfaceC0094emc() { // from class: com.bytedance.adsdk.ugeno.yoga.ypw.emc.1
                @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0094emc
                public void emc(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs != null) {
                            com.bytedance.adsdk.ugeno.core.ycc unused = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs;
                            String unused2 = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).tp;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs != null) {
                        com.bytedance.adsdk.ugeno.core.ycc unused3 = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs;
                        String unused4 = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).tp;
                    }
                    final Bitmap bitmapEmc = msw.emc(((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).ypw, bitmap, (int) ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).ra);
                    if (bitmapEmc != null) {
                        msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.ypw.emc.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                emc.this.emc(new BitmapDrawable(bitmapEmc));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.zz.dg.emc emcVar = new com.bytedance.adsdk.ugeno.zz.dg.emc(this.ypw);
        com.bytedance.adsdk.ugeno.bw.emc().ypw().emc(this.zz, this.tp, emcVar, this.bw.getWidth(), this.bw.getHeight(), new emc.InterfaceC0094emc() { // from class: com.bytedance.adsdk.ugeno.yoga.ypw.emc.2
            @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0094emc
            public void emc(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs != null) {
                        com.bytedance.adsdk.ugeno.core.ycc unused = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs;
                        String unused2 = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).tp;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs != null) {
                    com.bytedance.adsdk.ugeno.core.ycc unused3 = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).xxs;
                    String unused4 = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).tp;
                }
            }
        });
        if (!this.xxg || (scaleType = this.vw) == ImageView.ScaleType.FIT_XY) {
            emcVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            emcVar.setScaleType(scaleType);
        }
        emcVar.setCornerRadius(this.yz);
        xq.emc emcVar2 = new xq.emc(-1, -1);
        emcVar2.ycc(sz.ABSOLUTE.emc());
        emcVar2.uym(0.0f);
        emcVar2.msw(0.0f);
        T t10 = this.bw;
        if (t10 instanceof xq) {
            ((xq) t10).addView(emcVar, 0, emcVar2);
            emc(emcVar);
        }
    }

    public bw wd() {
        return this.dpk;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public C0101emc ru() {
        return new C0101emc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void qh() {
        if (this.lt) {
            this.zhk.ypw(dg.ALL, this.db);
        }
        if (this.cuf) {
            this.zhk.ypw(dg.LEFT, this.sb);
        }
        if (this.rtt) {
            this.zhk.ypw(dg.RIGHT, this.sf);
        }
        if (this.mkp) {
            this.zhk.ypw(dg.TOP, this.dr);
        }
        if (this.iyl) {
            this.zhk.ypw(dg.BOTTOM, this.xmt);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public xq emc() {
        xq xqVar = new xq(this.ypw);
        xqVar.emc(this);
        this.zhk = xqVar.getYogaNode();
        return xqVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        this.zhk.emc(this.dpk);
        this.zhk.emc(this.hh);
        this.zhk.emc(this.ge);
        this.zhk.emc(this.oa);
        this.zhk.xq(this.nx);
        this.zhk.emc(true);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.zz.dg.emc emcVar = new com.bytedance.adsdk.ugeno.zz.dg.emc(this.ypw);
        emcVar.setImageDrawable(drawable);
        if (this.xxg && (scaleType = this.vw) != ImageView.ScaleType.FIT_XY) {
            emcVar.setScaleType(scaleType);
        } else {
            emcVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        emcVar.setCornerRadius(this.yz);
        xq.emc emcVar2 = new xq.emc(-1, -1);
        emcVar2.ycc(sz.ABSOLUTE.emc());
        emcVar2.uym(0.0f);
        emcVar2.msw(0.0f);
        T t10 = this.bw;
        if (t10 instanceof xq) {
            ((xq) t10).addView(emcVar, 0, emcVar2);
            emc(emcVar);
        }
    }

    private void emc(final com.bytedance.adsdk.ugeno.zz.dg.emc emcVar) {
        this.bw.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.ypw.emc.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ru ruVarEmc;
                if (((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).bw == null || (ruVarEmc = ((xq) ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).bw).emc(emcVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).bw.getWidth();
                ruVarEmc.dg(width);
                int height = ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).bw.getHeight();
                ruVarEmc.ycc(height);
                emcVar.setCornerRadius(((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).yz);
                ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).bw.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.ypw.xq) emc.this).bw.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        super.emc(xqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, ViewGroup.LayoutParams layoutParams) {
        if (xqVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.add(xqVar);
        View viewGbl = xqVar.gbl();
        if (viewGbl != null) {
            ((xq) this.bw).addView(viewGbl, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.oa = com.bytedance.adsdk.ugeno.yoga.emc.emc(str2);
                break;
            case "flexDirection":
                this.dpk = bw.emc(str2);
                break;
            case "alignContent":
                this.nx = com.bytedance.adsdk.ugeno.yoga.emc.emc(str2);
                break;
            case "flexWrap":
                this.hh = qh.emc(str2);
                break;
            case "justifyContent":
                this.ge = ycc.emc(str2);
                break;
        }
    }
}
