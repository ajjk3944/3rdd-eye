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

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6363a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6364b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6365c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f6366d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f6367e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f6368f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f6369z;

    /* renamed from: B, reason: collision with root package name */
    private int f6371B;

    /* renamed from: g, reason: collision with root package name */
    private Application f6372g;

    /* renamed from: h, reason: collision with root package name */
    private Context f6373h;

    /* renamed from: n, reason: collision with root package name */
    private String f6378n;

    /* renamed from: o, reason: collision with root package name */
    private long f6379o;

    /* renamed from: p, reason: collision with root package name */
    private String f6380p;

    /* renamed from: q, reason: collision with root package name */
    private long f6381q;

    /* renamed from: r, reason: collision with root package name */
    private String f6382r;

    /* renamed from: s, reason: collision with root package name */
    private long f6383s;

    /* renamed from: t, reason: collision with root package name */
    private String f6384t;

    /* renamed from: u, reason: collision with root package name */
    private long f6385u;

    /* renamed from: v, reason: collision with root package name */
    private String f6386v;

    /* renamed from: w, reason: collision with root package name */
    private long f6387w;
    private List<String> i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<Long> f6374j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f6375k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<Long> f6376l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private LinkedList<a> f6377m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f6388x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f6389y = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f6370A = 50;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f6391a;

        /* renamed from: b, reason: collision with root package name */
        String f6392b;

        /* renamed from: c, reason: collision with root package name */
        long f6393c;

        public a(String str, String str2, long j6) {
            this.f6392b = str2;
            this.f6393c = j6;
            this.f6391a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f6393c)) + " : " + this.f6391a + ' ' + this.f6392b;
        }
    }

    private b(Application application) {
        this.f6373h = application;
        this.f6372g = application;
        if (application != null) {
            try {
                this.f6372g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f6378n = activity.getClass().getName();
                        b.this.f6379o = System.currentTimeMillis();
                        boolean unused = b.f6364b = bundle != null;
                        boolean unused2 = b.f6365c = true;
                        b.this.i.add(b.this.f6378n);
                        b.this.f6374j.add(Long.valueOf(b.this.f6379o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f6378n, b.this.f6379o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.i.size()) {
                            b.this.i.remove(iIndexOf);
                            b.this.f6374j.remove(iIndexOf);
                        }
                        b.this.f6375k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f6376l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f6384t = activity.getClass().getName();
                        b.this.f6385u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.f6371B == 0) {
                            b.this.f6388x = false;
                            boolean unused = b.f6365c = false;
                            b.this.f6389y = SystemClock.uptimeMillis();
                        } else if (b.this.f6371B < 0) {
                            b.n(b.this);
                            b.this.f6388x = false;
                            boolean unused2 = b.f6365c = false;
                            b.this.f6389y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f6384t, b.this.f6385u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f6382r = activity.getClass().getName();
                        b.this.f6383s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f6388x) {
                            if (b.f6363a) {
                                b.k();
                                int unused = b.f6366d = 1;
                                long unused2 = b.f6368f = b.this.f6383s;
                            }
                            if (!b.this.f6382r.equals(b.this.f6384t)) {
                                return;
                            }
                            if (b.f6365c && !b.f6364b) {
                                int unused3 = b.f6366d = 4;
                                long unused4 = b.f6368f = b.this.f6383s;
                                return;
                            } else if (!b.f6365c) {
                                int unused5 = b.f6366d = 3;
                                long unused6 = b.f6368f = b.this.f6383s;
                                return;
                            }
                        }
                        b.this.f6388x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f6382r, b.this.f6383s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f6380p = activity.getClass().getName();
                        b.this.f6381q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f6380p, b.this.f6381q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f6386v = activity.getClass().getName();
                        b.this.f6387w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f6386v, b.this.f6387w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i = bVar.f6371B;
        bVar.f6371B = i + 1;
        return i;
    }

    public static /* synthetic */ int l(b bVar) {
        int i = bVar.f6371B;
        bVar.f6371B = i - 1;
        return i;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.f6371B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f6363a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.i;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.i.size(); i++) {
                try {
                    jSONArray.put(a(this.i.get(i), this.f6374j.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6375k;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f6375k.size(); i++) {
                try {
                    jSONArray.put(a(this.f6375k.get(i), this.f6376l.get(i).longValue()));
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
                jSONObject.put("last_create_activity", a(this.f6378n, this.f6379o));
                jSONObject.put("last_start_activity", a(this.f6380p, this.f6381q));
                jSONObject.put("last_resume_activity", a(this.f6382r, this.f6383s));
                jSONObject.put("last_pause_activity", a(this.f6384t, this.f6385u));
                jSONObject.put("last_stop_activity", a(this.f6386v, this.f6387w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final String h() {
        return String.valueOf(this.f6382r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.f6377m);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((a) obj).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f6388x;
    }

    public static long c() {
        return f6368f;
    }

    public static b d() {
        if (f6369z == null) {
            synchronized (b.class) {
                try {
                    if (f6369z == null) {
                        f6369z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f6369z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f6389y;
    }

    public static int b() {
        int i = f6366d;
        return i == 1 ? f6367e ? 2 : 1 : i;
    }

    public static void a() {
        f6367e = true;
    }

    private static JSONObject a(String str, long j6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j6);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j6, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f6377m.size() >= bVar.f6370A) {
                    aVar = bVar.f6377m.poll();
                    if (aVar != null) {
                        bVar.f6377m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j6);
                    bVar.f6377m.add(aVar);
                }
                aVar.f6392b = str2;
                aVar.f6391a = str;
                aVar.f6393c = j6;
            } catch (Throwable unused) {
            }
        }
    }
}
