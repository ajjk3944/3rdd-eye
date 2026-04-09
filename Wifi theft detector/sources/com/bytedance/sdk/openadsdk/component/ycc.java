package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.msw;
import com.bytedance.sdk.component.bw.ru;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.sba;
import com.bytedance.sdk.openadsdk.common.ypw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.lt;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sb;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.ylm;
import com.bytedance.sdk.openadsdk.utils.aa;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mxo;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import r2.a;

/* loaded from: classes.dex */
public class ycc {
    private static String emc = "/openad_image_cache";
    private static volatile ycc xq = null;
    private static String ypw = "openad_image_cache";
    private final sra<com.bytedance.sdk.openadsdk.dg.emc> bw;
    private final com.bytedance.sdk.openadsdk.ypw.ypw dg;
    private final Context ycc;
    private final Map<String, AtomicInteger> uym = new ConcurrentHashMap();
    private final Map<String, String> msw = new ConcurrentHashMap();

    public interface emc {
        void emc();

        void emc(@Nullable com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar);
    }

    public interface xq {
        void emc(Object obj);
    }

    public interface ypw {
        void emc();

        void emc(int i10, String str);
    }

    private ycc(Context context) {
        if (context != null) {
            this.ycc = context.getApplicationContext();
        } else {
            this.ycc = aa.emc();
        }
        this.dg = new com.bytedance.sdk.openadsdk.ypw.ypw(10, 8, true);
        this.bw = aa.xq();
        if (com.bytedance.sdk.openadsdk.ru.dg.ypw()) {
            emc += "_p";
            ypw += "_p";
        }
        com.bytedance.sdk.openadsdk.common.ypw.emc("tt_openad_materialMeta_new", new ypw.emc("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.ycc.1
            @Override // com.bytedance.sdk.openadsdk.common.ypw.emc
            public String emc(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.ypw.emc
            public String ypw(String str) {
                return com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.ypw.emc
            public void emc(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.uym.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.uym.put(adSlot.getCodeId(), atomicInteger);
    }

    private int ycc(AdSlot adSlot) {
        StringBuilder sb = new StringBuilder("material_expiration_time");
        sb.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", sb.toString(), -1L) == -1 ? 0 : 1;
    }

    private void ypw(@NonNull final rie rieVar, final AdSlot adSlot, final lt ltVar, final com.bytedance.sdk.openadsdk.core.model.emc emcVar) throws JSONException {
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            emc(rieVar, adSlot, ltVar, emcVar);
        }
        emc(rieVar, adSlot, ltVar, new ypw() { // from class: com.bytedance.sdk.openadsdk.component.ycc.9
            @Override // com.bytedance.sdk.openadsdk.component.ycc.ypw
            public void emc() throws JSONException {
                if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
                    return;
                }
                ycc.this.emc(rieVar, adSlot, ltVar, emcVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ycc.ypw
            public void emc(int i10, String str) {
                ycc.this.bw(adSlot);
            }
        });
    }

    public boolean dg(AdSlot adSlot) {
        if (!com.bytedance.sdk.openadsdk.component.uym.emc.bw() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (com.bytedance.sdk.openadsdk.component.uym.emc.emc(adSlot) && !TextUtils.isEmpty(codeId)) {
                return this.msw.containsKey(codeId);
            }
        }
        return false;
    }

    private void xq(@NonNull final rie rieVar, final AdSlot adSlot, final lt ltVar, final com.bytedance.sdk.openadsdk.core.model.emc emcVar) throws JSONException {
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            emc(rieVar, adSlot, ltVar, emcVar);
        }
        emc(rieVar, ltVar, new emc() { // from class: com.bytedance.sdk.openadsdk.component.ycc.10
            @Override // com.bytedance.sdk.openadsdk.component.ycc.emc
            public void emc(com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar) throws JSONException {
                if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
                    return;
                }
                ycc.this.emc(rieVar, adSlot, ltVar, emcVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ycc.emc
            public void emc() {
                ycc.this.bw(adSlot);
            }
        });
    }

    public static ycc emc(Context context) {
        if (xq == null) {
            synchronized (ycc.class) {
                try {
                    if (xq == null) {
                        xq = new ycc(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return xq;
    }

    public void ypw(int i10) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "image_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public String xq(int i10) {
        String strYpw = com.bytedance.sdk.openadsdk.common.ypw.emc("tt_openad_materialMeta_new").ypw(String.valueOf(i10));
        long jEmc = com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
        if (System.currentTimeMillis() / 1000 < jEmc) {
            return strYpw;
        }
        if (jEmc != -1) {
            emc(i10, (String) null);
            emc(strYpw);
        }
        return null;
    }

    @Nullable
    public rie ypw(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        rie rieVarXq = xq(adSlot);
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            return rieVarXq;
        }
        if (rieVarXq != null && dg(adSlot)) {
            return null;
        }
        long jEmc = com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "material_expiration_time" + adSlot.getCodeId(), -1L);
        if (System.currentTimeMillis() / 1000 < jEmc && rieVarXq != null) {
            emc(adSlot, rieVarXq.lvs());
            return rieVarXq;
        }
        if (rieVarXq != null || jEmc != -1) {
            emc(Integer.parseInt(adSlot.getCodeId()), (String) null);
            if (rieVarXq != null) {
                com.bytedance.sdk.openadsdk.component.dg.emc.emc(rieVarXq);
            }
        }
        return null;
    }

    public static void emc(rie rieVar, xq xqVar) {
        emc(rieVar, xqVar, 0);
    }

    public static void emc(rie rieVar, final xq xqVar, final int i10) {
        String strR = rieVar.iat().r();
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        ru ruVarDg = com.bytedance.sdk.openadsdk.ru.dg.emc(strR).emc(rieVar.iat().B()).ypw(rieVar.iat().I()).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc()));
        if (i10 > 0 && Build.VERSION.SDK_INT >= 26) {
            ruVarDg.xq(2).emc(new msw() { // from class: com.bytedance.sdk.openadsdk.component.ycc.5
                @Override // com.bytedance.sdk.component.bw.msw
                public Bitmap emc(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.dg.emc.emc(aa.emc(), bitmap, i10);
                }
            });
        } else {
            ruVarDg.xq(1);
        }
        ruVarDg.emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, strR, new vk() { // from class: com.bytedance.sdk.openadsdk.component.ycc.6
            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(int i11, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(gbl gblVar) {
                xq xqVar2;
                if (gblVar == null || gblVar.ypw() == null || gblVar.xq() == null || (xqVar2 = xqVar) == null) {
                    return;
                }
                xqVar2.emc(gblVar.ypw());
            }
        }));
    }

    @Nullable
    public rie xq(AdSlot adSlot) {
        String strYpw;
        com.bytedance.sdk.openadsdk.component.bw.ypw ypwVarEmc;
        if (adSlot == null) {
            return null;
        }
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            ypwVarEmc = sba.emc().emc(adSlot);
            strYpw = ypwVarEmc != null ? ypwVarEmc.ypw() : null;
        } else {
            strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tt_openad_materialMeta", "material" + adSlot.getCodeId(), null);
            ypwVarEmc = null;
        }
        if (!TextUtils.isEmpty(strYpw)) {
            try {
                JSONObject jSONObjectEmc = aa.xq().emc(new JSONObject(strYpw));
                if (jSONObjectEmc != null && jSONObjectEmc.has("creatives")) {
                    return null;
                }
                rie rieVarEmc = com.bytedance.sdk.openadsdk.core.ypw.emc(jSONObjectEmc);
                if (com.bytedance.sdk.openadsdk.component.uym.emc.bw() && ypwVarEmc != null && rieVarEmc != null && rieVarEmc.vaf() != null) {
                    rieVarEmc.vaf().setCacheTime(ypwVarEmc.dg());
                }
                return rieVarEmc;
            } catch (Exception e10) {
                ul.xq("TTAppOpenAdCacheManager", e10.getMessage());
            }
        }
        return null;
    }

    private void ypw(String str) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    public String ypw() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            return name + "/" + ypw + "/";
        }
        return name + "/" + emc + "/";
    }

    public void emc(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            sba.emc().ypw(adSlot);
        }
        AtomicInteger atomicInteger = this.uym.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (!sba.emc().emc(adSlot.getCodeId(), atomicInteger.get(), atomicInteger.get() + ycc(adSlot))) {
            com.bytedance.sdk.openadsdk.component.uym.emc.msw();
            return;
        }
        atomicInteger.incrementAndGet();
        this.uym.put(adSlot.getCodeId(), atomicInteger);
        final lt ltVar = new lt();
        ltVar.emc(mxo.ypw());
        if (Build.VERSION.SDK_INT >= 24) {
            ltVar.ypw(com.bytedance.sdk.openadsdk.component.uym.emc.ypw());
            ltVar.ypw(com.bytedance.sdk.openadsdk.component.uym.emc.xq());
        }
        sb sbVar = new sb();
        sbVar.gbl = ltVar;
        sbVar.dg = 2;
        sbVar.zz = 2;
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            this.bw.emc(adSlot, sbVar, 3, (com.bytedance.sdk.openadsdk.core.ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.ycc.7
                @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(int i10, String str) {
                    ycc.this.bw(adSlot);
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(ltVar, 100, 2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) throws JSONException {
                    ycc.this.emc(emcVar, xqVar, adSlot, ltVar);
                }
            });
        } else {
            this.bw.emc(adSlot, sbVar, 3, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.ycc.8
                @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(int i10, String str) {
                    ycc.this.bw(adSlot);
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(ltVar, 100, 2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) throws JSONException {
                    ycc.this.emc(emcVar, xqVar, adSlot, ltVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar, AdSlot adSlot, lt ltVar) throws JSONException {
        com.bytedance.sdk.openadsdk.component.dg.emc.emc(ltVar, 100, 1);
        if (emcVar != null && emcVar.dg() != null && !emcVar.dg().isEmpty()) {
            rie rieVar = emcVar.dg().get(0);
            if (rieVar == null) {
                return;
            }
            if (rieVar.xmt()) {
                emc(rieVar, adSlot, ltVar, emcVar);
                return;
            } else if (rie.bw(rieVar)) {
                ypw(rieVar, adSlot, ltVar, emcVar);
                return;
            } else {
                xq(rieVar, adSlot, ltVar, emcVar);
                return;
            }
        }
        xqVar.emc(-3);
        xqVar.xq(2);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
    }

    public void emc(@NonNull rie rieVar, AdSlot adSlot, lt ltVar, com.bytedance.sdk.openadsdk.core.model.emc emcVar) throws JSONException {
        if (ltVar != null) {
            rieVar.xq(ltVar.ru());
        }
        emc(new com.bytedance.sdk.openadsdk.component.bw.emc(rieVar.tx(), rieVar, emcVar));
        com.bytedance.sdk.openadsdk.component.dg.emc.emc(rieVar, 1, ltVar);
        bw(adSlot);
    }

    public void emc(@NonNull final rie rieVar, AdSlot adSlot, final lt ltVar, final ypw ypwVar) {
        final mxo mxoVarYpw = mxo.ypw();
        final int iTx = rieVar.tx();
        b bVarIat = rieVar.iat();
        String strN = bVarIat.n();
        String strQ = bVarIat.q();
        if (TextUtils.isEmpty(strQ)) {
            strQ = com.bytedance.sdk.component.utils.bw.emc(strN);
        }
        final File fileEmc = com.bytedance.sdk.openadsdk.component.uym.emc.emc(strQ);
        if (fileEmc.exists()) {
            com.bytedance.sdk.openadsdk.component.uym.emc.emc(fileEmc);
            emc(iTx);
            long jDg = mxoVarYpw.dg();
            if (ltVar != null) {
                ltVar.emc(jDg);
                ltVar.emc(1);
            }
            ypwVar.emc();
            emc(rieVar, (xq) null);
            return;
        }
        if (aa.dg().ee(String.valueOf(iTx)) && !com.bytedance.sdk.component.utils.sba.dg(aa.emc())) {
            ypwVar.emc(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(fileEmc.getParent(), rieVar);
        ypwVarEmc.emc("material_meta", rieVar);
        ypwVarEmc.emc("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new a.InterfaceC0474a() { // from class: com.bytedance.sdk.openadsdk.component.ycc.11
            @Override // r2.a.InterfaceC0474a
            public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10) throws JSONException {
                ycc.this.emc(iTx);
                long jDg2 = mxoVarYpw.dg();
                com.bytedance.sdk.openadsdk.component.dg.emc.ypw(rieVar, jDg2, true);
                lt ltVar2 = ltVar;
                if (ltVar2 != null) {
                    ltVar2.emc(jDg2);
                    ltVar.emc(2);
                }
                ypwVar.emc();
                ycc.emc(rieVar, (xq) null);
            }

            @Override // r2.a.InterfaceC0474a
            public void ypw(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10) {
            }

            @Override // r2.a.InterfaceC0474a
            public void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar, int i10, String str) throws JSONException {
                long jDg2 = mxoVarYpw.dg();
                com.bytedance.sdk.openadsdk.component.dg.emc.ypw(rieVar, jDg2, false);
                lt ltVar2 = ltVar;
                if (ltVar2 != null) {
                    ltVar2.emc(jDg2);
                }
                ypwVar.emc(i10, str);
                try {
                    if (fileEmc.exists() && fileEmc.isFile()) {
                        com.bytedance.sdk.component.utils.uym.xq(fileEmc);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void emc(final rie rieVar, final lt ltVar, final emc emcVar) {
        final mxo mxoVarYpw = mxo.ypw();
        final int iTx = rieVar.tx();
        com.bytedance.sdk.openadsdk.core.model.sba sbaVar = rieVar.rr().get(0);
        String strUym = sbaVar.uym();
        String strEmc = sbaVar.emc();
        int iYpw = sbaVar.ypw();
        int iXq = sbaVar.xq();
        String strEmc2 = TextUtils.isEmpty(strUym) ? com.bytedance.sdk.component.utils.bw.emc(strEmc) : strUym;
        if (TextUtils.isEmpty(strEmc2)) {
            if (emcVar != null) {
                emcVar.emc();
                return;
            }
            return;
        }
        File fileYpw = com.bytedance.sdk.openadsdk.component.uym.emc.ypw(strEmc2);
        if (emc(strEmc, strUym)) {
            ypw(iTx);
            long jDg = mxoVarYpw.dg();
            if (ltVar != null) {
                ltVar.emc(jDg);
                ltVar.emc(1);
            }
            emcVar.emc(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.aa.emc(new com.bytedance.sdk.openadsdk.yzg.emc(strEmc, sbaVar.uym()), iYpw, iXq, new aa.emc() { // from class: com.bytedance.sdk.openadsdk.component.ycc.12
            @Override // com.bytedance.sdk.openadsdk.utils.aa.emc
            @MainThread
            public void emc(@NonNull com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar) throws JSONException {
                if (!ypwVar.bw()) {
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(rieVar, mxoVarYpw.dg(), false);
                    emcVar.emc();
                    return;
                }
                ycc.this.ypw(iTx);
                long jDg2 = mxoVarYpw.dg();
                com.bytedance.sdk.openadsdk.component.dg.emc.emc(rieVar, jDg2, true);
                lt ltVar2 = ltVar;
                if (ltVar2 != null) {
                    ltVar2.emc(jDg2);
                    ltVar.emc(2);
                }
                emcVar.emc(ypwVar);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.aa.emc
            @MainThread
            public void emc() throws JSONException {
                com.bytedance.sdk.openadsdk.component.dg.emc.emc(rieVar, mxoVarYpw.dg(), false);
                emcVar.emc();
            }
        }, fileYpw.getParent());
    }

    public void emc(int i10) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "video_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public void emc(final com.bytedance.sdk.openadsdk.component.bw.emc emcVar) {
        qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ycc.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    rie rieVarYpw = emcVar.ypw();
                    if (rieVarYpw == null || rie.uym(rieVarYpw) || rieVarYpw.wh()) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
                        sba.emc().emc(rieVarYpw, emcVar.xq());
                        return;
                    }
                    if (ycc.this.dg(rieVarYpw.vaf())) {
                        return;
                    }
                    ycc.this.emc(rieVarYpw.vaf(), rieVarYpw.lvs());
                    com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad", "material_expiration_time" + emcVar.emc(), Long.valueOf(rieVarYpw.az()));
                    if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
                        com.bytedance.sdk.openadsdk.common.ypw.emc("tt_openad_materialMeta_new").emc(emcVar.ypw().vaf(), emcVar.xq());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_materialMeta", "material" + emcVar.emc(), com.bytedance.sdk.component.utils.emc.emc(emcVar.ypw().uie()).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void emc(final String str) {
        iyl.emc(new com.bytedance.sdk.component.msw.msw("opencache") { // from class: com.bytedance.sdk.openadsdk.component.ycc.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = com.bytedance.sdk.openadsdk.core.aa.xq().emc(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (emcVarYpw = com.bytedance.sdk.openadsdk.core.model.emc.ypw(jSONObject)) == null || !emcVarYpw.bw()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(emcVarYpw.ycc());
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Nullable
    public String emc(rie rieVar) {
        if (rieVar != null && rieVar.iat() != null && !TextUtils.isEmpty(rieVar.iat().n())) {
            String strN = rieVar.iat().n();
            String strQ = rieVar.iat().q();
            if (TextUtils.isEmpty(strQ)) {
                strQ = com.bytedance.sdk.component.utils.bw.emc(strN);
            }
            File fileEmc = com.bytedance.sdk.openadsdk.component.uym.emc.emc(strQ);
            if (fileEmc.exists() && fileEmc.isFile()) {
                return fileEmc.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean emc(String str, String str2) throws IOException {
        boolean z10;
        File file;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.bw.emc(str);
            }
            File fileYpw = com.bytedance.sdk.openadsdk.component.uym.emc.ypw(str2);
            InputStream inputStreamEmc = com.bytedance.sdk.openadsdk.ru.dg.emc(str, str2);
            if (inputStreamEmc != null) {
                try {
                    inputStreamEmc.close();
                } catch (IOException e10) {
                    ul.xq("TTAppOpenAdCacheManager", e10.getMessage());
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (com.bytedance.sdk.openadsdk.ru.dg.emc(str, str2, fileYpw.getParent())) {
                    return true;
                }
                if (com.bytedance.sdk.openadsdk.ru.dg.ypw()) {
                    file = new File(fileYpw.getPath());
                } else {
                    file = new File(fileYpw.getPath() + ".0");
                }
                if (file.exists()) {
                    return true;
                }
            }
            return z10;
        } catch (Exception e11) {
            ul.xq("TTAppOpenAdCacheManager", e11.getMessage());
            return false;
        }
    }

    public void emc(AdSlot adSlot, String str) {
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z10 = adSlot.getCacheScene() != 0;
        if (!com.bytedance.sdk.openadsdk.component.uym.emc.emc(adSlot) || z10 || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.msw.put(codeId, str);
    }

    public void emc(int i10, String str) {
        String strValueOf = String.valueOf(i10);
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            sba.emc().emc(strValueOf, str);
            return;
        }
        if (this.msw.size() != 0 && !TextUtils.isEmpty(str) && this.msw.containsKey(strValueOf)) {
            if (this.msw.containsValue(str)) {
                this.msw.remove(strValueOf);
                ypw(strValueOf);
                return;
            }
            return;
        }
        ypw(strValueOf);
    }

    public void emc() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.ycc.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.ycc.4
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    return name.contains(ycc.ypw) || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.uym.xq(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
