package e6;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.z;
import b6.a;
import d6.f;
import d6.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements a.InterfaceC0059a {

    /* renamed from: i, reason: collision with root package name */
    public static a f20957i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static Handler f20958j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public static Handler f20959k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final Runnable f20960l = new b();

    /* renamed from: m, reason: collision with root package name */
    public static final Runnable f20961m = new c();

    /* renamed from: b, reason: collision with root package name */
    public int f20963b;

    /* renamed from: h, reason: collision with root package name */
    public long f20969h;

    /* renamed from: a, reason: collision with root package name */
    public List f20962a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f20964c = false;

    /* renamed from: d, reason: collision with root package name */
    public final List f20965d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public e6.b f20967f = new e6.b();

    /* renamed from: e, reason: collision with root package name */
    public b6.b f20966e = new b6.b();

    /* renamed from: g, reason: collision with root package name */
    public e6.c f20968g = new e6.c(new f6.c());

    /* renamed from: e6.a$a, reason: collision with other inner class name */
    public class RunnableC0389a implements Runnable {
        public RunnableC0389a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f20968g.c();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            a.p().u();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (a.f20959k != null) {
                a.f20959k.post(a.f20960l);
                a.f20959k.postDelayed(a.f20961m, 200L);
            }
        }
    }

    public static a p() {
        return f20957i;
    }

    @Override // b6.a.InterfaceC0059a
    public void a(View view, b6.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.unity3d.walking.c cVarM;
        a aVar2;
        if (h.d(view) && (cVarM = this.f20967f.m(view)) != com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            d6.c.j(jSONObject, jSONObjectA);
            if (j(view, jSONObjectA)) {
                aVar2 = this;
            } else {
                boolean z11 = z10 || g(view, jSONObjectA);
                if (this.f20964c && cVarM == com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f20965d.add(new g6.a(view));
                }
                aVar2 = this;
                aVar2.e(view, aVar, jSONObjectA, cVarM, z11);
            }
            aVar2.f20963b++;
        }
    }

    public final void d(long j10) {
        if (this.f20962a.size() > 0) {
            Iterator it = this.f20962a.iterator();
            if (it.hasNext()) {
                z.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j10);
                throw null;
            }
        }
    }

    public final void e(View view, b6.a aVar, JSONObject jSONObject, com.iab.omid.library.unity3d.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, z10);
    }

    public final void f(String str, View view, JSONObject jSONObject) throws JSONException {
        b6.a aVarB = this.f20966e.b();
        String strG = this.f20967f.g(str);
        if (strG != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            d6.c.h(jSONObjectA, str);
            d6.c.n(jSONObjectA, strG);
            d6.c.j(jSONObject, jSONObjectA);
        }
    }

    public final boolean g(View view, JSONObject jSONObject) {
        this.f20967f.i(view);
        return false;
    }

    public final boolean j(View view, JSONObject jSONObject) throws JSONException {
        String strK = this.f20967f.k(view);
        if (strK == null) {
            return false;
        }
        d6.c.h(jSONObject, strK);
        d6.c.g(jSONObject, Boolean.valueOf(this.f20967f.o(view)));
        this.f20967f.l();
        return true;
    }

    public final void l() {
        d(f.b() - this.f20969h);
    }

    public final void m() {
        this.f20963b = 0;
        this.f20965d.clear();
        this.f20964c = false;
        Iterator it = a6.c.e().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((y5.f) it.next()).l()) {
                this.f20964c = true;
                break;
            }
        }
        this.f20969h = f.b();
    }

    public void n() throws JSONException {
        a aVar;
        this.f20967f.n();
        long jB = f.b();
        b6.a aVarA = this.f20966e.a();
        if (this.f20967f.h().size() > 0) {
            Iterator it = this.f20967f.h().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                f(str, this.f20967f.a(str), jSONObjectA);
                d6.c.m(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f20968g.b(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f20967f.j().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            aVar = this;
            aVar.e(null, aVarA, jSONObjectA2, com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, false);
            d6.c.m(jSONObjectA2);
            aVar.f20968g.d(jSONObjectA2, aVar.f20967f.j(), jB);
            if (aVar.f20964c) {
                Iterator it2 = a6.c.e().a().iterator();
                while (it2.hasNext()) {
                    ((y5.f) it2.next()).f(aVar.f20965d);
                }
            }
        } else {
            aVar = this;
            aVar.f20968g.c();
        }
        aVar.f20967f.c();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public final void r() {
        if (f20959k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f20959k = handler;
            handler.post(f20960l);
            f20959k.postDelayed(f20961m, 200L);
        }
    }

    public void s() {
        o();
        this.f20962a.clear();
        f20958j.post(new RunnableC0389a());
    }

    public final void t() {
        Handler handler = f20959k;
        if (handler != null) {
            handler.removeCallbacks(f20961m);
            f20959k = null;
        }
    }

    public final void u() throws JSONException {
        m();
        n();
        l();
    }
}
