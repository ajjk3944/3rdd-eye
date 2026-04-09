package com.bytedance.adsdk.ugeno.bly.yu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.applovin.shadow.okio.a;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.le;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.ra.yu;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh extends com.bytedance.adsdk.ugeno.vt.lh<ouw> {
    private float byv;
    private float ehk;
    private int fn;
    protected ImageView.ScaleType ln;
    protected String ouw;
    protected boolean qni;
    protected String smu;

    public lh(Context context) {
        super(context);
        this.ln = ImageView.ScaleType.FIT_XY;
        this.fn = -1;
        this.byv = -1.0f;
        this.ehk = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh, com.bytedance.adsdk.ugeno.yu
    public final void le() throws NumberFormatException {
        super.le();
        ((ouw) this.fkw).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                Drawable drawable = ((ouw) lh.this.fkw).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !a.i(drawable)) {
                    return;
                }
                a.c(drawable).start();
            }
        });
    }

    public final void mwh(String str) {
        this.ouw = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bly.yu.lh.ouw(java.lang.String, java.lang.String):void");
    }

    public String pno() {
        return this.smu;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh, com.bytedance.adsdk.ugeno.yu
    public final void ra() {
        super.ra();
        Drawable drawable = ((ouw) this.fkw).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.i(drawable)) {
            return;
        }
        a.c(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void vt() throws JSONException, NumberFormatException {
        super.vt();
        if (!TextUtils.isEmpty(this.ouw)) {
            ((ouw) this.fkw).setImageDrawable(null);
            if (this.ouw.startsWith("local://")) {
                try {
                    String strReplace = this.ouw.replace("local://", "");
                    if (TextUtils.equals(pno(), "raw")) {
                        ((ouw) this.fkw).setImageResource(yu.ouw(this.vt, strReplace));
                    } else {
                        ((ouw) this.fkw).setImageResource(yu.vt(this.vt, strReplace));
                    }
                } catch (Throwable unused) {
                }
            } else if (this.ouw.startsWith("@")) {
                try {
                    ((ouw) this.fkw).setImageResource(Integer.parseInt(this.ouw.substring(1)));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (this.byv > 0.0f) {
                fkw.ouw().f6878lh.ouw(this.bly, this.ouw, new ouw.InterfaceC0033ouw() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.1
                    @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0033ouw
                    public final void ouw(Bitmap bitmap) {
                        if (bitmap == null) {
                            if (lh.this.ms != null) {
                                le unused2 = lh.this.ms;
                                return;
                            }
                            return;
                        }
                        if (lh.this.ms != null) {
                            le unused3 = lh.this.ms;
                        }
                        final Bitmap bitmapOuw = ra.ouw(lh.this.vt, bitmap, (int) lh.this.byv);
                        if (bitmapOuw != null) {
                            ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((ouw) lh.this.fkw).setImageBitmap(bitmapOuw);
                                }
                            });
                        }
                        lh lhVar = lh.this;
                        if (lhVar.qni || lhVar.ehk > 0.0f) {
                            Bitmap bitmapOuw2 = ra.ouw(lh.this.vt, bitmap, lh.this.ehk > 0.0f ? (int) lh.this.ehk : 10);
                            if (bitmapOuw2 != null) {
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(lh.this.vt.getResources(), bitmapOuw2);
                                ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.1.2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((ouw) lh.this.fkw).setBackground(bitmapDrawable);
                                    }
                                });
                            }
                        }
                    }
                });
            } else {
                com.bytedance.adsdk.ugeno.ouw ouwVar = fkw.ouw().f6878lh;
                cf cfVar = this.bly;
                String str = this.ouw;
                T t10 = this.fkw;
                ImageView imageView = (ImageView) t10;
                int width = ((ouw) t10).getWidth();
                int height = ((ouw) this.fkw).getHeight();
                new ouw.InterfaceC0033ouw() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.2
                    @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0033ouw
                    public final void ouw(Bitmap bitmap) {
                        if (bitmap == null) {
                            if (lh.this.ms != null) {
                                le unused2 = lh.this.ms;
                            }
                        } else if (lh.this.ms != null) {
                            le unused3 = lh.this.ms;
                        }
                    }
                };
                ouwVar.ouw(cfVar, str, imageView, width, height);
                if (this.qni || this.ehk > 0.0f) {
                    fkw.ouw().f6878lh.ouw(this.bly, this.ouw, new ouw.InterfaceC0033ouw() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.3
                        @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0033ouw
                        public final void ouw(Bitmap bitmap) {
                            if (bitmap == null) {
                                return;
                            }
                            final Bitmap bitmapOuw = ra.ouw(lh.this.vt, bitmap, lh.this.ehk > 0.0f ? (int) lh.this.ehk : 10);
                            ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (bitmapOuw != null) {
                                        ((ouw) lh.this.fkw).setBackground(new BitmapDrawable(lh.this.vt.getResources(), bitmapOuw));
                                    }
                                }
                            });
                        }
                    });
                }
            }
        }
        ((ouw) this.fkw).setScaleType(this.ln);
        ((ouw) this.fkw).setBorderColor(this.yhj);
        ((ouw) this.fkw).setCornerRadius(this.ux);
        ((ouw) this.fkw).setBorderWidth(this.yib);
        int i4 = this.fn;
        if (i4 != -1) {
            ((ouw) this.fkw).setColorFilter(i4);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.vt = this;
        return ouwVar;
    }
}
