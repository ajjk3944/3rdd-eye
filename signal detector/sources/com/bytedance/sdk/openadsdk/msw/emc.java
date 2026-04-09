package com.bytedance.sdk.openadsdk.msw;

import A.f;
import J1.c;
import T.a;
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
import d5.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
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
                    return f.e("init");
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
                com.bytedance.sdk.openadsdk.hxp.emc.emc(new emc.InterfaceC0093emc() { // from class: com.bytedance.sdk.openadsdk.msw.emc.10.1
                });
                gbl.dg = gbl.ypw(context);
                uym.ypw();
                JSONObject jSONObjectRig = aa.dg().rig();
                if (jSONObjectRig != null) {
                    try {
                        y.f19830a = jSONObjectRig.optInt("splash", 10);
                        y.f19831b = jSONObjectRig.optInt("reward", 10);
                        y.f19832c = jSONObjectRig.optInt("brand", 10);
                        int iOptInt = jSONObjectRig.optInt("other", 10);
                        y.f19833d = iOptInt;
                        if (y.f19830a < 0) {
                            y.f19830a = 10;
                        }
                        if (y.f19831b < 0) {
                            y.f19831b = 10;
                        }
                        if (y.f19832c < 0) {
                            y.f19832c = 10;
                        }
                        if (iOptInt < 0) {
                            y.f19833d = 10;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                y.f19834e = CacheDirFactory.getICacheDir(0);
                gbl gblVarDg = aa.dg();
                if (!gblVarDg.xhi()) {
                    synchronized (gblVarDg) {
                        try {
                            if (!gblVarDg.xhi()) {
                                gblVarDg.dg();
                                gblVarDg.mxo();
                            }
                        } catch (Throwable th2) {
                            throw th2;
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
                    public void emc(final String str, boolean z6, final hxp.emc emcVar) {
                        com.bytedance.sdk.openadsdk.vk.xq.emc(str, z6, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.msw.emc.10.3.1
                            @Override // com.bytedance.sdk.openadsdk.vk.ypw
                            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() {
                                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc(str).ypw(emcVar.ypw());
                            }
                        });
                    }
                });
                dr.emc(com.bytedance.sdk.openadsdk.sra.emc.emc("webview_reuse_config", (String) null));
                String strEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("video_play_config", (String) null);
                if (TextUtils.isEmpty(strEmc)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(strEmc);
                    y.f19835f = jSONObject.optInt("check_moov", 0) == 1;
                    y.f19836g = jSONObject.optInt("new_media_source", 1);
                    y.f19837h = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
                } catch (JSONException unused) {
                }
            }
        });
    }

    public static void ypw(Context context) {
        try {
            float f2 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            ypw = f2;
            if (f2 <= 0.0f) {
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
                public com.bytedance.sdk.component.msw.zz emc(int i, String str) {
                    return new com.bytedance.sdk.component.msw.zz(i, str) { // from class: com.bytedance.sdk.openadsdk.msw.emc.9.1
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
                            int i3 = this.xq;
                            if (i3 > 10 || i3 <= 0) {
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
            } catch (Exception e6) {
                ul.xq("PAGSdk", e6.getMessage());
            }
            xq(initConfig);
            xq(context, initConfig);
            c.f2036a = context;
            c.f2037b = null;
            c.f2040e = 2;
            c.f2038c = initConfig.isSupportMultiProcess();
            c.f2039d = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ycc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ycc() {
        ShortcutManager shortcutManagerA;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextEmc = aa.emc();
                if (contextEmc == null || (shortcutManagerA = a.a(contextEmc.getSystemService(a.b()))) == null) {
                    return;
                }
                zz.ypw().emc(shortcutManagerA.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    public static final void emc() {
        try {
            com.bytedance.sdk.component.emc.emc(new emc.InterfaceC0033emc() { // from class: com.bytedance.sdk.openadsdk.msw.emc.1
                @Override // com.bytedance.sdk.component.emc.InterfaceC0033emc
                public ExecutorService emc() {
                    return iyl.bw();
                }

                @Override // com.bytedance.sdk.component.emc.InterfaceC0033emc
                public HandlerThread emc(String str, int i) {
                    return com.bytedance.sdk.component.utils.msw.emc(str, i);
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
                public WebView emc(Context context, AttributeSet attributeSet, int i, ycc.xq xqVar) {
                    if (dr.ypw(xqVar)) {
                        return dr.ypw(context, attributeSet, i, xqVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new com.bytedance.sdk.component.zz.bw(context, attributeSet) : new com.bytedance.sdk.component.zz.bw(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new com.bytedance.sdk.component.zz.bw(context, attributeSet) : new com.bytedance.sdk.component.zz.bw(context, attributeSet, i);
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
        long j6;
        try {
        } catch (Throwable th) {
            th.getMessage();
            ul.xq("PAGSdk", th.getMessage());
            long jElapsedRealtime = SystemClock.elapsedRealtime() - xq;
            ypw(4000, th.getMessage());
            j6 = jElapsedRealtime;
        }
        if (PAGSdk.isInitSuccess()) {
            uym();
            return;
        }
        bw(context, initConfig);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - xq;
        uym();
        ycc(context, initConfig);
        j6 = jElapsedRealtime2;
        emc(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - xq, j6);
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
                public void emc(int i, String str) {
                    emc.ypw(i, str);
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
    public static void ypw(int i, String str) {
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
                            next.fail(i, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new dg() { // from class: com.bytedance.sdk.openadsdk.msw.emc.3
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            return f.e("init");
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

    private static void emc(final Context context, final boolean z6, final InitConfig initConfig, final long j6, final long j7) {
        com.bytedance.sdk.openadsdk.vk.xq.emc();
        com.bytedance.sdk.openadsdk.vk.xq.emc("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.msw.emc.11
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zXq = zz.ypw().xq();
                    jSONObject.put("duration", j6);
                    jSONObject.put("sdk_init_time", j7);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", emc.ypw(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zXq);
                    jSONObject.put("minSdkVersion", tp.uym(context));
                    jSONObject.put("targetSdkVersion", tp.ycc(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z6);
                    jSONObject.put("support_hevc_levels", R2.a.h());
                    zz.ypw().ypw(false);
                } catch (Exception e6) {
                    ul.emc("PAGSdk", "run: ", e6);
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
