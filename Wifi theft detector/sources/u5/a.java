package u5;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o5.g;
import org.json.JSONException;
import org.json.JSONObject;
import q5.j;
import r5.a;
import t5.f;
import t5.h;
import u5.b;

/* loaded from: classes3.dex */
public class a implements a.InterfaceC0476a {

    /* renamed from: i, reason: collision with root package name */
    public static a f24505i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static Handler f24506j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public static Handler f24507k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final Runnable f24508l = new b();

    /* renamed from: m, reason: collision with root package name */
    public static final Runnable f24509m = new c();

    /* renamed from: b, reason: collision with root package name */
    public int f24511b;

    /* renamed from: h, reason: collision with root package name */
    public long f24517h;

    /* renamed from: a, reason: collision with root package name */
    public List f24510a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f24512c = false;

    /* renamed from: d, reason: collision with root package name */
    public final List f24513d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public u5.b f24515f = new u5.b();

    /* renamed from: e, reason: collision with root package name */
    public r5.b f24514e = new r5.b();

    /* renamed from: g, reason: collision with root package name */
    public u5.c f24516g = new u5.c(new v5.c());

    /* renamed from: u5.a$a, reason: collision with other inner class name */
    public class RunnableC0489a implements Runnable {
        public RunnableC0489a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f24516g.c();
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
            if (a.f24507k != null) {
                a.f24507k.post(a.f24508l);
                a.f24507k.postDelayed(a.f24509m, 200L);
            }
        }
    }

    public static a p() {
        return f24505i;
    }

    @Override // r5.a.InterfaceC0476a
    public void a(View view, r5.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.mmadbridge.walking.c cVarM;
        a aVar2;
        if (h.f(view) && (cVarM = this.f24515f.m(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            t5.c.i(jSONObject, jSONObjectA);
            if (j(view, jSONObjectA)) {
                aVar2 = this;
            } else {
                boolean z11 = z10 || g(view, jSONObjectA);
                if (this.f24512c && cVarM == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24513d.add(new w5.a(view));
                }
                aVar2 = this;
                aVar2.e(view, aVar, jSONObjectA, cVarM, z11);
            }
            aVar2.f24511b++;
        }
    }

    public final void d(long j10) {
        if (this.f24510a.size() > 0) {
            Iterator it = this.f24510a.iterator();
            if (it.hasNext()) {
                z.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j10);
                throw null;
            }
        }
    }

    public final void e(View view, r5.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    public final void f(String str, View view, JSONObject jSONObject) throws JSONException {
        r5.a aVarB = this.f24514e.b();
        String strG = this.f24515f.g(str);
        if (strG != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            t5.c.g(jSONObjectA, str);
            t5.c.o(jSONObjectA, strG);
            t5.c.i(jSONObject, jSONObjectA);
        }
    }

    public final boolean g(View view, JSONObject jSONObject) throws JSONException {
        b.a aVarI = this.f24515f.i(view);
        if (aVarI == null) {
            return false;
        }
        t5.c.j(jSONObject, aVarI);
        return true;
    }

    public final boolean j(View view, JSONObject jSONObject) throws JSONException {
        String strJ = this.f24515f.j(view);
        if (strJ == null) {
            return false;
        }
        t5.c.g(jSONObject, strJ);
        t5.c.f(jSONObject, Boolean.valueOf(this.f24515f.p(view)));
        t5.c.n(jSONObject, Boolean.valueOf(this.f24515f.l(strJ)));
        this.f24515f.n();
        return true;
    }

    public final void l() {
        d(f.b() - this.f24517h);
    }

    public final void m() {
        this.f24511b = 0;
        this.f24513d.clear();
        this.f24512c = false;
        Iterator it = q5.c.e().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((g) it.next()).p()) {
                this.f24512c = true;
                break;
            }
        }
        this.f24517h = f.b();
    }

    public void n() throws JSONException {
        a aVar;
        this.f24515f.o();
        long jB = f.b();
        r5.a aVarA = this.f24514e.a();
        if (this.f24515f.h().size() > 0) {
            Iterator it = this.f24515f.h().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                f(str, this.f24515f.a(str), jSONObjectA);
                t5.c.m(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f24516g.b(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24515f.k().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            aVar = this;
            aVar.e(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            t5.c.m(jSONObjectA2);
            aVar.f24516g.d(jSONObjectA2, aVar.f24515f.k(), jB);
            if (aVar.f24512c) {
                Iterator it2 = q5.c.e().a().iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).j(aVar.f24513d);
                }
            }
        } else {
            aVar = this;
            aVar.f24516g.c();
        }
        aVar.f24515f.d();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public final void r() {
        if (f24507k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24507k = handler;
            handler.post(f24508l);
            f24507k.postDelayed(f24509m, 200L);
        }
    }

    public void s() {
        o();
        this.f24510a.clear();
        f24506j.post(new RunnableC0489a());
    }

    public final void t() {
        Handler handler = f24507k;
        if (handler != null) {
            handler.removeCallbacks(f24509m);
            f24507k = null;
        }
    }

    public final void u() throws JSONException {
        m();
        n();
        l();
        j.f().a();
    }
}
