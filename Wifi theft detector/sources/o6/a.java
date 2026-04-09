package o6;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k6.j;
import l6.a;
import n6.f;
import n6.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a implements a.InterfaceC0434a {

    /* renamed from: i, reason: collision with root package name */
    public static a f23676i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static Handler f23677j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public static Handler f23678k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final Runnable f23679l = new b();

    /* renamed from: m, reason: collision with root package name */
    public static final Runnable f23680m = new c();

    /* renamed from: b, reason: collision with root package name */
    public int f23682b;

    /* renamed from: h, reason: collision with root package name */
    public long f23688h;

    /* renamed from: a, reason: collision with root package name */
    public List f23681a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f23683c = false;

    /* renamed from: d, reason: collision with root package name */
    public final List f23684d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public o6.b f23686f = new o6.b();

    /* renamed from: e, reason: collision with root package name */
    public l6.b f23685e = new l6.b();

    /* renamed from: g, reason: collision with root package name */
    public o6.c f23687g = new o6.c(new p6.c());

    /* renamed from: o6.a$a, reason: collision with other inner class name */
    public class RunnableC0448a implements Runnable {
        public RunnableC0448a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f23687g.c();
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
            if (a.f23678k != null) {
                a.f23678k.post(a.f23679l);
                a.f23678k.postDelayed(a.f23680m, 200L);
            }
        }
    }

    public static a p() {
        return f23676i;
    }

    @Override // l6.a.InterfaceC0434a
    public void a(View view, l6.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.vungle.walking.c cVarM;
        a aVar2;
        if (h.f(view) && (cVarM = this.f23686f.m(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            n6.c.j(jSONObject, jSONObjectA);
            if (j(view, jSONObjectA)) {
                aVar2 = this;
            } else {
                boolean z11 = z10 || g(view, jSONObjectA);
                if (this.f23683c && cVarM == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f23684d.add(new q6.a(view));
                }
                aVar2 = this;
                aVar2.e(view, aVar, jSONObjectA, cVarM, z11);
            }
            aVar2.f23682b++;
        }
    }

    public final void d(long j10) {
        if (this.f23681a.size() > 0) {
            Iterator it = this.f23681a.iterator();
            if (it.hasNext()) {
                z.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j10);
                throw null;
            }
        }
    }

    public final void e(View view, l6.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z10);
    }

    public final void f(String str, View view, JSONObject jSONObject) throws JSONException {
        l6.a aVarB = this.f23685e.b();
        String strG = this.f23686f.g(str);
        if (strG != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            n6.c.g(jSONObjectA, str);
            n6.c.o(jSONObjectA, strG);
            n6.c.j(jSONObject, jSONObjectA);
        }
    }

    public final boolean g(View view, JSONObject jSONObject) {
        this.f23686f.i(view);
        return false;
    }

    public final boolean j(View view, JSONObject jSONObject) throws JSONException {
        String strJ = this.f23686f.j(view);
        if (strJ == null) {
            return false;
        }
        n6.c.g(jSONObject, strJ);
        n6.c.f(jSONObject, Boolean.valueOf(this.f23686f.p(view)));
        n6.c.n(jSONObject, Boolean.valueOf(this.f23686f.l(strJ)));
        this.f23686f.n();
        return true;
    }

    public final void l() {
        d(f.b() - this.f23688h);
    }

    public final void m() {
        this.f23682b = 0;
        this.f23684d.clear();
        this.f23683c = false;
        Iterator it = k6.c.e().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((i6.h) it.next()).n()) {
                this.f23683c = true;
                break;
            }
        }
        this.f23688h = f.b();
    }

    public void n() throws JSONException {
        a aVar;
        this.f23686f.o();
        long jB = f.b();
        l6.a aVarA = this.f23685e.a();
        if (this.f23686f.h().size() > 0) {
            Iterator it = this.f23686f.h().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                f(str, this.f23686f.a(str), jSONObjectA);
                n6.c.m(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f23687g.b(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f23686f.k().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            aVar = this;
            aVar.e(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            n6.c.m(jSONObjectA2);
            aVar.f23687g.d(jSONObjectA2, aVar.f23686f.k(), jB);
            if (aVar.f23683c) {
                Iterator it2 = k6.c.e().a().iterator();
                while (it2.hasNext()) {
                    ((i6.h) it2.next()).g(aVar.f23684d);
                }
            }
        } else {
            aVar = this;
            aVar.f23687g.c();
        }
        aVar.f23686f.d();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public final void r() {
        if (f23678k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23678k = handler;
            handler.post(f23679l);
            f23678k.postDelayed(f23680m, 200L);
        }
    }

    public void s() {
        o();
        this.f23681a.clear();
        f23677j.post(new RunnableC0448a());
    }

    public final void t() {
        Handler handler = f23678k;
        if (handler != null) {
            handler.removeCallbacks(f23680m);
            f23678k = null;
        }
    }

    public final void u() throws JSONException {
        m();
        n();
        l();
        j.f().a();
    }
}
