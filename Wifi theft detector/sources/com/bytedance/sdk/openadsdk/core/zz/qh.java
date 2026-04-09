package com.bytedance.sdk.openadsdk.core.zz;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cuf;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class qh {
    /* JADX INFO: Access modifiers changed from: private */
    public static void dg(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strEmc = com.bytedance.sdk.openadsdk.core.gbl.dg.emc(strOptString, str);
                File fileEmc = emc(strEmc);
                if (fileEmc != null && fileEmc.exists() && fileEmc.length() > 0) {
                    return;
                } else {
                    xq(strEmc);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strEmc = com.bytedance.sdk.openadsdk.core.gbl.dg.emc(strOptString, str);
                File fileEmc = emc(strEmc);
                if (fileEmc != null && fileEmc.exists() && fileEmc.length() > 0) {
                    return;
                } else {
                    xq(strEmc);
                }
            }
        }
    }

    public static void emc(final com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.zz.qh.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                cuf cufVarKv;
                cuf.emc emcVarYcc;
                com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = rieVar;
                if (rieVar2 == null || (cufVarKv = rieVar2.kv()) == null || (emcVarYcc = cufVarKv.ycc()) == null) {
                    return;
                }
                String strYlm = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().ylm();
                qh.emc(rieVar, emcVarYcc.emc(), strYlm);
                qh.xq(emcVarYcc.ypw(), strYlm);
                qh.dg(emcVarYcc.xq(), strYlm);
            }
        });
    }

    public static boolean ypw(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        cuf cufVarKv;
        return (rieVar == null || (cufVarKv = rieVar.kv()) == null || cufVarKv.ycc() == null) ? false : true;
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, JSONArray jSONArray, String str) throws IOException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strEmc = com.bytedance.sdk.openadsdk.core.gbl.dg.emc(strOptString, str);
                String strEmc2 = com.bytedance.sdk.component.utils.bw.emc(strEmc);
                InputStream inputStreamEmc = com.bytedance.sdk.openadsdk.ru.dg.emc(strEmc, strEmc2);
                if (inputStreamEmc != null) {
                    try {
                        inputStreamEmc.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.ru.dg.emc(strEmc).xq(1).emc(strEmc2).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, strEmc, new com.bytedance.sdk.component.bw.vk() { // from class: com.bytedance.sdk.openadsdk.core.zz.qh.2
                        @Override // com.bytedance.sdk.component.bw.vk
                        public void emc(int i11, String str2, @Nullable Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.bw.vk
                        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
                            gblVar.emc();
                        }
                    }), 4);
                }
            }
        }
    }

    public static InputStream ypw(String str) {
        File fileEmc = emc(str);
        if (fileEmc == null || !fileEmc.exists() || fileEmc.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileEmc);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("ExpressStaticResPreload", th.getMessage());
            return null;
        }
    }

    private static void xq(String str) {
        File fileEmc = emc(str);
        if (fileEmc == null) {
            return;
        }
        File file = new File(fileEmc + ".tmp");
        com.bytedance.sdk.component.uym.ypw.emc emcVarDg = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().dg();
        emcVarDg.emc(8);
        emcVarDg.emc("preloadStaticRes");
        emcVarDg.ypw(str);
        emcVarDg.emc(fileEmc.getParent(), fileEmc.getName());
        com.bytedance.sdk.component.uym.ypw ypwVarEmc = emcVarDg.emc();
        if (ypwVarEmc != null && ypwVarEmc.ycc() && ypwVarEmc.bw() != null && ypwVarEmc.bw().exists()) {
            com.bytedance.sdk.component.utils.ul.emc("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileEmc.exists()) {
            try {
                fileEmc.delete();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ul.xq("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    public static File emc(String str) {
        String str2;
        String strEmc = com.bytedance.sdk.component.utils.bw.emc(str);
        if (strEmc == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            str2 = name + "/express_static_res/";
        } else {
            str2 = name + "/express_static_res/";
        }
        return com.bytedance.sdk.component.utils.uym.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq(), str2, strEmc);
    }
}
