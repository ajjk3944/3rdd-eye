package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.yandex.mobile.ads.impl.kn2;
import com.yandex.mobile.ads.impl.on2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t62 implements kn2.a {

    /* renamed from: h, reason: collision with root package name */
    private static t62 f33458h = new t62();
    private static Handler i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    private static Handler f33459j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f33460k = new b();

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f33461l = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f33463b;

    /* renamed from: g, reason: collision with root package name */
    private long f33468g;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f33462a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f33464c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private on2 f33466e = new on2();

    /* renamed from: d, reason: collision with root package name */
    private un2 f33465d = new un2();

    /* renamed from: f, reason: collision with root package name */
    private xn2 f33467f = new xn2(new co2());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            t62.this.f33467f.a();
        }
    }

    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            t62.b(t62.g());
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (t62.f33459j != null) {
                t62.f33459j.post(t62.f33460k);
                t62.f33459j.postDelayed(t62.f33461l, 200L);
            }
        }
    }

    public interface d extends e {
        void a();
    }

    public interface e {
        void b();
    }

    public static void c() {
        Handler handler = f33459j;
        if (handler != null) {
            handler.removeCallbacks(f33461l);
            f33459j = null;
        }
    }

    public static t62 g() {
        return f33458h;
    }

    public final void b() {
        c();
        this.f33462a.clear();
        i.post(new a());
    }

    public static void a() {
        if (f33459j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f33459j = handler;
            handler.post(f33460k);
            f33459j.postDelayed(f33461l, 200L);
        }
    }

    public static void b(t62 t62Var) throws JSONException {
        t62 t62Var2;
        t62Var.f33463b = 0;
        t62Var.f33464c.clear();
        Iterator<in2> it = jn2.a().c().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        t62Var.f33468g = System.nanoTime();
        t62Var.f33466e.c();
        long jNanoTime = System.nanoTime();
        bo2 bo2VarA = t62Var.f33465d.a();
        if (t62Var.f33466e.b().size() > 0) {
            Iterator<String> it2 = t62Var.f33466e.b().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                JSONObject jSONObjectA = bo2VarA.a(null);
                View viewB = t62Var.f33466e.b(next);
                fo2 fo2VarB = t62Var.f33465d.b();
                String strA = t62Var.f33466e.a(next);
                if (strA != null) {
                    JSONObject jSONObjectA2 = fo2VarB.a(viewB);
                    try {
                        jSONObjectA2.put("adSessionId", next);
                    } catch (JSONException e4) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e4);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", strA);
                    } catch (JSONException e10) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e10);
                    }
                    vn2.a(jSONObjectA, jSONObjectA2);
                }
                vn2.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                t62Var.f33467f.b(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (t62Var.f33466e.a().size() > 0) {
            JSONObject jSONObjectA3 = bo2VarA.a(null);
            t62Var2 = t62Var;
            bo2VarA.a(null, jSONObjectA3, t62Var2, true, false);
            vn2.a(jSONObjectA3);
            t62Var2.f33467f.a(jSONObjectA3, t62Var2.f33466e.a(), jNanoTime);
        } else {
            t62Var2 = t62Var;
            t62Var2.f33467f.a();
        }
        t62Var2.f33466e.d();
        long jNanoTime2 = System.nanoTime() - t62Var2.f33468g;
        if (t62Var2.f33462a.size() > 0) {
            Iterator it3 = t62Var2.f33462a.iterator();
            while (it3.hasNext()) {
                e eVar = (e) it3.next();
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                eVar.b();
                if (eVar instanceof d) {
                    ((d) eVar).a();
                }
            }
        }
    }

    public final void a(View view, kn2 kn2Var, JSONObject jSONObject, boolean z10) throws JSONException {
        int iC;
        t62 t62Var;
        boolean z11;
        boolean z12;
        kn2 kn2Var2;
        View view2;
        if (no2.c(view) != null || (iC = this.f33466e.c(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = kn2Var.a(view);
        vn2.a(jSONObject, jSONObjectA);
        String strA = this.f33466e.a(view);
        if (strA != null) {
            try {
                jSONObjectA.put("adSessionId", strA);
            } catch (JSONException e4) {
                Log.e("OMIDLIB", "Error with setting ad session id", e4);
            }
            try {
                jSONObjectA.put("hasWindowFocus", Boolean.valueOf(this.f33466e.d(view)));
            } catch (JSONException e10) {
                Log.e("OMIDLIB", "Error with setting not visible reason", e10);
            }
            this.f33466e.e();
            t62Var = this;
        } else {
            on2.a aVarB = this.f33466e.b(view);
            if (aVarB != null) {
                ao2 ao2VarA = aVarB.a();
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = aVarB.b().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", ao2VarA.b());
                    jSONObjectA.put("friendlyObstructionPurpose", ao2VarA.c());
                    jSONObjectA.put("friendlyObstructionReason", ao2VarA.d());
                } catch (JSONException e11) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e11);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z10 || z11;
            if (iC == 1) {
                z12 = true;
                t62Var = this;
                view2 = view;
                kn2Var2 = kn2Var;
            } else {
                z12 = false;
                t62Var = this;
                kn2Var2 = kn2Var;
                view2 = view;
            }
            kn2Var2.a(view2, jSONObjectA, t62Var, z12, z13);
        }
        t62Var.f33463b++;
    }
}
