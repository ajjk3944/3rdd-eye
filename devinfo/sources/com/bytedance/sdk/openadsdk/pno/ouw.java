package com.bytedance.sdk.openadsdk.pno;

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
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.adexpress.ouw.vt.fkw;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.pno.le;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.pno.tlj;
import com.bytedance.sdk.component.utils.jqy;
import com.bytedance.sdk.component.utils.od;
import com.bytedance.sdk.component.utils.tc;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.component.utils.vt;
import com.bytedance.sdk.component.vt;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.ko;
import com.bytedance.sdk.openadsdk.core.mwh;
import com.bytedance.sdk.openadsdk.core.pd;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.settings.yu;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ex.ouw;
import com.bytedance.sdk.openadsdk.tc.vt.ra;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.qbp;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.uq;
import com.bytedance.sdk.openadsdk.utils.vm;
import com.bytedance.sdk.openadsdk.vm.lh;
import com.bytedance.sdk.openadsdk.yu.ouw.vt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import pk.a;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static final List<PAGSdk.PAGInitCallback> ouw = new ArrayList();
    public static float vt = 1.0f;

    /* renamed from: lh, reason: collision with root package name */
    private static long f8619lh = 0;

    private static void fkw(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        bs.ouw(new pno("init_sync") { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10
            @Override // java.lang.Runnable
            public final void run() throws IOException, ClassNotFoundException {
                jg.ouw(initConfig.getData());
                com.bytedance.sdk.openadsdk.vpp.ouw.ouw(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.vpp.ouw.ouw();
                lh.ouw();
                lh.vt();
                new rn();
                fkw.ouw(qbp.ouw() * 10);
                vt.ouw(context, initConfig.isSupportMultiProcess());
                ko.ouw().vt();
                com.bytedance.sdk.openadsdk.core.tlj.lh.ouw();
                com.bytedance.sdk.openadsdk.ex.ouw.ouw(new ouw.InterfaceC0103ouw() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.1
                });
                cf.fkw = cf.vt(context);
                ra.vt();
                JSONObject jSONObjectBs = zih.yu().bs();
                if (jSONObjectBs != null) {
                    try {
                        t.f35184a = jSONObjectBs.optInt("splash", 10);
                        t.f35185b = jSONObjectBs.optInt("reward", 10);
                        t.f35186c = jSONObjectBs.optInt("brand", 10);
                        int iOptInt = jSONObjectBs.optInt("other", 10);
                        t.f35187d = iOptInt;
                        if (t.f35184a < 0) {
                            t.f35184a = 10;
                        }
                        if (t.f35185b < 0) {
                            t.f35185b = 10;
                        }
                        if (t.f35186c < 0) {
                            t.f35186c = 10;
                        }
                        if (iOptInt < 0) {
                            t.f35187d = 10;
                        }
                        a.y("MediaConfig", "splash=", Integer.valueOf(t.f35184a), ",reward=", Integer.valueOf(t.f35185b), ",brand=", Integer.valueOf(t.f35186c), ",other=", Integer.valueOf(t.f35187d));
                    } catch (Throwable th2) {
                        a.m("MediaConfig", th2.getMessage());
                    }
                }
                t.f35188e = CacheDirFactory.getICacheDir(0);
                cf cfVarYu = zih.yu();
                if (!cfVarYu.ksc()) {
                    synchronized (cfVarYu) {
                        try {
                            if (!cfVarYu.ksc()) {
                                cfVarYu.lh();
                                cfVarYu.rn();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                DeviceUtils.tlj();
                ouw.ouw(context);
                PAGSdk.getBiddingToken();
                le.ouw(true);
                le.ouw(new com.bytedance.sdk.openadsdk.rn.vt.ouw());
                DeviceUtils.ouw(context);
                DeviceUtils.ra(context);
                DeviceUtils.pno(context);
                com.bytedance.sdk.openadsdk.rn.ouw.ouw();
                yu.ouw();
                com.bytedance.sdk.openadsdk.rn.lh.lh();
                uoy.fkw(context);
                com.bytedance.sdk.openadsdk.yu.lh.ouw();
                ouw.yu();
                com.bytedance.sdk.openadsdk.core.tlj.lh.vt();
                com.bytedance.sdk.openadsdk.core.fkw.ouw.ouw().vt();
                com.bytedance.sdk.component.pno.lh.lh.ouw(jg.vt());
                com.bytedance.sdk.component.utils.vt.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.2
                    @Override // com.bytedance.sdk.component.utils.vt.ouw
                    public final ExecutorService lh() {
                        return bs.bly();
                    }

                    @Override // com.bytedance.sdk.component.utils.vt.ouw
                    public final boolean ouw() {
                        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.vt.ouw
                    public final boolean vt() {
                        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("start_act_asy", 0) == 1;
                    }
                });
                uoy.yu();
                jqy.ouw(new jqy.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.3
                    @Override // com.bytedance.sdk.component.utils.jqy.vt
                    public final void ouw(final String str, final jqy.ouw ouwVar) {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw(str, false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.10.3.1
                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                return com.bytedance.sdk.openadsdk.rn.ouw.yu.vt().ouw(str).vt(ouwVar.vt());
                            }
                        });
                    }
                });
                od.ouw(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("webview_reuse_config", (String) null));
                String strOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("video_play_config", (String) null);
                if (TextUtils.isEmpty(strOuw)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(strOuw);
                    t.f35189f = jSONObject.optInt("check_moov", 0) == 1;
                    t.g = jSONObject.optInt("new_media_source", 1);
                    t.f35190h = jSONObject.optInt("read_buffer_size_k", 8) * Segment.SHARE_MINIMUM;
                } catch (JSONException unused) {
                }
            }
        });
    }

    public static void lh() {
        if (com.bytedance.sdk.openadsdk.common.le.ouw()) {
            return;
        }
        try {
            String strYu = bly.ouw().yu();
            if (TextUtils.isEmpty(strYu)) {
                return;
            }
            ApmHelper.initApm(zih.ouw(), new PAGConfig.Builder().appId(strYu).build());
        } catch (Exception unused) {
        }
    }

    public static void vt() {
        zih.yu();
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_sp_bad_par", "gaid");
    }

    private static void yu(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            le.le();
            com.bytedance.sdk.component.pno.fkw.ouw(new tlj() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.9
                @Override // com.bytedance.sdk.component.pno.tlj
                public final com.bytedance.sdk.component.pno.bly ouw(int i4, String str) {
                    return new com.bytedance.sdk.component.pno.bly(i4, str) { // from class: com.bytedance.sdk.openadsdk.pno.ouw.9.1
                        @Override // com.bytedance.sdk.component.pno.bly, java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            if (com.bytedance.sdk.component.pno.bly.yu) {
                                return null;
                            }
                            int iRrs = cf.vt().rrs();
                            if (iRrs < -524288 || iRrs >= 0) {
                                return super.newThread(runnable);
                            }
                            Thread thread = new Thread(this.ouw, runnable, this.vt, iRrs);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i10 = this.f7606lh;
                            if (i10 > 10 || i10 <= 0) {
                                this.f7606lh = 5;
                            }
                            thread.setPriority(this.f7606lh);
                            return thread;
                        }
                    };
                }
            });
            com.bytedance.sdk.openadsdk.multipro.lh.ouw(context);
            com.bytedance.sdk.openadsdk.ra.vt.lh();
            jg.vt.set(true);
            try {
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw(new com.bytedance.sdk.openadsdk.tlj.ouw());
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.qbp.lh("PAGSdk", e2.getMessage());
            }
            vt(initConfig);
            lh(context, initConfig);
            v8.a.f35974a = context;
            v8.a.f35975b = null;
            v8.a.f35978e = 2;
            v8.a.f35976c = initConfig.isSupportMultiProcess();
            v8.a.f35977d = com.bytedance.sdk.openadsdk.th.vt.ouw().vt().fkw();
        }
    }

    private static void fkw() {
        jg.ouw(1);
        try {
            List<PAGSdk.PAGInitCallback> list = ouw;
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
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.ouw("init");
                    return ouwVar;
                }
            });
        } catch (Throwable th3) {
            com.bytedance.sdk.component.utils.qbp.yu(th3.getMessage(), new Object[0]);
        }
    }

    public static final void ouw() {
        try {
            com.bytedance.sdk.component.vt.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.1
                @Override // com.bytedance.sdk.component.vt.ouw
                public final ExecutorService ouw() {
                    return bs.fkw();
                }

                @Override // com.bytedance.sdk.component.vt.ouw
                public final HandlerThread ouw(String str) {
                    return com.bytedance.sdk.component.utils.pno.ouw(str, -2);
                }
            });
            bs.ouw(new pno("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.pno.ouw.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
                    ouw.lh();
                    ouw.vt();
                }
            });
            jg.ouw(System.currentTimeMillis());
            jg.vt();
            com.bytedance.sdk.component.bly.le.setWebViewProvider(new le.yu() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.5
                @Override // com.bytedance.sdk.component.bly.le.yu
                public final WebView ouw(Context context, AttributeSet attributeSet, le.lh lhVar) {
                    if (od.vt(lhVar)) {
                        return od.vt(context, attributeSet, lhVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return new com.bytedance.sdk.component.bly.fkw(context, attributeSet);
                    } catch (Exception unused) {
                        return new com.bytedance.sdk.component.bly.fkw(context, attributeSet);
                    }
                }
            });
        } catch (Throwable th2) {
            Log.i("PAGSdk", th2.getMessage());
        }
    }

    private static void lh(Context context, InitConfig initConfig) {
        jg.ouw = true;
        pd.ouw().ouw(initConfig.getAppId()).vt(initConfig.getGdpr()).fkw(initConfig.getPA()).yu(tc.ouw(context)).ouw(initConfig.getTitleBarTheme()).lh(initConfig.getAdxId());
        bly.zih();
        if (initConfig instanceof PAGConfig) {
            pd.ouw().lh(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (((PAGConfig) initConfig).getDebugLog()) {
                pd.ouw().ouw();
                vm.ouw();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.bly.ouw();
    }

    public static void ouw(Context context) {
        com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw(context);
        uq.ouw();
        osn.ouw(context);
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        com.bytedance.sdk.openadsdk.core.lh.ouw("uuid", ex.ouw());
        zih.fkw();
        String strOuw = ryl.ouw(context);
        com.bytedance.sdk.openadsdk.core.tlj.lh.vt(strOuw);
        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(strOuw, true);
        com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw();
        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().vt();
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            vt = f10;
            if (f10 <= 0.0f) {
                vt = 1.0f;
            }
        } catch (Throwable unused) {
            vt = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(Context context, InitConfig initConfig) {
        long jElapsedRealtime;
        try {
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("PAGSdk", "init throwable " + th2.getMessage());
            com.bytedance.sdk.component.utils.qbp.lh("PAGSdk", th2.getMessage());
            jElapsedRealtime = SystemClock.elapsedRealtime() - f8619lh;
            ouw(4000, th2.getMessage());
        }
        if (PAGSdk.isInitSuccess()) {
            fkw();
            return;
        }
        yu(context, initConfig);
        jElapsedRealtime = SystemClock.elapsedRealtime() - f8619lh;
        fkw();
        fkw(context, initConfig);
        long j = jElapsedRealtime;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - f8619lh;
        ouw(context, PAGSdk.isInitSuccess(), initConfig, jElapsedRealtime2, j);
        com.bytedance.sdk.component.utils.ko.vt("PAGSdk", "init exec init sdk sdkInitTime=", Long.valueOf(j), " duration=", Long.valueOf(jElapsedRealtime2));
    }

    public static /* synthetic */ void yu() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextOuw = zih.ouw();
                if (contextOuw == null || (shortcutManager = (ShortcutManager) contextOuw.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                bly.ouw().ouw(shortcutManager.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    public static void ouw(final Context context, final InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        f8619lh = SystemClock.elapsedRealtime();
        zih.vt(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = ouw;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (jg.yu() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.le.ouw()) {
            ouw(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            fkw();
            vt(initConfig);
            return;
        }
        if (initConfig == null) {
            ouw(4000, "PAGConfig is null, please check.");
            return;
        }
        jg.ouw(3);
        int pa2 = initConfig.getPA();
        if (pa2 < -1 || pa2 > 1) {
            ouw(10004, com.bytedance.sdk.openadsdk.core.pno.ouw(10004));
            return;
        }
        if (context == null) {
            ouw(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (!TextUtils.isEmpty(initConfig.getPackageName())) {
            vpp.ouw(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.ra.yu.ouw(initConfig.getPackageName());
        } else {
            vpp.ouw((String) null);
            com.bytedance.adsdk.ugeno.ra.yu.ouw(null);
        }
        zih.vt(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.vt.ouw();
        } else {
            com.bytedance.sdk.openadsdk.multipro.vt.vt();
        }
        com.bytedance.sdk.openadsdk.core.bly.ryl.ouw();
        com.bytedance.sdk.openadsdk.core.cf.vt.ouw();
        ApmHelper.initApm(context, initConfig);
        try {
            bly.ouw(new mwh() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.6
                @Override // com.bytedance.sdk.openadsdk.core.mwh
                public final void ouw(String str) {
                    ouw.ouw(4000, str);
                }
            });
            try {
                vpp.ouw(zih.ouw(), "tt_ad_logo_txt");
                if (vpp.yu(context, "tt_ad_logo") == 0) {
                    ouw(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        fkw();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.fkw.ouw ouwVar = new com.bytedance.sdk.openadsdk.fkw.ouw();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.7
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public final IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return ouwVar;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    vt(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(new com.bytedance.sdk.openadsdk.multipro.aidl.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.8
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.vt
                        public final void ouw() {
                            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    ouw.vt(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().lh();
                }
            } catch (Throwable unused) {
                ouw(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            ouw(4000, "Internal Error, setting exception. ");
        }
    }

    private static void vt(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            bly.ouw().ouw(initConfig.getData());
        }
        bly.ouw().vt(((PAGConfig) initConfig).getDebugLog());
    }

    private static void ouw(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        jg.ouw(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                ouw(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                ouw(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void ouw(final Context context, final boolean z3, final InitConfig initConfig, final long j, final long j8) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.11
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    bly.ouw();
                    boolean zVt = bly.vt();
                    jSONObject.put("duration", j);
                    jSONObject.put("sdk_init_time", j8);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", ouw.ouw(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zVt);
                    jSONObject.put("minSdkVersion", uoy.lh(context));
                    jSONObject.put("targetSdkVersion", uoy.vt(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z3);
                    jSONObject.put("support_hevc_levels", t.n());
                    bly.ouw();
                    bly.lh();
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.qbp.ouw("PAGSdk", "run: ", e2);
                }
                return com.bytedance.sdk.openadsdk.rn.ouw.yu.vt().ouw("pangle_sdk_init").vt(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ouw(int i4, String str) {
        jg.ouw(2);
        try {
            List<PAGSdk.PAGInitCallback> list = ouw;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i4, str);
                        }
                    }
                    lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.pno.ouw.3
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.ouw("init");
                            return ouwVar;
                        }
                    });
                } finally {
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
        }
    }

    public static String ouw(PAGBiddingRequest pAGBiddingRequest) {
        if (com.bytedance.sdk.openadsdk.common.le.ouw()) {
            return null;
        }
        return (zih.ouw() == null || pd.ouw() == null) ? "" : pd.ouw().ouw(pAGBiddingRequest);
    }

    public static /* synthetic */ boolean ouw(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }
}
