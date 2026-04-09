package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
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
    private static boolean f5187a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5188b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5189c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f5190d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5191e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f5192f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f5193z;
    private int B;

    /* renamed from: g, reason: collision with root package name */
    private Application f5194g;

    /* renamed from: h, reason: collision with root package name */
    private Context f5195h;

    /* renamed from: n, reason: collision with root package name */
    private String f5201n;

    /* renamed from: o, reason: collision with root package name */
    private long f5202o;

    /* renamed from: p, reason: collision with root package name */
    private String f5203p;

    /* renamed from: q, reason: collision with root package name */
    private long f5204q;

    /* renamed from: r, reason: collision with root package name */
    private String f5205r;

    /* renamed from: s, reason: collision with root package name */
    private long f5206s;

    /* renamed from: t, reason: collision with root package name */
    private String f5207t;

    /* renamed from: u, reason: collision with root package name */
    private long f5208u;

    /* renamed from: v, reason: collision with root package name */
    private String f5209v;

    /* renamed from: w, reason: collision with root package name */
    private long f5210w;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f5196i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<Long> f5197j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f5198k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<Long> f5199l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private LinkedList<a> f5200m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f5211x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f5212y = -1;
    private int A = 50;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f5214a;

        /* renamed from: b, reason: collision with root package name */
        String f5215b;

        /* renamed from: c, reason: collision with root package name */
        long f5216c;

        public a(String str, String str2, long j10) {
            this.f5215b = str2;
            this.f5216c = j10;
            this.f5214a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f5216c)) + " : " + this.f5214a + ' ' + this.f5215b;
        }
    }

    private b(@NonNull Application application) {
        this.f5195h = application;
        this.f5194g = application;
        if (application != null) {
            try {
                this.f5194g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f5201n = activity.getClass().getName();
                        b.this.f5202o = System.currentTimeMillis();
                        boolean unused = b.f5188b = bundle != null;
                        boolean unused2 = b.f5189c = true;
                        b.this.f5196i.add(b.this.f5201n);
                        b.this.f5197j.add(Long.valueOf(b.this.f5202o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f5201n, b.this.f5202o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f5196i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f5196i.size()) {
                            b.this.f5196i.remove(iIndexOf);
                            b.this.f5197j.remove(iIndexOf);
                        }
                        b.this.f5198k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f5199l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f5207t = activity.getClass().getName();
                        b.this.f5208u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f5211x = false;
                            boolean unused = b.f5189c = false;
                            b.this.f5212y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f5211x = false;
                            boolean unused2 = b.f5189c = false;
                            b.this.f5212y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f5207t, b.this.f5208u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f5205r = activity.getClass().getName();
                        b.this.f5206s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f5211x) {
                            if (b.f5187a) {
                                b.k();
                                int unused = b.f5190d = 1;
                                long unused2 = b.f5192f = b.this.f5206s;
                            }
                            if (!b.this.f5205r.equals(b.this.f5207t)) {
                                return;
                            }
                            if (b.f5189c && !b.f5188b) {
                                int unused3 = b.f5190d = 4;
                                long unused4 = b.f5192f = b.this.f5206s;
                                return;
                            } else if (!b.f5189c) {
                                int unused5 = b.f5190d = 3;
                                long unused6 = b.f5192f = b.this.f5206s;
                                return;
                            }
                        }
                        b.this.f5211x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f5205r, b.this.f5206s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f5203p = activity.getClass().getName();
                        b.this.f5204q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f5203p, b.this.f5204q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f5209v = activity.getClass().getName();
                        b.this.f5210w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f5209v, b.this.f5210w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f5187a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f5196i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f5196i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f5196i.get(i10), this.f5197j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f5198k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f5198k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f5198k.get(i10), this.f5199l.get(i10).longValue()));
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
                jSONObject.put("last_create_activity", a(this.f5201n, this.f5202o));
                jSONObject.put("last_start_activity", a(this.f5203p, this.f5204q));
                jSONObject.put("last_resume_activity", a(this.f5205r, this.f5206s));
                jSONObject.put("last_pause_activity", a(this.f5207t, this.f5208u));
                jSONObject.put("last_stop_activity", a(this.f5209v, this.f5210w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f5205r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.f5200m);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jSONArray.put(((a) obj).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f5211x;
    }

    public static long c() {
        return f5192f;
    }

    public static b d() {
        if (f5193z == null) {
            synchronized (b.class) {
                try {
                    if (f5193z == null) {
                        f5193z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f5193z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f5212y;
    }

    public static int b() {
        int i10 = f5190d;
        return i10 == 1 ? f5191e ? 2 : 1 : i10;
    }

    public static void a() {
        f5191e = true;
    }

    private static JSONObject a(String str, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f5200m.size() >= bVar.A) {
                    aVar = bVar.f5200m.poll();
                    if (aVar != null) {
                        bVar.f5200m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f5200m.add(aVar);
                }
                aVar.f5215b = str2;
                aVar.f5214a = str;
                aVar.f5216c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
