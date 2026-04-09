package com.bytedance.adsdk.ugeno.zz.ycc;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uym.msw;
import com.bytedance.adsdk.ugeno.ypw.xq;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ypw extends xq<emc> {
    private float av;
    private int dor;
    protected int dpk;
    protected String emc;

    @Deprecated
    private TextUtils.TruncateAt etw;
    private float fxt;
    private float ge;
    private float gyw;
    private float hh;
    private boolean hs;
    private int iat;

    @Deprecated
    private float igv;
    private TextUtils.TruncateAt kv;
    private int nx;
    private int oa;
    private float oug;
    private float oz;
    private float qp;
    private int sg;

    @Deprecated
    private float sx;
    private int zhk;

    public ypw(Context context) {
        super(context);
        this.dpk = -16777216;
        this.hh = 12.0f;
        this.ge = -1.0f;
        this.nx = Integer.MAX_VALUE;
        this.dor = 8388611;
        this.kv = TextUtils.TruncateAt.END;
        this.gyw = -1.0f;
        this.qp = 400.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int aa(java.lang.String r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.zz.ycc.ypw.aa(java.lang.String):int");
    }

    private TextUtils.TruncateAt cf(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.etw = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.etw = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.etw = TextUtils.TruncateAt.START;
                break;
            default:
                this.etw = null;
                break;
        }
        return this.etw;
    }

    private void dg() {
        ((emc) this.bw).setLineSpacing(0.0f, this.gyw);
    }

    private int sba(String str) {
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

    private TextUtils.TruncateAt vk(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int yzg(String str) {
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

    private void zz() {
        float f2 = this.gyw;
        if (f2 <= 3.0f) {
            ((emc) this.bw).setLineSpacing(0.0f, f2);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(msw.emc(this.ypw, (f2 - (this.hh * 1.2f)) / 2.0f));
            int paddingTop = ((emc) this.bw).getPaddingTop() + iRound;
            int paddingBottom = ((emc) this.bw).getPaddingBottom() + iRound;
            emc emcVar = (emc) this.bw;
            emcVar.setPadding(emcVar.getPaddingLeft(), paddingTop, ((emc) this.bw).getPaddingRight(), paddingBottom);
            ((emc) this.bw).setLineHeight(Math.round(msw.emc(this.ypw, this.gyw)));
        }
    }

    public void qh(String str) {
        this.emc = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.emc = "";
        }
        ((emc) this.bw).setText(this.emc);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public emc emc() {
        emc emcVar = new emc(this.ypw);
        emcVar.emc(this);
        return emcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        if (TextUtils.equals("null", this.emc)) {
            this.emc = "";
        }
        qh(this.emc);
        ((emc) this.bw).setTextSize(1, this.hh);
        ((emc) this.bw).setTextColor(this.dpk);
        ((emc) this.bw).setLines(this.zhk);
        ((emc) this.bw).setMaxLines(this.nx);
        ((emc) this.bw).setGravity(this.dor);
        ((emc) this.bw).setIncludeFontPadding(false);
        ((emc) this.bw).setMinTextSize(msw.emc(this.ypw, this.ge));
        emc(this.sg);
        if (lt()) {
            emc(this.kv);
        } else {
            emc(this.etw);
        }
        if (this.gyw > 0.0f) {
            if (lt()) {
                zz();
            } else {
                dg();
            }
        }
        int i = Build.VERSION.SDK_INT;
        ((emc) this.bw).setBreakStrategy(0);
        if (!lt()) {
            ((emc) this.bw).setShadowLayer(this.oug, this.igv, this.sx, this.iat);
        } else if (this.hs) {
            if (this.oug <= 0.0f) {
                this.oug = 1.0E-5f;
            }
            ((emc) this.bw).setShadowLayer(this.oug, this.oz, this.av, this.iat);
        }
        int i3 = this.oa;
        if (i3 == 1) {
            ((emc) this.bw).setTypeface(Typeface.DEFAULT, i3);
        } else if (i >= 28) {
            Typeface typeface = Typeface.DEFAULT;
            ((emc) this.bw).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.qp, i3 == 2));
        } else if (this.qp >= 500.0f) {
            ((emc) this.bw).setTypeface(Typeface.DEFAULT, 1);
        }
        if (msw.emc(this.ypw, this.hh) > 0.0f) {
            ((emc) this.bw).setLetterSpacing(this.fxt / msw.emc(this.ypw, this.hh));
        }
    }

    public void emc(int i) {
        this.sg = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((emc) this.bw).setPaintFlags(i);
    }

    public void emc(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((emc) this.bw).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.oug = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "shadowColor":
                this.iat = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                this.hs = true;
                break;
            case "shadowOffsetX":
                this.oz = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.av = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "textAlign":
                this.dor = sba(str2);
                break;
            case "textColor":
                this.dpk = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "textStyle":
                this.oa = aa(str2);
                break;
            case "textSize":
                this.hh = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "textDecoration":
                this.sg = yzg(str2);
                break;
            case "shadowDx":
                this.igv = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "shadowDy":
                this.sx = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "fontWeight":
                float fEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                this.qp = fEmc;
                if (fEmc < 1.0f || fEmc > 1000.0f) {
                    this.qp = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.gyw = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                break;
            case "text":
                this.emc = str2;
                break;
            case "lines":
                this.zhk = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                break;
            case "ellipsis":
                this.kv = vk(str2);
                break;
            case "minTextSize":
                this.ge = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, -1.0f);
                break;
            case "maxLines":
                int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, Integer.MAX_VALUE);
                this.nx = iEmc > 0 ? iEmc : Integer.MAX_VALUE;
                break;
            case "ellipsize":
                this.etw = cf(str2);
                break;
            case "letterSpacing":
                this.fxt = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
        }
    }
}
