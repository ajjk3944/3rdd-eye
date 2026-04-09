package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TreeWalker implements a.InterfaceC0107a {
    private static TreeWalker i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f18711j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f18712k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f18713l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f18714m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f18716b;

    /* renamed from: h, reason: collision with root package name */
    private long f18722h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f18715a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f18717c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f18718d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f18720f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f18719e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f18721g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j6);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j6);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f18721g.b();
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
            if (TreeWalker.f18712k != null) {
                TreeWalker.f18712k.post(TreeWalker.f18713l);
                TreeWalker.f18712k.postDelayed(TreeWalker.f18714m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f18722h);
    }

    private void e() {
        this.f18716b = 0;
        this.f18718d.clear();
        this.f18717c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f18717c = true;
                break;
            }
        }
        this.f18722h = f.b();
    }

    public static TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (f18712k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18712k = handler;
            handler.post(f18713l);
            f18712k.postDelayed(f18714m, 200L);
        }
    }

    private void k() {
        Handler handler = f18712k;
        if (handler != null) {
            handler.removeCallbacks(f18714m);
            f18712k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18715a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f18715a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f18720f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f18719e.a();
        if (this.f18720f.b().size() > 0) {
            Iterator<String> it = this.f18720f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f18720f.a(next), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f18721g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f18720f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f18721g.b(jSONObjectA2, treeWalker.f18720f.c(), jB);
            if (treeWalker.f18717c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f18718d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f18721g.b();
        }
        treeWalker.f18720f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f18715a.clear();
        f18711j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18715a.contains(treeWalkerTimeLogger)) {
            this.f18715a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j6) {
        if (this.f18715a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f18715a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f18716b, TimeUnit.NANOSECONDS.toMillis(j6));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f18716b, j6);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f18720f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f18720f.f(view)));
        this.f18720f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z6) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z6);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0107a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z6) throws JSONException {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f18720f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z7 = z6 || a(view, jSONObjectA);
                if (this.f18717c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z7) {
                    this.f18718d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z7);
            }
            treeWalker.f18716b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f18719e.b();
        String strB = this.f18720f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0109a c0109aC = this.f18720f.c(view);
        if (c0109aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0109aC);
        return true;
    }
}
