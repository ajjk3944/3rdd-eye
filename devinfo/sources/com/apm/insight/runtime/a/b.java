package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f3404a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3405b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3406c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f3407d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3408e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f3409f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f3410z;
    private int B;
    private Application g;

    /* renamed from: h, reason: collision with root package name */
    private Context f3411h;

    /* renamed from: n, reason: collision with root package name */
    private String f3416n;

    /* renamed from: o, reason: collision with root package name */
    private long f3417o;

    /* renamed from: p, reason: collision with root package name */
    private String f3418p;

    /* renamed from: q, reason: collision with root package name */
    private long f3419q;

    /* renamed from: r, reason: collision with root package name */
    private String f3420r;

    /* renamed from: s, reason: collision with root package name */
    private long f3421s;

    /* renamed from: t, reason: collision with root package name */
    private String f3422t;

    /* renamed from: u, reason: collision with root package name */
    private long f3423u;

    /* renamed from: v, reason: collision with root package name */
    private String f3424v;

    /* renamed from: w, reason: collision with root package name */
    private long f3425w;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f3412i = new ArrayList();
    private List<Long> j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f3413k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<Long> f3414l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private LinkedList<a> f3415m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f3426x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f3427y = -1;
    private int A = 50;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f3429a;

        /* renamed from: b, reason: collision with root package name */
        String f3430b;

        /* renamed from: c, reason: collision with root package name */
        long f3431c;

        public a(String str, String str2, long j) {
            this.f3430b = str2;
            this.f3431c = j;
            this.f3429a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f3431c)) + " : " + this.f3429a + ' ' + this.f3430b;
        }
    }

    private b(Application application) {
        this.f3411h = application;
        this.g = application;
        if (application != null) {
            try {
                this.g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f3416n = activity.getClass().getName();
                        b.this.f3417o = System.currentTimeMillis();
                        boolean unused = b.f3405b = bundle != null;
                        boolean unused2 = b.f3406c = true;
                        b.this.f3412i.add(b.this.f3416n);
                        b.this.j.add(Long.valueOf(b.this.f3417o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f3416n, b.this.f3417o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f3412i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f3412i.size()) {
                            b.this.f3412i.remove(iIndexOf);
                            b.this.j.remove(iIndexOf);
                        }
                        b.this.f3413k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f3414l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f3422t = activity.getClass().getName();
                        b.this.f3423u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f3426x = false;
                            boolean unused = b.f3406c = false;
                            b.this.f3427y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f3426x = false;
                            boolean unused2 = b.f3406c = false;
                            b.this.f3427y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f3422t, b.this.f3423u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f3420r = activity.getClass().getName();
                        b.this.f3421s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f3426x) {
                            if (b.f3404a) {
                                b.k();
                                int unused = b.f3407d = 1;
                                long unused2 = b.f3409f = b.this.f3421s;
                            }
                            if (!b.this.f3420r.equals(b.this.f3422t)) {
                                return;
                            }
                            if (b.f3406c && !b.f3405b) {
                                int unused3 = b.f3407d = 4;
                                long unused4 = b.f3409f = b.this.f3421s;
                                return;
                            } else if (!b.f3406c) {
                                int unused5 = b.f3407d = 3;
                                long unused6 = b.f3409f = b.this.f3421s;
                                return;
                            }
                        }
                        b.this.f3426x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f3420r, b.this.f3421s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f3418p = activity.getClass().getName();
                        b.this.f3419q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f3418p, b.this.f3419q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f3424v = activity.getClass().getName();
                        b.this.f3425w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f3424v, b.this.f3425w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i4 = bVar.B;
        bVar.B = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int l(b bVar) {
        int i4 = bVar.B;
        bVar.B = i4 - 1;
        return i4;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f3404a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f3412i;
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < this.f3412i.size(); i4++) {
                try {
                    jSONArray.put(a(this.f3412i.get(i4), this.j.get(i4).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f3413k;
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < this.f3413k.size(); i4++) {
                try {
                    jSONArray.put(a(this.f3413k.get(i4), this.f3414l.get(i4).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f3416n, this.f3417o));
                jSONObject.put("last_start_activity", a(this.f3418p, this.f3419q));
                jSONObject.put("last_resume_activity", a(this.f3420r, this.f3421s));
                jSONObject.put("last_pause_activity", a(this.f3422t, this.f3423u));
                jSONObject.put("last_stop_activity", a(this.f3424v, this.f3425w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final String h() {
        return String.valueOf(this.f3420r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.f3415m);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            jSONArray.put(((a) obj).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f3426x;
    }

    public static long c() {
        return f3409f;
    }

    public static b d() {
        if (f3410z == null) {
            synchronized (b.class) {
                try {
                    if (f3410z == null) {
                        f3410z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f3410z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f3427y;
    }

    public static int b() {
        int i4 = f3407d;
        return i4 == 1 ? f3408e ? 2 : 1 : i4;
    }

    public static void a() {
        f3408e = true;
    }

    private static JSONObject a(String str, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f3415m.size() >= bVar.A) {
                    aVar = bVar.f3415m.poll();
                    if (aVar != null) {
                        bVar.f3415m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j);
                    bVar.f3415m.add(aVar);
                }
                aVar.f3430b = str2;
                aVar.f3429a = str;
                aVar.f3431c = j;
            } catch (Throwable unused) {
            }
        }
    }
}
