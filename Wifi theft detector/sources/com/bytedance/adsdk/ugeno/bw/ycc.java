package com.bytedance.adsdk.ugeno.bw;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.bw.bw;
import com.bytedance.adsdk.ugeno.ypw.emc;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.adsdk.ugeno.ypw.emc<bw> {
    private int dpk;
    private int ge;
    private int hh;
    private int nx;
    private int oa;

    public static class emc extends emc.C0102emc {
        public int cuf;
        public int db;
        public int dr;
        public int lt;
        public int mkp;
        public int rtt;
        public float sb;
        public float sf;
        public float xmt;

        public emc(com.bytedance.adsdk.ugeno.ypw.emc emcVar) {
            super(emcVar);
            this.db = 1;
            this.sb = 0.0f;
            this.sf = 0.0f;
            this.dr = -1;
            this.xmt = -1.0f;
            this.lt = -1;
            this.cuf = -1;
            this.rtt = 16777215;
            this.mkp = 16777215;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int bw(java.lang.String r8) {
            /*
                r7 = this;
                r8.getClass()
                int r0 = r8.hashCode()
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = -1
                switch(r0) {
                    case -1881872635: goto L3e;
                    case -1720785339: goto L33;
                    case -1364013995: goto L28;
                    case 1384876188: goto L1d;
                    case 1744442261: goto L12;
                    default: goto L10;
                }
            L10:
                r8 = r6
                goto L48
            L12:
                java.lang.String r0 = "flex_end"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L1b
                goto L10
            L1b:
                r8 = r1
                goto L48
            L1d:
                java.lang.String r0 = "flex_start"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L26
                goto L10
            L26:
                r8 = r2
                goto L48
            L28:
                java.lang.String r0 = "center"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L31
                goto L10
            L31:
                r8 = r3
                goto L48
            L33:
                java.lang.String r0 = "baseline"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L3c
                goto L10
            L3c:
                r8 = r4
                goto L48
            L3e:
                java.lang.String r0 = "stretch"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L47
                goto L10
            L47:
                r8 = r5
            L48:
                switch(r8) {
                    case 0: goto L50;
                    case 1: goto L4f;
                    case 2: goto L4e;
                    case 3: goto L4d;
                    case 4: goto L4c;
                    default: goto L4b;
                }
            L4b:
                return r6
            L4c:
                return r4
            L4d:
                return r5
            L4e:
                return r3
            L4f:
                return r2
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bw.ycc.emc.bw(java.lang.String):int");
        }

        private float dg(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float xq(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float ypw(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ypw.emc.C0102emc
        public String toString() {
            return "LayoutParams{mWidth=" + this.emc + ", mHeight=" + this.ypw + ", mMargin=" + this.bw + ", mMarginLeft=" + this.ycc + ", mMarginRight=" + this.uym + ", mMarginTop=" + this.msw + ", mMarginBottom=" + this.zz + ", mParams=" + this.hxp + ", mOrder=" + this.db + ", mFlexGrow=" + this.sb + ", mFlexShrink=" + this.sf + ", mAlignSelf=" + this.dr + ", mFlexBasisPercent=" + this.xmt + ", mMinWidth=" + this.lt + ", mMinHeight=" + this.cuf + ", mMaxWidth=" + this.rtt + ", mMaxHeight=" + this.mkp + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.ypw.emc.C0102emc
        public void emc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.emc(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.xmt = dg(str2);
                    break;
                case "order":
                    this.db = emc(str2);
                    break;
                case "flexShrink":
                    this.sf = xq(str2);
                    break;
                case "flexGrow":
                    this.sb = ypw(str2);
                    break;
                case "alignSelf":
                    this.dr = bw(str2);
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ypw.emc.C0102emc
        /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
        public bw.emc emc() {
            bw.emc emcVar = new bw.emc((int) this.emc, (int) this.ypw);
            ((ViewGroup.MarginLayoutParams) emcVar).leftMargin = (int) this.ycc;
            ((ViewGroup.MarginLayoutParams) emcVar).rightMargin = (int) this.uym;
            ((ViewGroup.MarginLayoutParams) emcVar).topMargin = (int) this.msw;
            ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin = (int) this.zz;
            emcVar.xq(this.db);
            emcVar.dg(this.dr);
            emcVar.emc(this.sb);
            emcVar.ypw(this.sf);
            emcVar.xq(this.xmt);
            return emcVar;
        }

        private int emc(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public ycc(Context context) {
        super(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int aa(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1881872635: goto L35;
                case -1720785339: goto L2b;
                case -1364013995: goto L21;
                case 1384876188: goto L17;
                case 1744442261: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "flex_end"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r5
            goto L40
        L17:
            java.lang.String r0 = "flex_start"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r2
            goto L40
        L21:
            java.lang.String r0 = "center"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r4
            goto L40
        L2b:
            java.lang.String r0 = "baseline"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r3
            goto L40
        L35:
            java.lang.String r0 = "stretch"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r1
            goto L40
        L3f:
            r7 = -1
        L40:
            if (r7 == 0) goto L4c
            if (r7 == r5) goto L4b
            if (r7 == r4) goto L4a
            if (r7 == r3) goto L49
            return r1
        L49:
            return r3
        L4a:
            return r4
        L4b:
            return r5
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bw.ycc.aa(java.lang.String):int");
    }

    private int cf(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int sba(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 5
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 4
            r6 = 1
            switch(r0) {
                case -1881872635: goto L40;
                case -1364013995: goto L36;
                case -932331738: goto L2c;
                case 1384876188: goto L22;
                case 1682480591: goto L18;
                case 1744442261: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L4a
        Le:
            java.lang.String r0 = "flex_end"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r6
            goto L4b
        L18:
            java.lang.String r0 = "space_between"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r5
            goto L4b
        L22:
            java.lang.String r0 = "flex_start"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r2
            goto L4b
        L2c:
            java.lang.String r0 = "space_around"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r4
            goto L4b
        L36:
            java.lang.String r0 = "center"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r3
            goto L4b
        L40:
            java.lang.String r0 = "stretch"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r1
            goto L4b
        L4a:
            r8 = -1
        L4b:
            if (r8 == 0) goto L5a
            if (r8 == r6) goto L59
            if (r8 == r3) goto L58
            if (r8 == r4) goto L57
            if (r8 == r5) goto L56
            return r1
        L56:
            return r4
        L57:
            return r5
        L58:
            return r3
        L59:
            return r6
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bw.ycc.sba(java.lang.String):int");
    }

    private int vk(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    public int qh(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public emc.C0102emc ru() {
        return new emc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public bw emc() {
        bw bwVar = new bw(this.ypw);
        bwVar.emc(this);
        return bwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        ((bw) this.bw).setFlexDirection(this.dpk);
        ((bw) this.bw).setFlexWrap(this.hh);
        ((bw) this.bw).setJustifyContent(this.ge);
        ((bw) this.bw).setAlignItems(this.oa);
        ((bw) this.bw).setAlignContent(this.nx);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.oa = aa(str2);
                break;
            case "flexDirection":
                this.dpk = qh(str2);
                break;
            case "alignContent":
                this.nx = sba(str2);
                break;
            case "flexWrap":
                this.hh = cf(str2);
                break;
            case "justifyContent":
                this.ge = vk(str2);
                break;
        }
    }
}
