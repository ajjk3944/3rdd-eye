package com.bytedance.sdk.openadsdk.tlj;

import android.content.Context;
import android.util.Log;
import com.bytedance.sdk.component.fkw.ko;
import com.bytedance.sdk.component.fkw.lh.fkw;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.yu.lh.fkw;
import com.bytedance.sdk.component.fkw.zin;
import com.bytedance.sdk.component.utils.tlj;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fvf;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw {
        private static int fkw;

        /* renamed from: lh, reason: collision with root package name */
        private static int f8682lh;
        public static boolean ouw;
        private static final ko vt;
        private static int yu;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.bytedance.sdk.openadsdk.tlj.yu$ouw$ouw, reason: collision with other inner class name */
        public static class C0114ouw implements com.bytedance.sdk.component.fkw.yu {
            private C0114ouw() {
            }

            private static com.bytedance.sdk.component.fkw.vt.lh vt(com.bytedance.sdk.component.fkw.fkw fkwVar) throws IOException {
                cf cfVar = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt;
                jg jgVar = null;
                HashMap map = null;
                ryl rylVarOuw = new ryl.ouw().ouw(fkwVar.ouw()).ouw("GET", (mwh) null).ouw();
                com.bytedance.sdk.component.fkw.vt.yu yuVar = fkwVar.lh() ? new com.bytedance.sdk.component.fkw.vt.yu() : null;
                if (yuVar != null) {
                    yuVar.ouw = System.currentTimeMillis();
                }
                try {
                    jg jgVarVt = cfVar.ouw(rylVarOuw).vt();
                    if (yuVar != null) {
                        try {
                            yuVar.vt = System.currentTimeMillis();
                        } catch (Throwable th2) {
                            th = th2;
                            jgVar = jgVarVt;
                            try {
                                com.bytedance.sdk.component.utils.ko.yu("ImageLoaderWrapper", th.getMessage());
                                if (yuVar != null) {
                                    yuVar.f7490lh = System.currentTimeMillis();
                                }
                                com.bytedance.sdk.component.fkw.vt.lh lhVar = new com.bytedance.sdk.component.fkw.vt.lh(98765, th, "net failed");
                                lhVar.vt = yuVar;
                                tlj.ouw(jgVar);
                                return lhVar;
                            } finally {
                                tlj.ouw(jgVar);
                            }
                        }
                    }
                    if (fkwVar.vt()) {
                        le leVarFkw = jgVarVt.fkw();
                        map = new HashMap();
                        int length = leVarFkw.ouw.length / 2;
                        for (int i4 = 0; i4 < length; i4++) {
                            String strOuw = leVarFkw.ouw(i4);
                            String strVt = leVarFkw.vt(i4);
                            if (strOuw != null) {
                                map.put(strOuw, strVt);
                            }
                        }
                    }
                    com.bytedance.sdk.component.fkw.vt.lh lhVar2 = new com.bytedance.sdk.component.fkw.vt.lh(jgVarVt.ouw(), jgVarVt.yu().yu(), "", map);
                    tlj.ouw(jgVarVt);
                    return lhVar2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            @Override // com.bytedance.sdk.component.fkw.yu
            public final /* synthetic */ com.bytedance.sdk.component.fkw.le ouw(com.bytedance.sdk.component.fkw.fkw fkwVar) {
                return vt(fkwVar);
            }

            public /* synthetic */ C0114ouw(byte b10) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            com.bytedance.sdk.component.fkw.lh.vt vtVar;
            Context contextOuw = zih.ouw();
            byte b10 = 0;
            ouw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "use_new_img", 1) == 1;
            f8682lh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "bitmap_cache_count", 10);
            yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "data_cache_count", 15);
            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("image_config", "disk_cache_count", 30);
            fkw = iOuw;
            if (ouw) {
                com.bytedance.sdk.component.fkw.yu.lh.ouw.vt vtVar2 = new com.bytedance.sdk.component.fkw.yu.lh.ouw.vt(f8682lh, yu, iOuw, new File(CacheDirFactory.getImageCacheDir("image_p")));
                fkw.ouw ouwVar = new fkw.ouw();
                ouwVar.ra = vtVar2;
                ouwVar.tlj = com.bytedance.sdk.openadsdk.multipro.vt.lh();
                ouwVar.pno = new qbp() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.2
                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService ouw() {
                        return bs.vt();
                    }

                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService vt() {
                        return bs.lh();
                    }
                };
                ouwVar.bly = new zin() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.1
                    @Override // com.bytedance.sdk.component.fkw.zin
                    public final void ouw(String str) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, true);
                    }
                };
                ouwVar.f7494lh = new C0114ouw(b10);
                com.bytedance.sdk.component.fkw.yu.lh.fkw fkwVar = new com.bytedance.sdk.component.fkw.yu.lh.fkw(ouwVar, b10);
                com.bytedance.sdk.component.fkw.yu.lh.vt vtVar3 = new com.bytedance.sdk.component.fkw.yu.lh.vt();
                if (vtVar3.ouw != null) {
                    Log.w("ImageLoader", "already init!");
                }
                vtVar3.ouw = new com.bytedance.sdk.component.fkw.yu.lh.le(contextOuw, fkwVar);
                vtVar = vtVar3;
            } else {
                com.bytedance.sdk.component.fkw.lh.ouw.ouw ouwVar2 = new com.bytedance.sdk.component.fkw.lh.ouw.ouw(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir("image")));
                fkw.ouw ouwVar3 = new fkw.ouw();
                ouwVar3.ra = ouwVar2;
                ouwVar3.tlj = com.bytedance.sdk.openadsdk.multipro.vt.lh();
                ouwVar3.pno = new qbp() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.4
                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService ouw() {
                        return bs.vt();
                    }

                    @Override // com.bytedance.sdk.component.fkw.qbp
                    public final ExecutorService vt() {
                        return null;
                    }
                };
                ouwVar3.bly = new zin() { // from class: com.bytedance.sdk.openadsdk.tlj.yu.ouw.3
                    @Override // com.bytedance.sdk.component.fkw.zin
                    public final void ouw(String str) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, false);
                    }
                };
                ouwVar3.f7449lh = new C0114ouw(b10);
                com.bytedance.sdk.component.fkw.lh.fkw fkwVar2 = new com.bytedance.sdk.component.fkw.lh.fkw(ouwVar3, b10);
                com.bytedance.sdk.component.fkw.lh.vt vtVar4 = new com.bytedance.sdk.component.fkw.lh.vt();
                if (vtVar4.ouw != null) {
                    Log.w("ImageLoader", "already init!");
                }
                vtVar4.ouw = new com.bytedance.sdk.component.fkw.lh.le(contextOuw, fkwVar2);
                vtVar = vtVar4;
            }
            vt = vtVar;
            ouw = true;
            f8682lh = 10;
            yu = 15;
            fkw = 30;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.fkw.tlj ouw(com.bytedance.sdk.component.fkw.tlj tljVar) {
            return fvf.ouw() ? tljVar.ouw(new fkw()) : tljVar;
        }
    }
}
