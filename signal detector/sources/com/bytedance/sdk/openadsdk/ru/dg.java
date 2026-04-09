package com.bytedance.sdk.openadsdk.ru;

import android.content.Context;
import com.bytedance.sdk.component.bw.cf;
import com.bytedance.sdk.component.bw.dg.xq.bw;
import com.bytedance.sdk.component.bw.ul;
import com.bytedance.sdk.component.bw.xq.bw;
import com.bytedance.sdk.component.bw.ylm;
import com.bytedance.sdk.component.utils.ru;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.ycc;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mkp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class dg {

    public static final class emc {
        private static final cf ypw = emc(aa.emc());
        public static boolean emc = true;
        private static int xq = 10;
        private static int dg = 15;
        private static int bw = 30;

        /* renamed from: com.bytedance.sdk.openadsdk.ru.dg$emc$emc, reason: collision with other inner class name */
        public static class C0097emc implements com.bytedance.sdk.component.bw.dg {
            private C0097emc() {
            }

            @Override // com.bytedance.sdk.component.bw.dg
            /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.bw.ypw.xq emc(com.bytedance.sdk.component.bw.bw bwVar) throws IOException {
                gbl gblVarYcc = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ycc();
                sup supVarYpw = new sup.emc().ypw(bwVar.emc()).emc().ypw();
                qh qhVarYpw = null;
                com.bytedance.sdk.component.bw.ypw.dg dgVar = bwVar.xq() ? new com.bytedance.sdk.component.bw.ypw.dg() : null;
                if (dgVar != null) {
                    dgVar.emc(System.currentTimeMillis());
                }
                try {
                    qhVarYpw = gblVarYcc.emc(supVarYpw).ypw();
                    if (dgVar != null) {
                        dgVar.ypw(System.currentTimeMillis());
                    }
                    return new com.bytedance.sdk.component.bw.ypw.xq(qhVarYpw.xq(), qhVarYpw.ycc().dg(), "", emc(bwVar, qhVarYpw));
                } catch (Throwable th) {
                    try {
                        return emc(dgVar, th);
                    } finally {
                        ru.emc(qhVarYpw);
                    }
                }
            }

            private Map<String, String> emc(com.bytedance.sdk.component.bw.bw bwVar, qh qhVar) {
                if (!bwVar.ypw()) {
                    return null;
                }
                ycc yccVarUym = qhVar.uym();
                HashMap map = new HashMap();
                int iEmc = yccVarUym.emc();
                for (int i = 0; i < iEmc; i++) {
                    String strEmc = yccVarUym.emc(i);
                    String strYpw = yccVarUym.ypw(i);
                    if (strEmc != null) {
                        map.put(strEmc, strYpw);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.bw.ypw.xq emc(com.bytedance.sdk.component.bw.ypw.dg dgVar, Throwable th) {
                th.getMessage();
                if (dgVar != null) {
                    dgVar.xq(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.bw.ypw.xq xqVar = new com.bytedance.sdk.component.bw.ypw.xq(98765, th, "net failed");
                xqVar.emc(dgVar);
                return xqVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.bw.ru ypw(String str) {
            return emc(ypw.emc(str).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())));
        }

        public static void emc() {
            emc = com.bytedance.sdk.openadsdk.sra.emc.emc("image_config", "use_new_img", 1) == 1;
            xq = com.bytedance.sdk.openadsdk.sra.emc.emc("image_config", "bitmap_cache_count", 10);
            dg = com.bytedance.sdk.openadsdk.sra.emc.emc("image_config", "data_cache_count", 15);
            bw = com.bytedance.sdk.openadsdk.sra.emc.emc("image_config", "disk_cache_count", 30);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.bw.ru ypw(sba sbaVar) {
            return emc(ypw.emc(sbaVar.emc()).emc(sbaVar.ypw()).ypw(sbaVar.xq()).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())).emc(sbaVar.uym()));
        }

        private static cf emc(Context context) {
            emc();
            if (emc) {
                return com.bytedance.sdk.component.bw.dg.xq.ypw.emc(context, new bw.emc().emc(new com.bytedance.sdk.component.bw.dg.xq.emc.ypw(0, xq, dg, bw, new File(CacheDirFactory.getImageCacheDir("image_p")))).emc(com.bytedance.sdk.openadsdk.multipro.ypw.xq()).emc(new ul() { // from class: com.bytedance.sdk.openadsdk.ru.dg.emc.2
                    @Override // com.bytedance.sdk.component.bw.ul
                    public ExecutorService emc() {
                        return iyl.ypw();
                    }

                    @Override // com.bytedance.sdk.component.bw.ul
                    public ExecutorService ypw() {
                        return iyl.xq();
                    }
                }).emc(new ylm() { // from class: com.bytedance.sdk.openadsdk.ru.dg.emc.1
                    @Override // com.bytedance.sdk.component.bw.ylm
                    public void emc(int i, String str) {
                        com.bytedance.sdk.openadsdk.vk.xq.emc(str, true);
                    }
                }).emc(new C0097emc()).emc());
            }
            return com.bytedance.sdk.component.bw.xq.ypw.emc(context, new bw.emc().emc(new com.bytedance.sdk.component.bw.xq.emc.emc(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir("image")))).emc(com.bytedance.sdk.openadsdk.multipro.ypw.xq()).emc(new ul() { // from class: com.bytedance.sdk.openadsdk.ru.dg.emc.4
                @Override // com.bytedance.sdk.component.bw.ul
                public ExecutorService emc() {
                    return iyl.ypw();
                }

                @Override // com.bytedance.sdk.component.bw.ul
                public ExecutorService ypw() {
                    return null;
                }
            }).emc(new ylm() { // from class: com.bytedance.sdk.openadsdk.ru.dg.emc.3
                @Override // com.bytedance.sdk.component.bw.ylm
                public void emc(int i, String str) {
                    com.bytedance.sdk.openadsdk.vk.xq.emc(str, false);
                }
            }).emc(new C0097emc()).emc());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream ypw(String str, String str2) {
            return ypw.emc(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ypw(String str, String str2, String str3) {
            return ypw.emc(str, str2, str3);
        }

        private static com.bytedance.sdk.component.bw.ru emc(com.bytedance.sdk.component.bw.ru ruVar) {
            return mkp.emc() ? ruVar.emc(new bw()) : ruVar;
        }
    }

    public static com.bytedance.sdk.component.bw.ru emc(String str) {
        return emc.ypw(str);
    }

    public static boolean ypw() {
        return emc.emc;
    }

    public static com.bytedance.sdk.component.bw.ru emc(sba sbaVar) {
        return emc.ypw(sbaVar);
    }

    public static InputStream emc(String str, String str2) {
        return emc.ypw(str, str2);
    }

    public static boolean emc(String str, String str2, String str3) {
        return emc.ypw(str, str2, str3);
    }

    public static cf emc() {
        return emc.ypw;
    }
}
