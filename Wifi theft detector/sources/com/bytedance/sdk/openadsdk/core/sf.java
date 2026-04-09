package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class sf {
    private static sf emc;
    private com.bytedance.sdk.openadsdk.emc.bw.emc bw;
    private com.bytedance.sdk.openadsdk.emc.dg.ypw uym;
    private com.bytedance.sdk.openadsdk.emc.xq.ypw ycc;
    private final AtomicInteger ypw = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.emc> xq = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, emc<?>> dg = new ConcurrentHashMap<>();
    private final Map<String, ypw> msw = new HashMap();

    public static class emc<T> {
        public final T emc;
        public final long xq = System.currentTimeMillis();
        public final String ypw;

        public emc(T t10, String str) {
            this.emc = t10;
            this.ypw = str;
        }
    }

    public interface ypw {
        void emc();
    }

    private sf() {
    }

    public void bw() {
        this.bw = null;
        this.ycc = null;
        this.uym = null;
    }

    public com.bytedance.sdk.openadsdk.emc.dg.ypw dg() {
        return this.uym;
    }

    public <T> void emc(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return;
        }
        this.dg.put(str, new emc<>(t10, str));
    }

    public com.bytedance.sdk.openadsdk.emc.xq.ypw xq() {
        return this.ycc;
    }

    public com.bytedance.sdk.openadsdk.emc.bw.emc ypw() {
        return this.bw;
    }

    private static String dg(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            return null;
        }
        String strLvs = rieVar.lvs();
        return TextUtils.isEmpty(strLvs) ? String.valueOf(rieVar.hashCode()) : strLvs;
    }

    public void xq(int i10) {
        this.xq.remove(Integer.valueOf(i10));
    }

    public com.bytedance.sdk.openadsdk.core.model.emc ypw(int i10) {
        return this.xq.remove(Integer.valueOf(i10));
    }

    public <T> T emc(String str, Class<T> cls) {
        emc<?> emcVar;
        if (TextUtils.isEmpty(str) || cls == null || (emcVar = this.dg.get(str)) == null || !cls.isInstance(emcVar.emc)) {
            return null;
        }
        return cls.cast(emcVar.emc);
    }

    public void xq(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        String strDg = dg(rieVar);
        if (TextUtils.isEmpty(strDg)) {
            return;
        }
        this.msw.remove(strDg);
    }

    public void ypw(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        ypw ypwVar;
        if (rieVar == null) {
            return;
        }
        String strDg = dg(rieVar);
        if (TextUtils.isEmpty(strDg) || (ypwVar = this.msw.get(strDg)) == null) {
            return;
        }
        ypwVar.emc();
    }

    public emc<?> emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.dg.remove(str);
    }

    @MainThread
    public static sf emc() {
        if (emc == null) {
            emc = new sf();
        }
        return emc;
    }

    public com.bytedance.sdk.openadsdk.core.model.rie emc(int i10) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarRemove = this.xq.remove(Integer.valueOf(i10));
        if (emcVarRemove != null) {
            return emcVarRemove.cf();
        }
        return null;
    }

    public int emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = new com.bytedance.sdk.openadsdk.core.model.emc();
        emcVar.ypw(rieVar);
        return emc(emcVar);
    }

    public void emc(com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar) {
        this.ycc = ypwVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.emc.bw.emc emcVar) {
        this.bw = emcVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.emc.dg.ypw ypwVar) {
        this.uym = ypwVar;
    }

    public int emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        int iIncrementAndGet = this.ypw.incrementAndGet();
        this.xq.put(Integer.valueOf(iIncrementAndGet), emcVar);
        return iIncrementAndGet;
    }

    public static int emc(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, ypw ypwVar) {
        if (rieVar == null || ypwVar == null) {
            return;
        }
        String strDg = dg(rieVar);
        if (TextUtils.isEmpty(strDg)) {
            return;
        }
        this.msw.put(strDg, ypwVar);
    }

    public void emc(String str, boolean z10, boolean z11) {
        boolean z12 = z10 || !z11;
        boolean zAa = zz.ypw().aa();
        if (zAa) {
            com.bytedance.sdk.component.utils.ul.emc("BVA", "cleanListener: isFinish = " + z10 + ",isConfigChange = " + z11);
        }
        if (z12) {
            emc(str, zAa);
        } else if (z10 || !z11) {
            emc(str, zAa);
        }
    }

    private void emc(String str, boolean z10) {
        emc<?> emcVarEmc = emc(str);
        if (z10) {
            if (emcVarEmc == null) {
                com.bytedance.sdk.component.utils.ul.emc("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            com.bytedance.sdk.component.utils.ul.emc("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + emcVarEmc.emc);
        }
    }
}
