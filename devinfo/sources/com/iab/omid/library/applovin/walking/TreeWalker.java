package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TreeWalker implements a.InterfaceC0126a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f20987i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f20988k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f20989l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f20990m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f20992b;

    /* renamed from: h, reason: collision with root package name */
    private long f20997h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f20991a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f20993c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f20994d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f20996f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f20995e = new com.iab.omid.library.applovin.processor.b();
    private com.iab.omid.library.applovin.walking.b g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i4, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i4, long j);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f20988k != null) {
                TreeWalker.f20988k.post(TreeWalker.f20989l);
                TreeWalker.f20988k.postDelayed(TreeWalker.f20990m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f20997h);
    }

    private void e() {
        this.f20992b = 0;
        this.f20994d.clear();
        this.f20993c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f20993c = true;
                break;
            }
        }
        this.f20997h = f.b();
    }

    public static TreeWalker getInstance() {
        return f20987i;
    }

    private void i() {
        if (f20988k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f20988k = handler;
            handler.post(f20989l);
            f20988k.postDelayed(f20990m, 200L);
        }
    }

    private void k() {
        Handler handler = f20988k;
        if (handler != null) {
            handler.removeCallbacks(f20990m);
            f20988k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f20991a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f20991a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f20996f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f20995e.a();
        if (this.f20996f.b().size() > 0) {
            Iterator<String> it = this.f20996f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f20996f.a(next), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f20996f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.g.b(jSONObjectA2, treeWalker.f20996f.c(), jB);
            if (treeWalker.f20993c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f20994d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.g.b();
        }
        treeWalker.f20996f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f20991a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f20991a.contains(treeWalkerTimeLogger)) {
            this.f20991a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j8) {
        if (this.f20991a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f20991a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f20992b, TimeUnit.NANOSECONDS.toMillis(j8));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f20992b, j8);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f20996f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f20996f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f20996f.c(strC)));
        this.f20996f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z3) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z3);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0126a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z3) throws JSONException {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f20996f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z10 = z3 || a(view, jSONObjectA);
                if (this.f20993c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z10) {
                    this.f20994d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z10);
            }
            treeWalker.f20992b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.applovin.processor.a aVarB = this.f20995e.b();
        String strB = this.f20996f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0128a c0128aB = this.f20996f.b(view);
        if (c0128aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0128aB);
        return true;
    }
}
