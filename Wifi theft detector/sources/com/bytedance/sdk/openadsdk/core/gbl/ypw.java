package com.bytedance.sdk.openadsdk.core.gbl;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uym.msw;

/* loaded from: classes.dex */
public class ypw {

    /* renamed from: aa, reason: collision with root package name */
    private float f9284aa;
    private int bw;
    private float cf;
    protected String emc;
    private float gbl;
    private boolean qh;
    private TextUtils.TruncateAt ru;
    private float sba;
    private float sup;
    private int sz;
    private boolean ul;
    private int uym;
    private float vk;
    private Context yzg;
    private int zz;
    protected int ypw = -16777216;
    private float xq = 12.0f;
    private float dg = -1.0f;
    private int ycc = Integer.MAX_VALUE;
    private int msw = 8388611;

    public ypw(Context context, boolean z10) {
        this.yzg = context;
        this.ul = z10;
    }

    private int dg(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    private TextUtils.TruncateAt xq(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int ypw(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L2b
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L21
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L17
            goto L35
        L17:
            java.lang.String r0 = "bold"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r3
            goto L36
        L21:
            java.lang.String r0 = "normal"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r2
            goto L36
        L2b:
            java.lang.String r0 = "italic"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r4
            goto L36
        L35:
            r6 = -1
        L36:
            if (r6 == 0) goto L3c
            if (r6 == r4) goto L3b
            return r3
        L3b:
            return r2
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw(java.lang.String):int");
    }

    public void emc(com.bytedance.adsdk.ugeno.zz.ycc.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.emc)) {
            emcVar.setText(TextUtils.equals("null", this.emc) ? "" : this.emc);
        }
        emcVar.setTextSize(1, this.xq);
        emcVar.setMinTextSize(msw.emc(this.yzg, this.dg));
        emcVar.setTextColor(this.ypw);
        emcVar.setGravity(this.msw);
        emcVar.setLines(this.uym);
        emcVar.setMaxLines(this.ycc);
        int i10 = this.zz;
        if (i10 != Integer.MAX_VALUE) {
            emcVar.setPaintFlags(i10);
        }
        emcVar.setEllipsize(this.ru);
        if (this.gbl > 0.0f) {
            if (this.ul) {
                xq(emcVar);
            } else {
                ypw(emcVar);
            }
        }
        emcVar.setTypeface(emc((int) this.sup));
        dg(emcVar);
        float fEmc = msw.emc(this.yzg, this.xq);
        if (fEmc > 0.0f) {
            emcVar.setLetterSpacing(this.sba / fEmc);
        }
        emcVar.setIncludeFontPadding(false);
    }

    private void dg(com.bytedance.adsdk.ugeno.zz.ycc.emc emcVar) {
        if (!this.ul) {
            emcVar.setShadowLayer(this.f9284aa, this.cf, this.vk, this.sz);
        } else if (this.qh) {
            float f10 = this.f9284aa;
            if (f10 <= 0.0f) {
                f10 = 1.0E-5f;
            }
            emcVar.setShadowLayer(f10, this.cf, this.vk, this.sz);
        }
    }

    private void xq(com.bytedance.adsdk.ugeno.zz.ycc.emc emcVar) {
        float f10 = this.gbl;
        if (f10 <= 3.0f) {
            emcVar.setLineSpacing(0.0f, f10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(msw.emc(this.yzg, (f10 - (this.xq * 1.2f)) / 2.0f));
            emcVar.setPadding(emcVar.getPaddingLeft(), emcVar.getPaddingTop() + iRound, emcVar.getPaddingRight(), emcVar.getPaddingBottom() + iRound);
            emcVar.setLineHeight(Math.round(msw.emc(this.yzg, this.gbl)));
        }
    }

    private void ypw(com.bytedance.adsdk.ugeno.zz.ycc.emc emcVar) {
        emcVar.setLineSpacing(0.0f, this.gbl);
    }

    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "shadowColor":
                this.sz = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                this.qh = true;
                break;
            case "shadowOffsetX":
                this.cf = msw.emc(this.yzg, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.vk = msw.emc(this.yzg, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "textAlign":
                this.msw = emc(str2);
                break;
            case "textColor":
                this.ypw = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "textStyle":
                this.bw = ypw(str2);
                break;
            case "shadowBlur":
                this.f9284aa = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "textSize":
                this.xq = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "textDecoration":
                this.zz = dg(str2);
                break;
            case "fontWeight":
                float fEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                this.sup = fEmc;
                if (fEmc < 1.0f || fEmc > 1000.0f) {
                    this.sup = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.gbl = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                break;
            case "text":
                this.emc = str2;
                break;
            case "lines":
                this.uym = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                break;
            case "ellipsis":
                this.ru = xq(str2);
                break;
            case "minTextSize":
                this.dg = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                break;
            case "maxLines":
                int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, Integer.MAX_VALUE);
                this.ycc = iEmc > 0 ? iEmc : Integer.MAX_VALUE;
                break;
            case "letterSpacing":
                this.sba = msw.emc(this.yzg, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
        }
    }

    private int emc(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private Typeface emc(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i10, false);
        }
        return i10 >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
