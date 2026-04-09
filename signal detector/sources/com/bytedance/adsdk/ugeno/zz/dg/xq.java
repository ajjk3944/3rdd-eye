package com.bytedance.adsdk.ugeno.zz.dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.bw;
import com.bytedance.adsdk.ugeno.core.gbl;
import com.bytedance.adsdk.ugeno.core.ycc;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.adsdk.ugeno.uym.dg;
import com.bytedance.adsdk.ugeno.uym.msw;
import org.json.JSONException;
import w1.a;

/* loaded from: classes.dex */
public class xq extends com.bytedance.adsdk.ugeno.ypw.xq<emc> {
    protected ImageView.ScaleType dpk;
    protected String emc;
    protected String ge;
    protected boolean hh;
    private float nx;
    private int oa;
    private float zhk;

    public xq(Context context) {
        super(context);
        this.dpk = ImageView.ScaleType.FIT_XY;
        this.oa = -1;
        this.nx = -1.0f;
        this.zhk = -1.0f;
    }

    private ImageView.ScaleType qh(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void ru() {
        if (this.nx > 0.0f) {
            bw.emc().ypw().emc(this.zz, this.emc, new emc.InterfaceC0009emc() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.1
                @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0009emc
                public void emc(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs != null) {
                            ycc unused = ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs != null) {
                        ycc unused2 = ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs;
                    }
                    final Bitmap bitmapEmc = msw.emc(((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).ypw, bitmap, (int) xq.this.nx);
                    if (bitmapEmc != null) {
                        msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((emc) ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).bw).setImageBitmap(bitmapEmc);
                            }
                        });
                    }
                    xq xqVar = xq.this;
                    if (xqVar.hh || xqVar.zhk > 0.0f) {
                        Bitmap bitmapEmc2 = msw.emc(((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).ypw, bitmap, xq.this.zhk > 0.0f ? (int) xq.this.zhk : 10);
                        if (bitmapEmc2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).ypw.getResources(), bitmapEmc2);
                            msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((emc) ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).bw).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.emc emcVarYpw = bw.emc().ypw();
        gbl gblVar = this.zz;
        String str = this.emc;
        T t6 = this.bw;
        emcVarYpw.emc(gblVar, str, (ImageView) t6, ((emc) t6).getWidth(), ((emc) this.bw).getHeight(), new emc.InterfaceC0009emc() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.2
            @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0009emc
            public void emc(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs != null) {
                        ycc unused = ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs;
                    }
                } else if (((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs != null) {
                    ycc unused2 = ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).xxs;
                }
            }
        });
        if (this.hh || this.zhk > 0.0f) {
            bw.emc().ypw().emc(this.zz, this.emc, new emc.InterfaceC0009emc() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.3
                @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0009emc
                public void emc(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapEmc = msw.emc(((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).ypw, bitmap, xq.this.zhk > 0.0f ? (int) xq.this.zhk : 10);
                    msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapEmc != null) {
                                ((emc) ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).bw).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).ypw.getResources(), bitmapEmc));
                            }
                        }
                    });
                }
            });
        }
    }

    private void zz() throws NumberFormatException {
        if (TextUtils.isEmpty(this.emc)) {
            return;
        }
        ((emc) this.bw).setImageDrawable(null);
        if (!this.emc.startsWith("local://")) {
            if (!this.emc.startsWith("@")) {
                ru();
                return;
            } else {
                ((emc) this.bw).setImageResource(Integer.parseInt(this.emc.substring(1)));
                return;
            }
        }
        try {
            String strReplace = this.emc.replace("local://", "");
            if (TextUtils.equals(xq(), "raw")) {
                ((emc) this.bw).setImageResource(dg.emc(this.ypw, strReplace));
            } else {
                ((emc) this.bw).setImageResource(dg.ypw(this.ypw, strReplace));
            }
        } catch (Exception unused) {
        }
    }

    public void cf(String str) {
        this.emc = str;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public emc emc() {
        emc emcVar = new emc(this.ypw);
        emcVar.emc(this);
        return emcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq, com.bytedance.adsdk.ugeno.dg
    public void msw() {
        super.msw();
        Drawable drawable = ((emc) this.bw).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.d(drawable)) {
            return;
        }
        a.b(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq, com.bytedance.adsdk.ugeno.dg
    public void uym() {
        super.uym();
        ((emc) this.bw).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.dg.xq.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((emc) ((com.bytedance.adsdk.ugeno.ypw.xq) xq.this).bw).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !a.d(drawable)) {
                    return;
                }
                a.b(drawable).start();
            }
        });
    }

    public String xq() {
        return this.ge;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException, NumberFormatException {
        super.ypw();
        zz();
        ((emc) this.bw).setScaleType(this.dpk);
        ((emc) this.bw).setBorderColor(this.hj);
        ((emc) this.bw).setCornerRadius(this.yz);
        ((emc) this.bw).setBorderWidth(this.ndl);
        int i = this.oa;
        if (i != -1) {
            ((emc) this.bw).setColorFilter(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.dpk = qh(str2);
                break;
            case "imageBlur":
                this.nx = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.hh = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                break;
            case "src":
                this.emc = str2;
                break;
            case "tintColor":
                this.oa = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "imageBgBlur":
                this.zhk = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                break;
        }
    }
}
