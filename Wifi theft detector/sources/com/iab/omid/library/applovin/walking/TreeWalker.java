package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
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
public class TreeWalker implements a.InterfaceC0223a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f12283i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f12284j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f12285k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f12286l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f12287m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f12289b;

    /* renamed from: h, reason: collision with root package name */
    private long f12295h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f12288a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12290c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f12291d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f12293f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f12292e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f12294g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f12294g.b();
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
            if (TreeWalker.f12285k != null) {
                TreeWalker.f12285k.post(TreeWalker.f12286l);
                TreeWalker.f12285k.postDelayed(TreeWalker.f12287m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f12295h);
    }

    private void e() {
        this.f12289b = 0;
        this.f12291d.clear();
        this.f12290c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f12290c = true;
                break;
            }
        }
        this.f12295h = f.b();
    }

    public static TreeWalker getInstance() {
        return f12283i;
    }

    private void i() {
        if (f12285k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12285k = handler;
            handler.post(f12286l);
            f12285k.postDelayed(f12287m, 200L);
        }
    }

    private void k() {
        Handler handler = f12285k;
        if (handler != null) {
            handler.removeCallbacks(f12287m);
            f12285k = null;
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
        if (this.f12288a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f12288a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f12293f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f12292e.a();
        if (this.f12293f.b().size() > 0) {
            Iterator<String> it = this.f12293f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f12293f.a(next), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f12294g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f12293f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f12294g.b(jSONObjectA2, treeWalker.f12293f.c(), jB);
            if (treeWalker.f12290c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f12291d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f12294g.b();
        }
        treeWalker.f12293f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f12288a.clear();
        f12284j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12288a.contains(treeWalkerTimeLogger)) {
            this.f12288a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f12288a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f12288a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f12289b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f12289b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f12293f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f12293f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f12293f.c(strC)));
        this.f12293f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0223a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f12293f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f12290c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f12291d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f12289b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.applovin.processor.a aVarB = this.f12292e.b();
        String strB = this.f12293f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0225a c0225aB = this.f12293f.b(view);
        if (c0225aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0225aB);
        return true;
    }
}
