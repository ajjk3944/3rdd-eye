package com.bytedance.sdk.openadsdk.core.cf.vt.ouw;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.vt.tlj;
import com.bytedance.adsdk.vt.yu;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends lh<vt> {
    private float baa;
    private boolean byv;
    private boolean ehk;
    private boolean fg;
    private String fn;

    /* renamed from: ki, reason: collision with root package name */
    private int f8165ki;
    protected HashMap<String, Bitmap> ln;
    private float nn;
    protected String ouw;
    protected ImageView.ScaleType qni;
    protected ImageView.ScaleType smu;
    private boolean xwt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1, reason: invalid class name */
    public class AnonymousClass1 implements yu {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.vt.yu
        public final Bitmap ouw(final tlj tljVar) {
            final String strOuw;
            if (tljVar == null) {
                return null;
            }
            String str = tljVar.fkw;
            String str2 = tljVar.yu;
            if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, ouw.this.yu);
            } else if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str2, ouw.this.yu);
            } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                strOuw = null;
            } else {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, ouw.this.yu) + com.bytedance.adsdk.ugeno.lh.vt.ouw(str2, ouw.this.yu);
            }
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            Bitmap bitmap = ouw.this.ln.get(strOuw);
            if (bitmap != null) {
                return bitmap;
            }
            fkw.ouw().f6878lh.ouw(ouw.this.bly, strOuw, new ouw.InterfaceC0033ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.1.1
                @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0033ouw
                public final void ouw(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        tlj tljVar2 = tljVar;
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, tljVar2.ouw, tljVar2.vt, false);
                        ouw.this.ln.put(strOuw, bitmapCreateScaledBitmap);
                        ra.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((vt) ouw.this.fkw).ouw(tljVar.f7213lh, bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return ouw.this.ln.get(strOuw);
        }
    }

    public ouw(Context context) {
        super(context);
        this.fn = "images";
        this.fg = true;
        this.nn = 1.0f;
        this.qni = ImageView.ScaleType.FIT_CENTER;
        this.smu = ImageView.ScaleType.FIT_XY;
        this.ln = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.ouw(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void vt() throws org.json.JSONException {
        /*
            r3 = this;
            super.vt()
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            float r1 = r3.baa
            r0.setProgress(r1)
            float r0 = r3.nn
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.nn = r0
        L17:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            float r1 = r3.nn
            r0.setSpeed(r1)
            java.lang.String r0 = r3.ouw
            java.lang.String r1 = "local"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L61
            java.lang.String r0 = r3.ouw
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4e
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L4e
            java.lang.String r1 = "shake_phone"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L43
            java.lang.String r0 = "lottie_json/shake_phone.json"
            goto L50
        L43:
            java.lang.String r1 = "swipe_right"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "lottie_json/swipe_right.json"
            goto L50
        L4e:
            java.lang.String r0 = ""
        L50:
            T extends android.view.View r1 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r1 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r1
            r1.setAnimation(r0)
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            java.lang.String r1 = r3.fn
            r0.setImageAssetsFolder(r1)
            goto L6a
        L61:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            java.lang.String r1 = r3.ouw
            r0.setAnimationFromUrl(r1)
        L6a:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1 r1 = new com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1
            r1.<init>()
            r0.setImageAssetDelegate(r1)
            boolean r0 = r3.ex()
            if (r0 == 0) goto L86
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            android.widget.ImageView$ScaleType r1 = r3.smu
            r0.setScaleType(r1)
            goto L8f
        L86:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            android.widget.ImageView$ScaleType r1 = r3.qni
            r0.setScaleType(r1)
        L8f:
            boolean r0 = r3.ex()
            if (r0 == 0) goto L9f
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            int r1 = r3.f8165ki
            r0.setRepeatCount(r1)
            goto La8
        L9f:
            T extends android.view.View r0 = r3.fkw
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            boolean r1 = r3.ehk
            r0.ouw(r1)
        La8:
            boolean r0 = r3.ex()
            if (r0 == 0) goto Lbc
            T extends android.view.View r0 = r3.fkw
            if (r0 == 0) goto Lc5
            boolean r1 = r3.fg
            if (r1 == 0) goto Lc5
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            r0.ouw()
            return
        Lbc:
            T extends android.view.View r0 = r3.fkw
            if (r0 == 0) goto Lc5
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt r0 = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt) r0
            r0.ouw()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.vt():void");
    }

    public final void ouw(AnimatorListenerAdapter animatorListenerAdapter) {
        ((vt) this.fkw).ouw(animatorListenerAdapter);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        vt vtVar = new vt(this.vt);
        vtVar.f8167lh = this;
        return vtVar;
    }
}
