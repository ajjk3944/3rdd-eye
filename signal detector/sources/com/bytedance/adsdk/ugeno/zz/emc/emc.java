package com.bytedance.adsdk.ugeno.zz.emc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.bw;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.adsdk.ugeno.uym.dg;
import com.bytedance.adsdk.ugeno.uym.emc;
import com.bytedance.adsdk.ugeno.uym.msw;
import com.bytedance.adsdk.ugeno.ypw.xq;
import com.bytedance.adsdk.ugeno.zz.ycc.ypw;
import org.json.JSONException;

/* loaded from: classes.dex */
public class emc extends ypw {
    private emc.C0012emc dor;
    private boolean etw;
    private String ge;
    private String hh;
    private boolean kv;
    private String nx;
    private String oa;
    private int sg;
    private int zhk;

    public emc(Context context) {
        super(context);
        this.ge = "row";
    }

    private void dg() {
        if (TextUtils.isEmpty(this.hh)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setCompoundDrawables(null, null, null, null);
        if (!this.hh.startsWith("local://")) {
            bw.emc().ypw().emc(this.zz, this.hh, new emc.InterfaceC0009emc() { // from class: com.bytedance.adsdk.ugeno.zz.emc.emc.1
                @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0009emc
                public void emc(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    msw.emc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.emc.emc.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            emc.this.ypw(new BitmapDrawable(((xq) emc.this).ypw.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.hh.replace("local://", "");
            Context context = this.ypw;
            ypw(msw.emc(context, dg.ypw(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void wo() {
        super.wo();
        if (this.etw) {
            ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setTextColor(this.sg);
        }
        if (this.kv) {
            if (this.qhy) {
                emc(this.dor);
            } else {
                dg(this.zhk);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void xxg() {
        super.xxg();
        if (this.etw) {
            ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setTextColor(((ypw) this).dpk);
        }
        if (this.kv) {
            if (this.qhy) {
                emc(this.hoq);
            } else {
                dg(this.mxo);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zz.ycc.ypw, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        dg();
        ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.ycc.ypw, com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.ge = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.sg = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                this.etw = true;
                break;
            case "image":
                this.hh = str2;
                break;
            case "highlightImage":
                this.oa = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.uym.emc.xq(str2)) {
                    this.qhy = true;
                    this.dor = com.bytedance.adsdk.ugeno.uym.emc.ypw(str2);
                } else {
                    this.zhk = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                    this.qhy = false;
                }
                this.kv = true;
                break;
            case "highlightBackgroundImage":
                this.nx = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ypw(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.ge
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case -1781065991: goto L2d;
                case -1354837162: goto L23;
                case -207799939: goto L19;
                case 113114: goto Lf;
                default: goto Le;
            }
        Le:
            goto L37
        Lf:
            java.lang.String r1 = "row"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = 3
            goto L38
        L19:
            java.lang.String r1 = "row_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = 0
            goto L38
        L23:
            java.lang.String r1 = "column"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r3
            goto L38
        L2d:
            java.lang.String r1 = "column_reverse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r2
            goto L38
        L37:
            r0 = -1
        L38:
            r1 = 0
            if (r0 == 0) goto L57
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L47
            T extends android.view.View r0 = r4.bw
            com.bytedance.adsdk.ugeno.zz.ycc.emc r0 = (com.bytedance.adsdk.ugeno.zz.ycc.emc) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r1, r1, r1)
            return
        L47:
            T extends android.view.View r0 = r4.bw
            com.bytedance.adsdk.ugeno.zz.ycc.emc r0 = (com.bytedance.adsdk.ugeno.zz.ycc.emc) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r5)
            return
        L4f:
            T extends android.view.View r0 = r4.bw
            com.bytedance.adsdk.ugeno.zz.ycc.emc r0 = (com.bytedance.adsdk.ugeno.zz.ycc.emc) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r1, r1)
            return
        L57:
            T extends android.view.View r0 = r4.bw
            com.bytedance.adsdk.ugeno.zz.ycc.emc r0 = (com.bytedance.adsdk.ugeno.zz.ycc.emc) r0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.zz.emc.emc.ypw(android.graphics.drawable.Drawable):void");
    }
}
