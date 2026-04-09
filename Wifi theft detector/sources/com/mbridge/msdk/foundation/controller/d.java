package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.j;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: l, reason: collision with root package name */
    private static volatile d f14737l;

    /* renamed from: a, reason: collision with root package name */
    private int f14738a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f14739b;

    /* renamed from: c, reason: collision with root package name */
    private FastKV f14740c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14741d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f14742e;

    /* renamed from: f, reason: collision with root package name */
    private String f14743f;

    /* renamed from: g, reason: collision with root package name */
    private String f14744g;

    /* renamed from: h, reason: collision with root package name */
    private Context f14745h;

    /* renamed from: i, reason: collision with root package name */
    private String f14746i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.preload.a f14747j;

    /* renamed from: k, reason: collision with root package name */
    private String f14748k;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14749a;

        public a(Context context) {
            this.f14749a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.h(this.f14749a);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.f14742e);
            new h(d.this.f14745h).a();
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    public class C0258d implements a.e {
        public C0258d() {
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14754a;

        public e(String str) {
            this.f14754a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e10) {
                q0.b("SDKController", e10.getMessage());
            }
            new j().b(d.this.f14745h, this.f14754a, d.this.f14743f);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.timer.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), null);
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage(), th);
        }
    }

    public boolean e() {
        return true;
    }

    public void f() {
    }

    private void c() throws JSONException {
        com.mbridge.msdk.foundation.controller.c.n().b(this.f14745h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.f14742e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f14743f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.f14748k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.f14744g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C0258d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null || (listG = gVarD.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.f14745h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance, null);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance2, null);
                }
            }
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage());
        }
    }

    public void b() {
        a(this.f14745h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            com.mbridge.msdk.foundation.same.report.j.b();
        } catch (Exception unused) {
            q0.b("SDKController", "get app setting failed");
        }
        this.f14741d = true;
    }

    public static d a() {
        if (f14737l == null) {
            synchronized (d.class) {
                try {
                    if (f14737l == null) {
                        f14737l = new d();
                    }
                } finally {
                }
            }
        }
        return f14737l;
    }

    public void b(String str) {
        if (this.f14747j == null) {
            this.f14747j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.f14739b;
            if (map == null || map.size() <= 0 || !this.f14739b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.f14739b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.f14747j.a(this.f14739b, this.f14738a);
                return;
            }
            if (1 == iIntValue) {
                this.f14747j.a(this.f14739b);
            } else if (2 != iIntValue) {
                q0.b("SDKController", "unknow layout type in preload");
            } else {
                this.f14747j.b(this.f14739b);
            }
        } catch (Exception e10) {
            q0.b("SDKController", e10.getMessage());
        }
    }

    public void a(Map map, Context context) throws JSONException {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f14742e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f14743f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f14748k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f14744g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f14746i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f14745h = context.getApplicationContext();
            c();
            if (this.f14741d) {
                return;
            }
            b();
            m0.l(context);
            long jB0 = com.mbridge.msdk.setting.h.b().b(this.f14742e).B0();
            if (jB0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jB0);
            }
        }
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.f14740c == null) {
                try {
                    this.f14740c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f14740c = null;
                }
            }
            FastKV fastKV = this.f14740c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(k0.a("H+tU+bfPhM=="), "");
                String string4 = this.f14740c.getString(k0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15032g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f15032g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15032g)) {
                        return;
                    }
                    this.f14740c.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.f14740c.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f15032g);
                    return;
                }
                com.mbridge.msdk.foundation.same.a.V = string3;
                com.mbridge.msdk.foundation.same.a.f15032g = string4;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f15032g);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences != null) {
                string2 = sharedPreferences.getString(k0.a("H+tU+bfPhM=="), "");
                string = sharedPreferences.getString(k0.a("H+tU+Fz8"), "");
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15032g)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                com.mbridge.msdk.foundation.same.a.f15032g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c");
            }
            if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                if ((TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15032g)) || sharedPreferences == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                editorEdit.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f15032g);
                editorEdit.apply();
                return;
            }
            com.mbridge.msdk.foundation.same.a.V = string2;
            com.mbridge.msdk.foundation.same.a.f15032g = string;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f15032g);
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.mbridge.msdk.setting.h.b() == null) {
            return;
        }
        com.mbridge.msdk.setting.h hVarB = com.mbridge.msdk.setting.h.b();
        if (hVarB != null) {
            g gVarD = hVarB.d(str);
            if (gVarD != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.V();
                MBridgeConstans.OMID_JS_H5_URL = gVarD.U();
                if (!TextUtils.isEmpty(gVarD.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f15173i = gVarD.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarD.w())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f15177m = gVarD.w();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.f17040b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f17039a;
            }
        }
        if (com.mbridge.msdk.setting.h.b().g(str) && com.mbridge.msdk.setting.h.b().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                        return;
                    } else {
                        new j().b(this.f14745h, str, this.f14743f);
                        return;
                    }
                } catch (Throwable unused) {
                    new j().b(this.f14745h, str, this.f14743f);
                    return;
                }
            }
            new j().b(this.f14745h, str, this.f14743f);
        }
    }

    public void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            q0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f14739b = map;
        this.f14738a = i10;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(strB);
        }
    }
}
