package com.bytedance.sdk.openadsdk.le;

import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static volatile ouw zih;
    public boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    public int[] f8561cf;
    public int[] fkw;

    /* renamed from: jg, reason: collision with root package name */
    int f8562jg;
    boolean ko;

    /* renamed from: le, reason: collision with root package name */
    public int[] f8563le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8564lh;
    public boolean mwh;
    public boolean ouw;
    public int[] pno;
    public int[] ra;
    boolean rn;
    public boolean ryl;
    public boolean tlj;
    public boolean vt;
    public int[] yu;

    private ouw() {
        vt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] yu(String[] strArr) throws NumberFormatException {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i4 = 0;
        for (String str : strArr) {
            try {
                int i10 = Integer.parseInt(str);
                iArr[i4] = i10;
                if (i10 > 0) {
                    i4++;
                }
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        if (i4 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, 0, iArr2, 0, i4);
        return iArr2;
    }

    public final void vt() {
        jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.mwh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("feature_switch", false);
                if (ouw.this.mwh) {
                    try {
                        ouw.this.rn = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("exclude_banner_native", false);
                        ouw.this.f8562jg = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("feature_timer_interval", 10000);
                        ouw.this.ko = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_dislike_cnt", "1,3,5session").split(",");
                        ouw.this.ouw = ouw.ouw(strArrSplit);
                        ouw.this.vt = ouw.ouw(strArrSplit2);
                        ouw.this.f8564lh = ouw.ouw(strArrSplit3);
                        ouw.this.yu = ouw.vt(strArrSplit);
                        ouw.this.fkw = ouw.vt(strArrSplit2);
                        ouw.this.f8563le = ouw.vt(strArrSplit3);
                        ouw.this.f8561cf = ouw.yu(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_video_stay_time", "1,3,5&session").split("&");
                        ouw.this.bly = ouw.ouw(strArrSplit5);
                        ouw.this.tlj = ouw.ouw(strArrSplit6);
                        ouw.this.ra = ouw.vt(strArrSplit5);
                        ouw.this.pno = ouw.vt(strArrSplit6);
                        ouw.this.ryl = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pag_video_30p_session", true);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        });
    }

    public static /* synthetic */ int[] vt(String[] strArr) {
        if (strArr.length > 0) {
            return yu(strArr[0].split(","));
        }
        return new int[0];
    }

    public static ouw ouw() {
        if (zih == null) {
            synchronized (lh.class) {
                try {
                    if (zih == null) {
                        zih = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zih;
    }

    public static /* synthetic */ boolean ouw(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
