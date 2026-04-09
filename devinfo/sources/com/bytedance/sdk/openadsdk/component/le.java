package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.fkw.pno;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.vt;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.ksc;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.zih;
import d.h;
import i3.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import w8.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le {

    /* renamed from: lh, reason: collision with root package name */
    private static String f7877lh = "openad_image_cache";
    private static String vt = "/openad_image_cache";
    private static volatile le yu;
    private final com.bytedance.sdk.openadsdk.vt.vt fkw;

    /* renamed from: le, reason: collision with root package name */
    private final vpp<com.bytedance.sdk.openadsdk.yu.ouw> f7878le;
    public final Context ouw;
    private final Map<String, AtomicInteger> ra = new ConcurrentHashMap();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface lh {
        void ouw(Object obj);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();

        void vt();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw();

        void ouw(int i4, String str);
    }

    private le(Context context) {
        if (context != null) {
            this.ouw = context.getApplicationContext();
        } else {
            this.ouw = zih.ouw();
        }
        this.fkw = new com.bytedance.sdk.openadsdk.vt.vt();
        this.f7878le = zih.lh();
        if (yu.ouw.ouw) {
            vt = h.w(new StringBuilder(), vt, "_p");
            f7877lh = h.w(new StringBuilder(), f7877lh, "_p");
        }
        com.bytedance.sdk.openadsdk.common.vt.ouw("tt_openad_materialMeta_new", new vt.ouw("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.le.1
            @Override // com.bytedance.sdk.openadsdk.common.vt.ouw
            public final String ouw(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.vt.ouw
            public final String vt(String str) {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.vt.ouw
            public final void ouw(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    public static com.bytedance.sdk.openadsdk.core.model.vpp lh(int i4) {
        String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad_materialMeta", "material".concat(String.valueOf(i4)), null);
        if (!TextUtils.isEmpty(strVt)) {
            try {
                JSONObject jSONObjectOuw = zih.lh().ouw(new JSONObject(strVt));
                if (jSONObjectOuw == null || !jSONObjectOuw.has("creatives")) {
                    return com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObjectOuw);
                }
                return null;
            } catch (Exception e2) {
                qbp.lh("TTAppOpenAdCacheManager", e2.getMessage());
            }
        }
        return null;
    }

    public static void yu(int i4) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad_materialMeta_new", "material".concat(String.valueOf(i4)));
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad_materialMeta", "material".concat(String.valueOf(i4)));
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad", "material_expiration_time".concat(String.valueOf(i4)));
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad", "video_has_cached".concat(String.valueOf(i4)));
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tt_openad", "image_has_cached".concat(String.valueOf(i4)));
    }

    public static le ouw(Context context) {
        if (yu == null) {
            synchronized (le.class) {
                try {
                    if (yu == null) {
                        yu = new le(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return yu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.ra.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.ra.put(adSlot.getCodeId(), atomicInteger);
    }

    public static void vt(int i4) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad", "image_has_cached".concat(String.valueOf(i4)), Boolean.TRUE);
    }

    private static int lh(AdSlot adSlot) {
        long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad", "material_expiration_time" + adSlot.getCodeId(), -1L);
        ko.ouw("TTAppOpenAdCacheManager", "local cache number : ", Integer.valueOf(jOuw == -1 ? 0 : 1));
        return jOuw == -1 ? 0 : 1;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, lh lhVar) {
        ouw(vppVar, lhVar, 0);
    }

    public final void ouw(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.ra.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        ko.ouw("TTAppOpenAdCacheManager", "local Requesting:", atomicInteger);
        int iLh = atomicInteger.get() + lh(adSlot);
        if (iLh > 0) {
            ko.ouw("TTAppOpenAdCacheManager", Integer.valueOf(iLh), ",The number of preloads exceeds the limit ", 1);
            return;
        }
        atomicInteger.incrementAndGet();
        this.ra.put(adSlot.getCodeId(), atomicInteger);
        final uq uqVar = new uq();
        uqVar.ouw = fak.ouw();
        ksc kscVar = new ksc();
        kscVar.f8240cf = uqVar;
        kscVar.yu = 2;
        kscVar.bly = 2;
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            this.f7878le.ouw(adSlot, kscVar, 3, (com.bytedance.sdk.openadsdk.core.qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.le.7
                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(int i4, String str) {
                    ko.vt("TTAppOpenAdCacheManager", "new cache Load App OpenAd From Network fail");
                    le.this.vt(adSlot);
                }

                @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                    le.ouw(le.this, ouwVar, lhVar, adSlot, uqVar);
                }
            });
        } else {
            this.f7878le.ouw(adSlot, kscVar, 3, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.le.8
                @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(int i4, String str) {
                    ko.vt("TTAppOpenAdCacheManager", "cache Load App OpenAd From Network fail");
                    le.this.vt(adSlot);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                    le.ouw(le.this, ouwVar, lhVar, adSlot, uqVar);
                }
            });
        }
    }

    public final void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, final uq uqVar, final vt vtVar) {
        final fak fakVarOuw = fak.ouw();
        final int iFqk = vppVar.fqk();
        c cVar = vppVar.f8309sd;
        String str = cVar.g;
        String strB = cVar.b();
        if (TextUtils.isEmpty(strB)) {
            strB = com.bytedance.sdk.component.utils.fkw.ouw(str);
        }
        final File fileOuw = com.bytedance.sdk.openadsdk.component.ra.ouw.ouw(strB);
        if (fileOuw.exists()) {
            ko.vt("TTAppOpenAdCacheManager", "The video cache exists locally, use the cache directly");
            try {
                com.bytedance.sdk.component.utils.ra.vt(fileOuw);
            } catch (Throwable unused) {
            }
            ouw(iFqk);
            long jLh = fakVarOuw.lh();
            if (uqVar != null) {
                uqVar.ra = jLh;
                uqVar.pno = 1;
            }
            vtVar.ouw();
            ouw(vppVar, (lh) null, 0);
            return;
        }
        zih.yu();
        if (cf.th(String.valueOf(iFqk)) && !vm.ouw(zih.ouw())) {
            vtVar.ouw(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(fileOuw.getParent(), vppVar);
        vtVarOuw.ouw("material_meta", vppVar);
        vtVarOuw.ouw("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new a() { // from class: com.bytedance.sdk.openadsdk.component.le.11
            @Override // w8.a
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar, int i4) {
                ko.vt("TTAppOpenAdCacheManager", "Video file caching success");
                le.ouw(iFqk);
                long jLh2 = fakVarOuw.lh();
                com.bytedance.sdk.openadsdk.component.yu.ouw.vt(vppVar, jLh2, true);
                uq uqVar2 = uqVar;
                if (uqVar2 != null) {
                    uqVar2.ra = jLh2;
                    uqVar2.pno = 2;
                }
                vtVar.ouw();
                le.ouw(vppVar, (lh) null);
            }

            @Override // w8.a
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar, int i4, String str2) {
                ko.vt("TTAppOpenAdCacheManager", "Video file caching failed");
                long jLh2 = fakVarOuw.lh();
                com.bytedance.sdk.openadsdk.component.yu.ouw.vt(vppVar, jLh2, false);
                uq uqVar2 = uqVar;
                if (uqVar2 != null) {
                    uqVar2.ra = jLh2;
                }
                vtVar.ouw(i4, str2);
                try {
                    if (fileOuw.exists() && fileOuw.isFile()) {
                        com.bytedance.sdk.component.utils.ra.lh(fileOuw);
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // w8.a
            public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar, int i4) {
            }
        });
    }

    public final void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, final uq uqVar, final ouw ouwVar) {
        final fak fakVarOuw = fak.ouw();
        final int iFqk = vppVar.fqk();
        com.bytedance.sdk.openadsdk.core.model.zih zihVar = vppVar.tc.get(0);
        String str = zihVar.f8322le;
        String str2 = zihVar.ouw;
        int i4 = zihVar.vt;
        int i10 = zihVar.f8323lh;
        String strOuw = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.utils.fkw.ouw(str2) : str;
        if (TextUtils.isEmpty(strOuw)) {
            ouwVar.vt();
            return;
        }
        File fileVt = com.bytedance.sdk.openadsdk.component.ra.ouw.vt(strOuw);
        if (ouw(str2, str)) {
            ko.vt("TTAppOpenAdCacheManager", "The image cache exists locally, directly use the cache");
            vt(iFqk);
            long jLh = fakVarOuw.lh();
            if (uqVar != null) {
                uqVar.ra = jLh;
                uqVar.pno = 1;
            }
            ouwVar.ouw();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.zih.ouw(new com.bytedance.sdk.openadsdk.th.ouw(str2, zihVar.f8322le), i4, i10, new zih.ouw() { // from class: com.bytedance.sdk.openadsdk.component.le.12
            @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar) {
                if (!vtVar.vt()) {
                    com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, fakVarOuw.lh(), false);
                    ouwVar.vt();
                    return;
                }
                ko.vt("TTAppOpenAdCacheManager", "Image loaded successfully");
                le.vt(iFqk);
                long jLh2 = fakVarOuw.lh();
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, jLh2, true);
                uq uqVar2 = uqVar;
                if (uqVar2 != null) {
                    uqVar2.ra = jLh2;
                    uqVar2.pno = 2;
                }
                ouwVar.ouw();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
            public final void vt() {
                ko.vt("TTAppOpenAdCacheManager", "Image caching success");
            }

            @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
            public final void ouw() {
                ko.vt("TTAppOpenAdCacheManager", "Image loading failed");
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, fakVarOuw.lh(), false);
                ouwVar.vt();
            }
        }, fileVt.getParent(), 0);
    }

    public static void ouw(int i4) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad", "video_has_cached".concat(String.valueOf(i4)), Boolean.TRUE);
    }

    public final void ouw(final com.bytedance.sdk.openadsdk.component.fkw.ouw ouwVar) {
        jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.le.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.vt;
                    if (vppVar == null || com.bytedance.sdk.openadsdk.core.model.vpp.ra(vppVar)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = ouwVar.vt;
                    if (vppVar2.zn) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad", "material_expiration_time" + ouwVar.ouw, Long.valueOf(vppVar2.fwd));
                    if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                        com.bytedance.sdk.openadsdk.common.vt vtVarOuw = com.bytedance.sdk.openadsdk.common.vt.ouw("tt_openad_materialMeta_new");
                        com.bytedance.sdk.openadsdk.component.fkw.ouw ouwVar2 = ouwVar;
                        vtVarOuw.ouw(ouwVar2.vt.yiz, ouwVar2.f7874lh);
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_openad_materialMeta", "material" + ouwVar.ouw, com.bytedance.sdk.component.utils.ouw.ouw(ouwVar.vt.ouw(true)).toString());
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private static boolean ouw(String str, String str2) throws IOException {
        boolean z3;
        File file;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.fkw.ouw(str);
            }
            File fileVt = com.bytedance.sdk.openadsdk.component.ra.ouw.vt(str2);
            InputStream inputStreamOuw = yu.ouw.vt.ouw(str, str2);
            if (inputStreamOuw != null) {
                try {
                    inputStreamOuw.close();
                } catch (IOException e2) {
                    qbp.lh("TTAppOpenAdCacheManager", e2.getMessage());
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (yu.ouw.vt.ouw(str, str2, fileVt.getParent())) {
                    return true;
                }
                if (yu.ouw.ouw) {
                    file = new File(fileVt.getPath());
                } else {
                    file = new File(fileVt.getPath() + ".0");
                }
                if (file.exists()) {
                    return true;
                }
            }
            return z3;
        } catch (Exception e10) {
            qbp.lh("TTAppOpenAdCacheManager", e10.getMessage());
            return false;
        }
    }

    public static String ouw() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return h.w(e.b(name, "/"), f7877lh, "/");
        }
        return h.w(e.b(name, "/"), vt, "/");
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, final lh lhVar, final int i4) {
        String str = vppVar.f8309sd.f6578f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        tlj tljVarYu = yu.ouw.ouw(yu.ouw.vt.ouw(str).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()))).ouw(vppVar.f8309sd.f6574b).vt(vppVar.f8309sd.f6573a).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()));
        if (i4 > 0 && Build.VERSION.SDK_INT >= 26) {
            tljVarYu.lh(2).ouw(new pno() { // from class: com.bytedance.sdk.openadsdk.component.le.5
                @Override // com.bytedance.sdk.component.fkw.pno
                public final Bitmap ouw(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), bitmap, i4);
                }
            });
        } else {
            tljVarYu.lh(1);
        }
        tljVarYu.vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, str, new rn() { // from class: com.bytedance.sdk.openadsdk.component.le.6
            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(int i10, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                lh lhVar2;
                if (cfVar == null || cfVar.vt() == null || cfVar.lh() == null || (lhVar2 = lhVar) == null) {
                    return;
                }
                lhVar2.ouw(cfVar.vt());
            }
        }));
    }

    public static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        c cVar;
        if (vppVar != null && (cVar = vppVar.f8309sd) != null && !TextUtils.isEmpty(cVar.g)) {
            c cVar2 = vppVar.f8309sd;
            String str = cVar2.g;
            String strB = cVar2.b();
            if (TextUtils.isEmpty(strB)) {
                strB = com.bytedance.sdk.component.utils.fkw.ouw(str);
            }
            File fileOuw = com.bytedance.sdk.openadsdk.component.ra.ouw.ouw(strB);
            if (fileOuw.exists() && fileOuw.isFile()) {
                return fileOuw.getAbsolutePath();
            }
        }
        return null;
    }

    public static /* synthetic */ void ouw(le leVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, final AdSlot adSlot, final uq uqVar) {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
        ko.vt("TTAppOpenAdCacheManager", "cache Load App Open Ad From Network success");
        if (ouwVar != null && (list = ouwVar.yu) != null && !list.isEmpty()) {
            final com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.yu.get(0);
            if (vppVar != null && vppVar.ra()) {
                com.bytedance.sdk.openadsdk.component.fkw.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.component.fkw.ouw(vppVar.fqk(), vppVar, ouwVar);
                leVar.ouw(ouwVar2);
                com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(ouwVar2.vt, 1, uqVar);
                leVar.vt(adSlot);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                final int iFqk = vppVar.fqk();
                leVar.ouw(vppVar, adSlot, uqVar, new vt() { // from class: com.bytedance.sdk.openadsdk.component.le.9
                    @Override // com.bytedance.sdk.openadsdk.component.le.vt
                    public final void ouw() {
                        com.bytedance.sdk.openadsdk.component.fkw.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.component.fkw.ouw(iFqk, vppVar, ouwVar);
                        le.this.ouw(ouwVar3);
                        com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(ouwVar3.vt, 1, uqVar);
                        le.this.vt(adSlot);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.le.vt
                    public final void ouw(int i4, String str) {
                        le.this.vt(adSlot);
                    }
                });
                return;
            } else {
                final int iFqk2 = vppVar.fqk();
                leVar.ouw(vppVar, uqVar, new ouw() { // from class: com.bytedance.sdk.openadsdk.component.le.10
                    @Override // com.bytedance.sdk.openadsdk.component.le.ouw
                    public final void ouw() {
                        com.bytedance.sdk.openadsdk.component.fkw.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.component.fkw.ouw(iFqk2, vppVar, ouwVar);
                        le.this.ouw(ouwVar3);
                        com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(ouwVar3.vt, 1, uqVar);
                        le.this.vt(adSlot);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.le.ouw
                    public final void vt() {
                        le.this.vt(adSlot);
                    }
                });
                return;
            }
        }
        ko.vt("TTAppOpenAdCacheManager", "material is null");
        lhVar.vt = -3;
        lhVar.ra = 2;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }
}
