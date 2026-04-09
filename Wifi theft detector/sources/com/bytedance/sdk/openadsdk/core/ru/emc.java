package com.bytedance.sdk.openadsdk.core.ru;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.multipro.dg.dg;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class emc {
    private PglSSManager emc;
    private volatile boolean ypw;
    private volatile boolean xq = true;
    private volatile boolean dg = false;

    public emc() {
        emc();
    }

    private boolean msw() {
        if (!this.ypw && this.xq) {
            emc();
        }
        return this.ypw;
    }

    private Class ru() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
            try {
                this.xq = true;
                return cls;
            } catch (Throwable unused) {
                this.xq = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
    }

    private void zz() {
        if (this.emc == null) {
            this.emc = PglSSManager.getInstance();
        }
    }

    public String bw() {
        if (!msw()) {
            return "";
        }
        zz();
        PglSSManager pglSSManager = this.emc;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public String dg() {
        if (!msw()) {
            return "";
        }
        zz();
        PglSSManager pglSSManager = this.emc;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public int uym() {
        if (this.xq) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void xq() {
        if (msw()) {
            zz();
            if (this.emc != null) {
                qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ru.emc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, aa.dg().rie());
                            emc.this.emc.setCustomInfo(map);
                        } catch (Throwable th) {
                            ul.xq("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public long ycc() {
        if (!msw()) {
            return 0L;
        }
        zz();
        PglSSManager pglSSManager = this.emc;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public boolean ypw() {
        return this.ypw;
    }

    public synchronized void emc() {
        Context contextEmc;
        String strDg;
        if (!this.ypw) {
            try {
                contextEmc = aa.emc();
                strDg = zz.ypw().dg();
                if (TextUtils.isEmpty(strDg)) {
                    strDg = zz.emc(MBridgeConstans.APP_ID, Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                ru();
                this.ypw = false;
            }
            if (TextUtils.isEmpty(strDg)) {
                return;
            }
            String strEmc = sup.emc(contextEmc);
            String strYpw = com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw();
            PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strDg).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String strYpw2 = dg.ypw("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(strYpw2)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strYpw2);
            }
            Set<String> setGe = gbl.xq().ge();
            if (setGe != null && !setGe.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setGe);
            }
            String strSba = tp.sba();
            if (!TextUtils.isEmpty(strSba)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strSba);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, gbl.xq().nx());
            String strEmc2 = com.bytedance.sdk.openadsdk.sra.emc.emc(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(strEmc2)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strEmc2);
            }
            pglSSConfigBuild.setCustomInfo(map);
            pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.ru.emc.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    com.bytedance.sdk.openadsdk.vk.xq.emc(str, false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.ru.emc.1.1
                        @Override // com.bytedance.sdk.openadsdk.vk.ypw
                        @Nullable
                        public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                            return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc(str).ypw(str2);
                        }
                    });
                }
            });
            PglSSManager.init(contextEmc, pglSSConfigBuild, null, null, strEmc, strYpw);
            zz();
            this.ypw = true;
            try {
                if (this.xq) {
                    xq(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                ul.xq("mssdk", th.getMessage());
            }
        }
    }

    public void ypw(String str) {
        if (msw()) {
            zz();
            PglSSManager pglSSManager = this.emc;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    private void xq(final String str) {
        if (this.dg || TextUtils.isEmpty(str)) {
            return;
        }
        aa.bw().emc(new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.ru.emc.4
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("secsdk_init_error").ypw(str);
            }
        }, false);
        this.dg = true;
    }

    public void emc(String str) {
        if (msw()) {
            zz();
            PglSSManager pglSSManager = this.emc;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void emc(final Map<String, Object> map) {
        if (msw()) {
            zz();
            if (this.emc != null) {
                qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ru.emc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            emc.this.emc.setCustomInfo(map);
                        } catch (Throwable th) {
                            ul.xq("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void emc(String str, Map<String, Object> map) {
        if (msw()) {
            zz();
            PglSSManager pglSSManager = this.emc;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void emc(MotionEvent motionEvent) {
        if (ypw()) {
            zz();
            PglSSManager pglSSManager = this.emc;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> emc(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!msw() || (featureHash = this.emc.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
