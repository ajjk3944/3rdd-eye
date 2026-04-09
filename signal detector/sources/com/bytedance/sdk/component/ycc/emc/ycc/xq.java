package com.bytedance.sdk.component.ycc.emc.ycc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.msw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq implements ypw {
    private final Context emc;
    private final bw ypw;

    @SuppressLint({"StaticFieldLeak"})
    public class emc extends com.bytedance.sdk.component.ycc.emc.bw.bw {
        private final Map<String, String> dg;
        private final String xq;
        private final dg ypw;

        private String xq(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.xq)) ? str.replace("{UID}", this.xq).replace("__UID__", this.xq) : str;
        }

        public boolean emc(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.ycc.emc.bw.dg dgVarEmc;
            com.bytedance.sdk.component.ycc.emc.bw bwVarVk = msw.uym().vk();
            if (bwVarVk == null || msw.uym().ycc() == null || !bwVarVk.xq() || !emc(this.ypw.ypw())) {
                return;
            }
            if (this.ypw.dg() >= bwVarVk.xq(this.ypw.ycc())) {
                xq.this.ypw.xq(this.ypw);
                return;
            }
            try {
                if (this.ypw.gbl()) {
                    xq.this.ypw.emc(this.ypw);
                }
                if (bwVarVk.emc(xq.this.emc())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strYpw = this.ypw.ypw();
                    if (bwVarVk.ycc() == 0) {
                        strYpw = xq(this.ypw.ypw());
                        if (this.ypw.xq()) {
                            strYpw = ypw(strYpw);
                        }
                    }
                    com.bytedance.sdk.component.ycc.emc.bw.xq xqVarRu = bwVarVk.ru();
                    if (xqVarRu == null) {
                        return;
                    }
                    xqVarRu.emc("User-Agent", bwVarVk.zz());
                    xqVarRu.emc("csj_client_source_from", "1");
                    if (this.dg != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.dg.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        xqVarRu.emc("csj_extra_info", jSONObject.toString());
                    }
                    xqVarRu.emc(strYpw);
                    try {
                        dgVarEmc = xqVarRu.emc();
                        try {
                            dgVarEmc.emc();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        dgVarEmc = null;
                    }
                    dg dgVar = this.ypw;
                    dgVar.emc(dgVar.dg() + 1);
                    if (dgVarEmc != null && dgVarEmc.emc()) {
                        xq.this.ypw.xq(this.ypw);
                        this.ypw.ypw();
                        bwVarVk.emc(true, TTAdConstant.MATE_VALID, System.currentTimeMillis() - jCurrentTimeMillis, this.ypw);
                        return;
                    }
                    if (dgVarEmc != null) {
                        this.ypw.ypw(dgVarEmc.ypw());
                        this.ypw.xq(dgVarEmc.xq());
                    }
                    if (dgVarEmc == null || dgVarEmc.ypw() != 8848) {
                        this.ypw.ypw();
                        if (this.ypw.dg() >= bwVarVk.xq(this.ypw.ycc())) {
                            xq.this.ypw.xq(this.ypw);
                            this.ypw.ypw();
                        } else {
                            xq.this.ypw.ypw(this.ypw);
                        }
                    } else {
                        dgVarEmc.xq();
                        xq.this.ypw.xq(this.ypw);
                    }
                    bwVarVk.emc(false, this.ypw.msw(), System.currentTimeMillis() - jCurrentTimeMillis, this.ypw);
                }
            } catch (Throwable unused3) {
            }
        }

        public String ypw(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(xq.xq().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        private emc(dg dgVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.ypw = dgVar;
            this.xq = str;
            this.dg = map;
        }
    }

    public xq(Context context, bw bwVar) {
        this.emc = context;
        this.ypw = bwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random xq() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    public Context emc() {
        Context context = this.emc;
        return context == null ? msw.uym().ycc() : context;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.ypw
    public void emc(String str, List<String> list, boolean z6, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.ycc.emc.bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || msw.uym().ycc() == null || bwVarVk.dg() == null || !bwVarVk.xq() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            bwVarVk.dg().execute(new emc(new dg(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z6, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.ypw
    public Runnable emc(final dg dgVar, final String str, final Map<String, String> map) {
        if (dgVar == null || TextUtils.isEmpty(dgVar.emc())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.ycc.emc.ycc.xq.1
            @Override // java.lang.Runnable
            public void run() {
                if (xq.this.ypw.emc(dgVar.emc()) != null) {
                    new emc(dgVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.ypw
    public void emc(final String str, final boolean z6) {
        com.bytedance.sdk.component.ycc.emc.bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || msw.uym().ycc() == null || !bwVarVk.xq()) {
            return;
        }
        com.bytedance.sdk.component.ycc.emc.bw.bw bwVar = new com.bytedance.sdk.component.ycc.emc.bw.bw("trackFailedUrls") { // from class: com.bytedance.sdk.component.ycc.emc.ycc.xq.2
            @Override // java.lang.Runnable
            public void run() {
                xq.this.emc(xq.this.ypw.emc(), str, z6);
            }
        };
        bwVar.emc(1);
        if (bwVarVk.dg() != null) {
            bwVarVk.dg().execute(bwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(List<dg> list, String str, boolean z6) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.ycc.emc.bw bwVarVk = msw.uym().vk();
        for (dg dgVar : list) {
            if (bwVarVk == null || bwVarVk.dg() == null) {
                str2 = str;
            } else {
                dgVar.emc(z6);
                str2 = str;
                bwVarVk.dg().execute(new emc(dgVar, str2, null));
            }
            str = str2;
        }
    }
}
