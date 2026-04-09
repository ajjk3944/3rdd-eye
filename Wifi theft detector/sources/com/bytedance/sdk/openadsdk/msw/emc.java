package com.bytedance.sdk.openadsdk.msw;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.emc;
import com.bytedance.sdk.component.msw.bw;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.msw.ru;
import com.bytedance.sdk.component.utils.dr;
import com.bytedance.sdk.component.utils.hxp;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.ypw;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.common.sba;
import com.bytedance.sdk.openadsdk.common.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.cf;
import com.bytedance.sdk.openadsdk.core.lt;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.sz;
import com.bytedance.sdk.openadsdk.core.xq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.core.zz.sup;
import com.bytedance.sdk.openadsdk.dg.emc.ypw;
import com.bytedance.sdk.openadsdk.ee.ypw.uym;
import com.bytedance.sdk.openadsdk.hxp.emc;
import com.bytedance.sdk.openadsdk.sba.dg;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.cuf;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.utils.ylm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public static final List<PAGSdk.PAGInitCallback> emc = new ArrayList();
    public static float ypw = 1.0f;
    private static long xq = 0;

    private static void bw() {
        xq.emc().emc("uuid", db.emc());
    }

    private static void uym() {
        qh.emc(1);
        try {
            List<PAGSdk.PAGInitCallback> list = emc;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.bytedance.sdk.openadsdk.sba.xq.ypw(new dg() { // from class: com.bytedance.sdk.openadsdk.msw.emc.2
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                    emcVar.ypw("init");
                    return emcVar;
                }
            });
        } catch (Throwable th2) {
            ul.xq(th2.getMessage(), new Object[0]);
        }
    }

    public static void xq() {
        if (ycc.emc()) {
            return;
        }
        try {
            String strDg = zz.ypw().dg();
            if (TextUtils.isEmpty(strDg)) {
                return;
            }
            ApmHelper.initApm(aa.emc(), new PAGConfig.Builder().appId(strDg).build());
        } catch (Exception unused) {
        }
    }

    private static void ycc(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        iyl.emc(new msw("init_sync") { // from class: com.bytedance.sdk.openadsdk.msw.emc.10
            @Override // java.lang.Runnable
            public void run() throws IOException, ClassNotFoundException {
                qh.emc(initConfig.getData());
                com.bytedance.sdk.openadsdk.sra.emc.emc(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.sra.emc.emc();
                com.bytedance.sdk.openadsdk.sba.xq.emc();
                com.bytedance.sdk.openadsdk.sba.xq.ypw();
                new vk();
                com.bytedance.sdk.component.adexpress.emc.ypw.ycc.emc(ylm.emc() * 10);
                ypw.emc(context, initConfig.isSupportMultiProcess());
                cf.emc().ypw();
                com.bytedance.sdk.openadsdk.core.ru.xq.emc();
                com.bytedance.sdk.openadsdk.hxp.emc.emc(new emc.InterfaceC0178emc() { // from class: com.bytedance.sdk.openadsdk.msw.emc.10.1
                });
                gbl.dg = gbl.ypw(context);
                uym.ypw();
                x2.a.e(aa.dg().rig());
                x2.a.f(CacheDirFactory.getICacheDir(0));
                gbl gblVarDg = aa.dg();
                if (!gblVarDg.xhi()) {
                    synchronized (gblVarDg) {
                        try {
                            if (!gblVarDg.xhi()) {
                                gblVarDg.dg();
                                gblVarDg.mxo();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                DeviceUtils.gbl();
                emc.emc(context);
                PAGSdk.getBiddingToken();
                com.bytedance.sdk.component.msw.ycc.emc(true);
                com.bytedance.sdk.component.msw.ycc.emc(new com.bytedance.sdk.openadsdk.vk.ypw.emc());
                DeviceUtils.emc(context);
                DeviceUtils.gbl(context);
                DeviceUtils.sup(context);
                com.bytedance.sdk.openadsdk.vk.emc.emc();
                com.bytedance.sdk.openadsdk.core.settings.dg.emc();
                com.bytedance.sdk.openadsdk.vk.xq.dg();
                tp.zz(context);
                com.bytedance.sdk.openadsdk.dg.xq.emc();
                emc.ycc();
                com.bytedance.sdk.openadsdk.core.ru.xq.ypw();
                com.bytedance.sdk.openadsdk.core.bw.emc.emc().ypw();
                com.bytedance.sdk.component.msw.xq.xq.emc(qh.ypw());
                if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
                    sba.emc().dg();
                }
                com.bytedance.sdk.component.utils.ypw.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.msw.emc.10.2
                    @Override // com.bytedance.sdk.component.utils.ypw.emc
                    public boolean emc() {
                        return com.bytedance.sdk.openadsdk.sra.emc.emc("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.ypw.emc
                    public ExecutorService xq() {
                        return iyl.zz();
                    }

                    @Override // com.bytedance.sdk.component.utils.ypw.emc
                    public boolean ypw() {
                        return com.bytedance.sdk.openadsdk.sra.emc.emc("start_act_asy", 0) == 1;
                    }
                });
                tp.xq();
                hxp.emc(new hxp.ypw() { // from class: com.bytedance.sdk.openadsdk.msw.emc.10.3
                    @Override // com.bytedance.sdk.component.utils.hxp.ypw
                    public void emc(final String str, boolean z10, final hxp.emc emcVar) {
                        com.bytedance.sdk.openadsdk.vk.xq.emc(str, z10, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.msw.emc.10.3.1
                            @Override // com.bytedance.sdk.openadsdk.vk.ypw
                            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc(str).ypw(emcVar.ypw());
                            }
                        });
                    }
                });
                dr.emc(com.bytedance.sdk.openadsdk.sra.emc.emc("webview_reuse_config", (String) null));
                x2.a.d(com.bytedance.sdk.openadsdk.sra.emc.emc("video_play_config", (String) null));
            }
        });
    }

    public static void ypw(Context context) {
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            ypw = f10;
            if (f10 <= 0.0f) {
                ypw = 1.0f;
            }
        } catch (Throwable unused) {
            ypw = 1.0f;
        }
    }

    private static void dg(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            rie.emc((String) null);
            com.bytedance.adsdk.ugeno.uym.dg.emc((String) null);
        } else {
            rie.emc(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.uym.dg.emc(initConfig.getPackageName());
        }
        aa.ypw(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.ypw.emc();
        } else {
            com.bytedance.sdk.openadsdk.multipro.ypw.ypw();
        }
        sup.emc();
        com.bytedance.sdk.openadsdk.core.gbl.xq.emc(context);
    }

    private static void bw(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            com.bytedance.sdk.component.msw.ycc.ypw(-1);
            bw.emc(new ru() { // from class: com.bytedance.sdk.openadsdk.msw.emc.9
                @Override // com.bytedance.sdk.component.msw.ru
                public com.bytedance.sdk.component.msw.zz emc(int i10, String str) {
                    return new com.bytedance.sdk.component.msw.zz(i10, str) { // from class: com.bytedance.sdk.openadsdk.msw.emc.9.1
                        @Override // com.bytedance.sdk.component.msw.zz, java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            if (com.bytedance.sdk.component.msw.zz.dg) {
                                return null;
                            }
                            int iIpv = gbl.xq().ipv();
                            if (iIpv < -524288 || iIpv >= 0) {
                                return super.newThread(runnable);
                            }
                            Thread thread = new Thread(this.emc, runnable, this.ypw, iIpv);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i11 = this.xq;
                            if (i11 > 10 || i11 <= 0) {
                                this.xq = 5;
                            }
                            thread.setPriority(this.xq);
                            return thread;
                        }
                    };
                }
            });
            com.bytedance.sdk.openadsdk.multipro.xq.emc(context);
            com.bytedance.sdk.openadsdk.uym.ypw.xq();
            qh.ypw.set(true);
            try {
                com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().emc(new com.bytedance.sdk.openadsdk.ru.emc());
            } catch (Exception e10) {
                ul.xq("PAGSdk", e10.getMessage());
            }
            xq(initConfig);
            xq(context, initConfig);
            q2.b.e(context, null);
            q2.b.d(2);
            q2.b.g(initConfig.isSupportMultiProcess());
            q2.b.f(com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ycc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ycc() {
        ShortcutManager shortcutManagerA;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextEmc = aa.emc();
                if (contextEmc == null || (shortcutManagerA = b.a(contextEmc.getSystemService(a.a()))) == null) {
                    return;
                }
                zz.ypw().emc(shortcutManagerA.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    public static final void emc() {
        try {
            com.bytedance.sdk.component.emc.emc(new emc.InterfaceC0118emc() { // from class: com.bytedance.sdk.openadsdk.msw.emc.1
                @Override // com.bytedance.sdk.component.emc.InterfaceC0118emc
                public ExecutorService emc() {
                    return iyl.bw();
                }

                @Override // com.bytedance.sdk.component.emc.InterfaceC0118emc
                public HandlerThread emc(String str, int i10) {
                    return com.bytedance.sdk.component.utils.msw.emc(str, i10);
                }
            });
            iyl.emc(new msw("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.msw.emc.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(false);
                    emc.xq();
                    emc.ypw();
                }
            });
            qh.emc(System.currentTimeMillis());
            qh.ypw();
            com.bytedance.sdk.component.zz.ycc.setWebViewProvider(new ycc.dg() { // from class: com.bytedance.sdk.openadsdk.msw.emc.5
                @Override // com.bytedance.sdk.component.zz.ycc.dg
                public WebView emc(Context context, AttributeSet attributeSet, int i10, ycc.xq xqVar) {
                    if (dr.ypw(xqVar)) {
                        return dr.ypw(context, attributeSet, i10, xqVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i10 == 0 ? new com.bytedance.sdk.component.zz.bw(context, attributeSet) : new com.bytedance.sdk.component.zz.bw(context, attributeSet, i10);
                    } catch (Exception unused) {
                        return i10 == 0 ? new com.bytedance.sdk.component.zz.bw(context, attributeSet) : new com.bytedance.sdk.component.zz.bw(context, attributeSet, i10);
                    }
                }
            });
        } catch (Throwable th) {
            Log.i("PAGSdk", th.getMessage());
        }
    }

    public static void ypw() {
        aa.dg();
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_privacy", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("sp_global_icon_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("pag_sp_bad_par", "gaid");
    }

    private static void xq(Context context, InitConfig initConfig) {
        qh.emc = true;
        lt.emc().emc(initConfig.getAppId()).ypw(initConfig.getGdpr()).bw(initConfig.getPA()).dg(com.bytedance.sdk.component.utils.db.emc(context)).emc(initConfig.getTitleBarTheme()).xq(initConfig.getAdxId());
        zz.rie();
        if (initConfig instanceof PAGConfig) {
            lt.emc().xq(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (ypw(initConfig)) {
                lt.emc().emc();
                com.bytedance.sdk.openadsdk.utils.sba.emc();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.zz.emc();
    }

    public static void emc(Context context) {
        com.bytedance.sdk.openadsdk.core.emc.emc.emc(context);
        cuf.emc();
        vw.emc(context);
        bw();
        aa.bw();
        String strEmc = com.bytedance.sdk.openadsdk.core.sup.emc(context);
        com.bytedance.sdk.openadsdk.core.ru.xq.ypw(strEmc);
        com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(strEmc, true);
        com.bytedance.sdk.component.adexpress.emc.ypw.ypw.emc();
        com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().ypw();
        ypw(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(Context context, InitConfig initConfig) {
        long j10;
        try {
        } catch (Throwable th) {
            th.getMessage();
            ul.xq("PAGSdk", th.getMessage());
            long jElapsedRealtime = SystemClock.elapsedRealtime() - xq;
            ypw(4000, th.getMessage());
            j10 = jElapsedRealtime;
        }
        if (PAGSdk.isInitSuccess()) {
            uym();
            return;
        }
        bw(context, initConfig);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - xq;
        uym();
        ycc(context, initConfig);
        j10 = jElapsedRealtime2;
        emc(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - xq, j10);
    }

    public static void emc(final Context context, final InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        xq = jElapsedRealtime;
        qh.dg = jElapsedRealtime;
        aa.ypw(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = emc;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (qh.dg() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.ycc.emc()) {
            ypw(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            uym();
            xq(initConfig);
            return;
        }
        if (initConfig == null) {
            ypw(4000, "PAGConfig is null, please check.");
            return;
        }
        qh.emc(3);
        int pa = initConfig.getPA();
        if (pa < -1 || pa > 1) {
            ypw(10004, com.bytedance.sdk.openadsdk.core.msw.emc(10004));
            return;
        }
        if (context == null) {
            ypw(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        dg(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            zz.emc(new sz() { // from class: com.bytedance.sdk.openadsdk.msw.emc.6
                @Override // com.bytedance.sdk.openadsdk.core.sz
                public void emc(int i10, String str) {
                    emc.ypw(i10, str);
                }
            });
            try {
                rie.emc(aa.emc(), "tt_ad_logo_txt");
                if (rie.dg(context, "tt_ad_logo") == 0) {
                    emc(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        uym();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.bw.emc emcVar = new com.bytedance.sdk.openadsdk.bw.emc();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.msw.emc.7
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return emcVar;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    ypw(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().emc(new com.bytedance.sdk.openadsdk.multipro.aidl.ypw() { // from class: com.bytedance.sdk.openadsdk.msw.emc.8
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.ypw
                        public void emc() {
                            qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.msw.emc.8.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    emc.ypw(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().xq();
                }
            } catch (Throwable unused) {
                emc(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            ypw(4000, "Internal Error, setting exception. ");
        }
    }

    private static void xq(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            zz.ypw().xq(initConfig.getData());
        }
        zz.ypw().xq(ypw(initConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ypw(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(int i10, String str) {
        qh.emc(2);
        try {
            List<PAGSdk.PAGInitCallback> list = emc;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i10, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new dg() { // from class: com.bytedance.sdk.openadsdk.msw.emc.3
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                            emcVar.ypw("init");
                            return emcVar;
                        }
                    });
                } finally {
                }
            }
        } catch (Throwable th) {
            ul.xq(th.getMessage(), new Object[0]);
        }
    }

    private static void emc(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        qh.emc(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                ypw(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                ypw(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void emc(final Context context, final boolean z10, final InitConfig initConfig, final long j10, final long j11) {
        com.bytedance.sdk.openadsdk.vk.xq.emc();
        com.bytedance.sdk.openadsdk.vk.xq.emc("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.msw.emc.11
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zXq = zz.ypw().xq();
                    jSONObject.put("duration", j10);
                    jSONObject.put("sdk_init_time", j11);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", emc.ypw(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zXq);
                    jSONObject.put("minSdkVersion", tp.uym(context));
                    jSONObject.put("targetSdkVersion", tp.ycc(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z10);
                    jSONObject.put("support_hevc_levels", u2.b.d());
                    zz.ypw().ypw(false);
                } catch (Exception e10) {
                    ul.emc("PAGSdk", "run: ", e10);
                }
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("pangle_sdk_init").ypw(jSONObject.toString());
            }
        });
    }

    public static String emc(PAGBiddingRequest pAGBiddingRequest) {
        if (com.bytedance.sdk.openadsdk.common.ycc.emc()) {
            return null;
        }
        return (aa.emc() == null || lt.emc() == null) ? "" : lt.emc().emc(pAGBiddingRequest);
    }
}
