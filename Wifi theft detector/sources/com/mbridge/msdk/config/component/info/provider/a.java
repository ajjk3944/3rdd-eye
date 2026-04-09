package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.d;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: j, reason: collision with root package name */
    private static final Map<String, Object> f13314j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Object> f13315k = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f13316a;

    /* renamed from: b, reason: collision with root package name */
    private int f13317b;

    /* renamed from: c, reason: collision with root package name */
    private int f13318c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.subprovider.a f13319d;

    /* renamed from: e, reason: collision with root package name */
    private e f13320e;

    /* renamed from: f, reason: collision with root package name */
    private c f13321f;

    /* renamed from: g, reason: collision with root package name */
    private d f13322g;

    /* renamed from: h, reason: collision with root package name */
    private b f13323h;

    /* renamed from: i, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.info.provider.listener.a f13324i = new com.mbridge.msdk.config.component.info.provider.listener.a() { // from class: s6.a
        @Override // com.mbridge.msdk.config.component.info.provider.listener.a
        public final void a(Map map) {
            com.mbridge.msdk.config.component.info.provider.a.a(map);
        }
    };

    public a(int i10, int i11, int i12) {
        this.f13316a = i10;
        this.f13317b = i11;
        this.f13318c = i12;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map) {
        if (map != null) {
            if (map.containsKey("adId")) {
                f13315k.put(com.mbridge.msdk.config.component.common.util.c.a("546"), map.get("adId"));
            }
            if (map.containsKey("adIdB64")) {
                f13315k.put(com.mbridge.msdk.config.component.common.util.c.a("547"), map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                f13315k.put(com.mbridge.msdk.config.component.common.util.c.a("548"), map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = f13315k;
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("549"), map.get("amazonIdInfoB64"));
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("550"), map.get("amazonIdInfo"));
            }
        }
    }

    public void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (this.f13316a == 1) {
            this.f13319d = new com.mbridge.msdk.config.component.info.provider.subprovider.a(contextD, this.f13324i);
        }
        if (this.f13317b == 1) {
            this.f13320e = new e(contextD);
        }
        this.f13321f = new c();
        this.f13322g = new d();
        this.f13323h = new b(contextD);
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (this.f13317b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("513"), this.f13321f.e(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("509"), this.f13321f.a(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("531"), Integer.valueOf(this.f13321f.j(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("533"), this.f13321f.k(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("557"), Integer.valueOf(this.f13321f.n()));
                HashMap<String, Object> mapM = this.f13321f.m();
                map.put(com.mbridge.msdk.config.component.common.util.c.a("553"), mapM.get("available"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("580"), mapM.get("versionName"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("581"), mapM.get("versionCode"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("538"), Integer.valueOf(this.f13323h.c()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("517"), this.f13323h.d());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("559"), Integer.valueOf(this.f13323h.e()));
            }
            if (this.f13318c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("534"), Integer.valueOf(this.f13322g.d(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("535"), Integer.valueOf(this.f13322g.d(contextD)));
                Map<String, Object> mapA = this.f13322g.a(contextD);
                map.put(com.mbridge.msdk.config.component.common.util.c.a("536"), mapA.get("charging"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("535"), mapA.get("batteryLevel"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("544"), this.f13322g.b(contextD));
            }
            return map;
        } catch (Throwable th) {
            q0.b("DeviceInfoProvider", th.getMessage(), th);
            return map;
        }
    }

    public Map<String, Object> a() {
        Map<String, Object> mapA;
        String str = "";
        Map<String, Object> map = f13314j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f13315k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
            return map;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            map.put(com.mbridge.msdk.config.component.common.util.c.a("524"), MBConfiguration.SDK_VERSION);
            map.put(com.mbridge.msdk.config.component.common.util.c.a("506"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("567"), contextD.getPackageName());
            map.put(com.mbridge.msdk.config.component.common.util.c.a("568"), this.f13321f.d(contextD));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("569"), Integer.valueOf(this.f13321f.c(contextD)));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("570"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("571"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("572"), this.f13321f.a(contextD, contextD.getPackageName()));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("573"), "2");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("574"), Integer.valueOf(this.f13321f.j()));
            if (this.f13317b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("508"), this.f13321f.g());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("579"), Integer.valueOf(this.f13321f.h()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("503"), this.f13321f.f());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("552"), this.f13321f.a());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("551"), this.f13321f.d());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("522"), this.f13320e.c());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("502"), this.f13321f.i());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("532"), this.f13321f.h(contextD) + "x" + this.f13321f.f(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("631"), "");
                Map<String, Object> mapE = this.f13321f.e();
                if (mapE != null && !mapE.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("505"), mapE.get("totalMem"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("541"), mapE.get("availMem"));
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.a("519"), Integer.valueOf(this.f13321f.o()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("518"), Integer.valueOf(this.f13321f.n(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("520"), Integer.valueOf(this.f13321f.k()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("566"), Integer.valueOf(this.f13321f.a(com.mbridge.msdk.foundation.controller.c.n().h())));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("515"), Long.valueOf(this.f13321f.b()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("512"), Integer.valueOf(this.f13321f.l()));
                Map<String, String> mapI = this.f13321f.i(contextD);
                if (mapI != null && !mapI.isEmpty()) {
                    String str2 = mapI.get("mnc");
                    String str3 = mapI.get("mcc");
                    String strA = com.mbridge.msdk.config.component.common.util.c.a("564");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put(strA, str2);
                    String strA2 = com.mbridge.msdk.config.component.common.util.c.a("565");
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put(strA2, str);
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.a("563"), this.f13321f.c());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("562"), Boolean.valueOf(this.f13321f.m(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("561"), this.f13321f.l(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("560"), Integer.valueOf(this.f13321f.b(contextD)));
            }
            if (this.f13318c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("516"), Float.valueOf(this.f13322g.c(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("510"), this.f13322g.b());
                Map<String, Object> mapA2 = this.f13322g.a();
                if (mapA2 != null && !mapA2.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("555"), mapA2.get("totalSpace"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("542"), mapA2.get("freeExternalSize"));
                }
            }
            if (this.f13316a == 1 && (mapA = this.f13319d.a()) != null && !mapA.isEmpty()) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("546"), mapA.get("adId"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("547"), mapA.get("adIdB64"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("548"), mapA.get("adIdLimit"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("549"), mapA.get("amazonIdInfoB64"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("550"), mapA.get("amazonIdInfo"));
            }
        } catch (Throwable th) {
            q0.b("DeviceInfoProvider", th.getMessage(), th);
        }
        return f13314j;
    }

    public String a(String str) {
        Map<String, Object> map = f13314j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f13315k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = f13315k;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> mapB = b();
        if (mapB.containsKey(str)) {
            return String.valueOf(mapB.get(str));
        }
        return "";
    }
}
