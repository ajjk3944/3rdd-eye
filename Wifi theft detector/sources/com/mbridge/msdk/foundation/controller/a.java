package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: q, reason: collision with root package name */
    public static final String f14693q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();

    /* renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f14694r = new HashMap<>();

    /* renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f14695s;

    /* renamed from: b, reason: collision with root package name */
    protected String f14697b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f14698c;

    /* renamed from: d, reason: collision with root package name */
    protected String f14699d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f14700e;

    /* renamed from: f, reason: collision with root package name */
    private String f14701f;

    /* renamed from: g, reason: collision with root package name */
    private int f14702g;

    /* renamed from: j, reason: collision with root package name */
    private String f14705j;

    /* renamed from: k, reason: collision with root package name */
    private String f14706k;

    /* renamed from: l, reason: collision with root package name */
    private int f14707l;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f14709n;

    /* renamed from: o, reason: collision with root package name */
    private JSONObject f14710o;

    /* renamed from: a, reason: collision with root package name */
    private final s f14696a = new s();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f14703h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    private boolean f14704i = false;

    /* renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f14708m = new ConcurrentHashMap<>();

    /* renamed from: p, reason: collision with root package name */
    private int f14711p = 0;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    public class RunnableC0255a implements Runnable {
        public RunnableC0255a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f14698c).a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f14697b = (String) y0.a(aVar.f14698c, "sp_appId", "");
            } catch (Throwable th) {
                q0.b(a.f14693q, th.getMessage());
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f14705j = (String) y0.a(aVar.f14698c, "sp_appKey", "");
            } catch (Throwable th) {
                q0.b(a.f14693q, th.getMessage());
            }
        }
    }

    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f14698c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f14698c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
        }
    }

    public abstract void a(e eVar);

    public void b(int i10) {
        this.f14707l = i10;
    }

    public void c(int i10) {
        this.f14711p = i10;
    }

    public Context d() {
        return this.f14698c;
    }

    public s e() {
        return this.f14696a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f14709n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.f14702g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f14706k) ? this.f14706k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f14699d)) {
                return this.f14699d;
            }
            Context context = this.f14698c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f14699d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f14706k)) {
            return this.f14706k;
        }
        Context context = this.f14698c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f14710o;
    }

    public int l() {
        return this.f14711p;
    }

    public WeakReference<Activity> a() {
        return this.f14700e;
    }

    public void b(e eVar) {
        try {
            m0.C(this.f14698c);
            a(eVar);
            h.a(this.f14698c, this.f14697b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        PackageManager packageManager = this.f14698c.getPackageManager();
                        m0.d(packageManager.getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                        PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 0);
                        m0.f(packageInfo != null ? packageInfo.versionName : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    } catch (Throwable th) {
                        q0.b(f14693q, th.getMessage());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    m0.d(0);
                }
            }
            try {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarD != null && gVarD.F() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0255a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th2) {
                q0.b(f14693q, th2.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
        }
    }

    public void c(e eVar) throws JSONException {
        if (this.f14704i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f14710o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f14693q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f14706k = str;
            Context context = this.f14698c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f14697b = str;
            if (TextUtils.isEmpty(str) || (context = this.f14698c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f14705j = str;
            if (TextUtils.isEmpty(str) || (context = this.f14698c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f14700e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f14709n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f14702g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        int i11;
        String str2;
        int i12;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f14708m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f14708m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str3);
        int i13 = TextUtils.isEmpty(str3) ? 2 : 1;
        String str4 = TextUtils.isEmpty(str3) ? "get watermark failed" : bitmapDrawableN != null ? "" : "str to bitmap failed";
        if (bitmapDrawableN == null) {
            i11 = 2;
            i12 = i10;
            str2 = str;
        } else {
            i11 = 1;
            str2 = str;
            i12 = i10;
        }
        j.a(str2, i12, i13, str4, i11, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f14705j)) {
                return this.f14705j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th) {
            q0.b(f14693q, th.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f14710o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f14708m != null && !TextUtils.isEmpty(str) && this.f14708m.containsKey(str)) {
                this.f14708m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14699d = str;
    }

    public void a(String str, JSONObject jSONObject) throws JSONException {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f14703h == null) {
                    this.f14703h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f14703h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f14703h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f14708m == null) {
                        this.f14708m = new ConcurrentHashMap<>();
                    }
                    this.f14708m.put(str, this.f14703h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e10) {
                q0.b(f14693q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f14697b)) {
                return this.f14697b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f14701f = str;
            if (TextUtils.isEmpty(str) || (context = this.f14698c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f14693q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f14698c = context;
    }
}
