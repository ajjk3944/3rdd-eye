package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ModelCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: h, reason: collision with root package name */
    private String f13604h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f13605i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f13606j;

    /* renamed from: k, reason: collision with root package name */
    private String f13607k;

    /* renamed from: l, reason: collision with root package name */
    private int f13608l = 0;

    /* renamed from: m, reason: collision with root package name */
    private String f13609m;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf = String.valueOf(ModelCpt.this.f13609m);
            Map<String, Object> mapD = (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) ? com.mbridge.msdk.config.component.database.a.a().d(strValueOf) : (strValueOf.startsWith("DELETE") || strValueOf.startsWith("delete")) ? com.mbridge.msdk.config.component.database.a.a().a(strValueOf) : com.mbridge.msdk.config.component.database.a.a().c(strValueOf);
            Object obj = mapD.get(c.a("code"));
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.a(true, "", mapD.get(c.a("data")));
            } else {
                ModelCpt.this.a(false, String.valueOf(mapD.get(c.a("reason"))), (Object) null);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f13606j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.f13609m)) {
            return;
        }
        a aVar = new a();
        if (this.f13608l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    private void h() {
        Map<String, Object> map = this.f13605i;
        if (map == null || this.f13090d == null || this.f13606j == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(c.a("120"));
        if (TextUtils.isEmpty(str)) {
            a(false, "Scope name is empty", (Object) null);
            return;
        }
        String str2 = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : this.f13606j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !c.a("120").equals(entry.getKey())) {
                    try {
                        String key = entry.getKey();
                        String str3 = str + "." + key;
                        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = c.a(this.f13090d, str3);
                        if (aVarA == null) {
                            continue;
                        } else if (aVarA.a(str3, key, entry.getValue()).intValue() == 1) {
                            z10 = true;
                        }
                    } catch (Exception e10) {
                        str2 = "Failed to modify data in scope: " + e10.getMessage();
                        q0.b("ModelCpt", str2);
                    }
                }
            }
            a(z10, str2, (Object) null);
            return;
        }
    }

    private void i() {
        Map<String, Object> map;
        if (this.f13605i == null || this.f13090d == null || (map = this.f13606j) == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z10 = this.f13090d.a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z10) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e10) {
                        str = "Failed to modify data without scope: " + e10.getMessage();
                        q0.b("ModelCpt", str);
                    }
                }
            }
            a(z10, str, (Object) null);
            return;
        }
    }

    private void j() {
        b bVar = new b();
        if (this.f13608l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            if (c.a("313").equals(this.f13607k)) {
                g();
                return;
            }
            if (c.a("314").equals(this.f13607k)) {
                j();
            } else if (this.f13604h.equals("withScope")) {
                h();
            } else {
                i();
            }
        } catch (Exception e10) {
            q0.b("ModelCpt", "Error during execution: " + e10.getMessage());
            a(false, "Execution failed: " + e10.getMessage(), (Object) null);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "914001";
        this.f13605i = map;
        if (map.isEmpty()) {
            q0.b("ModelCpt", "Config parameters is null");
            return;
        }
        this.f13604h = map.containsKey(c.a("120")) ? "withScope" : "withoutScope";
        Object obj = map.get(c.a("121"));
        if (obj instanceof Map) {
            this.f13606j = (Map) obj;
        }
        Object obj2 = map.get(c.a("117"));
        if (obj2 != null) {
            this.f13607k = String.valueOf(obj2);
        }
        Object obj3 = map.get(c.a("background"));
        if (obj3 != null) {
            this.f13608l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get(c.a("118"));
        if (obj4 != null) {
            this.f13609m = String.valueOf(obj4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put(c.a("500"), Integer.valueOf(z10 ? 1 : 2));
        map.put(c.a("code"), "");
        map.put(c.a("reason"), str);
        if (obj != null) {
            map.put(c.a("data"), obj);
        }
        a(a("914002", map));
    }
}
