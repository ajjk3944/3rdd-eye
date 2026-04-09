package com.bytedance.sdk.openadsdk.ycc;

import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.xq;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc emc;
    private boolean aa;
    private int[] bw;
    private int cf;
    private boolean dg;
    private boolean gbl;
    private int[] msw;
    private boolean qh;
    private boolean ru;
    private int[] sup;
    private boolean sz;
    private int[] uym;
    private boolean vk;
    private boolean xq;
    private int[] ycc;
    private boolean ypw;
    private int[] zz;

    private emc() {
        ypw();
    }

    public boolean aa() {
        return this.sz;
    }

    public boolean cf() {
        return this.gbl;
    }

    public int[] gbl() {
        return this.uym;
    }

    public boolean qh() {
        return this.ru;
    }

    public int[] ru() {
        return this.ycc;
    }

    public boolean sba() {
        return this.aa;
    }

    public int[] sup() {
        return this.msw;
    }

    public int[] sz() {
        return this.zz;
    }

    public int[] vk() {
        return this.sup;
    }

    public boolean msw() {
        return this.dg;
    }

    public boolean uym() {
        return this.xq;
    }

    public int[] zz() {
        return this.bw;
    }

    public boolean bw() {
        return this.vk;
    }

    public int dg() {
        return this.cf;
    }

    public boolean ycc() {
        return this.ypw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] xq(String[] strArr) throws NumberFormatException {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int i3 = Integer.parseInt(str);
                iArr[i] = i3;
                if (i3 > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public void ypw() {
        qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ycc.emc.1
            @Override // java.lang.Runnable
            public void run() {
                emc.this.qh = com.bytedance.sdk.openadsdk.sra.emc.emc("feature_switch", false);
                if (emc.this.qh) {
                    try {
                        emc.this.aa = com.bytedance.sdk.openadsdk.sra.emc.emc("exclude_banner_native", false);
                        emc.this.cf = com.bytedance.sdk.openadsdk.sra.emc.emc("feature_timer_interval", 10000);
                        emc.this.vk = com.bytedance.sdk.openadsdk.sra.emc.emc("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_dislike_cnt", "1,3,5session").split(",");
                        emc emcVar = emc.this;
                        emcVar.ypw = emcVar.emc(strArrSplit);
                        emc emcVar2 = emc.this;
                        emcVar2.xq = emcVar2.emc(strArrSplit2);
                        emc emcVar3 = emc.this;
                        emcVar3.dg = emcVar3.emc(strArrSplit3);
                        emc emcVar4 = emc.this;
                        emcVar4.bw = emcVar4.ypw(strArrSplit);
                        emc emcVar5 = emc.this;
                        emcVar5.ycc = emcVar5.ypw(strArrSplit2);
                        emc emcVar6 = emc.this;
                        emcVar6.uym = emcVar6.ypw(strArrSplit3);
                        emc emcVar7 = emc.this;
                        emcVar7.sup = emcVar7.xq(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_video_stay_time", "1,3,5&session").split("&");
                        emc emcVar8 = emc.this;
                        emcVar8.ru = emcVar8.emc(strArrSplit5);
                        emc emcVar9 = emc.this;
                        emcVar9.gbl = emcVar9.emc(strArrSplit6);
                        emc emcVar10 = emc.this;
                        emcVar10.msw = emcVar10.ypw(strArrSplit5);
                        emc emcVar11 = emc.this;
                        emcVar11.zz = emcVar11.ypw(strArrSplit6);
                        emc.this.sz = com.bytedance.sdk.openadsdk.sra.emc.emc("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] ypw(String[] strArr) {
        if (strArr.length > 0) {
            return xq(strArr[0].split(","));
        }
        return new int[0];
    }

    public static emc emc() {
        if (emc == null) {
            synchronized (xq.class) {
                try {
                    if (emc == null) {
                        emc = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public boolean xq() {
        return this.qh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
