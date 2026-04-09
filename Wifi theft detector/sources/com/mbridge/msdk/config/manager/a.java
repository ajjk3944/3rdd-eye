package com.mbridge.msdk.config.manager;

import android.text.TextUtils;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.c;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f14126d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f14127e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static int f14128f = 5000;

    /* renamed from: g, reason: collision with root package name */
    public static int f14129g = 5000;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.pipeline.a f14131b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14132c = false;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f14130a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    /* renamed from: com.mbridge.msdk.config.manager.a$a, reason: collision with other inner class name */
    public class C0249a extends c {
        public C0249a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
        public void a(String str, Object obj) {
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            try {
                String strValueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                    return;
                }
                a.this.f14131b.a(new e().a(strValueOf));
            } catch (Throwable unused) {
                a.b().a(false);
            }
        }
    }

    private a() {
    }

    public static a b() {
        if (f14126d == null) {
            synchronized (f14127e) {
                try {
                    if (f14126d == null) {
                        f14126d = new a();
                    }
                } finally {
                }
            }
        }
        return f14126d;
    }

    public void d() {
        this.f14130a.a("g0.npc", (com.mbridge.msdk.config.dynamic.binddata.wrapper.b<String>) new C0249a());
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a a() {
        return this.f14130a;
    }

    public boolean c() {
        return this.f14132c;
    }

    public void a(boolean z10) {
        this.f14132c = z10;
    }

    public void a(Object obj) {
        if (obj instanceof String) {
            d();
            this.f14131b = new com.mbridge.msdk.config.component.pipeline.a(String.valueOf(obj), this.f14130a);
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        try {
            if (this.f14131b == null) {
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("577"), str2);
            HashMap map3 = new HashMap();
            map3.put("id", str);
            if (map.containsKey("sdk_context")) {
                map2.put("sdk_context", map.get("sdk_context"));
                map.remove("sdk_context");
            }
            map3.put("api_params", map);
            HashMap map4 = new HashMap();
            map4.put("context_id", str);
            map3.put("metrics", map4);
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("51"), map3);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.a("_");
            bVar.b("922001");
            bVar.a(map2);
            com.mbridge.msdk.config.component.pipeline.a aVar = this.f14131b;
            if (aVar != null) {
                aVar.a(bVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    public void b(final String str, final String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.manager.b
            @Override // java.lang.Runnable
            public final void run() {
                a.a(str2, str);
            }
        });
    }

    public Map<String, Object> a(String str) {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM settingDB WHERE appId = " + str);
        if (mapD != null && !mapD.isEmpty()) {
            Object obj = mapD.get(com.mbridge.msdk.config.component.common.util.c.a("500"));
            if (obj instanceof List) {
                String strValueOf = String.valueOf(((List) obj).get(0));
                if (!TextUtils.isEmpty(strValueOf) && (mapA2 = eVar.a(strValueOf)) != null && !mapA2.isEmpty()) {
                    a(mapA2);
                    return mapA2;
                }
            }
        }
        String strE = h.b().e(str);
        if (TextUtils.isEmpty(strE) || (mapA = eVar.a(strE)) == null || mapA.isEmpty()) {
            return null;
        }
        a(mapA);
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM settingDB WHERE appID = " + str2 + " AND type = 1");
            String strReplaceAll = str.replaceAll("'", "''");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (mapD != null && !mapD.isEmpty()) {
                Object obj = mapD.get("data");
                if ((obj instanceof List) && ((List) obj).size() > 0) {
                    com.mbridge.msdk.config.component.database.a.a().c("UPDATE settingDB SET appID =" + str2 + ", unitID = '',  type = 1, timestamp = " + jCurrentTimeMillis + " , jsonString = '" + strReplaceAll + "' WHERE appID = " + str2);
                    return;
                }
            }
            com.mbridge.msdk.config.component.database.a.a().c("INSERT INTO settingDB (appID, unitID, type, timestamp, jsonString) VALUES (" + str2 + ",'',1," + jCurrentTimeMillis + ",'" + strReplaceAll + "')");
        } catch (Throwable th) {
            q0.b("ComponentManager", "update component appSetting error: " + th.getMessage(), th);
        }
    }

    private void a(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String strValueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(strValueOf) && TextUtils.isDigitsOnly(strValueOf)) {
                    f14128f = Integer.parseInt(strValueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String strValueOf2 = String.valueOf(map.get("t_o_ar"));
                if (TextUtils.isEmpty(strValueOf2) || !TextUtils.isDigitsOnly(strValueOf2)) {
                    return;
                }
                f14129g = Integer.parseInt(strValueOf2) * 1000;
            }
        } catch (Throwable th) {
            q0.b("ComponentManager", "refreshTimeout error: " + th.getMessage(), th);
        }
    }
}
