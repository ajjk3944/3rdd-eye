package com.bytedance.sdk.openadsdk.core.bw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.bw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.xq.xq;
import com.bytedance.sdk.openadsdk.multipro.ypw;
import com.bytedance.sdk.openadsdk.vk.emc.dg;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o4.AbstractC2763b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private final List<String> emc = new CopyOnWriteArrayList();
    private final xq ypw = new xq(5, 5, true);
    private final ConcurrentHashMap<String, Long> xq = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.sdk.openadsdk.core.bw.emc$emc, reason: collision with other inner class name */
    public static class C0052emc {
        private static final emc emc = new emc();
    }

    private boolean xq(String str) {
        return !this.emc.contains(str);
    }

    public File ypw(String str) {
        String strEmc = bw.emc(str);
        if (strEmc == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        return uym.emc(aa.emc(), ypw.xq(), ypw.xq() ? AbstractC2763b.e(name, "/music/") : AbstractC2763b.e(name, "//music/"), strEmc);
    }

    public void xq() {
        com.bytedance.sdk.openadsdk.vk.xq.emc("music_preload_start", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.bw.emc.2
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                dg dgVarEmc = dg.ypw().emc("music_preload_start");
                dgVarEmc.emc();
                return dgVarEmc;
            }
        });
    }

    public static emc emc() {
        return C0052emc.emc;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) throws JSONException {
        List<rie> listDg = emcVar.dg();
        if (listDg == null || listDg.size() == 0) {
            return;
        }
        for (int i = 0; i < listDg.size(); i++) {
            rie rieVar = listDg.get(i);
            if (rieVar != null) {
                emc(rieVar);
            }
        }
    }

    public InputStream emc(String str) {
        File fileYpw = ypw(str);
        if (fileYpw == null || !emc(fileYpw)) {
            return null;
        }
        try {
            return new FileInputStream(fileYpw);
        } catch (Exception e6) {
            ul.xq("MusicCacheManager", e6.getMessage());
            return null;
        }
    }

    private void emc(rie rieVar) throws JSONException {
        rie.emc emcVarZhk;
        String strZz;
        if (rieVar == null || (emcVarZhk = rieVar.zhk()) == null || (strZz = emcVarZhk.zz()) == null || !strZz.contains("music_url")) {
            return;
        }
        xq();
        String strYpw = emcVarZhk.ypw();
        if (TextUtils.isEmpty(strYpw)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e6) {
                ul.xq("MusicCacheManager", e6.getMessage());
            }
            emc(0, -1L, 10001, "music url string is null");
            return;
        }
        File fileYpw = ypw(strYpw);
        if (fileYpw == null) {
            return;
        }
        fileYpw.getPath();
        if (emc(fileYpw)) {
            emc(2, -1L, -1, null);
        } else {
            emc(rieVar, strYpw, fileYpw);
        }
    }

    public void ypw() {
        File fileEmc = emc(aa.emc(), ypw.xq());
        fileEmc.getAbsolutePath();
        try {
            this.ypw.emc(fileEmc);
        } catch (IOException e6) {
            ul.emc("MusicCacheManager", "trimFileCache fail", e6);
        }
    }

    private boolean emc(File file) {
        return file.exists() && file.length() != 0;
    }

    private void emc(rie rieVar, String str, File file) {
        if (xq(str)) {
            this.xq.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.uym.ypw.emc emcVarDg = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().dg();
            emcVarDg.ypw(str);
            emcVarDg.emc(file.getParent(), file.getName());
            emcVarDg.xq(str);
            this.emc.add(str);
            emcVarDg.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.bw.emc.1
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                    ypwVar.xq();
                    ypwVar.emc();
                    String strXq = xqVar.xq();
                    Long l2 = (Long) emc.this.xq.get(strXq);
                    if (ypwVar.ycc() && ypwVar.bw() != null && ypwVar.bw().exists()) {
                        ypwVar.bw();
                        if (l2 != null) {
                            emc.this.xq.remove(strXq);
                            emc.this.emc(1, SystemClock.elapsedRealtime() - l2.longValue(), -1, null);
                        }
                        try {
                            uym.ypw(ypwVar.bw());
                        } catch (IOException e6) {
                            ul.xq("MusicCacheManager", e6.getMessage());
                        }
                    }
                    if (ypwVar.ycc() || l2 == null) {
                        return;
                    }
                    emc.this.emc(0, SystemClock.elapsedRealtime() - l2.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                    Long l2 = (Long) emc.this.xq.get(xqVar.xq());
                    if (l2 != null) {
                        emc.this.emc(0, SystemClock.elapsedRealtime() - l2.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private File emc(Context context, boolean z6) {
        String strE;
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (ypw.xq()) {
            strE = AbstractC2763b.e(name, "/music");
        } else {
            strE = AbstractC2763b.e(name, "//music");
        }
        return uym.emc(context, z6, strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final int i, final long j6, final int i3, final String str) {
        com.bytedance.sdk.openadsdk.vk.xq.emc("music_preload_finish", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.bw.emc.3
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i);
                long j7 = j6;
                if (j7 != -1) {
                    jSONObject.put("load_duration", j7);
                }
                dg dgVarYpw = dg.ypw().emc("music_preload_finish").ypw(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    dgVarYpw.ypw(i3);
                    dgVarYpw.ycc(str);
                }
                dgVarYpw.emc();
                return dgVarYpw;
            }
        });
    }

    public void emc(final boolean z6) {
        com.bytedance.sdk.openadsdk.vk.xq.emc("music_cache", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.bw.emc.4
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z6);
                dg dgVarYpw = dg.ypw().emc("music_cache").ypw(jSONObject.toString());
                dgVarYpw.emc();
                return dgVarYpw;
            }
        });
    }
}
