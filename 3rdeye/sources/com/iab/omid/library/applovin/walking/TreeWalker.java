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

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0358a {
    private static TreeWalker i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f23608j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f23609k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f23610l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f23611m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f23613b;

    /* renamed from: h, reason: collision with root package name */
    private long f23619h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f23612a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f23614c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f23615d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f23617f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f23616e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f23618g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j4);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j4);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f23618g.b();
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
            if (TreeWalker.f23609k != null) {
                TreeWalker.f23609k.post(TreeWalker.f23610l);
                TreeWalker.f23609k.postDelayed(TreeWalker.f23611m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f23619h);
    }

    private void e() {
        this.f23613b = 0;
        this.f23615d.clear();
        this.f23614c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f23614c = true;
                break;
            }
        }
        this.f23619h = f.b();
    }

    public static TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (f23609k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23609k = handler;
            handler.post(f23610l);
            f23609k.postDelayed(f23611m, 200L);
        }
    }

    private void k() {
        Handler handler = f23609k;
        if (handler != null) {
            handler.removeCallbacks(f23611m);
            f23609k = null;
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
        if (this.f23612a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23612a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f23617f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f23616e.a();
        if (this.f23617f.b().size() > 0) {
            Iterator<String> it = this.f23617f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f23617f.a(next), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f23618g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f23617f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f23618g.b(jSONObjectA2, treeWalker.f23617f.c(), jB);
            if (treeWalker.f23614c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f23615d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f23618g.b();
        }
        treeWalker.f23617f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f23612a.clear();
        f23608j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23612a.contains(treeWalkerTimeLogger)) {
            this.f23612a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j4) {
        if (this.f23612a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23612a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23613b, TimeUnit.NANOSECONDS.toMillis(j4));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23613b, j4);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f23617f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f23617f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f23617f.c(strC)));
        this.f23617f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0358a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f23617f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f23614c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f23615d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f23613b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.applovin.processor.a aVarB = this.f23616e.b();
        String strB = this.f23617f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0360a c0360aB = this.f23617f.b(view);
        if (c0360aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0360aB);
        return true;
    }
}
